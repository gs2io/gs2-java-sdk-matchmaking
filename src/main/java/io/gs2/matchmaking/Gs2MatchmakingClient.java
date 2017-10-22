package io.gs2.matchmaking;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

import io.gs2.AbstractGs2Client;
import io.gs2.Gs2Constant;
import io.gs2.auth.Gs2AuthClient;
import io.gs2.exception.BadRequestException;
import io.gs2.matchmaking.control.AnybodyDescribeJoinedUserRequest;
import io.gs2.matchmaking.control.AnybodyDescribeJoinedUserResult;
import io.gs2.matchmaking.control.AnybodyDoMatchmakingRequest;
import io.gs2.matchmaking.control.AnybodyDoMatchmakingResult;
import io.gs2.matchmaking.control.AnybodyLeaveGatheringRequest;
import io.gs2.matchmaking.control.CreateMatchmakingRequest;
import io.gs2.matchmaking.control.CreateMatchmakingResult;
import io.gs2.matchmaking.control.CustomAutoDescribeJoinedUserRequest;
import io.gs2.matchmaking.control.CustomAutoDescribeJoinedUserResult;
import io.gs2.matchmaking.control.CustomAutoDoMatchmakingRequest;
import io.gs2.matchmaking.control.CustomAutoDoMatchmakingResult;
import io.gs2.matchmaking.control.CustomAutoLeaveGatheringRequest;
import io.gs2.matchmaking.control.DeleteMatchmakingRequest;
import io.gs2.matchmaking.control.DescribeMatchmakingRequest;
import io.gs2.matchmaking.control.DescribeMatchmakingResult;
import io.gs2.matchmaking.control.DescribeServiceClassRequest;
import io.gs2.matchmaking.control.DescribeServiceClassResult;
import io.gs2.matchmaking.control.GetMatchmakingRequest;
import io.gs2.matchmaking.control.GetMatchmakingResult;
import io.gs2.matchmaking.control.GetMatchmakingStatusRequest;
import io.gs2.matchmaking.control.GetMatchmakingStatusResult;
import io.gs2.matchmaking.control.PasscodeBreakupGatheringRequest;
import io.gs2.matchmaking.control.PasscodeCreateGatheringRequest;
import io.gs2.matchmaking.control.PasscodeCreateGatheringResult;
import io.gs2.matchmaking.control.PasscodeDescribeJoinedUserRequest;
import io.gs2.matchmaking.control.PasscodeDescribeJoinedUserResult;
import io.gs2.matchmaking.control.PasscodeEarlyCompleteGatheringRequest;
import io.gs2.matchmaking.control.PasscodeJoinGatheringRequest;
import io.gs2.matchmaking.control.PasscodeJoinGatheringResult;
import io.gs2.matchmaking.control.PasscodeLeaveGatheringRequest;
import io.gs2.matchmaking.control.RoomBreakupGatheringRequest;
import io.gs2.matchmaking.control.RoomCreateGatheringRequest;
import io.gs2.matchmaking.control.RoomCreateGatheringResult;
import io.gs2.matchmaking.control.RoomDescribeGatheringRequest;
import io.gs2.matchmaking.control.RoomDescribeGatheringResult;
import io.gs2.matchmaking.control.RoomDescribeJoinedUserRequest;
import io.gs2.matchmaking.control.RoomDescribeJoinedUserResult;
import io.gs2.matchmaking.control.RoomEarlyCompleteGatheringRequest;
import io.gs2.matchmaking.control.RoomJoinGatheringRequest;
import io.gs2.matchmaking.control.RoomJoinGatheringResult;
import io.gs2.matchmaking.control.RoomLeaveGatheringRequest;
import io.gs2.matchmaking.control.UpdateMatchmakingRequest;
import io.gs2.matchmaking.control.UpdateMatchmakingResult;
import io.gs2.model.IGs2Credential;

/**
 * GS2-Matchmaking API クライアント
 * 
 * @author Game Server Services, Inc.
 *
 */
public class Gs2MatchmakingClient extends AbstractGs2Client<Gs2MatchmakingClient> {

	public static String ENDPOINT = "matchmaking";
	
	/**
	 * コンストラクタ。
	 * 
	 * @param credential 認証情報
	 */
	public Gs2MatchmakingClient(IGs2Credential credential) {
		super(credential);
	}

	/**
	 * サービスクラス一覧を取得。
	 * 
	 * @param request リクエストパラメータ
	 * @return サービスクラス一覧
	 */
	public DescribeServiceClassResult describeServiceClass(DescribeServiceClassRequest request) {
		HttpGet get = createHttpGet(
				Gs2Constant.ENDPOINT_HOST + "/matchmaking/serviceClass", 
				credential, 
				ENDPOINT,
				DescribeServiceClassRequest.Constant.MODULE, 
				DescribeServiceClassRequest.Constant.FUNCTION);
		return doRequest(get, DescribeServiceClassResult.class);
	}

	/**
	 * マッチメイキングを作成。<br>
	 * <br>
	 * GS2-Matchmaking を利用するためにまず作成するデータモデルです。<br>
	 * マッチメイキングの設定項目として、マッチメイキングの方式や最大プレイヤー数を設定します。<br>
	 * 
	 * @param request リクエストパラメータ
	 * @return 作成結果
	 */
	public CreateMatchmakingResult createMatchmaking(CreateMatchmakingRequest request) {
		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("name", request.getName())
				.put("description", request.getDescription())
				.put("serviceClass", request.getServiceClass())
				.put("type", request.getType())
				.put("maxPlayer", request.getMaxPlayer())
				.put("gatheringPoolName", request.getGatheringPoolName())
				.put("callback", request.getCallback())
				.put("notificationGameName", request.getNotificationGameName());
		HttpPost post = createHttpPost(
				Gs2Constant.ENDPOINT_HOST + "/matchmaking", 
				credential, 
				ENDPOINT,
				CreateMatchmakingRequest.Constant.MODULE, 
				CreateMatchmakingRequest.Constant.FUNCTION,
				body.toString());
		return doRequest(post, CreateMatchmakingResult.class);
	}
	
	/**
	 * マッチメイキング一覧を取得。
	 * 
	 * @param request リクエストパラメータ
	 * @return マッチメイキング一覧
	 */
	public DescribeMatchmakingResult describeMatchmaking(DescribeMatchmakingRequest request) {
		String url = Gs2Constant.ENDPOINT_HOST + "/matchmaking";
		List<NameValuePair> queryString = new ArrayList<>();
		if(request.getLimit() != null) queryString.add(new BasicNameValuePair("limit", String.valueOf(request.getLimit())));
		if(request.getPageToken() != null) queryString.add(new BasicNameValuePair("pageToken", request.getPageToken()));
		if(queryString.size() > 0) {
			url += "?" + URLEncodedUtils.format(queryString, "UTF-8");
		}
		HttpGet get = createHttpGet(
				url, 
				credential, 
				ENDPOINT,
				DescribeMatchmakingRequest.Constant.MODULE, 
				DescribeMatchmakingRequest.Constant.FUNCTION);
		return doRequest(get, DescribeMatchmakingResult.class);
	}

	/**
	 * マッチメイキングを取得。
	 * 
	 * @param request リクエストパラメータ
	 * @return マッチメイキング
	 */
	public GetMatchmakingResult getMatchmaking(GetMatchmakingRequest request) {
		HttpGet get = createHttpGet(
				Gs2Constant.ENDPOINT_HOST + "/matchmaking/" + request.getMatchmakingName(), 
				credential, 
				ENDPOINT,
				GetMatchmakingRequest.Constant.MODULE, 
				GetMatchmakingRequest.Constant.FUNCTION);
		return doRequest(get, GetMatchmakingResult.class);
	}

	/**
	 * マッチメイキングの状態を取得。
	 * 
	 * @param request リクエストパラメータ
	 * @return マッチメイキングの状態
	 */
	public GetMatchmakingStatusResult getMatchmakingStatus(GetMatchmakingStatusRequest request) {
		HttpGet get = createHttpGet(
				Gs2Constant.ENDPOINT_HOST + "/matchmaking/" + request.getMatchmakingName() + "/status", 
				credential, 
				ENDPOINT,
				GetMatchmakingStatusRequest.Constant.MODULE, 
				GetMatchmakingStatusRequest.Constant.FUNCTION);
		return doRequest(get, GetMatchmakingStatusResult.class);
	}

	/**
	 * マッチメイキングを更新。
	 * 
	 * @param request リクエストパラメータ
	 * @return 更新結果
	 */
	public UpdateMatchmakingResult updateMatchmaking(UpdateMatchmakingRequest request) {
		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("description", request.getDescription())
				.put("serviceClass", request.getServiceClass())
				.put("gatheringPoolName", request.getGatheringPoolName())
				.put("callback", request.getCallback())
				.put("notificationGameName", request.getNotificationGameName());
		HttpPut put = createHttpPut(
				Gs2Constant.ENDPOINT_HOST + "/matchmaking/" + request.getMatchmakingName(), 
				credential, 
				ENDPOINT,
				UpdateMatchmakingRequest.Constant.MODULE, 
				UpdateMatchmakingRequest.Constant.FUNCTION,
				body.toString());
		return doRequest(put, UpdateMatchmakingResult.class);
	}

	/**
	 * マッチメイキングを削除。
	 * 
	 * @param request リクエストパラメータ
	 */
	public void deleteMatchmaking(DeleteMatchmakingRequest request) {
		HttpDelete delete = createHttpDelete(
				Gs2Constant.ENDPOINT_HOST + "/matchmaking/" + request.getMatchmakingName(), 
				credential, 
				ENDPOINT,
				DeleteMatchmakingRequest.Constant.MODULE, 
				DeleteMatchmakingRequest.Constant.FUNCTION);
		doRequest(delete, null);
	}
	
	/**
	 * Anybodyマッチメイキング - マッチメイキングを実行。<br>
	 * <br>
	 * Anybodyマッチメイキングのマッチメイキングプロセスは、このAPIを呼び出すことで完結します。<br>
	 * このAPIを呼び出した段階で参加者を待っているギャザリングが存在すれば参加し、<br>
	 * 参加者を待っているギャザリングが存在しなければ、新しくギャザリングに作成して、そのギャザリングに参加します。<br>
	 * <br>
	 * 戻り値にはギャザリングに参加している人数が含まれますので、自分がギャザリングを作成したのかはそこで確認することができます。<br>
	 * <br>
	 * マッチメイキング完了コールバックをが返るまで待つことでマッチメイキングの完了を待つことができます。<br>
	 * マッチメイキングの進捗を確認したい場合は {@link Gs2MatchmakingClient#anybodyDescribeJoinedUser(AnybodyDescribeJoinedUserRequest)} を呼び出すことで、<br>
	 * ギャザリングに参加しているユーザIDが取得できるため、誰とマッチメイキングが行われているか途中経過を取得できます。<br>
	 * <br>
	 * ユーザ操作などにより、マッチメイキングを中断する場合は {@link Gs2MatchmakingClient#anybodyLeaveGathering(AnybodyLeaveGatheringRequest)} を呼び出すことで中断できます。<br>
	 * GS2-Matchmaking にはホストという明確な役割は存在しないため、ギャザリングを作成したユーザがマッチメイキングを中断したとしてもマッチメイキングは継続されます。<br>
	 * <br>
	 * accessToken には {@link Gs2AuthClient#login(io.gs2.auth.control.LoginRequest)} でログインして取得したアクセストークンを指定してください。<br>
	 * 
	 * @param request リクエストパラメータ
	 * @return 更新結果
	 */
	public AnybodyDoMatchmakingResult anybodyDoMatchmaking(AnybodyDoMatchmakingRequest request) {
		ObjectNode body = JsonNodeFactory.instance.objectNode();
		HttpPost post = createHttpPost(
				Gs2Constant.ENDPOINT_HOST + "/matchmaking/" + request.getMatchmakingName() + "/anybody", 
				credential, 
				ENDPOINT,
				AnybodyDoMatchmakingRequest.Constant.MODULE, 
				AnybodyDoMatchmakingRequest.Constant.FUNCTION,
				body.toString());
		post.setHeader("X-GS2-ACCESS-TOKEN", request.getAccessToken());
		return doRequest(post, AnybodyDoMatchmakingResult.class);
	}
	
	/**
	 * Anybodyマッチメイキング - ギャザリングに参加しているユーザID一覧取得を実行。<br>
	 * <br>
	 * accessToken には {@link Gs2AuthClient#login(io.gs2.auth.control.LoginRequest)} でログインして取得したアクセストークンを指定してください。<br>
	 * 
	 * @param request リクエストパラメータ
	 * @return 更新結果
	 */
	public AnybodyDescribeJoinedUserResult anybodyDescribeJoinedUser(AnybodyDescribeJoinedUserRequest request) {
		HttpGet get = createHttpGet(
				Gs2Constant.ENDPOINT_HOST + "/matchmaking/" + request.getMatchmakingName() + "/anybody/" + request.getGatheringId() + "/player", 
				credential, 
				ENDPOINT,
				AnybodyDescribeJoinedUserRequest.Constant.MODULE, 
				AnybodyDescribeJoinedUserRequest.Constant.FUNCTION);
		get.setHeader("X-GS2-ACCESS-TOKEN", request.getAccessToken());
		return doRequest(get, AnybodyDescribeJoinedUserResult.class);
	}
	
	/**
	 * Anybodyマッチメイキング - ギャザリングからの離脱を実行。<br>
	 * <br>
	 * accessToken には {@link Gs2AuthClient#login(io.gs2.auth.control.LoginRequest)} でログインして取得したアクセストークンを指定してください。<br>
	 * 
	 * @param request リクエストパラメータ
	 */
	public void anybodyLeaveGathering(AnybodyLeaveGatheringRequest request) {
		HttpDelete delete = createHttpDelete(
				Gs2Constant.ENDPOINT_HOST + "/matchmaking/" + request.getMatchmakingName() + "/anybody/" + request.getGatheringId() + "/player", 
				credential, 
				ENDPOINT,
				AnybodyLeaveGatheringRequest.Constant.MODULE, 
				AnybodyLeaveGatheringRequest.Constant.FUNCTION);
		delete.setHeader("X-GS2-ACCESS-TOKEN", request.getAccessToken());
		doRequest(delete, null);
	}
	
	/**
	 * CustomAutoマッチメイキング - マッチメイキングを実行。<br>
	 * <br>
	 * CustomAutoマッチメイキングを実行する場合は、基本的にはこのAPIを呼び出すことで完結します。<br>
	 * CustomAutoマッチメイキングのリクエストパラメータには、参加対象となるギャザリングの属性値の範囲を指定して行われます。<br>
	 * 属性値は最大5個指定することができ、属性値毎に検索する最小値・最大値を指定できます。<br>
	 * すべての属性値が希望する範囲内に収まっているギャザリングを見つけた場合はそのギャザリングに参加します。<br>
	 * <br>
	 * 一定時間内にすべてのギャザリングの検索を終えることができなかった場合は、searchContext というパラメータを応答します。<br>
	 * この場合、searchContext を指定して このAPIを再度呼び出すことで、検索を再開することができます。<br>
	 * この際に指定する検索条件は以前の searchContext と同じ条件にするようにしてください。<br>
	 * 条件が変更されたうえで、searchContext を利用した場合の動作は保証できません。<br>
	 * <br>
	 * すべてのギャザリングを検索した結果、対象となるギャザリングが存在しなかった場合は、新しくギャザリングを作成し、そのギャザリングに参加します。<br>
	 * <br>
	 * 戻り値にはギャザリングに参加している人数が含まれますので、自分がギャザリングを作成したのかはそこで確認することができます。<br>
	 * <br>
	 * マッチメイキング完了コールバックをが返るまで待つことでマッチメイキングの完了を待つことができます。<br>
	 * マッチメイキングの進捗を確認したい場合は {@link Gs2MatchmakingClient#customAutoDescribeJoinedUser(CustomAutoDescribeJoinedUserRequest)} を呼び出すことで、<br>
	 * ギャザリングに参加しているユーザIDが取得できるため、誰とマッチメイキングが行われているか途中経過を取得できます。<br>
	 * <br>
	 * ユーザ操作などにより、マッチメイキングを中断する場合は {@link Gs2MatchmakingClient#customAutoLeaveGathering(CustomAutoLeaveGatheringRequest)} を呼び出すことで中断できます。<br>
	 * GS2-Matchmaking にはホストという明確な役割は存在しないため、ギャザリングを作成したユーザがマッチメイキングを中断したとしてもマッチメイキングは継続されます。<br>
	 * <br>
	 * accessToken には {@link Gs2AuthClient#login(io.gs2.auth.control.LoginRequest)} でログインして取得したアクセストークンを指定してください。<br>
	 * 
	 * @param request リクエストパラメータ
	 * @return 更新結果
	 */
	public CustomAutoDoMatchmakingResult customAutoDoMatchmaking(CustomAutoDoMatchmakingRequest request) {
		ObjectNode body = JsonNodeFactory.instance.objectNode();
		if(request.getAttribute1() != null) body.put("attribute1", request.getAttribute1());
		if(request.getAttribute2() != null) body.put("attribute2", request.getAttribute2());
		if(request.getAttribute3() != null) body.put("attribute3", request.getAttribute3());
		if(request.getAttribute4() != null) body.put("attribute4", request.getAttribute4());
		if(request.getAttribute5() != null) body.put("attribute5", request.getAttribute5());
		if(request.getSearchAttribute1Min() != null) body.put("searchAttribute1Min", request.getSearchAttribute1Min());
		if(request.getSearchAttribute1Max() != null) body.put("searchAttribute1Max", request.getSearchAttribute1Max());
		if(request.getSearchAttribute2Min() != null) body.put("searchAttribute2Min", request.getSearchAttribute2Min());
		if(request.getSearchAttribute2Max() != null) body.put("searchAttribute2Max", request.getSearchAttribute2Max());
		if(request.getSearchAttribute3Min() != null) body.put("searchAttribute3Min", request.getSearchAttribute3Min());
		if(request.getSearchAttribute3Max() != null) body.put("searchAttribute3Max", request.getSearchAttribute3Max());
		if(request.getSearchAttribute4Min() != null) body.put("searchAttribute4Min", request.getSearchAttribute4Min());
		if(request.getSearchAttribute4Max() != null) body.put("searchAttribute4Max", request.getSearchAttribute4Max());
		if(request.getSearchAttribute5Min() != null) body.put("searchAttribute5Min", request.getSearchAttribute5Min());
		if(request.getSearchAttribute5Max() != null) body.put("searchAttribute5Max", request.getSearchAttribute5Max());
		if(request.getSearchContext() != null) body.put("searchContext", request.getSearchContext());
		HttpPost post = createHttpPost(
				Gs2Constant.ENDPOINT_HOST + "/matchmaking/" + request.getMatchmakingName() + "/customauto", 
				credential, 
				ENDPOINT,
				CustomAutoDoMatchmakingRequest.Constant.MODULE, 
				CustomAutoDoMatchmakingRequest.Constant.FUNCTION,
				body.toString());
		post.setHeader("X-GS2-ACCESS-TOKEN", request.getAccessToken());
		return doRequest(post, CustomAutoDoMatchmakingResult.class);
	}
	
	/**
	 * CustomAutoマッチメイキング - ギャザリングに参加しているユーザID一覧取得を実行。<br>
	 * <br>
	 * accessToken には {@link Gs2AuthClient#login(io.gs2.auth.control.LoginRequest)} でログインして取得したアクセストークンを指定してください。<br>
	 * 
	 * @param request リクエストパラメータ
	 * @return 更新結果
	 */
	public CustomAutoDescribeJoinedUserResult customAutoDescribeJoinedUser(CustomAutoDescribeJoinedUserRequest request) {
		HttpGet get = createHttpGet(
				Gs2Constant.ENDPOINT_HOST + "/matchmaking/" + request.getMatchmakingName() + "/customauto/" + request.getGatheringId() + "/player", 
				credential, 
				ENDPOINT,
				CustomAutoDescribeJoinedUserRequest.Constant.MODULE, 
				CustomAutoDescribeJoinedUserRequest.Constant.FUNCTION);
		get.setHeader("X-GS2-ACCESS-TOKEN", request.getAccessToken());
		return doRequest(get, CustomAutoDescribeJoinedUserResult.class);
	}
	
	/**
	 * CustomAutoマッチメイキング - ギャザリングからの離脱を実行。<br>
	 * <br>
	 * accessToken には {@link Gs2AuthClient#login(io.gs2.auth.control.LoginRequest)} でログインして取得したアクセストークンを指定してください。<br>
	 * 
	 * @param request リクエストパラメータ
	 */
	public void customAutoLeaveGathering(CustomAutoLeaveGatheringRequest request) {
		HttpDelete delete = createHttpDelete(
				Gs2Constant.ENDPOINT_HOST + "/matchmaking/" + request.getMatchmakingName() + "/customauto/" + request.getGatheringId() + "/player", 
				credential, 
				ENDPOINT,
				CustomAutoLeaveGatheringRequest.Constant.MODULE, 
				CustomAutoLeaveGatheringRequest.Constant.FUNCTION);
		delete.setHeader("X-GS2-ACCESS-TOKEN", request.getAccessToken());
		doRequest(delete, null);
	}
	
	/**
	 * Passcodeマッチメイキング - ギャザリングを作成。<br>
	 * <br>
	 * Passcodeマッチメイキングの開始手段は2つに別れます。<br>
	 * ひとつ目は既存のギャザリングに参加すること。もう一つはこのAPIで実行できる、新しくギャザリングを作成する。という手段です。<br>
	 * <br>
	 * ギャザリングを新しく作成するにあたって必要なパラメータなどはありません。<br>
	 * このAPIを呼び出すことでギャザリングが新しく作られ、ギャザリングには固有のパスコード(8ケタ数字)が割り当てられます。<br>
	 * 割り当てられたパスコードは戻り値に含まれています。<br>
	 * <br>
	 * パスコードの上位は乱数、下位はミリ秒単位のタイムスタンプで構成されています。<br>
	 * そのため、非常に短い間隔でリクエストを出した時に、乱数もあるため可能性は低くいですがパスコードが衝突する可能性があります。<br>
	 * その場合はパスコードを入力した時に同一パスコードを持つギャザリングのうちどのギャザリングに参加するかは不定です。<br>
	 * <br>
	 * 万全を期するには、ミリ秒単位でルームの作成が多数衝突する頻度でギャザリングを作成する必要がある場合は、<br>
	 * Anybody や CustomAuto といった方法のマッチメイキングも併用していただき、友達同士と遊びたい場合にのみ Passcode 方式を利用するよう誘導いただくのが得策です。<br>
	 * <br>
	 * ギャザリング作成後は、マッチメイキング完了コールバックをが返るまで待つことでマッチメイキングの完了を待つことができます。<br>
	 * マッチメイキングの進捗を確認したい場合は {@link Gs2MatchmakingClient#passcodeDescribeJoinedUser(PasscodeDescribeJoinedUserRequest)} を呼び出すことで、<br>
	 * ギャザリングに参加しているユーザIDが取得できるため、誰とマッチメイキングが行われているか途中経過を取得できます。<br>
	 * <br>
	 * ユーザ操作などにより、マッチメイキングを中断する場合は {@link Gs2MatchmakingClient#passcodeLeaveGathering(PasscodeLeaveGatheringRequest)} を呼び出すことで中断できます。<br>
	 * GS2-Matchmaking にはホストという明確な役割は存在しないため、ギャザリングを作成したユーザがマッチメイキングを中断したとしてもマッチメイキングは継続されます。<br>
	 * <br>
	 * accessToken には {@link Gs2AuthClient#login(io.gs2.auth.control.LoginRequest)} でログインして取得したアクセストークンを指定してください。<br>
	 * 
	 * @param request リクエストパラメータ
	 * @return 更新結果
	 */
	public PasscodeCreateGatheringResult passcodeCreateGathering(PasscodeCreateGatheringRequest request) {
		ObjectNode body = JsonNodeFactory.instance.objectNode();
		HttpPost post = createHttpPost(
				Gs2Constant.ENDPOINT_HOST + "/matchmaking/" + request.getMatchmakingName() + "/passcode", 
				credential, 
				ENDPOINT,
				PasscodeCreateGatheringRequest.Constant.MODULE, 
				PasscodeCreateGatheringRequest.Constant.FUNCTION,
				body.toString());
		post.setHeader("X-GS2-ACCESS-TOKEN", request.getAccessToken());
		return doRequest(post, PasscodeCreateGatheringResult.class);
	}

	/**
	 * Passcodeマッチメイキング - ギャザリングに参加。<br>
	 * <br>
	 * Passcodeマッチメイキングの開始手段は2つに別れます。<br>
	 * ひとつ目は新しくギャザリングを作成すること。もう一つはこのAPIで実行できる、既存のギャザリングに参加する。という手段です。<br>
	 * <br>
	 * パスコードの交換方法は GS2 では提供しません。<br>
	 * ソーシャル連携などの手段は各ゲームで実装頂く必要があります。<br>
	 * <br>
	 * 何らかの手段で得たパスコードを指定してこのAPIを呼び出すことで、既存のギャザリングに参加することができます。<br>
	 * <br>
	 * ギャザリング参加後は、マッチメイキング完了コールバックをが返るまで待つことでマッチメイキングの完了を待つことができます。<br>
	 * マッチメイキングの進捗を確認したい場合は {@link Gs2MatchmakingClient#passcodeDescribeJoinedUser(PasscodeDescribeJoinedUserRequest)} を呼び出すことで、<br>
	 * ギャザリングに参加しているユーザIDが取得できるため、誰とマッチメイキングが行われているか途中経過を取得できます。<br>
	 * <br>
	 * ユーザ操作などにより、マッチメイキングを中断する場合は {@link Gs2MatchmakingClient#passcodeLeaveGathering(PasscodeLeaveGatheringRequest)} を呼び出すことで中断できます。<br>
	 * <br>
	 * accessToken には {@link Gs2AuthClient#login(io.gs2.auth.control.LoginRequest)} でログインして取得したアクセストークンを指定してください。<br>
	 * 
	 * @param request リクエストパラメータ
	 * @return 更新結果
	 */
	public PasscodeJoinGatheringResult passcodeJoinGathering(PasscodeJoinGatheringRequest request) {
		ObjectNode body = JsonNodeFactory.instance.objectNode();
		HttpPost post = createHttpPost(
				Gs2Constant.ENDPOINT_HOST + "/matchmaking/" + request.getMatchmakingName() + "/passcode/join/" + request.getPasscode(), 
				credential, 
				ENDPOINT,
				PasscodeJoinGatheringRequest.Constant.MODULE, 
				PasscodeJoinGatheringRequest.Constant.FUNCTION,
				body.toString());
		post.setHeader("X-GS2-ACCESS-TOKEN", request.getAccessToken());
		return doRequest(post, PasscodeJoinGatheringResult.class);
	}
	
	/**
	 * Passcodeマッチメイキング - ギャザリングに参加しているユーザID一覧取得を実行。<br>
	 * <br>
	 * accessToken には {@link Gs2AuthClient#login(io.gs2.auth.control.LoginRequest)} でログインして取得したアクセストークンを指定してください。<br>
	 * 
	 * @param request リクエストパラメータ
	 * @return 更新結果
	 */
	public PasscodeDescribeJoinedUserResult passcodeDescribeJoinedUser(PasscodeDescribeJoinedUserRequest request) {
		HttpGet get = createHttpGet(
				Gs2Constant.ENDPOINT_HOST + "/matchmaking/" + request.getMatchmakingName() + "/passcode/" + request.getGatheringId() + "/player", 
				credential, 
				ENDPOINT,
				PasscodeDescribeJoinedUserRequest.Constant.MODULE, 
				PasscodeDescribeJoinedUserRequest.Constant.FUNCTION);
		get.setHeader("X-GS2-ACCESS-TOKEN", request.getAccessToken());
		return doRequest(get, PasscodeDescribeJoinedUserResult.class);
	}
	
	/**
	 * Passcodeマッチメイキング - ギャザリングからの離脱を実行。<br>
	 * <br>
	 * accessToken には {@link Gs2AuthClient#login(io.gs2.auth.control.LoginRequest)} でログインして取得したアクセストークンを指定してください。<br>
	 * 
	 * @param request リクエストパラメータ
	 */
	public void passcodeLeaveGathering(PasscodeLeaveGatheringRequest request) {
		HttpDelete delete = createHttpDelete(
				Gs2Constant.ENDPOINT_HOST + "/matchmaking/" + request.getMatchmakingName() + "/passcode/" + request.getGatheringId() + "/player", 
				credential, 
				ENDPOINT,
				PasscodeLeaveGatheringRequest.Constant.MODULE, 
				PasscodeLeaveGatheringRequest.Constant.FUNCTION);
		delete.setHeader("X-GS2-ACCESS-TOKEN", request.getAccessToken());
		doRequest(delete, null);
	}

	/**
	 * Passcodeマッチメイキング - ギャザリングの解散を実行。<br>
	 * <br>
	 * ギャザリングへのプレイヤー募集を中止し、解散します。<br>
	 * 解散によって完了コールバックが返ることはありません。<br>
	 * この操作はギャザリングの作成主のユーザのみ行うことができます。<br>
	 * <br>
	 * accessToken には {@link Gs2AuthClient#login(io.gs2.auth.control.LoginRequest)} でログインして取得したアクセストークンを指定してください。<br>
	 * 
	 * @param request リクエストパラメータ
	 */
	public void passcodeBreakupGathering(PasscodeBreakupGatheringRequest request) {
		HttpDelete post = createHttpDelete(
				Gs2Constant.ENDPOINT_HOST + "/matchmaking/" + request.getMatchmakingName() + "/passcode/" + request.getGatheringId(), 
				credential, 
				ENDPOINT,
				PasscodeBreakupGatheringRequest.Constant.MODULE, 
				PasscodeBreakupGatheringRequest.Constant.FUNCTION);
		post.setHeader("X-GS2-ACCESS-TOKEN", request.getAccessToken());
		doRequest(post, null);
	}

	/**
	 * Passcodeマッチメイキング - ギャザリングの早期終了を実行。<br>
	 * <br>
	 * ギャザリングへのプレイヤー募集を早期終了します。<br>
	 * Matchmaking で定義した規定人数に満ていない場合もマッチメイキング完了コールバックが返ります。<br>
	 * この操作はギャザリングの作成主のユーザのみ行うことができます。<br>
	 * <br>
	 * accessToken には {@link Gs2AuthClient#login(io.gs2.auth.control.LoginRequest)} でログインして取得したアクセストークンを指定してください。<br>
	 * 
	 * @param request リクエストパラメータ
	 */
	public void passcodeEarlyCompleteGathering(PasscodeEarlyCompleteGatheringRequest request) {
		HttpPost post = createHttpPost(
				Gs2Constant.ENDPOINT_HOST + "/matchmaking/" + request.getMatchmakingName() + "/passcode/" + request.getGatheringId() + "/complete", 
				credential, 
				ENDPOINT,
				PasscodeEarlyCompleteGatheringRequest.Constant.MODULE, 
				PasscodeEarlyCompleteGatheringRequest.Constant.FUNCTION,
				"");
		post.setHeader("X-GS2-ACCESS-TOKEN", request.getAccessToken());
		doRequest(post, null);
	}

	/**
	 * Roomマッチメイキング - ギャザリングを作成。<br>
	 * <br>
	 * Room 方式のマッチメイキングは以下のプロセスで成立します。<br>
	 * <ol>
	 * <li>{@link Gs2MatchmakingClient#roomCreateGathering(RoomCreateGatheringRequest)} でギャザリングを作成</li>
	 * <li>{@link Gs2MatchmakingClient#roomDescribeGathering(RoomDescribeGatheringRequest)} でギャザリング一覧を取得</li>
	 * <li>気に入ったルームが見つかったら {@link Gs2MatchmakingClient#roomJoinGathering(RoomJoinGatheringRequest)} でギャザリングに参加</li>
	 * </ol>
	 * このAPIでは1番目のプロセスのギャザリングの作成が行えます。<br>
	 * <br>
	 * ギャザリングの作成リクエストには、128バイト以下と非常に小さいですが、ギャザリングのメタ情報を付加することができます。<br>
	 * ここにはホストが遊びたいと思っているゲームモードなどの情報を付与し、ギャザリング一覧での表示に利用できます。<br>
	 * 129バイト以上のデータを利用したい場合はメタデータのURLを格納するなどして対処してください。<br>
	 * <br>
	 * ギャザリング作成後、マッチメイキング完了コールバックをが返るまで待つことでマッチメイキングの完了を待つことができます。<br>
	 * マッチメイキングの進捗を確認したい場合は {@link Gs2MatchmakingClient#roomDescribeJoinedUser(RoomDescribeJoinedUserRequest)} を呼び出すことで、<br>
	 * ギャザリングに参加しているユーザIDが取得できるため、誰とマッチメイキングが行われているか途中経過を取得できます。<br>
	 * <br>
	 * ユーザ操作などにより、マッチメイキングを中断する場合は {@link Gs2MatchmakingClient#roomLeaveGathering(RoomLeaveGatheringRequest)} を呼び出すことで中断できます。<br>
	 * GS2-Matchmaking にはホストという明確な役割は存在しないため、ギャザリングを作成したユーザがマッチメイキングを中断したとしてもマッチメイキングは継続されます。<br>
	 * <br>
	 * accessToken には {@link Gs2AuthClient#login(io.gs2.auth.control.LoginRequest)} でログインして取得したアクセストークンを指定してください。<br>
	 * 
	 * @param request リクエストパラメータ
	 * @return 更新結果
	 */
	public RoomCreateGatheringResult roomCreateGathering(RoomCreateGatheringRequest request) {
		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("meta", request.getMeta());
		HttpPost post = createHttpPost(
				Gs2Constant.ENDPOINT_HOST + "/matchmaking/" + request.getMatchmakingName() + "/room", 
				credential, 
				ENDPOINT,
				RoomCreateGatheringRequest.Constant.MODULE, 
				RoomCreateGatheringRequest.Constant.FUNCTION,
				body.toString());
		post.setHeader("X-GS2-ACCESS-TOKEN", request.getAccessToken());
		return doRequest(post, RoomCreateGatheringResult.class);
	}

	/**
	 * Roomマッチメイキング - ギャザリング一覧を取得。<br>
	 * <br>
	 * Room 方式のマッチメイキングは以下のプロセスで成立します。<br>
	 * <ol>
	 * <li>{@link Gs2MatchmakingClient#roomCreateGathering(RoomCreateGatheringRequest)} でギャザリングを作成</li>
	 * <li>{@link Gs2MatchmakingClient#roomDescribeGathering(RoomDescribeGatheringRequest)} でギャザリング一覧を取得</li>
	 * <li>気に入ったルームが見つかったら {@link Gs2MatchmakingClient#roomJoinGathering(RoomJoinGatheringRequest)} でギャザリングに参加</li>
	 * </ol>
	 * <br>
	 * このAPIでは2番目のプロセスのギャザリング一覧の取得が行えます。<br>
	 * <br>
	 * ギャザリングの一覧をユーザに提供し、気に入ったギャザリングがあれば次のプロセスへ<br>
	 * 見つからなければ、先頭から取り直すか戻り値に含まれる nextPageToken を利用して次のページを案内できます。<br>
	 * 
	 * @param request リクエストパラメータ
	 * @return 更新結果
	 */
	public RoomDescribeGatheringResult roomDescribeGathering(RoomDescribeGatheringRequest request) {
		String url = Gs2Constant.ENDPOINT_HOST + "/matchmaking/" + request.getMatchmakingName() + "/room";
		List<NameValuePair> queryString = new ArrayList<>();
		if(request.getLimit() != null) queryString.add(new BasicNameValuePair("limit", String.valueOf(request.getLimit())));
		if(request.getPageToken() != null) queryString.add(new BasicNameValuePair("pageToken", request.getPageToken()));
		if(queryString.size() > 0) {
			url += "?" + URLEncodedUtils.format(queryString, "UTF-8");
		}
		HttpGet get = createHttpGet(
				url, 
				credential, 
				ENDPOINT,
				RoomDescribeGatheringRequest.Constant.MODULE, 
				RoomDescribeGatheringRequest.Constant.FUNCTION);
		return doRequest(get, RoomDescribeGatheringResult.class);
	}

	/**
	 * Roomマッチメイキング - ギャザリングに参加。<br>
	 * <br>
	 * Room 方式のマッチメイキングは以下のプロセスで成立します。<br>
	 * <ol>
	 * <li>{@link Gs2MatchmakingClient#roomCreateGathering(RoomCreateGatheringRequest)} でギャザリングを作成</li>
	 * <li>{@link Gs2MatchmakingClient#roomDescribeGathering(RoomDescribeGatheringRequest)} でギャザリング一覧を取得</li>
	 * <li>気に入ったルームが見つかったら {@link Gs2MatchmakingClient#roomJoinGathering(RoomJoinGatheringRequest)} でギャザリングに参加</li>
	 * </ol>
	 * <br>
	 * このAPIでは3番目のプロセスのギャザリングへの参加が行えます。<br>
	 * ギャザリングの一覧取得からギャザリングへの参加がアトミックに行われるわけではないので、<br>
	 * このAPIを呼び出した段階では、ギャザリングが解散していたり、すでに満員になっている可能性があります。<br>
	 * そのような場合は、このAPIはエラー応答として、{@link BadRequestException} 例外をスローします。<br>
	 * <br>
	 * ギャザリング参加後、マッチメイキング完了コールバックをが返るまで待つことでマッチメイキングの完了を待つことができます。<br>
	 * マッチメイキングの進捗を確認したい場合は {@link Gs2MatchmakingClient#roomDescribeJoinedUser(RoomDescribeJoinedUserRequest)} を呼び出すことで、<br>
	 * ギャザリングに参加しているユーザIDが取得できるため、誰とマッチメイキングが行われているか途中経過を取得できます。<br>
	 * <br>
	 * ユーザ操作などにより、マッチメイキングを中断する場合は {@link Gs2MatchmakingClient#roomLeaveGathering(RoomLeaveGatheringRequest)} を呼び出すことで中断できます。<br>
	 * <br>
	 * ゲーム利用者にとって、最もニーズに合ったギャザリングに参加できるのが Room 方式のマッチメイキングの特徴ではありますが、<br>
	 * プレイヤー数が多いゲームにおいては、このアトミックに操作が行われないという点がUXにマイナスの影響をおよぼす可能性があります。<br>
	 * どうしても Room 方式でなければならない理由がないのであれば、他のマッチメイキング方式を採用することをおすすめします。<br>
	 * <br>
	 * accessToken には {@link Gs2AuthClient#login(io.gs2.auth.control.LoginRequest)} でログインして取得したアクセストークンを指定してください。<br>
	 * 
	 * @param request リクエストパラメータ
	 * @return 更新結果
	 */
	public RoomJoinGatheringResult roomJoinGathering(RoomJoinGatheringRequest request) {
		ObjectNode body = JsonNodeFactory.instance.objectNode();
		HttpPost post = createHttpPost(
				Gs2Constant.ENDPOINT_HOST + "/matchmaking/" + request.getMatchmakingName() + "/room/" + request.getGatheringId(), 
				credential, 
				ENDPOINT,
				RoomJoinGatheringRequest.Constant.MODULE, 
				RoomJoinGatheringRequest.Constant.FUNCTION,
				body.toString());
		post.setHeader("X-GS2-ACCESS-TOKEN", request.getAccessToken());
		return doRequest(post, RoomJoinGatheringResult.class);
	}
	
	/**
	 * Roomマッチメイキング - ギャザリングに参加しているユーザID一覧取得を実行。<br>
	 * <br>
	 * accessToken には {@link Gs2AuthClient#login(io.gs2.auth.control.LoginRequest)} でログインして取得したアクセストークンを指定してください。<br>
	 * 
	 * @param request リクエストパラメータ
	 * @return 更新結果
	 */
	public RoomDescribeJoinedUserResult roomDescribeJoinedUser(RoomDescribeJoinedUserRequest request) {
		HttpGet get = createHttpGet(
				Gs2Constant.ENDPOINT_HOST + "/matchmaking/" + request.getMatchmakingName() + "/room/" + request.getGatheringId() + "/player", 
				credential, 
				ENDPOINT,
				RoomDescribeJoinedUserRequest.Constant.MODULE, 
				RoomDescribeJoinedUserRequest.Constant.FUNCTION);
		get.setHeader("X-GS2-ACCESS-TOKEN", request.getAccessToken());
		return doRequest(get, RoomDescribeJoinedUserResult.class);
	}

	/**
	 * Roomマッチメイキング - ギャザリングの解散を実行。<br>
	 * <br>
	 * ギャザリングへのプレイヤー募集を中止し、解散します。<br>
	 * 解散によって完了コールバックが返ることはありません。<br>
	 * この操作はギャザリングの作成主のユーザのみ行うことができます。<br>
	 * <br>
	 * accessToken には {@link Gs2AuthClient#login(io.gs2.auth.control.LoginRequest)} でログインして取得したアクセストークンを指定してください。<br>
	 * 
	 * @param request リクエストパラメータ
	 */
	public void roomBreakupGathering(RoomBreakupGatheringRequest request) {
		HttpDelete post = createHttpDelete(
				Gs2Constant.ENDPOINT_HOST + "/matchmaking/" + request.getMatchmakingName() + "/room/" + request.getGatheringId(), 
				credential, 
				ENDPOINT,
				RoomBreakupGatheringRequest.Constant.MODULE, 
				RoomBreakupGatheringRequest.Constant.FUNCTION);
		post.setHeader("X-GS2-ACCESS-TOKEN", request.getAccessToken());
		doRequest(post, null);
	}

	/**
	 * Roomマッチメイキング - ギャザリングの早期終了を実行。<br>
	 * <br>
	 * ギャザリングへのプレイヤー募集を早期終了します。<br>
	 * Matchmaking で定義した規定人数に満ていない場合もマッチメイキング完了コールバックが返ります。<br>
	 * この操作はギャザリングの作成主のユーザのみ行うことができます。<br>
	 * <br>
	 * accessToken には {@link Gs2AuthClient#login(io.gs2.auth.control.LoginRequest)} でログインして取得したアクセストークンを指定してください。<br>
	 * 
	 * @param request リクエストパラメータ
	 */
	public void roomEarlyCompleteGathering(RoomEarlyCompleteGatheringRequest request) {
		HttpPost post = createHttpPost(
				Gs2Constant.ENDPOINT_HOST + "/matchmaking/" + request.getMatchmakingName() + "/room/" + request.getGatheringId() + "/complete", 
				credential, 
				ENDPOINT,
				RoomEarlyCompleteGatheringRequest.Constant.MODULE, 
				RoomEarlyCompleteGatheringRequest.Constant.FUNCTION,
				"");
		post.setHeader("X-GS2-ACCESS-TOKEN", request.getAccessToken());
		doRequest(post, null);
	}
	
	/**
	 * Roomマッチメイキング - ギャザリングからの離脱を実行。<br>
	 * <br>
	 * accessToken には {@link Gs2AuthClient#login(io.gs2.auth.control.LoginRequest)} でログインして取得したアクセストークンを指定してください。<br>
	 * 
	 * @param request リクエストパラメータ
	 */
	public void roomLeaveGathering(RoomLeaveGatheringRequest request) {
		HttpDelete delete = createHttpDelete(
				Gs2Constant.ENDPOINT_HOST + "/matchmaking/" + request.getMatchmakingName() + "/room/" + request.getGatheringId() + "/player", 
				credential, 
				ENDPOINT,
				RoomLeaveGatheringRequest.Constant.MODULE, 
				RoomLeaveGatheringRequest.Constant.FUNCTION);
		delete.setHeader("X-GS2-ACCESS-TOKEN", request.getAccessToken());
		doRequest(delete, null);
	}

}

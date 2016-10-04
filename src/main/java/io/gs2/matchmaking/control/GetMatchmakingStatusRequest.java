package io.gs2.matchmaking.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.matchmaking.Gs2Matchmaking;

/**
 * 受信ボックスの状態取得リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class GetMatchmakingStatusRequest extends Gs2BasicRequest<GetMatchmakingStatusRequest> {

	public static class Constant extends Gs2Matchmaking.Constant {
		public static final String FUNCTION = "GetMatchmakingStatus";
	}

	/** マッチメイキング名 */
	String matchmakingName;

	/**
	 * マッチメイキング名を取得。
	 * 
	 * @return マッチメイキング名
	 */
	public String getMatchmakingName() {
		return matchmakingName;
	}
	
	/**
	 * マッチメイキング名を設定。
	 * 
	 * @param matchmakingName マッチメイキング名
	 */
	public void setMatchmakingName(String matchmakingName) {
		this.matchmakingName = matchmakingName;
	}
	
	/**
	 * マッチメイキング名を設定。
	 * 
	 * @param matchmakingName マッチメイキング名
	 * @return this
	 */
	public GetMatchmakingStatusRequest withMatchmakingName(String matchmakingName) {
		setMatchmakingName(matchmakingName);
		return this;
	}
}

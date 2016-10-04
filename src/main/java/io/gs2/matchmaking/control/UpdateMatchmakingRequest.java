package io.gs2.matchmaking.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.matchmaking.Gs2Matchmaking;

/**
 * マッチメイキングの作成リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class UpdateMatchmakingRequest extends Gs2BasicRequest<UpdateMatchmakingRequest> {

	public static class Constant extends Gs2Matchmaking.Constant {
		public static final String FUNCTION = "UpdateMatchmaking";
	}

	/** マッチメイキング名 */
	String matchmakingName;
	/** 説明文 */
	String description;
	/** サービスクラス */
	String serviceClass;
	/** コールバックURL */
	String callback;

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
	public UpdateMatchmakingRequest withMatchmakingName(String matchmakingName) {
		setMatchmakingName(matchmakingName);
		return this;
	}

	/**
	 * 説明文を取得。
	 * 
	 * @return 説明文
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * 説明文を設定。
	 * 
	 * @param description 説明文
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * 説明文を設定。
	 * 
	 * @param description 説明文
	 * @return this
	 */
	public UpdateMatchmakingRequest withDescription(String description) {
		setDescription(description);
		return this;
	}

	/**
	 * サービスクラスを取得。
	 * 
	 * @return サービスクラス
	 */
	public String getServiceClass() {
		return serviceClass;
	}
	
	/**
	 * サービスクラスを設定。
	 * 
	 * @param serviceClass サービスクラス
	 */
	public void setServiceClass(String serviceClass) {
		this.serviceClass = serviceClass;
	}
	
	/**
	 * サービスクラスを設定。
	 * 
	 * @param serviceClass サービスクラス
	 * @return this
	 */
	public UpdateMatchmakingRequest withServiceClass(String serviceClass) {
		setServiceClass(serviceClass);
		return this;
	}

	/**
	 * コールバックURLを取得。
	 * 
	 * @return コールバックURL
	 */
	public String getCallback() {
		return callback;
	}
	
	/**
	 * コールバックURLを設定。
	 * 
	 * @param callback コールバックURL
	 */
	public void setCallback(String callback) {
		this.callback = callback;
	}
	
	/**
	 * コールバックURLを設定。
	 * 
	 * @param callback コールバックURL
	 * @return this
	 */
	public UpdateMatchmakingRequest withCallback(String callback) {
		setCallback(callback);
		return this;
	}
	
}

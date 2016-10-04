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
public class CreateMatchmakingRequest extends Gs2BasicRequest<CreateMatchmakingRequest> {

	public static class Constant extends Gs2Matchmaking.Constant {
		public static final String FUNCTION = "CreateMatchmaking";
	}

	/** 名前 */
	String name;
	/** 説明 */
	String description;
	/** サービスクラス */
	String serviceClass;
	/** 種類 */
	String type;
	/** 最大プレイヤー数 */
	Integer maxPlayer;
	/** コールバックURL */
	String callback;

	/**
	 * 名前を取得。
	 * 
	 * @return 名前
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 名前を設定。
	 * 
	 * @param name 名前
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 名前を設定。
	 * 
	 * @param name 名前
	 * @return this
	 */
	public CreateMatchmakingRequest withName(String name) {
		setName(name);
		return this;
	}

	/**
	 * 説明を取得。
	 * 
	 * @return 説明
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * 説明を設定。
	 * 
	 * @param description 説明
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * 説明を設定。
	 * 
	 * @param description 説明
	 * @return this
	 */
	public CreateMatchmakingRequest withDescription(String description) {
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
	public CreateMatchmakingRequest withServiceClass(String serviceClass) {
		setServiceClass(serviceClass);
		return this;
	}

	/**
	 * 種類を取得。
	 * 
	 * @return 種類
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * 種類を設定。
	 * 
	 * @param type 種類
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	/**
	 * 種類を設定。
	 * 
	 * @param type 種類
	 * @return this
	 */
	public CreateMatchmakingRequest withType(String type) {
		setType(type);
		return this;
	}

	/**
	 * 最大プレイヤー数を取得。
	 * 
	 * @return 最大プレイヤー数
	 */
	public Integer getMaxPlayer() {
		return maxPlayer;
	}
	
	/**
	 * 最大プレイヤー数を設定。
	 * 
	 * @param maxPlayer 最大プレイヤー数
	 */
	public void setMaxPlayer(Integer maxPlayer) {
		this.maxPlayer = maxPlayer;
	}
	
	/**
	 * 最大プレイヤー数を設定。
	 * 
	 * @param maxPlayer 最大プレイヤー数
	 * @return this
	 */
	public CreateMatchmakingRequest withMaxPlayer(Integer maxPlayer) {
		setMaxPlayer(maxPlayer);
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
	public CreateMatchmakingRequest withCallback(String callback) {
		setCallback(callback);
		return this;
	}
	
}

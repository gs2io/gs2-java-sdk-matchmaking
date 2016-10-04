package io.gs2.matchmaking.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * マッチメイキング
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Matchmaking implements Serializable {

	/** マッチメイキングID */
	String matchmakingId;
	/** オーナーID */
	String ownerId;
	/** マッチメイキング名 */
	String name;
	/** 説明文 */
	String description;
	/** 種類 */
	String type;
	/** 最大プレイヤー数 */
	Integer maxPlayer;
	/** サービスクラス */
	String serviceClass;
	/** コールバックURL */
	String callback;
	/** 登録日時 */
	Long createAt;
	/** 更新日時 */
	Long updateAt;
	
	/**
	 * マッチメイキングIDを取得
	 * 
	 * @return マッチメイキングID
	 */
	public String getMatchmakingId() {
		return matchmakingId;
	}
	
	/**
	 * マッチメイキングIDを設定
	 * 
	 * @param matchmakingId マッチメイキングID
	 */
	public void setMatchmakingId(String matchmakingId) {
		this.matchmakingId = matchmakingId;
	}
	
	/**
	 * オーナーIDを取得
	 * 
	 * @return オーナーID
	 */
	public String getOwnerId() {
		return ownerId;
	}
	
	/**
	 * オーナーIDを設定
	 * 
	 * @param ownerId オーナーID
	 */
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}
	
	/**
	 * マッチメイキング名を取得
	 * 
	 * @return マッチメイキング名
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * マッチメイキング名を設定
	 * 
	 * @param name マッチメイキング名
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 説明文を取得
	 * 
	 * @return 説明文
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * 説明文を設定
	 * 
	 * @param description 説明文
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * 種類を取得
	 * 
	 * @return 種類
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * 種類を設定
	 * 
	 * @param type 種類
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	/**
	 * 最大プレイヤー数を取得
	 * 
	 * @return 最大プレイヤー数
	 */
	public Integer getMaxPlayer() {
		return maxPlayer;
	}
	
	/**
	 * 最大プレイヤー数を設定
	 * 
	 * @param maxPlayer 最大プレイヤー数
	 */
	public void setMaxPlayer(Integer maxPlayer) {
		this.maxPlayer = maxPlayer;
	}
	
	/**
	 * サービスクラスを取得
	 * 
	 * @return サービスクラス
	 */
	public String getServiceClass() {
		return serviceClass;
	}
	
	/**
	 * サービスクラスを設定
	 * 
	 * @param serviceClass サービスクラス
	 */
	public void setServiceClass(String serviceClass) {
		this.serviceClass = serviceClass;
	}
	
	/**
	 * コールバックURLを取得
	 * 
	 * @return コールバックURL
	 */
	public String getCallback() {
		return callback;
	}
	
	/**
	 * コールバックURLを設定
	 * 
	 * @param callback コールバックURL
	 */
	public void setCallback(String callback) {
		this.callback = callback;
	}
	
	/**
	 * 登録日時を取得
	 * 
	 * @return 登録日時
	 */
	public Long getCreateAt() {
		return createAt;
	}
	
	/**
	 * 登録日時を設定
	 * 
	 * @param createAt 登録日時
	 */
	public void setCreateAt(Long createAt) {
		this.createAt = createAt;
	}
	
	/**
	 * 更新日時を取得
	 * 
	 * @return 更新日時
	 */
	public Long getUpdateAt() {
		return updateAt;
	}
	
	/**
	 * 更新日時を設定
	 * 
	 * @param updateAt 更新日時
	 */
	public void setUpdateAt(Long updateAt) {
		this.updateAt = updateAt;
	}
}

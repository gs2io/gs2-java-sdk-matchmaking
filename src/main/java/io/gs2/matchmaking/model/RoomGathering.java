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
public class RoomGathering implements Serializable {

	/** ギャザリングID */
	String gatheringId;
	/** メタデータ */
	String meta;
	/** 参加プレイヤー数 */
	Integer joinPlayer;
	/** 更新日時 */
	Long updateAt;
	
	/**
	 * ギャザリングIDを取得
	 * 
	 * @return ギャザリングID
	 */
	public String getGatheringId() {
		return gatheringId;
	}
	
	/**
	 * ギャザリングIDを設定
	 * 
	 * @param gatheringId ギャザリングID
	 */
	public void setGatheringId(String gatheringId) {
		this.gatheringId = gatheringId;
	}
	
	/**
	 * メタデータを取得
	 * 
	 * @return メタデータ
	 */
	public String getMeta() {
		return meta;
	}
	
	/**
	 * メタデータを設定
	 * 
	 * @param meta メタデータ
	 */
	public void setMeta(String meta) {
		this.meta = meta;
	}
	
	/**
	 * 参加プレイヤー数を取得
	 * 
	 * @return 参加プレイヤー数
	 */
	public Integer getJoinPlayer() {
		return joinPlayer;
	}
	
	/**
	 * 参加プレイヤー数を設定
	 * 
	 * @param joinPlayer 参加プレイヤー数
	 */
	public void setJoinPlayer(Integer joinPlayer) {
		this.joinPlayer = joinPlayer;
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

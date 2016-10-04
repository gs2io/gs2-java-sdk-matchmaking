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
public class CustomAutoGathering implements Serializable {

	/** ギャザリングID */
	String gatheringId;
	/** 属性値1 */
	Integer attribute1;
	/** 属性値2 */
	Integer attribute2;
	/** 属性値3 */
	Integer attribute3;
	/** 属性値4 */
	Integer attribute4;
	/** 属性値5 */
	Integer attribute5;
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
	 * 属性値1を取得
	 * 
	 * @return 属性値1
	 */
	public Integer getAttribute1() {
		return attribute1;
	}
	
	/**
	 * 属性値1を設定
	 * 
	 * @param attribute1 属性値1
	 */
	public void setAttribute1(Integer attribute1) {
		this.attribute1 = attribute1;
	}
	
	/**
	 * 属性値2を取得
	 * 
	 * @return 属性値2
	 */
	public Integer getAttribute2() {
		return attribute2;
	}
	
	/**
	 * 属性値2を設定
	 * 
	 * @param attribute2 属性値2
	 */
	public void setAttribute2(Integer attribute2) {
		this.attribute2 = attribute2;
	}
	
	/**
	 * 属性値3を取得
	 * 
	 * @return 属性値3
	 */
	public Integer getAttribute3() {
		return attribute3;
	}
	
	/**
	 * 属性値3を設定
	 * 
	 * @param attribute3 属性値3
	 */
	public void setAttribute3(Integer attribute3) {
		this.attribute3 = attribute3;
	}
	
	/**
	 * 属性値4を取得
	 * 
	 * @return 属性値4
	 */
	public Integer getAttribute4() {
		return attribute4;
	}
	
	/**
	 * 属性値4を設定
	 * 
	 * @param attribute4 属性値4
	 */
	public void setAttribute4(Integer attribute4) {
		this.attribute4 = attribute4;
	}
	
	/**
	 * 属性値5を取得
	 * 
	 * @return 属性値5
	 */
	public Integer getAttribute5() {
		return attribute5;
	}
	
	/**
	 * 属性値5を設定
	 * 
	 * @param attribute5 属性値5
	 */
	public void setAttribute5(Integer attribute5) {
		this.attribute5 = attribute5;
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

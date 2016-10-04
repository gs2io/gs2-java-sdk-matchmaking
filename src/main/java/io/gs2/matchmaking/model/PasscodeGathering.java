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
public class PasscodeGathering implements Serializable {

	/** ギャザリングID */
	String gatheringId;
	/** パスコード */
	String passcode;
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
	 * パスコードを取得
	 * 
	 * @return パスコード
	 */
	public String getPasscode() {
		return passcode;
	}
	
	/**
	 * パスコードを設定
	 * 
	 * @param passcode パスコード
	 */
	public void setPasscode(String passcode) {
		this.passcode = passcode;
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

package io.gs2.matchmaking.control;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.matchmaking.model.PasscodeGathering;

/**
 * Passcodeマッチメイキングの実行結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class PasscodeJoinGatheringResult {
	
	PasscodeGathering item;
	
	/**
	 * ギャザリングを取得。
	 * 
	 * @return ギャザリング
	 */
	public PasscodeGathering getItem() {
		return item;
	}
	
	/**
	 * ギャザリングを設定。
	 * 
	 * @param item ギャザリング
	 */
	public void setItem(PasscodeGathering item) {
		this.item = item;
	}
	
	/**
	 * ギャザリングを設定。
	 * 
	 * @param item ギャザリング
	 * @return this
	 */
	public PasscodeJoinGatheringResult withItem(PasscodeGathering item) {
		setItem(item);
		return this;
	}
}

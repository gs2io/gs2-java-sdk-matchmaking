package io.gs2.matchmaking.control;

import io.gs2.matchmaking.model.PasscodeGathering;

/**
 * Passcodeマッチメイキング - ギャザリングの作成実行結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
public class PasscodeCreateGatheringResult {
	
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
	public PasscodeCreateGatheringResult withItem(PasscodeGathering item) {
		setItem(item);
		return this;
	}
}

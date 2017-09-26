package io.gs2.matchmaking.control;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.matchmaking.model.AnybodyGathering;

/**
 * Anybodyマッチメイキングの実行結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class AnybodyDoMatchmakingResult {
	
	AnybodyGathering item;
	
	/**
	 * ギャザリングを取得。
	 * 
	 * @return ギャザリング
	 */
	public AnybodyGathering getItem() {
		return item;
	}
	
	/**
	 * ギャザリングを設定。
	 * 
	 * @param item ギャザリング
	 */
	public void setItem(AnybodyGathering item) {
		this.item = item;
	}
	
	/**
	 * ギャザリングを設定。
	 * 
	 * @param item ギャザリング
	 * @return this
	 */
	public AnybodyDoMatchmakingResult withItem(AnybodyGathering item) {
		setItem(item);
		return this;
	}
}

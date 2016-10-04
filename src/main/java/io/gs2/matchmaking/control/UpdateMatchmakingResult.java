package io.gs2.matchmaking.control;

import io.gs2.matchmaking.model.Matchmaking;

/**
 * マッチメイキングの作成結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
public class UpdateMatchmakingResult {
	
	Matchmaking item;
	
	/**
	 * マッチメイキングを取得。
	 * 
	 * @return マッチメイキング
	 */
	public Matchmaking getItem() {
		return item;
	}
	
	/**
	 * マッチメイキングを設定。
	 * 
	 * @param item マッチメイキング
	 */
	public void setItem(Matchmaking item) {
		this.item = item;
	}
	
	/**
	 * マッチメイキングを設定。
	 * 
	 * @param item マッチメイキング
	 * @return this
	 */
	public UpdateMatchmakingResult withItem(Matchmaking item) {
		setItem(item);
		return this;
	}
}

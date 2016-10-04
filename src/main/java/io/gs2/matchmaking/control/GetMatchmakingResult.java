package io.gs2.matchmaking.control;

import io.gs2.matchmaking.model.Matchmaking;

/**
 * マッチメイキング取得結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
public class GetMatchmakingResult {

	/** マッチメイキング */
	Matchmaking item;
	
	/**
	 * 取得したマッチメイキングを取得。
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
}

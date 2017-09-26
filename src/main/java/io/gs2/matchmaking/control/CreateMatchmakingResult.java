package io.gs2.matchmaking.control;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.matchmaking.model.Matchmaking;

/**
 * マッチメイキングの作成結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class CreateMatchmakingResult {
	
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
	public CreateMatchmakingResult withItem(Matchmaking item) {
		setItem(item);
		return this;
	}
}

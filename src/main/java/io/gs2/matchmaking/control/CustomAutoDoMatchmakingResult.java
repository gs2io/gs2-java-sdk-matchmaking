package io.gs2.matchmaking.control;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.matchmaking.model.CustomAutoGathering;

/**
 * CustomAutoマッチメイキングの実行結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class CustomAutoDoMatchmakingResult {
	
	Boolean done;
	CustomAutoGathering item;
	String searchContext;

	/**
	 * マッチメイキング完了を取得。
	 * 
	 * @return マッチメイキング完了
	 */
	public Boolean getDone() {
		return done;
	}
	
	/**
	 * マッチメイキング完了を設定。
	 * 
	 * @param done マッチメイキング完了
	 */
	public void setDone(Boolean done) {
		this.done = done;
	}
	
	/**
	 * マッチメイキング完了を設定。
	 * 
	 * @param done マッチメイキング完了
	 * @return this
	 */
	public CustomAutoDoMatchmakingResult withDone(Boolean done) {
		setDone(done);
		return this;
	}

	/**
	 * ギャザリングを取得。
	 * 
	 * @return ギャザリング
	 */
	public CustomAutoGathering getItem() {
		return item;
	}
	
	/**
	 * ギャザリングを設定。
	 * 
	 * @param item ギャザリング
	 */
	public void setItem(CustomAutoGathering item) {
		this.item = item;
	}
	
	/**
	 * ギャザリングを設定。
	 * 
	 * @param item ギャザリング
	 * @return this
	 */
	public CustomAutoDoMatchmakingResult withItem(CustomAutoGathering item) {
		setItem(item);
		return this;
	}

	/**
	 * 検索コンテキストを取得。
	 * 
	 * @return 検索コンテキスト
	 */
	public String getSearchContext() {
		return searchContext;
	}
	
	/**
	 * 検索コンテキストを設定。
	 * 
	 * @param searchContext 検索コンテキスト
	 */
	public void setSearchContext(String searchContext) {
		this.searchContext = searchContext;
	}
	
	/**
	 * 検索コンテキストを設定。
	 * 
	 * @param searchContext 検索コンテキスト
	 * @return this
	 */
	public CustomAutoDoMatchmakingResult withSearchContext(String searchContext) {
		setSearchContext(searchContext);
		return this;
	}

}

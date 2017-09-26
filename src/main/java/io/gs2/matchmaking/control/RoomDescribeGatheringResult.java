package io.gs2.matchmaking.control;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.matchmaking.model.RoomGathering;

/**
 * Roomマッチメイキング - ギャザリングの一覧取得実行結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class RoomDescribeGatheringResult {

	/** マッチメイキング一覧 */
	List<RoomGathering> items;
	/** 次のページを取得するためのトークン */
	String nextPageToken;
	
	/**
	 * 取得したマッチメイキング数を取得。
	 * 
	 * @return 取得したマッチメイキング数
	 */
	public Integer getCount() {
		return items == null ? null : items.size();
	}
	
	@Deprecated
	public void setCount(Integer count) {}
	
	/**
	 * 取得したマッチメイキング一覧を取得。
	 * 
	 * @return マッチメイキング一覧
	 */
	public List<RoomGathering> getItems() {
		return items;
	}
	
	/**
	 * マッチメイキング一覧を設定。
	 * 
	 * @param items マッチメイキング一覧
	 */
	public void setItems(List<RoomGathering> items) {
		this.items = items;
	}
	
	/**
	 * 次のページを取得するためのトークンを取得。
	 * 
	 * {@link RoomDescribeGatheringRequest} に指定することで、次のページを取得できます。
	 * 
	 * @return トークン
	 */
	public String getNextPageToken() {
		return nextPageToken;
	}

	public void setNextPageToken(String nextPageToken) {
		this.nextPageToken = nextPageToken;
	}
}

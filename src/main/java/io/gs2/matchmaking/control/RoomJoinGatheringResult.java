package io.gs2.matchmaking.control;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.matchmaking.model.RoomGathering;

/**
 * Roomマッチメイキングの実行結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class RoomJoinGatheringResult {
	
	RoomGathering item;
	
	/**
	 * ギャザリングを取得。
	 * 
	 * @return ギャザリング
	 */
	public RoomGathering getItem() {
		return item;
	}
	
	/**
	 * ギャザリングを設定。
	 * 
	 * @param item ギャザリング
	 */
	public void setItem(RoomGathering item) {
		this.item = item;
	}
	
	/**
	 * ギャザリングを設定。
	 * 
	 * @param item ギャザリング
	 * @return this
	 */
	public RoomJoinGatheringResult withItem(RoomGathering item) {
		setItem(item);
		return this;
	}
}

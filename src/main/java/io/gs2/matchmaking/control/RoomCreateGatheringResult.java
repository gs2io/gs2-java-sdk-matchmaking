package io.gs2.matchmaking.control;

import io.gs2.matchmaking.model.RoomGathering;

/**
 * Roomマッチメイキング - ギャザリングの作成実行結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
public class RoomCreateGatheringResult {
	
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
	public RoomCreateGatheringResult withItem(RoomGathering item) {
		setItem(item);
		return this;
	}
}

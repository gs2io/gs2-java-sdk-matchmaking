package io.gs2.matchmaking.control;

import io.gs2.control.Gs2UserRequest;
import io.gs2.matchmaking.Gs2Matchmaking;

/**
 * Roomマッチメイキング - ギャザリングの早期終了リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class RoomEarlyCompleteGatheringRequest extends Gs2UserRequest<RoomEarlyCompleteGatheringRequest> {

	public static class Constant extends Gs2Matchmaking.Constant {
		public static final String FUNCTION = "EarlyCompleteGathering";
	}

	/** マッチメイキング名 */
	String matchmakingName;
	/** ギャザリングID */
	String gatheringId;

	/**
	 * マッチメイキング名を取得。
	 * 
	 * @return マッチメイキング名
	 */
	public String getMatchmakingName() {
		return matchmakingName;
	}
	
	/**
	 * マッチメイキング名を設定。
	 * 
	 * @param matchmakingName マッチメイキング名
	 */
	public void setMatchmakingName(String matchmakingName) {
		this.matchmakingName = matchmakingName;
	}
	
	/**
	 * マッチメイキング名を設定。
	 * 
	 * @param matchmakingName マッチメイキング名
	 * @return this
	 */
	public RoomEarlyCompleteGatheringRequest withMatchmakingName(String matchmakingName) {
		setMatchmakingName(matchmakingName);
		return this;
	}
	
	/**
	 * ギャザリングIDを取得。
	 * 
	 * @return ギャザリングID
	 */
	public String getGatheringId() {
		return gatheringId;
	}
	
	/**
	 * ギャザリングIDを設定。
	 * 
	 * @param gatheringId ギャザリングID
	 */
	public void setGatheringId(String gatheringId) {
		this.gatheringId = gatheringId;
	}
	
	/**
	 * ギャザリングIDを設定。
	 * 
	 * @param gatheringId ギャザリングID
	 * @return this
	 */
	public RoomEarlyCompleteGatheringRequest withGatheringId(String gatheringId) {
		setGatheringId(gatheringId);
		return this;
	}
}

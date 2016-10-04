package io.gs2.matchmaking.control;

import io.gs2.control.Gs2UserRequest;
import io.gs2.matchmaking.Gs2Matchmaking;

/**
 * Roomマッチメイキング - ギャザリングの作成リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class RoomCreateGatheringRequest extends Gs2UserRequest<RoomCreateGatheringRequest> {

	public static class Constant extends Gs2Matchmaking.Constant {
		public static final String FUNCTION = "CreateGathering";
	}

	/** マッチメイキング名 */
	String matchmakingName;
	/** メタデータ */
	String meta;

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
	public RoomCreateGatheringRequest withMatchmakingName(String matchmakingName) {
		setMatchmakingName(matchmakingName);
		return this;
	}

	/**
	 * メタデータを取得。
	 * 
	 * @return メタデータ
	 */
	public String getMeta() {
		return meta;
	}
	
	/**
	 * メタデータを設定。
	 * 
	 * @param meta メタデータ
	 */
	public void setMeta(String meta) {
		this.meta = meta;
	}
	
	/**
	 * メタデータを設定。
	 * 
	 * @param meta メタデータ
	 * @return this
	 */
	public RoomCreateGatheringRequest withMeta(String meta) {
		setMeta(meta);
		return this;
	}
}

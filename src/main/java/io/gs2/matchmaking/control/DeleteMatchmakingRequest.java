package io.gs2.matchmaking.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.matchmaking.Gs2Matchmaking;

/**
 * マッチメイキングの削除リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class DeleteMatchmakingRequest extends Gs2BasicRequest<DeleteMatchmakingRequest> {

	public static class Constant extends Gs2Matchmaking.Constant {
		public static final String FUNCTION = "DeleteMatchmaking";
	}
	
	/** マッチメイキング名 */
	String matchmakingName;
	
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
	public DeleteMatchmakingRequest withMatchmakingName(String matchmakingName) {
		setMatchmakingName(matchmakingName);
		return this;
	}
}

package io.gs2.matchmaking.control;

import io.gs2.control.Gs2UserRequest;
import io.gs2.matchmaking.Gs2Matchmaking;

/**
 * マッチメイキングの作成リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class AnybodyDoMatchmakingRequest extends Gs2UserRequest<AnybodyDoMatchmakingRequest> {

	public static class Constant extends Gs2Matchmaking.Constant {
		public static final String FUNCTION = "DoMatchmaking";
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
	public AnybodyDoMatchmakingRequest withMatchmakingName(String matchmakingName) {
		setMatchmakingName(matchmakingName);
		return this;
	}
}

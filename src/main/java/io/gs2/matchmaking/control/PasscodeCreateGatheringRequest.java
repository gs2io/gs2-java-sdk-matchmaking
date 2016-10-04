package io.gs2.matchmaking.control;

import io.gs2.control.Gs2UserRequest;
import io.gs2.matchmaking.Gs2Matchmaking;

/**
 * Passcodeマッチメイキング - ギャザリングの作成リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class PasscodeCreateGatheringRequest extends Gs2UserRequest<PasscodeCreateGatheringRequest> {

	public static class Constant extends Gs2Matchmaking.Constant {
		public static final String FUNCTION = "CreateGathering";
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
	public PasscodeCreateGatheringRequest withMatchmakingName(String matchmakingName) {
		setMatchmakingName(matchmakingName);
		return this;
	}
}

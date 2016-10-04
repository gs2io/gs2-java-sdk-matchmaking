package io.gs2.matchmaking.control;

import io.gs2.control.Gs2UserRequest;
import io.gs2.matchmaking.Gs2Matchmaking;

/**
 * Passcodeマッチメイキング - ギャザリングへの参加リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class PasscodeJoinGatheringRequest extends Gs2UserRequest<PasscodeJoinGatheringRequest> {

	public static class Constant extends Gs2Matchmaking.Constant {
		public static final String FUNCTION = "JoinGathering";
	}

	/** マッチメイキング名 */
	String matchmakingName;
	/** パスコード */
	String passcode;

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
	public PasscodeJoinGatheringRequest withMatchmakingName(String matchmakingName) {
		setMatchmakingName(matchmakingName);
		return this;
	}

	/**
	 * パスコードを取得。
	 * 
	 * @return パスコード
	 */
	public String getPasscode() {
		return passcode;
	}
	
	/**
	 * パスコードを設定。
	 * 
	 * @param passcode パスコード
	 */
	public void setPasscode(String passcode) {
		this.passcode = passcode;
	}
	
	/**
	 * パスコードを設定。
	 * 
	 * @param passcode パスコード
	 * @return this
	 */
	public PasscodeJoinGatheringRequest withPasscode(String passcode) {
		setPasscode(passcode);
		return this;
	}
}

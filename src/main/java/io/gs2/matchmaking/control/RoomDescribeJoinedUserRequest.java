/*
 * Copyright 2016 Game Server Services, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package io.gs2.matchmaking.control;

import org.json.JSONObject;
import java.util.List;
import io.gs2.matchmaking.Gs2Matchmaking;
import io.gs2.control.Gs2UserRequest;

/**
 * @author Game Server Services, Inc.
 */
@SuppressWarnings("serial")
public class RoomDescribeJoinedUserRequest extends Gs2UserRequest<RoomDescribeJoinedUserRequest> {

	public static class Constant extends Gs2Matchmaking.Constant {
		public static final String FUNCTION = "DescribeJoinedUser";
	}

	/** マッチメイキングの名前を指定します。 */
	private String matchmakingName;

	/** ギャザリングのIDを指定します。 */
	private String gatheringId;


	/**
	 * マッチメイキングの名前を指定します。を取得
	 *
	 * @return マッチメイキングの名前を指定します。
	 */
	public String getMatchmakingName() {
		return matchmakingName;
	}

	/**
	 * マッチメイキングの名前を指定します。を設定
	 *
	 * @param matchmakingName マッチメイキングの名前を指定します。
	 */
	public void setMatchmakingName(String matchmakingName) {
		this.matchmakingName = matchmakingName;
	}

	/**
	 * マッチメイキングの名前を指定します。を設定
	 *
	 * @param matchmakingName マッチメイキングの名前を指定します。
	 * @return this
	 */
	public RoomDescribeJoinedUserRequest withMatchmakingName(String matchmakingName) {
		setMatchmakingName(matchmakingName);
		return this;
	}

	/**
	 * ギャザリングのIDを指定します。を取得
	 *
	 * @return ギャザリングのIDを指定します。
	 */
	public String getGatheringId() {
		return gatheringId;
	}

	/**
	 * ギャザリングのIDを指定します。を設定
	 *
	 * @param gatheringId ギャザリングのIDを指定します。
	 */
	public void setGatheringId(String gatheringId) {
		this.gatheringId = gatheringId;
	}

	/**
	 * ギャザリングのIDを指定します。を設定
	 *
	 * @param gatheringId ギャザリングのIDを指定します。
	 * @return this
	 */
	public RoomDescribeJoinedUserRequest withGatheringId(String gatheringId) {
		setGatheringId(gatheringId);
		return this;
	}

}
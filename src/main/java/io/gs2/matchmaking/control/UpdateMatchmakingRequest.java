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
import io.gs2.control.Gs2BasicRequest;

/**
 * @author Game Server Services, Inc.
 */
@SuppressWarnings("serial")
public class UpdateMatchmakingRequest extends Gs2BasicRequest<UpdateMatchmakingRequest> {

	public static class Constant extends Gs2Matchmaking.Constant {
		public static final String FUNCTION = "UpdateMatchmaking";
	}

	/** マッチメイキングの名前を指定します。 */
	private String matchmakingName;

	/** マッチメイキング完了コールバックURL */
	private String callback;

	/** マッチメイキングのサービスクラス */
	private String serviceClass;

	/** マッチメイキングの説明 */
	private String description;

	/** GS2-InGamePushNotification のゲーム名 */
	private String notificationGameName;

	/** GS2-Realtime のギャザリングプール名 */
	private String gatheringPoolName;


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
	public UpdateMatchmakingRequest withMatchmakingName(String matchmakingName) {
		setMatchmakingName(matchmakingName);
		return this;
	}

	/**
	 * マッチメイキング完了コールバックURLを取得
	 *
	 * @return マッチメイキング完了コールバックURL
	 */
	public String getCallback() {
		return callback;
	}

	/**
	 * マッチメイキング完了コールバックURLを設定
	 *
	 * @param callback マッチメイキング完了コールバックURL
	 */
	public void setCallback(String callback) {
		this.callback = callback;
	}

	/**
	 * マッチメイキング完了コールバックURLを設定
	 *
	 * @param callback マッチメイキング完了コールバックURL
	 * @return this
	 */
	public UpdateMatchmakingRequest withCallback(String callback) {
		setCallback(callback);
		return this;
	}

	/**
	 * マッチメイキングのサービスクラスを取得
	 *
	 * @return マッチメイキングのサービスクラス
	 */
	public String getServiceClass() {
		return serviceClass;
	}

	/**
	 * マッチメイキングのサービスクラスを設定
	 *
	 * @param serviceClass マッチメイキングのサービスクラス
	 */
	public void setServiceClass(String serviceClass) {
		this.serviceClass = serviceClass;
	}

	/**
	 * マッチメイキングのサービスクラスを設定
	 *
	 * @param serviceClass マッチメイキングのサービスクラス
	 * @return this
	 */
	public UpdateMatchmakingRequest withServiceClass(String serviceClass) {
		setServiceClass(serviceClass);
		return this;
	}

	/**
	 * マッチメイキングの説明を取得
	 *
	 * @return マッチメイキングの説明
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * マッチメイキングの説明を設定
	 *
	 * @param description マッチメイキングの説明
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * マッチメイキングの説明を設定
	 *
	 * @param description マッチメイキングの説明
	 * @return this
	 */
	public UpdateMatchmakingRequest withDescription(String description) {
		setDescription(description);
		return this;
	}

	/**
	 * GS2-InGamePushNotification のゲーム名を取得
	 *
	 * @return GS2-InGamePushNotification のゲーム名
	 */
	public String getNotificationGameName() {
		return notificationGameName;
	}

	/**
	 * GS2-InGamePushNotification のゲーム名を設定
	 *
	 * @param notificationGameName GS2-InGamePushNotification のゲーム名
	 */
	public void setNotificationGameName(String notificationGameName) {
		this.notificationGameName = notificationGameName;
	}

	/**
	 * GS2-InGamePushNotification のゲーム名を設定
	 *
	 * @param notificationGameName GS2-InGamePushNotification のゲーム名
	 * @return this
	 */
	public UpdateMatchmakingRequest withNotificationGameName(String notificationGameName) {
		setNotificationGameName(notificationGameName);
		return this;
	}

	/**
	 * GS2-Realtime のギャザリングプール名を取得
	 *
	 * @return GS2-Realtime のギャザリングプール名
	 */
	public String getGatheringPoolName() {
		return gatheringPoolName;
	}

	/**
	 * GS2-Realtime のギャザリングプール名を設定
	 *
	 * @param gatheringPoolName GS2-Realtime のギャザリングプール名
	 */
	public void setGatheringPoolName(String gatheringPoolName) {
		this.gatheringPoolName = gatheringPoolName;
	}

	/**
	 * GS2-Realtime のギャザリングプール名を設定
	 *
	 * @param gatheringPoolName GS2-Realtime のギャザリングプール名
	 * @return this
	 */
	public UpdateMatchmakingRequest withGatheringPoolName(String gatheringPoolName) {
		setGatheringPoolName(gatheringPoolName);
		return this;
	}

}
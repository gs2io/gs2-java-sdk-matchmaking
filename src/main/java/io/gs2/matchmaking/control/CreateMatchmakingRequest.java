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
public class CreateMatchmakingRequest extends Gs2BasicRequest<CreateMatchmakingRequest> {

	public static class Constant extends Gs2Matchmaking.Constant {
		public static final String FUNCTION = "CreateMatchmaking";
	}

	/** マッチメイキングの名前 */
	private String name;

	/** マッチメイキングのサービスクラス */
	private String serviceClass;

	/** GS2-Realtime のギャザリングプール名 */
	private String gatheringPoolName;

	/** マッチメイキング完了コールバックURL */
	private String callback;

	/** 最大プレイヤー数 */
	private Integer maxPlayer;

	/** GS2-InGamePushNotification のゲーム名 */
	private String notificationGameName;

	/** マッチメイキングの種類 */
	private String type;

	/** マッチメイキングの説明 */
	private String description;


	/**
	 * マッチメイキングの名前を取得
	 *
	 * @return マッチメイキングの名前
	 */
	public String getName() {
		return name;
	}

	/**
	 * マッチメイキングの名前を設定
	 *
	 * @param name マッチメイキングの名前
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * マッチメイキングの名前を設定
	 *
	 * @param name マッチメイキングの名前
	 * @return this
	 */
	public CreateMatchmakingRequest withName(String name) {
		setName(name);
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
	public CreateMatchmakingRequest withServiceClass(String serviceClass) {
		setServiceClass(serviceClass);
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
	public CreateMatchmakingRequest withGatheringPoolName(String gatheringPoolName) {
		setGatheringPoolName(gatheringPoolName);
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
	public CreateMatchmakingRequest withCallback(String callback) {
		setCallback(callback);
		return this;
	}

	/**
	 * 最大プレイヤー数を取得
	 *
	 * @return 最大プレイヤー数
	 */
	public Integer getMaxPlayer() {
		return maxPlayer;
	}

	/**
	 * 最大プレイヤー数を設定
	 *
	 * @param maxPlayer 最大プレイヤー数
	 */
	public void setMaxPlayer(Integer maxPlayer) {
		this.maxPlayer = maxPlayer;
	}

	/**
	 * 最大プレイヤー数を設定
	 *
	 * @param maxPlayer 最大プレイヤー数
	 * @return this
	 */
	public CreateMatchmakingRequest withMaxPlayer(Integer maxPlayer) {
		setMaxPlayer(maxPlayer);
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
	public CreateMatchmakingRequest withNotificationGameName(String notificationGameName) {
		setNotificationGameName(notificationGameName);
		return this;
	}

	/**
	 * マッチメイキングの種類を取得
	 *
	 * @return マッチメイキングの種類
	 */
	public String getType() {
		return type;
	}

	/**
	 * マッチメイキングの種類を設定
	 *
	 * @param type マッチメイキングの種類
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * マッチメイキングの種類を設定
	 *
	 * @param type マッチメイキングの種類
	 * @return this
	 */
	public CreateMatchmakingRequest withType(String type) {
		setType(type);
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
	public CreateMatchmakingRequest withDescription(String description) {
		setDescription(description);
		return this;
	}

}
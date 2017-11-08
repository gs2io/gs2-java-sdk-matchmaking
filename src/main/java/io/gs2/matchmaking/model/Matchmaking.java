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

package io.gs2.matchmaking.model;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * マッチメイキング
 *
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Matchmaking implements Serializable {

	/** マッチメイキング名 */
	private String name;

	/** マッチメイキング方式 - anybody - customauto - passcode - room */
	private String type;

	/** マッチメイキングGRN */
	private String matchmakingId;

	/** サービスクラス */
	private String serviceClass;

	/** マッチメイキング完了時に GS2-Realtime と自動的に連携する場合に指定するギャザリングプール名 */
	private String gatheringPoolName;

	/** マッチメイキング完了時の通知先URL */
	private String callback;

	/** 作成日時(エポック秒) */
	private Integer createAt;

	/** 最大プレイヤー数 */
	private Integer maxPlayer;

	/** マッチメイキングの状態変化や完了通知を GS2-InGamePushNotification を使用して通知する場合に指定するゲーム名 */
	private String notificationGameName;

	/** オーナーID */
	private String ownerId;

	/** 最終更新日時(エポック秒) */
	private Integer updateAt;

	/** 説明文 */
	private String description;


	/**
	 * マッチメイキング名を取得
	 *
	 * @return マッチメイキング名
	 */
	public String getName() {
		return name;
	}

	/**
	 * マッチメイキング名を設定
	 *
	 * @param name マッチメイキング名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * マッチメイキング方式 - anybody - customauto - passcode - roomを取得
	 *
	 * @return マッチメイキング方式 - anybody - customauto - passcode - room
	 */
	public String getType() {
		return type;
	}

	/**
	 * マッチメイキング方式 - anybody - customauto - passcode - roomを設定
	 *
	 * @param type マッチメイキング方式 - anybody - customauto - passcode - room
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * マッチメイキングGRNを取得
	 *
	 * @return マッチメイキングGRN
	 */
	public String getMatchmakingId() {
		return matchmakingId;
	}

	/**
	 * マッチメイキングGRNを設定
	 *
	 * @param matchmakingId マッチメイキングGRN
	 */
	public void setMatchmakingId(String matchmakingId) {
		this.matchmakingId = matchmakingId;
	}

	/**
	 * サービスクラスを取得
	 *
	 * @return サービスクラス
	 */
	public String getServiceClass() {
		return serviceClass;
	}

	/**
	 * サービスクラスを設定
	 *
	 * @param serviceClass サービスクラス
	 */
	public void setServiceClass(String serviceClass) {
		this.serviceClass = serviceClass;
	}

	/**
	 * マッチメイキング完了時に GS2-Realtime と自動的に連携する場合に指定するギャザリングプール名を取得
	 *
	 * @return マッチメイキング完了時に GS2-Realtime と自動的に連携する場合に指定するギャザリングプール名
	 */
	public String getGatheringPoolName() {
		return gatheringPoolName;
	}

	/**
	 * マッチメイキング完了時に GS2-Realtime と自動的に連携する場合に指定するギャザリングプール名を設定
	 *
	 * @param gatheringPoolName マッチメイキング完了時に GS2-Realtime と自動的に連携する場合に指定するギャザリングプール名
	 */
	public void setGatheringPoolName(String gatheringPoolName) {
		this.gatheringPoolName = gatheringPoolName;
	}

	/**
	 * マッチメイキング完了時の通知先URLを取得
	 *
	 * @return マッチメイキング完了時の通知先URL
	 */
	public String getCallback() {
		return callback;
	}

	/**
	 * マッチメイキング完了時の通知先URLを設定
	 *
	 * @param callback マッチメイキング完了時の通知先URL
	 */
	public void setCallback(String callback) {
		this.callback = callback;
	}

	/**
	 * 作成日時(エポック秒)を取得
	 *
	 * @return 作成日時(エポック秒)
	 */
	public Integer getCreateAt() {
		return createAt;
	}

	/**
	 * 作成日時(エポック秒)を設定
	 *
	 * @param createAt 作成日時(エポック秒)
	 */
	public void setCreateAt(Integer createAt) {
		this.createAt = createAt;
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
	 * マッチメイキングの状態変化や完了通知を GS2-InGamePushNotification を使用して通知する場合に指定するゲーム名を取得
	 *
	 * @return マッチメイキングの状態変化や完了通知を GS2-InGamePushNotification を使用して通知する場合に指定するゲーム名
	 */
	public String getNotificationGameName() {
		return notificationGameName;
	}

	/**
	 * マッチメイキングの状態変化や完了通知を GS2-InGamePushNotification を使用して通知する場合に指定するゲーム名を設定
	 *
	 * @param notificationGameName マッチメイキングの状態変化や完了通知を GS2-InGamePushNotification を使用して通知する場合に指定するゲーム名
	 */
	public void setNotificationGameName(String notificationGameName) {
		this.notificationGameName = notificationGameName;
	}

	/**
	 * オーナーIDを取得
	 *
	 * @return オーナーID
	 */
	public String getOwnerId() {
		return ownerId;
	}

	/**
	 * オーナーIDを設定
	 *
	 * @param ownerId オーナーID
	 */
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	/**
	 * 最終更新日時(エポック秒)を取得
	 *
	 * @return 最終更新日時(エポック秒)
	 */
	public Integer getUpdateAt() {
		return updateAt;
	}

	/**
	 * 最終更新日時(エポック秒)を設定
	 *
	 * @param updateAt 最終更新日時(エポック秒)
	 */
	public void setUpdateAt(Integer updateAt) {
		this.updateAt = updateAt;
	}

	/**
	 * 説明文を取得
	 *
	 * @return 説明文
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * 説明文を設定
	 *
	 * @param description 説明文
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}
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
 * Roomマッチメイキング ギャザリング
 *
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown=true)
public class RoomGathering implements Serializable {

	/** ギャザリングメタデータ
ルームの募集条件などを 128バイト以内で指定できます。
 */
	private String meta;

	/** ギャザリングGRN */
	private String gatheringId;

	/** ギャザリングを作成したユーザID */
	private String ownerUserId;

	/** 更新日時(エポック秒) */
	private Integer updateAt;

	/** 参加プレイヤー数 */
	private Integer joinPlayer;

	/** 作成日時(エポック秒) */
	private Integer createAt;


	/**
	 * ギャザリングメタデータ
ルームの募集条件などを 128バイト以内で指定できます。
を取得
	 *
	 * @return ギャザリングメタデータ
ルームの募集条件などを 128バイト以内で指定できます。

	 */
	public String getMeta() {
		return meta;
	}

	/**
	 * ギャザリングメタデータ
ルームの募集条件などを 128バイト以内で指定できます。
を設定
	 *
	 * @param meta ギャザリングメタデータ
ルームの募集条件などを 128バイト以内で指定できます。

	 */
	public void setMeta(String meta) {
		this.meta = meta;
	}

	/**
	 * ギャザリングGRNを取得
	 *
	 * @return ギャザリングGRN
	 */
	public String getGatheringId() {
		return gatheringId;
	}

	/**
	 * ギャザリングGRNを設定
	 *
	 * @param gatheringId ギャザリングGRN
	 */
	public void setGatheringId(String gatheringId) {
		this.gatheringId = gatheringId;
	}

	/**
	 * ギャザリングを作成したユーザIDを取得
	 *
	 * @return ギャザリングを作成したユーザID
	 */
	public String getOwnerUserId() {
		return ownerUserId;
	}

	/**
	 * ギャザリングを作成したユーザIDを設定
	 *
	 * @param ownerUserId ギャザリングを作成したユーザID
	 */
	public void setOwnerUserId(String ownerUserId) {
		this.ownerUserId = ownerUserId;
	}

	/**
	 * 更新日時(エポック秒)を取得
	 *
	 * @return 更新日時(エポック秒)
	 */
	public Integer getUpdateAt() {
		return updateAt;
	}

	/**
	 * 更新日時(エポック秒)を設定
	 *
	 * @param updateAt 更新日時(エポック秒)
	 */
	public void setUpdateAt(Integer updateAt) {
		this.updateAt = updateAt;
	}

	/**
	 * 参加プレイヤー数を取得
	 *
	 * @return 参加プレイヤー数
	 */
	public Integer getJoinPlayer() {
		return joinPlayer;
	}

	/**
	 * 参加プレイヤー数を設定
	 *
	 * @param joinPlayer 参加プレイヤー数
	 */
	public void setJoinPlayer(Integer joinPlayer) {
		this.joinPlayer = joinPlayer;
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

}
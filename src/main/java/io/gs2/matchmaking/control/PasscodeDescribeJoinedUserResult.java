package io.gs2.matchmaking.control;

import java.util.List;

/**
 * Passcodeマッチメイキング - ギャザリングに参加しているユーザID一覧取得結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
public class PasscodeDescribeJoinedUserResult {
	
	List<String> items;
	
	/**
	 * ユーザID一覧を取得。
	 * 
	 * @return ユーザID一覧
	 */
	public List<String> getItems() {
		return items;
	}
	
	/**
	 * ユーザID一覧を設定。
	 * 
	 * @param items ユーザID一覧
	 */
	public void setItems(List<String> items) {
		this.items = items;
	}
	
	/**
	 * ユーザID一覧を設定。
	 * 
	 * @param items ユーザID一覧
	 * @return this
	 */
	public PasscodeDescribeJoinedUserResult withItem(List<String> items) {
		setItems(items);
		return this;
	}
}

package io.gs2.matchmaking.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.matchmaking.Gs2Matchmaking;

/**
 * サービスクラス一覧の取得リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class DescribeServiceClassRequest extends Gs2BasicRequest<DescribeServiceClassRequest> {

	public static class Constant extends Gs2Matchmaking.Constant {
		public static final String FUNCTION = "DescribeServiceClass";
	}
}

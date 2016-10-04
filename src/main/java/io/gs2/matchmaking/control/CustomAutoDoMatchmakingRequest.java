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
public class CustomAutoDoMatchmakingRequest extends Gs2UserRequest<CustomAutoDoMatchmakingRequest> {

	public static class Constant extends Gs2Matchmaking.Constant {
		public static final String FUNCTION = "DoMatchmaking";
	}

	/** マッチメイキング名 */
	String matchmakingName;
	/** 属性値1 */
	Integer attribute1;
	/** 属性値2 */
	Integer attribute2;
	/** 属性値3 */
	Integer attribute3;
	/** 属性値4 */
	Integer attribute4;
	/** 属性値5 */
	Integer attribute5;
	/** 検索範囲 属性値1 最小値 */
	Integer searchAttribute1Min;
	/** 検索範囲 属性値1 最大値 */
	Integer searchAttribute1Max;
	/** 検索範囲 属性値2 最小値 */
	Integer searchAttribute2Min;
	/** 検索範囲 属性値2 最大値 */
	Integer searchAttribute2Max;
	/** 検索範囲 属性値3 最小値 */
	Integer searchAttribute3Min;
	/** 検索範囲 属性値3 最大値 */
	Integer searchAttribute3Max;
	/** 検索範囲 属性値4 最小値 */
	Integer searchAttribute4Min;
	/** 検索範囲 属性値4 最大値 */
	Integer searchAttribute4Max;
	/** 検索範囲 属性値5 最小値 */
	Integer searchAttribute5Min;
	/** 検索範囲 属性値5 最大値 */
	Integer searchAttribute5Max;
	/** 検索コンテキスト */
	String searchContext;

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
	public CustomAutoDoMatchmakingRequest withMatchmakingName(String matchmakingName) {
		setMatchmakingName(matchmakingName);
		return this;
	}
	
	/**
	 * 属性値1を取得。
	 * 
	 * @return 属性値1
	 */
	public Integer getAttribute1() {
		return attribute1;
	}
	
	/**
	 * 属性値1を設定。
	 * 
	 * @param attribute1 属性値1
	 */
	public void setAttribute1(Integer attribute1) {
		this.attribute1 = attribute1;
	}
	
	/**
	 * 属性値1を設定。
	 * 
	 * @param attribute1 属性値1
	 * @return this
	 */
	public CustomAutoDoMatchmakingRequest withAttribute1(Integer attribute1) {
		setAttribute1(attribute1);
		return this;
	}
	
	/**
	 * 属性値2を取得。
	 * 
	 * @return 属性値2
	 */
	public Integer getAttribute2() {
		return attribute2;
	}
	
	/**
	 * 属性値2を設定。
	 * 
	 * @param attribute2 属性値2
	 */
	public void setAttribute2(Integer attribute2) {
		this.attribute2 = attribute2;
	}
	
	/**
	 * 属性値2を設定。
	 * 
	 * @param attribute2 属性値2
	 * @return this
	 */
	public CustomAutoDoMatchmakingRequest withAttribute2(Integer attribute2) {
		setAttribute2(attribute2);
		return this;
	}
	
	/**
	 * 属性値3を取得。
	 * 
	 * @return 属性値3
	 */
	public Integer getAttribute3() {
		return attribute3;
	}
	
	/**
	 * 属性値3を設定。
	 * 
	 * @param attribute3 属性値3
	 */
	public void setAttribute3(Integer attribute3) {
		this.attribute3 = attribute3;
	}
	
	/**
	 * 属性値3を設定。
	 * 
	 * @param attribute3 属性値3
	 * @return this
	 */
	public CustomAutoDoMatchmakingRequest withAttribute3(Integer attribute3) {
		setAttribute3(attribute3);
		return this;
	}
	
	/**
	 * 属性値4を取得。
	 * 
	 * @return 属性値4
	 */
	public Integer getAttribute4() {
		return attribute4;
	}
	
	/**
	 * 属性値4を設定。
	 * 
	 * @param attribute4 属性値4
	 */
	public void setAttribute4(Integer attribute4) {
		this.attribute4 = attribute4;
	}
	
	/**
	 * 属性値4を設定。
	 * 
	 * @param attribute4 属性値4
	 * @return this
	 */
	public CustomAutoDoMatchmakingRequest withAttribute4(Integer attribute4) {
		setAttribute4(attribute4);
		return this;
	}
	
	/**
	 * 属性値5を取得。
	 * 
	 * @return 属性値5
	 */
	public Integer getAttribute5() {
		return attribute5;
	}
	
	/**
	 * 属性値5を設定。
	 * 
	 * @param attribute5 属性値5
	 */
	public void setAttribute5(Integer attribute5) {
		this.attribute5 = attribute5;
	}
	
	/**
	 * 属性値5を設定。
	 * 
	 * @param attribute5 属性値5
	 * @return this
	 */
	public CustomAutoDoMatchmakingRequest withAttribute5(Integer attribute5) {
		setAttribute5(attribute5);
		return this;
	}

	/**
	 * 検索範囲 属性値1 最小値を取得。
	 * 
	 * @return 検索範囲 属性値1 最小値
	 */
	public Integer getSearchAttribute1Min() {
		return searchAttribute1Min;
	}
	
	/**
	 * 検索範囲 属性値1 最小値を設定。
	 * 
	 * @param searchAttribute1Min 検索範囲 属性値1 最小値
	 */
	public void setSearchAttribute1Min(Integer searchAttribute1Min) {
		this.searchAttribute1Min = searchAttribute1Min;
	}
	
	/**
	 * 検索範囲 属性値1 最小値を設定。
	 * 
	 * @param searchAttribute1Min 検索範囲 属性値1 最小値
	 * @return this
	 */
	public CustomAutoDoMatchmakingRequest withSearchAttribute1Min(Integer searchAttribute1Min) {
		setSearchAttribute1Min(searchAttribute1Min);
		return this;
	}

	/**
	 * 検索範囲 属性値1 最大値を取得。
	 * 
	 * @return 検索範囲 属性値1 最大値
	 */
	public Integer getSearchAttribute1Max() {
		return searchAttribute1Max;
	}
	
	/**
	 * 検索範囲 属性値1 最大値を設定。
	 * 
	 * @param searchAttribute1Max 検索範囲 属性値1 最大値
	 */
	public void setSearchAttribute1Max(Integer searchAttribute1Max) {
		this.searchAttribute1Max = searchAttribute1Max;
	}
	
	/**
	 * 検索範囲 属性値1 最大値を設定。
	 * 
	 * @param searchAttribute1Max 検索範囲 属性値1 最大値
	 * @return this
	 */
	public CustomAutoDoMatchmakingRequest withSearchAttribute1Max(Integer searchAttribute1Max) {
		setSearchAttribute1Max(searchAttribute1Max);
		return this;
	}

	/**
	 * 検索範囲 属性値2 最小値を取得。
	 * 
	 * @return 検索範囲 属性値2 最小値
	 */
	public Integer getSearchAttribute2Min() {
		return searchAttribute2Min;
	}
	
	/**
	 * 検索範囲 属性値2 最小値を設定。
	 * 
	 * @param searchAttribute2Min 検索範囲 属性値2 最小値
	 */
	public void setSearchAttribute2Min(Integer searchAttribute2Min) {
		this.searchAttribute2Min = searchAttribute2Min;
	}
	
	/**
	 * 検索範囲 属性値2 最小値を設定。
	 * 
	 * @param searchAttribute2Min 検索範囲 属性値2 最小値
	 * @return this
	 */
	public CustomAutoDoMatchmakingRequest withSearchAttribute2Min(Integer searchAttribute2Min) {
		setSearchAttribute2Min(searchAttribute2Min);
		return this;
	}

	/**
	 * 検索範囲 属性値2 最大値を取得。
	 * 
	 * @return 検索範囲 属性値2 最大値
	 */
	public Integer getSearchAttribute2Max() {
		return searchAttribute2Max;
	}
	
	/**
	 * 検索範囲 属性値2 最大値を設定。
	 * 
	 * @param searchAttribute2Max 検索範囲 属性値2 最大値
	 */
	public void setSearchAttribute2Max(Integer searchAttribute2Max) {
		this.searchAttribute2Max = searchAttribute2Max;
	}
	
	/**
	 * 検索範囲 属性値2 最大値を設定。
	 * 
	 * @param searchAttribute2Max 検索範囲 属性値2 最大値
	 * @return this
	 */
	public CustomAutoDoMatchmakingRequest withSearchAttribute2Max(Integer searchAttribute2Max) {
		setSearchAttribute2Max(searchAttribute2Max);
		return this;
	}

	/**
	 * 検索範囲 属性値3 最小値を取得。
	 * 
	 * @return 検索範囲 属性値3 最小値
	 */
	public Integer getSearchAttribute3Min() {
		return searchAttribute3Min;
	}
	
	/**
	 * 検索範囲 属性値3 最小値を設定。
	 * 
	 * @param searchAttribute3Min 検索範囲 属性値3 最小値
	 */
	public void setSearchAttribute3Min(Integer searchAttribute3Min) {
		this.searchAttribute3Min = searchAttribute3Min;
	}
	
	/**
	 * 検索範囲 属性値3 最小値を設定。
	 * 
	 * @param searchAttribute3Min 検索範囲 属性値3 最小値
	 * @return this
	 */
	public CustomAutoDoMatchmakingRequest withSearchAttribute3Min(Integer searchAttribute3Min) {
		setSearchAttribute3Min(searchAttribute3Min);
		return this;
	}

	/**
	 * 検索範囲 属性値3 最大値を取得。
	 * 
	 * @return 検索範囲 属性値3 最大値
	 */
	public Integer getSearchAttribute3Max() {
		return searchAttribute3Max;
	}
	
	/**
	 * 検索範囲 属性値3 最大値を設定。
	 * 
	 * @param searchAttribute3Max 検索範囲 属性値3 最大値
	 */
	public void setSearchAttribute3Max(Integer searchAttribute3Max) {
		this.searchAttribute3Max = searchAttribute3Max;
	}
	
	/**
	 * 検索範囲 属性値3 最大値を設定。
	 * 
	 * @param searchAttribute3Max 検索範囲 属性値3 最大値
	 * @return this
	 */
	public CustomAutoDoMatchmakingRequest withSearchAttribute3Max(Integer searchAttribute3Max) {
		setSearchAttribute3Max(searchAttribute3Max);
		return this;
	}

	/**
	 * 検索範囲 属性値4 最小値を取得。
	 * 
	 * @return 検索範囲 属性値4 最小値
	 */
	public Integer getSearchAttribute4Min() {
		return searchAttribute4Min;
	}
	
	/**
	 * 検索範囲 属性値4 最小値を設定。
	 * 
	 * @param searchAttribute4Min 検索範囲 属性値4 最小値
	 */
	public void setSearchAttribute4Min(Integer searchAttribute4Min) {
		this.searchAttribute4Min = searchAttribute4Min;
	}
	
	/**
	 * 検索範囲 属性値4 最小値を設定。
	 * 
	 * @param searchAttribute4Min 検索範囲 属性値4 最小値
	 * @return this
	 */
	public CustomAutoDoMatchmakingRequest withSearchAttribute4Min(Integer searchAttribute4Min) {
		setSearchAttribute4Min(searchAttribute4Min);
		return this;
	}

	/**
	 * 検索範囲 属性値4 最大値を取得。
	 * 
	 * @return 検索範囲 属性値4 最大値
	 */
	public Integer getSearchAttribute4Max() {
		return searchAttribute4Max;
	}
	
	/**
	 * 検索範囲 属性値4 最大値を設定。
	 * 
	 * @param searchAttribute4Max 検索範囲 属性値4 最大値
	 */
	public void setSearchAttribute4Max(Integer searchAttribute4Max) {
		this.searchAttribute4Max = searchAttribute4Max;
	}
	
	/**
	 * 検索範囲 属性値4 最大値を設定。
	 * 
	 * @param searchAttribute4Max 検索範囲 属性値4 最大値
	 * @return this
	 */
	public CustomAutoDoMatchmakingRequest withSearchAttribute4Max(Integer searchAttribute4Max) {
		setSearchAttribute4Max(searchAttribute4Max);
		return this;
	}

	/**
	 * 検索範囲 属性値5 最小値を取得。
	 * 
	 * @return 検索範囲 属性値5 最小値
	 */
	public Integer getSearchAttribute5Min() {
		return searchAttribute5Min;
	}
	
	/**
	 * 検索範囲 属性値5 最小値を設定。
	 * 
	 * @param searchAttribute5Min 検索範囲 属性値5 最小値
	 */
	public void setSearchAttribute5Min(Integer searchAttribute5Min) {
		this.searchAttribute5Min = searchAttribute5Min;
	}
	
	/**
	 * 検索範囲 属性値5 最小値を設定。
	 * 
	 * @param searchAttribute5Min 検索範囲 属性値5 最小値
	 * @return this
	 */
	public CustomAutoDoMatchmakingRequest withSearchAttribute5Min(Integer searchAttribute5Min) {
		setSearchAttribute5Min(searchAttribute5Min);
		return this;
	}

	/**
	 * 検索範囲 属性値5 最大値を取得。
	 * 
	 * @return 検索範囲 属性値5 最大値
	 */
	public Integer getSearchAttribute5Max() {
		return searchAttribute5Max;
	}
	
	/**
	 * 検索範囲 属性値5 最大値を設定。
	 * 
	 * @param searchAttribute5Max 検索範囲 属性値5 最大値
	 */
	public void setSearchAttribute5Max(Integer searchAttribute5Max) {
		this.searchAttribute5Max = searchAttribute5Max;
	}
	
	/**
	 * 検索範囲 属性値5 最大値を設定。
	 * 
	 * @param searchAttribute5Max 検索範囲 属性値5 最大値
	 * @return this
	 */
	public CustomAutoDoMatchmakingRequest withSearchAttribute5Max(Integer searchAttribute5Max) {
		setSearchAttribute5Max(searchAttribute5Max);
		return this;
	}

	/**
	 * 検索コンテキストを取得。
	 * 
	 * @return 検索コンテキスト
	 */
	public String getSearchContext() {
		return searchContext;
	}
	
	/**
	 * 検索コンテキストを設定。
	 * 
	 * @param searchContext 検索コンテキスト
	 */
	public void setSearchContext(String searchContext) {
		this.searchContext = searchContext;
	}
	
	/**
	 * 検索コンテキストを設定。
	 * 
	 * @param searchContext 検索コンテキスト
	 * @return this
	 */
	public CustomAutoDoMatchmakingRequest withSearchContext(String searchContext) {
		setSearchContext(searchContext);
		return this;
	}
	
}

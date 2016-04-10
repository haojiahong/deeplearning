package com.hao.designpatterns.chainfilter;

/**
 * 字符串处理器类
 * 
 * @author haojiahong
 *
 */
public class MsgProcessor {
	private String str;
	private FilterChain fc;

	public String process() {
		return fc.doFilter(str);
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public FilterChain getFc() {
		return fc;
	}

	public void setFc(FilterChain fc) {
		this.fc = fc;
	}

}

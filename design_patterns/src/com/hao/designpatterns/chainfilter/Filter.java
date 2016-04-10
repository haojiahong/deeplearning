package com.hao.designpatterns.chainfilter;

public interface Filter {
	/**
	 * 字符串过滤
	 * @param str
	 * @return
	 */
	public String doFilter(String str);

}

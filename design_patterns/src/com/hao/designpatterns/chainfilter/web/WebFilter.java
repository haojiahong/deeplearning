package com.hao.designpatterns.chainfilter.web;

/**
 * 模拟web请求过滤器
 * 
 * @author haojiahong
 *
 */
public interface WebFilter {

	public void doFilter(Request request, Response response,
			WebFilterChain webFilterChain);

}

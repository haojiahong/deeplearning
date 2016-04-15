package com.hao.designpatterns.chainfilter.web;

import java.util.ArrayList;
import java.util.List;

/**
 * 模拟web过滤器链 1、FilterChain实现了Filter，方便filterchain添加filterchain。
 * 2、doFilter中加入webFilterChain参数，实现过滤器链的记忆（记忆下一个filter），即过滤器链的堆栈形式。
 * 代码在嵌套，所以，当开始跳出嵌套的时候，它就实现了堆栈的形式。
 * 
 * @author haojiahong
 *
 */
public class WebFilterChain implements WebFilter {
	private List<WebFilter> wfLs = new ArrayList<WebFilter>();
	private int index;

	public WebFilterChain addFilter(WebFilter f) {
		this.wfLs.add(f);
		return this;
	}

	@Override
	public void doFilter(Request request, Response response,
			WebFilterChain webFilterChain) {
		/**
		 * 实现按顺序调用filter
		 */
		if (index == wfLs.size()) {
			return;
		}
		WebFilter filter = wfLs.get(index);
		index++;
		filter.doFilter(request, response, webFilterChain);
		/*
		 * for (WebFilter wf : wfLs) { wf.doFilter(request, response); }
		 */
	}

}

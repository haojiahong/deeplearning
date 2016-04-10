package com.hao.designpatterns.chainfilter.web;

public class WebHTMLFilter implements WebFilter {

	@Override
	public void doFilter(Request request, Response response,
			WebFilterChain webFilterChain) {
		request.setRequestStr(request.getRequestStr().replace("<", "{")
				.replace(">", "}")
				+ getClass().getName());
		webFilterChain.doFilter(request, response, webFilterChain);
		response.setResponseStr(response.getResponseStr()+getClass().getName());

	}

}

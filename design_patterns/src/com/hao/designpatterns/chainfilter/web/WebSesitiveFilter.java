package com.hao.designpatterns.chainfilter.web;

public class WebSesitiveFilter implements WebFilter {

	@Override
	public void doFilter(Request request, Response response,
			WebFilterChain webFilterChain) {
		request.setRequestStr(request.getRequestStr().replace("敏感", "")
				+ getClass().getName());
		webFilterChain.doFilter(request, response, webFilterChain);
		response.setResponseStr(response.getResponseStr()
				+ getClass().getName());

	}

}

package com.hao.designpatterns.chainfilter.web;

public class WebMain {
	public static void main(String[] args) {
		String msg = "大家好，敏感，《script》<script>";

		Request request = new Request();
		Response response = new Response();
		request.setRequestStr(msg);
		response.setResponseStr("response");

		WebFilterChain wfc = new WebFilterChain();
		wfc.addFilter(new WebHTMLFilter()).addFilter(new WebSesitiveFilter());

		wfc.doFilter(request, response,wfc);

		System.out.println(request.getRequestStr());
		System.out.println(response.getResponseStr());
	}

}

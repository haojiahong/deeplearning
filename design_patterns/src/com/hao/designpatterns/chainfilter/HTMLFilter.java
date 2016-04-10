package com.hao.designpatterns.chainfilter;

public class HTMLFilter implements Filter{

	@Override
	public String doFilter(String str) {
		str = str.replace("<", "{").replace(">", "}");
		return str;
	}
	

}

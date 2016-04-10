package com.hao.designpatterns.chainfilter;

public class SesitiveFilter implements Filter {

	@Override
	public String doFilter(String str) {
		str = str.replace("敏感", "");
		return str;
	}

}

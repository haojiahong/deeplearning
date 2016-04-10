package com.hao.designpatterns.chainfilter;

public class Main {
	public static void main(String[] args) {
		String msg = "大家好，敏感，《script》<script>";
		MsgProcessor mp = new MsgProcessor();
		FilterChain fc = new FilterChain();
		fc.addFilter(new HTMLFilter()).addFilter(new SesitiveFilter());
		FilterChain fc2 = new FilterChain();
		fc2.addFilter(new SesitiveFilter());
		fc.addFilter(fc2);
		mp.setFc(fc);
		mp.setStr(msg);
		System.out.println(mp.process());
	}

}

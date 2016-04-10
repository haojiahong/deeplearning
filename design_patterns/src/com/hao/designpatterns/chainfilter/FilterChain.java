package com.hao.designpatterns.chainfilter;

import java.util.ArrayList;
import java.util.List;
/**
 * 1、FilterChain实现了Filter，方便filterchain添加filterchain。
 * @author haojiahong
 *
 */
public class FilterChain implements Filter{
	List<Filter> filters = new ArrayList<Filter>();

	public FilterChain addFilter(Filter filter) {
		this.filters.add(filter);
		return this;
	}
	
	public String doFilter(String str){
		for(Filter f : filters ){
			str = f.doFilter(str);
		}
		return str;
	}

}

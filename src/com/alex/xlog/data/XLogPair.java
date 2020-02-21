package com.alex.xlog.data;

import com.alex.xlog.Loggable;

public class XLogPair<T> extends XLogData implements Loggable{
	private String title;
	private T data;
	public XLogPair(String t) {
		title = t;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getData() {
		// TODO Auto-generated method stub
		return data.toString();
	}

	@Override
	public void setTitle(String s) {
		// TODO Auto-generated method stub
		title = s;
		
	}
	
	public void setData(T val) {
		data = val;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return title;
	}
	
	@Override
	public String toString() {
		return title+": "+data.toString();
	}

}

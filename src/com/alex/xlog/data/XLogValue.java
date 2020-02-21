package com.alex.xlog.data;

import com.alex.xlog.Loggable;

public class XLogValue<T> extends XLogData implements Loggable{
	private T data;
	public XLogValue(T value) {
		data = value;
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
	}

	@Override
	public String getTitle() {
		return data.toString();
		// TODO Auto-generated method stub
	}
	
	public void setData(T val) {
		data = val;
	}

}

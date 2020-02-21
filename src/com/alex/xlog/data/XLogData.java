package com.alex.xlog.data;

import com.alex.xlog.Loggable;

public abstract class XLogData implements Loggable{
	
	public XLogData() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract String getData();
	
	public abstract void setTitle(String s);
	
	public abstract String getTitle();
	
}

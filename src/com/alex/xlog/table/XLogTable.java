package com.alex.xlog.table;

import com.alex.xlog.Loggable;
import com.alex.xlog.data.XLogData;

//DO NOT USE HAT SWITCH IN TABLE
//TODO
public class XLogTable<T extends XLogData> implements Loggable {
	public T[][] data;
	public XLogTable() {
		
	}
	
	public XLogTable(int rows, int columns) {
		
	}
	
	@Override
	public String toString() {
		return null;
	}
	
}

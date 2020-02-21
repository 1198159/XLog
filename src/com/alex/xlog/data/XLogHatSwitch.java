package com.alex.xlog.data;

import com.alex.xlog.Loggable;

public class XLogHatSwitch extends XLogData implements Loggable {
	private String title;
	private int state;
	private final String[][] LOOK = {{" ^ ", " | "}, {"  ^", " / "},{" _\\", "  /"},{" \\ ", "  V"},{" | ", " V "},{"V  ", " / "},{"/_ ", "\\  "},{"^  ", " \\ "}};
	
	public XLogHatSwitch(String t) {
		title = t;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getData() {
		// TODO Auto-generated method stub
		return LOOK[state][0]+"\n"+LOOK[state][1];
		
	}

	public void setData(int val) {
		state = val;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTitle(String s) {
		// TODO Auto-generated method stub
		title = s;
		
	}
	
	@Override
	public String toString() {
		return title+":\n"+LOOK[state][0]+"\n"+LOOK[state][1];
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return title;
	}


}

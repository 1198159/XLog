package com.alex.xlog;

public class XLogger<T> {
	private int index = 0;
	private T[] entries;
	public XLogger() {
		// TODO Auto-generated constructor stub
	}
	public void addEntries(T... args) {
		for(T i : args) {
			entries[index] = i;
			index++;
		}
	}
	public void push() {
		//TODO TELEMETRY STUFF
	}
	
}

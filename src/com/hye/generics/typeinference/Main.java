package com.hye.generics.typeinference;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	static <T> T pick(T a1, T a2) { return a2; }
	
	public static void main(String args[]) {
		
		Serializable s = pick("d", new ArrayList<String>());
		
		List<String> list = new ArrayList<>();
		list.add("Korea");
		list.add("usa");
		list.add("england");
		list.add("japan");
		String[] strs = new String[list.size()];
//		<T> T[] toArray(T[] a); // 제너릭 메서드
		list.toArray(strs);
		// list.<String>toArray(strs);
		
		return;
		
	}

}
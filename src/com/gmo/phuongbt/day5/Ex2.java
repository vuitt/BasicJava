package com.gmo.phuongbt.day5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Nhập một sâu ký tự. Liệt kê số lần xuất hiện của các từ của sâu đó.

		String str = "Phuong, xin chao Phuong xin";
		str = str.replaceAll(",", "");
		String[] arr = str.split(" ");
		String key = "";
		Integer value;
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < arr.length; i++) {
			key = arr[i];
			if (map.containsKey(key)) {
				value = map.get(key);
				map.remove(key);
				map.put(key, value + 1);
			} else {
				map.put(key, 1);
			}
		}

		Set set = map.keySet();
		Iterator i = set.iterator();

		while (i.hasNext()) {
			key = (String) i.next();
			System.out.println("Từ '" + key + "' xuất hiện " + map.get(key) + " lần");
		}

	}

}

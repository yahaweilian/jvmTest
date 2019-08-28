package com.ynding;

import java.util.ArrayList;
import java.util.List;

public class Test implements Runnable{

	static List<String> ls = new ArrayList<>();
	static int j = 0;

	public static void main(String[] args) {
		Test vt = new Test();

		Thread t1 = new Thread(vt, "t1");
		Thread t2 = new Thread(vt, "t2");

		t1.start();
		t2.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (String string : ls) {
			System.out.println(string);
		}
		System.out.println("size:" + ls.size());
	}

	@Override
	public void run() {
		ls.add(Thread.currentThread().getName() +" "+ ++j);
	}
}

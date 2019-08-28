package com.ynding;

import java.util.Vector;

public class VectorTest implements Runnable {

	static Vector<String> vs = new Vector<>();
	static int i = 0;

	public static void main(String[] args) {
		VectorTest vt = new VectorTest();

		Thread t1 = new Thread(vt, "t1");
		Thread t2 = new Thread(vt, "t2");

		t1.start();
		t2.start();
		
		//主线程沉睡1秒，等待t1,t2线程执行完毕
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (String string : vs) {
			System.out.println(string);
		}
		
	}

	@Override
	public void run() {
		vs.add(Thread.currentThread().getName() +" "+ ++i);
	}
}

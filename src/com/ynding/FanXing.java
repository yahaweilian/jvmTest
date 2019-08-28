package com.ynding;

import java.util.ArrayList;
import java.util.List;

public class FanXing {

	class Fruit{
		
	}
	class Apple extends Fruit{
		
	}
	public static void main(String[] args) {
		List<Apple> a = new ArrayList<>();
		List<Fruit> f= new ArrayList<>(); 
		
		List<? extends Fruit> ff = new ArrayList<Apple>();
		
		Fruit fff;
		Fruit aa = ff.get(0);
	}
}

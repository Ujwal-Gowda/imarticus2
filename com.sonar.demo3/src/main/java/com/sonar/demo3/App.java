package com.sonar.demo3;

import java.util.ArrayList;
import java.util.List;

public class App {
	public App() {

		System.out.println("Constructor got called!!!!!!!!");

		}

		public void m1() {

		String s = "";

		List<Integer> list = new ArrayList<Integer>();

		list.add(1);

		list= null;

		if(list != null)

		list.add(2);

		Object obj = getData();

		if(obj!=null) {

		System.out.println(obj.toString());

		}

		for(int i=1;i<=1000;i++) {

		}

		}

		public Object getData() {

		return null;

		}

		public static void main(String[] args) {

		App app = new App();

		app.m1();

		}

		}



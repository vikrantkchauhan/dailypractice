package com.vikrant.prac;


class Thread1 implements Runnable{

	@Override
	public void run() {
		System.out.println("From thread 1");
		System.out.println("Threadname:"+Thread.currentThread().getName());
	}
	
	
}
public class Temp {
	
	public static void main(String[] args) {
		Thread obj = new Thread(new Thread1());
		obj.run();
		System.out.println("Executing thread name:"+Thread.currentThread().getName());
	}
	
	
	
	
}
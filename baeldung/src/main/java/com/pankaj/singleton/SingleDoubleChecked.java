package com.pankaj.singleton;

public class SingleDoubleChecked {

	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(Singleton.getInstance());

			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(Singleton.getInstance());

			}
		});

		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(Singleton.getInstance());

			}
		});

		t1.start();
		t2.start();
		t3.start();
	}
}

class Singleton {

	private static Singleton instance;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (instance == null)
			synchronized (Singleton.class) {
				if (instance == null)
					instance = new Singleton();
			}
		return instance;
	}
}

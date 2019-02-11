package com.pankaj.singleton;

public class SingletonBillPugh {

	private SingletonBillPugh() {

	}

	private static class SingletonHelper {
		private static final SingletonBillPugh INSTANCE = new SingletonBillPugh();
	}

	public static SingletonBillPugh getInstance() {
		return SingletonHelper.INSTANCE;
	}

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

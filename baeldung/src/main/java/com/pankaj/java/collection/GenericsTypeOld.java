package com.pankaj.java.collection;

public class GenericsTypeOld {

	private Object t;

	public Object get() {
		return t;
	}

	public void set(Object t) {
		this.t = t;
	}

	public static void main(String args[]) {
		GenericsTypeOld type = new GenericsTypeOld();
		type.set(new Integer(5));
		String str = (String) type.get(); // type casting, error prone and can cause ClassCastException
	}
}
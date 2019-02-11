package com.pankaj.java.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import java.util.Vector;

public class GenericsMethods {

	// Java Generic Method
	public static <T extends List<T> & RandomAccess> boolean isEqual(GenericsType<T> g1, GenericsType<T> g2) {
		return g1.get().equals(g2.get());
	}

	public static <T extends Comparable<T>> int compare(T t1, T t2) {
		return t1.compareTo(t2);
	}

	public static void main(String args[]) {
		GenericsType<Vector> g1 = new GenericsType<>();
		Vector list = new Vector<>();
		isEqual(g1, g1);

		GenericsType<ArrayList> g2 = new GenericsType<>();

		System.out.println("done");

		// above statement can be written simply as
		// This feature, known as type inference, allows you to invoke a generic method
		// as an ordinary method, without specifying a type between angle brackets.
		// Compiler will infer the type that is needed
	}
}
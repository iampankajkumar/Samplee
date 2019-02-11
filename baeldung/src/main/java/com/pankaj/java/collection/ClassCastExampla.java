package com.pankaj.java.collection;

import java.util.ArrayList;
import java.util.List;

public class ClassCastExampla {
	public static void main(String[] args) {

		List lis = new ArrayList();
		lis.add(new String());
		lis.add(new Integer(5));

		for (Object obj : lis) {
			System.out.println((Integer) obj);
		}

	}

}

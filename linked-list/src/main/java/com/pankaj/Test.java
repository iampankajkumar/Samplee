package com.pankaj;

import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {

		Set<Student> set = new HashSet<>();
		set.add(new Student(1, "pankaj"));
		set.add(new Student(1, "kumar"));
		set.add(new Student(2, "prajapati"));
		System.out.println(set.size());
		System.out.println(set);

	}

}

class Student {

	private int id;
	private String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		return true;
	}
}

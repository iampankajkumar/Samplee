package com.pankaj.java.collection;

import java.util.HashMap;
import java.util.Map;

public class CollectionExample {

	HashMap<String, String> hashmap = new HashMap<>();

	public CollectionExample() {
		hashmap.putIfAbsent("key1", "value1");
		hashmap.putIfAbsent("key3", "value3");
		hashmap.putIfAbsent("key2", "value2");
		hashmap.put("key4", null);
		System.out.println("Inside constructor");
	}

	{
		System.out.println("Inside Instance Block");
	}
	static {
		System.out.println("Inside static block");
	}

	public static void main(String[] args) {
		System.out.println("Inside Main");
		CollectionExample example = new CollectionExample();
		System.out.println(example.hashmap.keySet());
		System.out.println(example.hashmap.values());
		System.out.println(example.hashmap.entrySet());
		for (Map.Entry<String, String> entry : example.hashmap.entrySet())
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
	}
}

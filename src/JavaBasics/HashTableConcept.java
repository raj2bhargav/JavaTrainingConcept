package JavaBasics;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {

		Hashtable h = new Hashtable();

		h.put(1, "Test");
		h.put(2, "Hello");
		h.put(3, "World");

		System.out.println(h.size());

		h.put("A", 100);
		h.put("B", 200);

		System.out.println(h.size());

		System.out.println(h.get(2));

		System.out.println("------------------");

		for (int i = 0; i < h.size(); i++) {
			System.out.println(h.get(i));
		}

		Hashtable<Integer, Integer> h1 = new Hashtable<Integer, Integer>();
		h1.put(10, 150);
		h1.put(20, 250);
		h1.put(30, 350);
		h1.put(40, 450);
		h1.put(50, 550);

	}

}

package spider;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.Vector;

import javax.print.attribute.HashAttributeSet;

public class CollectionDemo {

	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("oracle");
		v.add("microsoft");
		v.add("Google");
		v.add("Apple");
		v.add("IBM");
		System.out.println("-- Itreating over vector using for each");
		for (String elem : v)
			System.out.println(elem);
		System.out.println("-- Itreating over vector using Iterator");
		Iterator<String> itr = v.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

		LinkedList<String> lst = new LinkedList<>();
		lst.add("Tesla");
		lst.add("Apache");
		lst.addFirst("Apple");

		v.addAll(lst);
		System.out.println("-- Itreating over update vector using for each");
		for (String elem : lst)
			System.out.println(elem);

		HashSet<String> set = new HashSet<>(v);
		System.out.println("-- Itreating over  Hashset using for each");
		for (String elem : set)
			System.out.println(elem);

		TreeSet<String> tree = new TreeSet<>(set);
		System.out.println("-- Itreating over  Treeset using for each");
		for (String elem : tree.descendingSet())
			System.out.println(elem);

		System.out.println("-- Itreating over  Treeset using java 8 for each");
		tree.forEach(System.out::println);
		String[] week = {"sun","mon","tues","wed","thurs","fri","sat"};
		List<String> days = Arrays.asList(week);
		days.forEach(System.out.println());

	}

}

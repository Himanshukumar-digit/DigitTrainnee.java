/**
 * 
 */
package com.digit.Collection_Framework;

import java.util.ArrayList;

/**
 * 
 */
public class Collection_ArrayList01 {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		ArrayList a2 = new ArrayList();
		a1.add("Himanshu");// adding himanshu in the list
		a1.add("21");
		a2.add("Yaduvanshi");
		a1.addAll(1, a2);// adding elements of a2 to a1 in the 1st position.

		System.out.println(a1);
		System.out.println(a1.contains("21"));// is 21 is present in the list.
		System.out.println(a1.equals(a2));// is both of the array is equal or not.
		System.out.println(a2.get(0));// give the elements present at the given index.
		System.out.println(a2.containsAll(a1));// checks all the element of arraylist a1 present in a2.
		System.out.println(a1.remove(0));// removes the element at the position 0.
		System.out.println(a1.removeAll(a2) + "" + a1);
		System.out.println(a1);
		System.out.println(a2.isEmpty());// is s2 is empty.
		System.out.println(a1.size());// prints the size of arraylist 1.
		System.out.println(a1.toArray());
		a1.add("-21");// adding negative no. in the array.
		System.out.println(a1);
		System.out.println(a2.hashCode());
		a2.add(90);
		a2.add("Virat");
		a2.add(90);
		System.out.println(a2);
		System.out.println(a2.remove(0));
		System.out.println(a2);
		System.out.println(a2.indexOf("Virat"));// index of virat present in the list.
		System.out.println(a2.lastIndexOf(90));// last index of arraylist present in the array.

	}

}

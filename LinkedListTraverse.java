/*
 * cameron campbell
 * advanced java
 * occc spring 2021
 * linked list traverse
 */

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListTraverse 
{
	/*
	 * main method demonstrates the time efficiency of the get method vs
	 * an interator in traversing a linked list from beginning to end of
	 * a size dictated by the user
	 */
	public static void main(String[] args) 
	{
		// prompt user and create
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of entries that you'd like the linked list to have: ");
		int entries = sc.nextInt();
		
		LinkedList<Integer> lList = new LinkedList<>();
		
		// generate random entries and add them up to the user's entered number
		for (int i = 0; i < entries; i++) 
		{
			int entry = (int)(Math.random() * 5000000);
			lList.add(entry);
		}
		
		Iterator<Integer> iterator = lList.iterator();
		
		// iterator time test
		long startTimeIterator = System.nanoTime();
		while(iterator.hasNext()) 
		{
			iterator.next();
		}
		long endTimeIterator = System.nanoTime();
		
		// get method time test
		long startTimeGet = System.nanoTime();
		int getTest = lList.get(entries - 1);
		long endTimeGet = System.nanoTime();
		
		// calculate final times and show results
		long finalTimeIterator = endTimeIterator - startTimeIterator;
		long finalTimeGet = endTimeGet - startTimeGet;
		
		System.out.println("\nNumber of entries in the list: " + entries);
		System.out.println("Iterator time to complete: " + finalTimeIterator);
		System.out.println("Get method time to complete: " + finalTimeGet);
	}
}

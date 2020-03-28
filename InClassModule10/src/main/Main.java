//Module 10 in class work
package main;

import java.util.Hashtable;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		//		<K,V>
		Hashtable<String, String> myTable = new Hashtable<String, String>();
		myTable.put("Smith", "Mary Smith 123 Main Street Cincinnati, OH 45000");
		System.out.println(myTable.size());
		myTable.put("Jones", "Indiana Jones 124 Main Street Cincinnati, OH 45000");
		System.out.println(myTable.size());
		//How can I look up the V for K=Smith
		String myValue;
		myValue = myTable.get("Smith");
		System.out.println("Value = " + myValue);
		//Iterate over the entire Hashtable
		myTable.put("Andrews", "Mary Andrews 125 Main Street Cincinnati, OH 45000");
		myTable.put("Zebra", "Mary Zebra 126 Main Street Cincinnati, OH 45000");

		Set<String> keys = myTable.keySet();
		for(String key: keys) {
			System.out.println("Value of " + key + " is: " + myTable.get(key));
		}
		
		
	}

}

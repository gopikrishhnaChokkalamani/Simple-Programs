package com.gi.simpleprograms.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class UserComparatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<User> array_list = new ArrayList<>();
		array_list.add(new User(100, "user_name1", "address1"));
		array_list.add(new User(101, "ser_name1", "addre1"));
		array_list.add(new User(102, "er_name1", "dress1"));
		array_list.add(new User(103, "r_name1", "ss1"));

		System.out.println("################Sort by User Name################");
		Collections.sort(array_list, new UserNameComparator());
		ListIterator it = array_list.listIterator();
		while (it.hasNext()) {
			User userObj = (User) it.next();
			System.out.println("User Name - " + userObj.user_name + ", User Id - " + userObj.user_id
					+ ", User Address - " + userObj.user_address + "\n");
		}

		System.out.println("#################Sort by User Id###################");
		Collections.sort(array_list, new UserIdComparator());
		ListIterator it2 = array_list.listIterator();
		while (it2.hasNext()) {
			User userObj = (User) it2.next();
			System.out.println("User Name - " + userObj.user_name + ", User Id - " + userObj.user_id
					+ ", User Address - " + userObj.user_address + "\n");
		}
	}

}

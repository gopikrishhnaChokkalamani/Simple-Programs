package com.gi.simpleprograms.comparator;

import java.util.Comparator;

import com.gi.simpleprograms.comparable.Student;

public class UserNameComparator implements Comparator {

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		User s1 = (User) arg0;
		User s2 = (User) arg1;

		return s1.user_name.compareTo(s2.user_name);
	}

}

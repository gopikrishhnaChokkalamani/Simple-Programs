package com.gi.simpleprograms.comparator;

import java.util.Comparator;

public class UserIdComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		User u1 = (User) o1;
		User u2 = (User) o2;

		if (u1.user_id == u2.user_id) {
			return 0;
		} else if (u1.user_id > u2.user_id) {
			return 1;
		} else {
			return -1;
		}
	}

}

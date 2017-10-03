package com.gi.simpleprograms.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> student_list = new ArrayList<>();
		student_list.add(new Student(100, "student", 14));
		student_list.add(new Student(101, "student1", 12));
		student_list.add(new Student(102, "student2", 11));
		student_list.add(new Student(103, "student3", 15));
		student_list.add(new Student(104, "student4", 16));

		Collections.sort(student_list);

		for (Student s : student_list) {
			System.out.println("Student Name - " + s.name + ", Age - " + s.age);
		}
	}

}

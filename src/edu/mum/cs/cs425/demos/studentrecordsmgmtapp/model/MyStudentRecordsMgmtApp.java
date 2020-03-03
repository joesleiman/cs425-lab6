package edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyStudentRecordsMgmtApp {
	
	public static void printListOfStudents(List<Student> s){
		for(int i = 0; i< s.size(); i++) {
			System.out.println("s" + i + ":studentId:" + s.get(i).getStudentId() + ", name:" + s.get(i).getName() + ", dateOfAdmission:" + s.get(i).getDateOfAdmission());
		}
	}
	
	public static void getListOfPlatinumAlumniStudents(List<Student> students){
		List<Student> listOfPlatinumAlumniStudents = new ArrayList<Student>();
		for(Student s : students) {
			if(LocalDate.now().getYear() - s.getDateOfAdmission().getYear() >= 30) {
				listOfPlatinumAlumniStudents.add(s);
			}
		}
		Collections.reverse(listOfPlatinumAlumniStudents);
		printListOfStudents(listOfPlatinumAlumniStudents);
	}
	
	public static void printHelloWorld(List<Integer> integersList){
		for(Integer i : integersList) {
			if(i % 5 == 0 && i % 7 == 0) System.out.println("HelloWorld");
			else if(i % 5 == 0) System.out.println("Hello");
			else if(i % 7 == 0) System.out.println("World");
		}
	}
	
	public static int findSecondBiggest(List<Integer> integersList){
		int largest = integersList.get(0);
		int secondLargest = integersList.get(0);
		for (int i = 0; i < integersList.size(); i++) {
			 if (integersList.get(i) > largest) {
				secondLargest = largest;
				largest = integersList.get(i);
			 } else if (integersList.get(i) > secondLargest) {
				secondLargest = integersList.get(i);
 
			}
		}
		return secondLargest;
	}
	
	public static void main(String[] args) {
//		MyStudentRecordsMgmtApp m = new MyStudentRecordsMgmtApp();
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("110001","Dave", 1951, 11, 18));
		students.add(new Student("110002","Anna", 1990, 12, 7));
		students.add(new Student("110003","Erica", 1974, 1, 31));
		students.add(new Student("110004","Carlos", 2009, 8, 22));
		students.add(new Student("110005","Bob", 1990, 3, 5));
	
//		1st method call
		Collections.sort(students, new Comparator<Student>() {
			 @Override
			    public int compare(Student s1, Student s2) {
			        return s1.getName().compareTo(s2.getName());
			    }
		});
		printListOfStudents(students);
		System.out.println("------------------------");
//		2nd method call
		Collections.sort(students, new Comparator<Student>() {
			 @Override
			    public int compare(Student s1, Student s2) {
			        return s1.getDateOfAdmission().compareTo(s2.getDateOfAdmission());
			    }
		});
		getListOfPlatinumAlumniStudents(students);
		
		
//		more practice
		List<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(7);
		l.add(35);
		l.add(1);
		l.add(3);
		System.out.println("Print Hello World: ");
		printHelloWorld(l);
		
		System.out.println("Second Biggest: ");
		System.out.println(findSecondBiggest(l));
	}
}

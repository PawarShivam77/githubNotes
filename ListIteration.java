package com.collection.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListStreamWork {

	public static void main(String[] args) {

		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(1, "Shivam", "Shivam77@gmail.com", 775837205));
		emp.add(new Employee(2, "Shubham", "Shubham94@gmail.com", 950378201));
		emp.add(new Employee(3, "Shivam", "Shivam78@gmail.com", 775837205));
		emp.add(new Employee(1, "Shivam", "Shivam77@gmail.com", 775837205));
		emp.add(new Employee(4, "Kartik", "Kartik85@gmail.com", 91681242));
		emp.add(new Employee(4, "Kartik", "Kartik85@gmail.com", 91681242));
		emp.add(new Employee(5, "Kartik", "Kartik98@gmail.com", 91681242));
		System.out.println(emp);
		System.out.println("list of employee \n");

		for (Employee employee : emp) {
			System.out.println(employee);
		}

		
		  
		 

	}

}

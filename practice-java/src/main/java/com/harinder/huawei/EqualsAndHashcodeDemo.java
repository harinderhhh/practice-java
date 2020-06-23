package com.harinder.huawei;

public class EqualsAndHashcodeDemo {
	public static void main(String[] args) {
		Employee emp1 = new Employee(123, "Harinder");
		Employee emp2 = new Employee(333, "Dheeraj");
		Employee emp3 = new Employee(123, "Harinder");
		
		System.out.println("Are emp1 and emp2 the same: ");
		System.out.println(emp1.equals(emp2));
		System.out.println("Are emp1 and emp3 the same: ");
		System.out.println(emp1.equals(emp3));
	}
}

class Employee {
	int id;
	String name;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public int hashCode() {
		return this.id;
	}
	
	@Override
	public boolean equals(Object obj) {
		 if (this == obj) return true;
         if (obj == null || getClass() != obj.getClass()) return false;
         Employee emp = (Employee) obj;
         return id == emp.id &&
                 name.equals(emp.name);
	}
}
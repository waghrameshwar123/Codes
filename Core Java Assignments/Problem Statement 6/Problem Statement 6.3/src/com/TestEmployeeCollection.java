package com;

import java.util.Vector;
public class TestEmployeeCollection {
	public static void main(String[] args) {
		Vector<Employee> vec = addInput();
		display(vec);
		}

	public static Vector<Employee> addInput() {
		// TODO Auto-generated method stub
		Employee e1=new Employee (101,"Raz", "XYZ");
		Employee e2=new Employee (102,"Sham", "Mumbai");
		Employee e3=new Employee (103,"Ram", "Pune");
		Vector<Employee> vec =new Vector<Employee>();
		vec.add(e1);
		vec.add(e2);
		vec.add(e3);
		return vec;
	}

	public static void display(Vector<Employee> vec) {
		// TODO Auto-generated method stub
		for(Employee e:vec)
		{
			System.out.println(e.getEmpid()+"\t"+e.getEname()+"\t"+e.getAddress());
		}
		
	}
}

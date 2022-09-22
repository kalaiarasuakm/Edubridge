package school_entity;

import java.util.Scanner;

public class Teacher implements person{
	private int empid;
	private String name;
	private String department;
	private String jobposition;
	private String mobileno;
	@Override
	public void insert() {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the Students empid:");
		empid = read.nextInt();
		System.out.println("Enter the student name:");
		name = read.next();
		System.out.println("Enter the student department:");
		department = read.next();
		System.out.println("Enter the jobposition:");
		jobposition = read.next();
		System.out.println("enter the mobile no:");
		mobileno = read.next();
		
	}
	@Override
	public void display() {
		System.out.println("Student empid is:" + empid);
		System.out.println("Student name is:" + name);
		System.out.println("Student department is:" + department);
		System.out.println("Student jobposition is:" + jobposition);
		System.out.println("Student mobileno is:" + mobileno);
		
	}
	
	public Teacher searchbyempid(Teacher[] ar1, int empid) {
		for(int i=0;i<ar1.length;i++) {
			if(ar1[i].empid == empid) {
				return ar1[i];
			}
		}
	
	return null;
}
	public Teacher[] searchbyname(Teacher[] ar1, String name) {
		Teacher[] arr1 = new Teacher[ar1.length];
		for(int i=0,j=0;i<ar1.length;i++) {
			if(ar1[i].name.equals(name)) {
				arr1[j]=ar1[i];
			}
			}
		return arr1;
		}
	public Teacher[] searchbymobileno(Teacher[] ar1, String mobileno) {
		Teacher[] arr2 = new Teacher[ar1.length];
		for(int i=0,k=0;i<ar1.length;i++) {
			if(ar1[i].mobileno.equals(mobileno)) {
				arr2[k] = ar1[i];
			}
		}
		return arr2;
	}
}


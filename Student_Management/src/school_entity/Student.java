package school_entity;
import java.util.Scanner;

public class Student implements person {
	private int rollno;
	private String name;
	private String department;
	private String father_name;
	private String mobileno;
	

	Scanner read = new Scanner(System.in);
	@Override
	public void insert() {
		System.out.println("Enter the Students rollno:");
		rollno = read.nextInt();
		System.out.println("Enter the student name:");
		name = read.next();
		System.out.println("Enter the student department:");
		department = read.next();
		System.out.println("Enter the father name:");
	    father_name = read.next();
		System.out.println("enter the mobile no:");
		mobileno = read.next();
	}
	@Override
	public void display() {
		System.out.println("Student rollno is:" + rollno);
		System.out.println("Student name is:" + name);
		System.out.println("Student department is:" + department);
		System.out.println("Student father_name is:" + father_name);
		System.out.println("Student mobileno is:" + mobileno);
		
	}
	public Student searchbyrollno(Student[] ar, int rollno) {
		for(int i=0;i<ar.length;i++) {
			if(ar[i].rollno == rollno) {
				return ar[i];
		}
			
	}
		return null;
	}
	public Student[] searchbyname(Student[] ar, String name) {
		Student[] arr = new Student[ar.length];
		for(int i=0,j=0;i<ar.length;i++) {
			if(ar[i].name.equals(name)) {
				arr[j] = ar[i];
			}
		}
		return arr;

   }
	public Student[] searchbymobileno(Student[] ar, String mobileno) {
		Student[] ar1 = new Student[ar.length];
		for(int i=0,k=0;i<ar.length;i++) {
			if(ar[i].mobileno.equals(mobileno)) {
				ar1[k] = ar[i];
			}
		}
		return ar1;
	}
}

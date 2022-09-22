package school_management;
import java.util.Scanner;
import school_entity.Student;
import school_entity.Teacher;
import school_entity.person;
public class Menu {
	int option;
	int stuoption;
	int teacheroption;
	
	
	public void option() {
		Student[] ar = null;
		Teacher tea = new Teacher();
		Teacher[] ar1 = null;
		Student s = new Student();
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the number of records");
		int n = read.nextInt();
		do {
			System.out.println("1.Student");
			System.out.println("2.Teacher");
			System.out.println("3.Exit");
			option = read.nextInt();
			switch(option) {
			case 1: System.out.println("1.Insert the student record");
			        System.out.println("2.view student record");
			        System.out.println("3.search the student record by rollno");
			        System.out.println("4.search the student record by name");
			        System.out.println("5.search the student record by mobilenumber");
			        
			        stuoption = read.nextInt();
			        switch(stuoption) {
			        case 1:
			                ar = new Student[n];
			        	    for(int i=0;i<n;i++) {
			        	    	ar[i] = new Student();
			        	    	ar[i].insert();
			        	                 
			        }
			        break;	
			        case 2: for(int i=0;i<n;i++) {
			        	ar[i].display();
			        }
			        break;
			        case 3:System.out.println("Enter the rolllno:");
					       int rollno = read.nextInt(); 
			        	   Student stu = s.searchbyrollno(ar,rollno);
			        	   if(stu == null) {
			        		   System.out.println("There is no Student record");
			        	   }
			        	   else {
			        		   stu.display();
			        	   }
			        break;
			        case 4: System.out.println("Enter the student name");
			                String name = read.next();
			                Student[] stu2 = new Student[ar.length];
			                 stu2 = s.searchbyname(ar, name);
			                 for(int i=0;i<stu2.length;i++) {
			                	 if(stu2[i] == null) {
			                		 System.out.println("There is no such record");
					                }
					                else {
					                	
					                	stu2[i].display();
					                }
			                 }
			                
			                break;
			        case 5: System.out.println("Enter the mobile no");
			                String mobileno = read.next();
			                Student[] stu3 = new Student[ar.length];
			                stu3 = s.searchbymobileno(ar, mobileno);
			                for(int i=0;i<stu3.length;i++) {
			                	if(stu3[i] == null) {
				                	System.out.println("There is no such recor");
				                }
				                else {
				                	stu3[i].display();
				                }
			                }
			                
			        }
			break;
			case 2: System.out.println("1.Insert the teacher record");
	                System.out.println("2.view teacher record");
	                System.out.println("3.search the teacher record by empid");
	                System.out.println("4.search the teacher record by name");
	                System.out.println("5.search the teacher record by mobilenumber");
	                teacheroption = read.nextInt();
	                
	                switch(teacheroption) {
	                case 1:
		                ar1 = new Teacher[n];
		        	    for(int i=0;i<n;i++) {
		        	    	ar1[i] = new Teacher();
		        	    	ar1[i].insert();
		        	        }
		            break;	
		            case 2: for(int i=0;i<n;i++) {
		        	      ar1[i].display();
		                  }
		            break;
		            case 3:System.out.println("Enter the empid:");
				           int empid = read.nextInt(); 
		        	       Teacher teac = tea.searchbyempid(ar1,empid);
		        	       if(teac == null) {
		        		       System.out.println("There is no teacher record");
		        	       }
		        	       else {
		        		     teac.display();
		        	       }
		            break;
		            case 4: System.out.println("Enter the teacher name");
		                    String name = read.next();
		                    Teacher[] teac2 = new Teacher[ar1.length];
		                    teac2 = tea.searchbyname(ar1, name);
		                    for(int i=0;i<teac2.length;i++) {
		                	    if(teac2[i] == null) {
		                		 System.out.println("There is no such record");
				                }
				                else {
				                	
				                	teac2[i].display();
				                }
		                 }
		                
		            break;
		            case 5: System.out.println("Enter the mobile no");
		                String mobileno = read.next();
		                Teacher[] teac3 = new Teacher[ar1.length];
		                teac3 = tea.searchbymobileno(ar1, mobileno);
		                for(int i=0;i<teac3.length;i++) {
		                	  if(teac3[i] == null) {
			                	   System.out.println("There is no such recor");
			                  }
			                  else {
			                	  teac3[i].display();
			                  }
		                  }
	                  }
		              
		    break;
		   case 3: System.out.println("Exited");
			        System.exit(0);
			break;
			}
		}while(option!=0);
	}

}

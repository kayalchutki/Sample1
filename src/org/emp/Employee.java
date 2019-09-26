package org.emp;
import org.client.*;
import org.company.*;
import org.emp.*;
import org.project.Project;

public class Employee {
	
	public void employeeName() {
		System.out.println("Employee name is sachin");
	}
	
	
	public static void main (String [] args) {
		
		Employee a= new Employee();
		 a.employeeName ();
		 
		Client b= new Client();
		b.clientName();
		
		
		 
		 Company d= new Company();
		  d.companyName();
		  
		
	}

}

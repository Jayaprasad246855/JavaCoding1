package com.app;

public class Main {

	public static void main(String[] args) {
		
		Employee prasad= new Employee();
		
		prasad.setEmpName("jai");
		prasad.setEmpId(35282);
		prasad.setEmpDignation("Software Engineer");
		prasad.setEmpSalary(60000);
		
		System.out.println( prasad.getEmpDignation() );
		System.out.println(prasad.getEmpName());
		System.out.println(prasad.getEmpId());
		System.out.println(prasad.getEmpSalary());
		
		System.out.println("---------------------");
		
		Employee siri=new Employee();
		
		siri.setEmpId(4546);
		siri.setEmpName("Siri");
		siri.setEmpDignation("Associate");
		siri.setEmpSalary(50000);
	
	System.out.println(siri.getEmpId());
	System.out.println(siri.getEmpDignation());
	System.out.println(siri.getEmpSalary());
	System.out.println(siri.getEmpName());
	

	
		
	} 
		
		
		
	

}

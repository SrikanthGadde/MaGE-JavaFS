package com.telstra.class1;

public class main {

	public static void main(String[] args) {
		Employee e = new Employee(100,"Hello World",60000,1);
		
		System.out.println(e.getDetails());
		
		Tax t = new Tax();
		System.out.println(t.calcTax(e));
		Insurance i = new Insurance();
		System.out.println(i.calcIns(e));
		
		Manager m = new Manager(213,"World",100000,1,"HR",10);
	
		System.out.println(m.getDetails());
	
		//virtual method invocation
		Employee emp  = new Manager(201, "Blah", 120000,2, "IT", 20);
		System.out.println(emp.calcSal());
		//getDetails method of Manager class is invoked since it is a Manager instance
		//emp is only able to access overridden methods of manager class

		
		Manager m1 = (Manager) emp;
		//Now you can access all the methods of Manager class
		System.out.println(m1.getEmpCount()+" "+m1.getDeptName() +" "+m1.calcSal());
		
		
		//Use case for virtual method invocation
		Employee[] emparr = new Employee[3];
		//Heterogenous array - due to the IS-A relationship base class reference can hold all its derived objects
		emparr[0] = new Employee(111,"A",40000,1);
		emparr[1] = new Manager(202,"B",60000,2,"RB",10);
		emparr[2] = new Manager(230,"C",70000,1,"Fin",24);
		
		for (Employee empa:emparr) {
			System.out.println(empa.getDetails());
		}
		//end use case
		
		
		//use instanceOf to check
		//eg. emp instanceOf Manager
		
		
	}

}

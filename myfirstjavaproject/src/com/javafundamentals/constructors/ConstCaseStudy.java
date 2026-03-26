package com.javafundamentals.constructors;

public class ConstCaseStudy {
	int eno;
	String ename;
	String designation;
	double basicSalary;
	
	
	ConstCaseStudy(){
		eno=0;
		ename="something";
		designation="Software Developer";
		basicSalary=0.0;
	}
	ConstCaseStudy(int eno,String ename,String designation,double basicSalary){
		this.eno=eno;
		this.ename=ename;
		this.designation=designation;
		this.basicSalary=basicSalary;
	}

	public static void main(String[] args) {
		ConstCaseStudy obj=new ConstCaseStudy(1,"Alex","Jr.Software Developer",650000);
		obj.display();
		obj.calculate();
		
	}
	void display() {
		System.out.println("--------EMPLOYEE DETAILS------------");
		System.out.println("ID: "+eno);
		System.out.println("Name: "+ename);
		System.out.println("Designation: "+designation);
		System.out.println("Basic Salary: "+basicSalary);
	}
	void calculate() {
		
		double hra=0.15*basicSalary;
		double specialPay = 0.03 * basicSalary;
		double variablePay = 0.03 * basicSalary;
		double bonus = 0.04 * basicSalary;
		int other = 200000;
		
		System.out.println("------------CREDITS-------------");
		System.out.println("House Rent Allowances: "+hra);
		System.out.println("Special Pay: "+specialPay);
		System.out.println("Variable Pay: "+variablePay);
		System.out.println("Bonus: "+bonus);
		System.out.println("Additional Allowances: "+other);
		
		double total_allowances=hra+specialPay+variablePay+bonus+other;
		System.out.println("Total Allowances: "+total_allowances);
		System.out.println("Gross Salary: "+(basicSalary+total_allowances));
		
		double incTax=0.02*basicSalary;
		double med_Claim=0.03*basicSalary;
		double fund=0.04*basicSalary;
		
		System.out.println("------------DEBITS-------------");
		System.out.println("Income Tax: "+incTax);
		System.out.println("Medical Claim: "+med_Claim);
		System.out.println("Provident Fund: "+fund);
		
		double total_deb=incTax+med_Claim+fund;
		double net_sal=(basicSalary+total_allowances)-total_deb;
		System.out.println("Total Debits: "+total_deb);
		System.out.println("Net Salary: "+net_sal);
		
		String res=(net_sal<500000)?"LOW":((net_sal>=500000 && net_sal<1000000)?"MEDIUM":"HIGH");
		System.out.println("Grade of Salary : "+res);
	}

}

package com.javafundamentals;


public class WrapperObjectExample {
	String name="King";
	Double salary=5000.0;
	Double pf=8.0;
	Double da=3.0;
	Double gst=6.0;
	Double annual_salary;
	

	public static void main(String[] args) {
		WrapperObjectExample obj=new WrapperObjectExample();
		
	}
	{
		pf=5000*0.08;
		System.out.println("PF Amount:" +pf);
		da=5000*0.03;
		System.out.println("DA Amount: "+da);
		gst=5000*0.06;
		System.out.println("GST Amount: "+gst);
		annual_salary=salary-pf+da-gst;
		System.out.println("Annual salary is: "+annual_salary);
		
	}

}

package com.javaintroduction;

public class ObjectCount {
	
	
	/*
	 * static int count=0;
	 * public static void main(String[] args) {
	 * ObjectCount o1=new ObjectCount();
	 * ObjectCount o2=new ObjectCount();
	 * ObjectCount o3=new ObjectCount();
	 * System.out.println(count);
	 *
	 * }
	 * {
	 * count+=1;
	 *
	 * }
	 */
	public static void main(String args[]) {
		
	}
	static {
		ObjectCount o1=new ObjectCount();
		o1.run1();
	}
	static void show1() {
		System.out.println("This is Static Method1");
		show2();
	}
	static void show2() {
		System.out.println("This is Static Method2");
	}
	void run1() {
		System.out.println("This is Instance Method1");
		run2();
		/*
		 * show1();
		 * show2();
		 */
		
	}
	void run2() {
		System.out.println("This is Instance Method2");
		show1();
	}
	
	
}

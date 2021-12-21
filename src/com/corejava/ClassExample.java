package com.corejava;

public class ClassExample extends AbstactClassExample implements InterfaceExample{

	// variable static/instance/final

		String sname = "Hima";
		int i; // primitive data
		static int k = 10; // primitive data
		final int l = 20; // primitive data
		Integer j = new Integer(20); // wrapper class

		// blocks static/instance
		{
			System.out.println("instance block");
		}
		static {
			System.out.println("static block");
		}

		// constructor one/two/three.. n argument constructor

		ClassExample() {
			System.out.println("zero/no argument constructor");
		}

		ClassExample(int i) {
			this.i = i;
			System.out.println("one argument constructor");
		}

		// method static/instance

		void m1() {
			System.out.println("AccountExample m1() instance method");
		}

		String m2() {
			System.out.println("AccountExample m2() instance method");
			return "Hima";
		}

		static int m3() {
			System.out.println("AccountExample m3() static method");
			return 20;
		}

		int m4(int i) {
			System.out.println("AccountExample m4() static method");
			return 20;
		}

		@Override
		void m5() {
			System.out.println("from sub class m5 method ");
			
		}

		@Override
		public void m7() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void m8() {
			// TODO Auto-generated method stub
			
		}
		
		/*
		 * int m6(){ System.out.println("from sub class m6 method "); return 80; }
		 */
}

package ConstructorBasics;

public class Employee1 {
	//16-12-23
	//Q)----HW  create Employee class  and define DC, 1 PC, 2 PC  , call all constructors from main()?

	//instance variables
	String name;
	String college;
	//define constructor
	Employee1()//default constructor
	{
		System.out.println("calling default constructor");
	}
	Employee1(String name)
	{
		name="ashok";
		System.out.println("calling 1 PC ="+name);
	}
	Employee1(String name,String college)
	{
		name="kumar";
		college="jntu university";
		System.out.println("calling 2 PC ="+name+",college="+college);

	}
	public static void main(String[] args) {
		//to call constructor ---create object for class
		Employee1 emp=new Employee1();//call default constructor
		Employee1 emp1=new Employee1("ashok");// call 1 PC constructor
		Employee1 emp2=new Employee1("kumar","jntu university");// call 2 PC constructor


	}

}

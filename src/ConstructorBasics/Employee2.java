package ConstructorBasics;

public class Employee2 {

	//16-12-23
	//HW  in the above class ,   Define some instance var, static variables, instance methods, static methods
	//, call all var, methods using this k/w ?
	//instance variables
	String name;
	String address;

	//static variables
	static String college;

	//static method
	static void SM1()
	{
		System.out.println("calling static method from instance method");
	}
	//instance method
	void M1()
	{
		this .college="osmania university";
		System.out.println("calling static variabe="+college);
		this.SM1();
	}
	Employee2()
	{

		System.out.println("calling default constructor");

	}
	Employee2(String name,String address)
	{
		this.name="ashok";
		this.address="bangalore";
		System.out.println("calling 2 PC constructor="+name+",address="+address);	
	}


	public static void main(String[] args) {
		Employee2 emp=new Employee2();
		emp.M1();
		Employee2 emp1=new Employee2 ("ashok","bangalore");


	}

}

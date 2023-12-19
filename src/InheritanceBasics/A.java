package InheritanceBasics;

public class A {
//17-12-23
	//HW WAP to call parent class var, Methods,constructors using 'super' k/w?

	//HW WAP to call parent class -1 param constr?

	//HW WAP to call parent class 2 param constr?

	int a =10;//instance variables
	A()//default construcot
	{
		System.out.println("Dc from Parent class A");
	}
	
	 A(String name)//1 PC constructor
	 {
		
		System.out.println("calling parent class method 1 PC ="+name);
	}
	 A(String address,int id)
	 {
		 System.out.println("calling parent class 2 PC construcor adddress="+address+",id="+id);
	 }
	 
	void M1()//non static method
	{
	
		System.out.println(" calling Parent class M1()=");
	}	

}

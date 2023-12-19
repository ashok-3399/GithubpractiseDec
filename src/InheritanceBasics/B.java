package InheritanceBasics;

public class B extends A
{
//	package InheritanceBasics;
//
//	public class A {
//		
//		int a =10;//instance variables
//		A()//default construcot
//		{
//			System.out.println("Dc from Parent class A");
//		}
//		
//		 A(String name)//1 PC constructor
//		 {
//			
//			System.out.println("calling parent class method 1 PC ="+name);
//		}
//		 A(String address,int id)
//		 {
//			 System.out.println("calling parent class 2 PC construcor adddress="+address+",id="+id);
//		 }
//		 
//		void M1()//non static method
//		{
//		
//			System.out.println(" calling Parent class M1()=");
//		}	
//
//	}

	
	int a=20;
	
	
	B()//default constructor
	{
      //super("ashok");
      super("bangalore",103);
		
	}
	void M1()
	{
		
        System.out.println("calliing parent class var="+super.a);
        super.M1();      
		System.out.println("calling child class method");
		
	}
	public static void main(String[] args) {
		// create obj for child class
		B bref=new B();
		bref.M1();

	}
			
}


	
	
	
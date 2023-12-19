package ConstructorBasics;

public class Employee3 {

	//16-12-23
	//HW  Define some  constr for employee class ex:  DC, 1 PC,  3 PC  with 1 int param, char param, String param  and call constr  from main()

	//instance variables
	int id;
	int emplid;
	String name;
	char ch;
	Employee3()//Default constru
	{
		System.out.println("calling default constructor");
	}
	Employee3(int id)
	{
		id=10;
		System.out.println("calling 1 PC constructor="+id);

	}
	Employee3(String name,int emplid,char ch)
	{
		name="ashok";
		emplid=555;
		ch='A';
		System.out.println("calling 3 PC Constructor="+name+",empid="+emplid+",ch="+ch);

	}
	public static void main(String[] args) {
		Employee3 emp=new Employee3();//call default constructor
		Employee3 emp1=new Employee3(10);//call 1 PC constructor
		Employee3 emp2=new Employee3("ashok",555,'A');//calling 3 PC constructor



	}

}

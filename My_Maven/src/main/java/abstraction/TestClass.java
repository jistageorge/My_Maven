package abstraction;

public class TestClass extends AbstractClass{  //extend abstract class here

	public void add()     
	{
		int a=2;
		int b=3;
		System.out.println(a+b);
	}
	public void print()   //create normal method with same abstract method name to pass definitions to abstract method with no body
	{
		System.out.println("abstract method");
	}
	public static void main(String[] args) {
		
		TestClass obj=new TestClass();
		obj.print(); 
		obj.display();
		obj.add();
	}

}

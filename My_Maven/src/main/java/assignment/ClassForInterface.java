package assignment;

public class ClassForInterface implements InterfaceSample1 {

	public void show()
	{
	System.out.println("1st interface method");	
	}
	public void print()
	{
		System.out.println("2nd interface method");
	}
	public void display()
	{
		System.out.println("abstract method");	
	}
	
	public void visible()
	{
	System.out.println("this class method");	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassForInterface obj=new ClassForInterface();
		obj.show();
		obj.print();
		obj.display();
		obj.visible();
		System.out.println(obj.a);
		System.out.println(obj.b);
		//System.out.println(obj.c);
		System.out.println(obj.name);
		//i don't want to display this class methods, required only interface
		//create obj for interface in a diff way
		
		InterfaceSample1 obj2=new ClassForInterface();
		obj2.show();
		//obj2.print();    
		//obj2.visible();
		obj2.display();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.name);
		//System.out.println(obj.c);
		
		
	}

}

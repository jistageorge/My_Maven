package assignment;

public class AbstractTestClass extends AbstractClass {   //extend abstract cls in this normal cls

	public void student()            //created same method name of abstract class
	{
		String name="ammu";
		int age=20;
		System.out.println(name);
		System.out.println(age);
	}
	public static void main(String[] args) {
		
		AbstractTestClass obj=new AbstractTestClass();  //create obj in this class
		obj.student();
		
	}

}

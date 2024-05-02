package exception;

public class ThrowException {
	
	public static void textThrow(int age)
	{
	if(age<18)
	{
	throw new ArithmeticException("not eligible for vote");  //throw an exception to constructor of arithmetic exp.
	}
	else
	{
	System.out.println("eligible for vote");	
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowException.textThrow(14);
		
	}

}

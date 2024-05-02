package exception;

public class Sample {

	public void text(int age) throws LicenseException
	{
	if(age<18)
	{
	throw new LicenseException("not eligible for vote");  // custom exception
	}
	else
	{
	System.out.println("eligible for vote");	
	}
	}
	public static void main(String[] args) {
		
		Sample obj=new Sample();
		try {
			obj.text(10);
		} catch (LicenseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("hi");
	}

}

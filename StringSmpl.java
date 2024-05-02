class StringSmpl
{
	public static void main(String args[])
	{
		StringBuilder s1=new StringBuilder("hi");
		System.out.println(s1);
		s1.append("program");
		System.out.println(s1);
		
		s1.insert(2,"Hi");
		System.out.println(s1);
		
		s1.replace(2,7,"Hello");
		System.out.println(s1);
		
		s1.delete(2,7);
		System.out.println(s1);
		
		s1.reverse();
		System.out.println(s1);
	}
}
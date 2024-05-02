package CollectionExample;

import java.util.ArrayList;

public class CollectionSample {

	public static void main(String[] args) {
		ArrayList obj=new ArrayList();  //non-generic array list    here,array list is already existing class

		obj.add("hi");    //pre defined add method
		obj.add(23);
		obj.add(2.3f);
		obj.add('a');
		System.out.println(obj);
		
		ArrayList<String> al=new ArrayList();   //generic - 
		al.add("hello");    //pre defined add method
		al.add("string value");
		al.add("java");
		System.out.println(al);
		
		ArrayList<String> obj1=new ArrayList();  //generic
		obj1.add("sample");
		obj1.add("welcome");
		
		obj1.addAll(al);        //add generic elements together from 2  collections
		System.out.println(obj1);
		
		obj1.remove(3);
		System.out.println(obj1);  //remove value from particular index
		
		al.removeAll(al);
		System.out.println(al);   //remove all elements
		
		ArrayList<String> obj2=new ArrayList();  //generic
		obj2.add("aaaa");
		obj2.add("bbbb");
		obj2.add("ccc");
		
		//obj2.get(0);     //to get particular index value
		System.out.println(obj2.get(2));
		
		System.out.println(obj2.size());   // size
		
		boolean a=obj2.contains("aaaa");   //contains - contained or not
		System.out.println(a);
		boolean b=obj2.contains("hi");
		System.out.println(b);		
	}
}

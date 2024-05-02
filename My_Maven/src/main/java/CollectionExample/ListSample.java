package CollectionExample;

import java.util.ArrayList;
import java.util.List;

public class ListSample {

	public static void main(String[] args) {
		List l1=new ArrayList();
		l1.add(34);  
        l1.add("hi");  
        l1.add(4.5f); 
        l1.add('a'); 
        System.out.println(l1); 
        
        
        List<String> al=new ArrayList();   //generic - 
		al.add("hello");    //pre defined add method
		al.add("string value");
		al.add("java");
		System.out.println(al);
		
		List<String> obj1=new ArrayList();  //generic
		obj1.add("sample");
		obj1.add("welcome");
		
		obj1.addAll(al);        //add generic elements together from 2  collections
		System.out.println(obj1);
		
		obj1.remove(3);
		System.out.println(obj1);  //remove value from particular index
		
		al.removeAll(al);
		System.out.println(al);   //remove all elements
		
		List<String> obj2=new ArrayList();  //generic
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

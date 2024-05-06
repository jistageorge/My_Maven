package CollectionExample;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListCollection {

	public static void main(String[] args) {
		
		LinkedList ll1=new LinkedList();    //non-generic using add()
		System.out.println(ll1);  
        ll1.add("hi");  
        ll1.add(23); 
        ll1.add(4.5f); 
        ll1.add('a'); 
        System.out.println(ll1); 

        
		LinkedList<String> ll2=new LinkedList<String>();    //generic - using add()
		System.out.println(ll2);  
        ll2.add("Arsha");  
        ll2.add("Jista"); 
        System.out.println(ll2); 

        ArrayList<String> ll3=new ArrayList();  //generic  - using add()
		ll3.add("sample");
		ll3.add("welcome");
		
		ll2.addAll(ll3);        //add 2 arraylist generic elements together from 2  collections using addall()
		System.out.println(ll2);
		
		ll1.remove(2);        //remove() element from an index
		System.out.println(ll1); 
		
		ll3.removeAll(ll3);
		System.out.println(ll3);   //removeAll() elements
		
		System.out.println(ll1.get(2));  //get() element from a particular index
		System.out.println(ll1.size());  //size of arraylist
		
		boolean a= ll1.contains(23);    //value contained - true 
		System.out.println(a);
		
		boolean b= ll1.contains("hello");  //value is not contained - false
		System.out.println(b);
	}

}

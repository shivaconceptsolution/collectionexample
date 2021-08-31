package collectionexample;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		//List<String> obj = new LinkedList<String>();
		Deque<String> obj = new LinkedList<String>();
		obj.add("1001");
		obj.add("1003");
		obj.addFirst("1004");
		obj.add("JAVA");
		obj.add("12.34F");
		obj.add("12345.7891");
		obj.addLast("1007");
		obj.remove(2);
		System.out.println("Linked List are");
		for(Object o:obj)
		{
			System.out.println(o);
		}
		System.out.println("Linked List are");
		for(int i=0;i<obj.size();i++)
		{
			//System.out.println(obj.get(i));
		}

	}

}

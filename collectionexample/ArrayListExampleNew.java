package collectionexample;
import java.util.*;
public class ArrayListExampleNew {
void arrayListExample()
{
	/*ArrayList obj = new ArrayList(); //unsafe
	obj.add("Laptop");
	obj.add("Mobile");
	obj.add(true);
	obj.add(12345);
	obj.add(12.345);*/
	LinkedList<Integer> obj = new LinkedList<Integer>(); //safe
	obj.add(1001);
	obj.addFirst(1007);
	obj.add(1006);
	obj.addLast(1009);
	obj.add(1005);
	obj.add(1002);
	
	for(int i=0;i<obj.size();i++)
	{
		System.out.println(obj.get(i));
	}
	for(int i=obj.size()-1;i>=0;i--)
	{
		System.out.println(obj.get(i));
	}
	for(Object o:obj)
	{
		System.out.println(o);
	}
	for(Integer o:obj)
	{
		System.out.println(o);
	}
}
public static void main(String ram[])
{
	ArrayListExampleNew obj = new ArrayListExampleNew();
	obj.arrayListExample();
}

}

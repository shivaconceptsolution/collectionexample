package collectionexample;

import java.util.ArrayList;
import java.util.List;

public class GenericArrayListExample {

	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(1001,"xyz"));
		emp.add(new Employee(1002,"mno"));
		emp.add(new Employee(1003,"klmn"));
		for(Employee obj:emp)
		{
			System.out.println(obj);
		}
		

	}

}

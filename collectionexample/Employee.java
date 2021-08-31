package collectionexample;

public class Employee {
 private int empid;
 private String empname;
 
 Employee(int empid, String empname)
 {
	 this.empid = empid;
	 this.empname =empname;
 }
 public String toString()
 {
	 return "Empid is "+this.empid + " emp name is "+this.empname;
 }
}

import java.util.*;
class Employee{
	private int id;
	private String name;
	private String department;
	private int salary;

	
	
	public Employee(int id, String name, int sal, String department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = sal;
		this.department = department;
	}


	public void displayDetails() {
		System.out.println(id+"\n"+name+"\n"+salary+"\n"+department);
	}
	
}
public class Hashsetquest {
	public static void main(String[] args) {
		HashSet<Employee> set=new HashSet<Employee>();
		Employee e1=new Employee(111,"Utk",2000,"COMPUTER SCIENCE");
		set.add(e1);
		set.add(e1);
		//set.add(new Integer(500));

		Iterator itr = set.iterator();
		  
        
        while (itr.hasNext()) {
            System.out.println(itr.next());
        	//System.out.println(itr.next().displayDetails());
        }
	}

}

package question2;

class Employee {
	protected int salary;
	public Employee() {
		salary=100;
	}
    void salary(){
        System.out.println("Employee has salary");
    }
}
class Manager extends Employee{
    private int incentive;
    public Manager(int incent) {
    	super();
    	incentive=incent;
    }

   // @Override
    void salary() {
        System.out.println("salary of manager is salary + incentive "+(salary+incentive));
    }
}
class Labour extends Employee{
    private int overTime;
    public Labour(int incent) {
    	super();
    	overTime=incent;
    }
    //@Override
    void salary() {
        System.out.println("salary of Labour is salary + overTime " + (salary+overTime));
    }
}
public class EmployeeHeirarchy {
	public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.salary();
        Manager m1 = new Manager(500);
        m1.salary();
        Labour l1= new Labour(300);
        l1.salary();
    }
}


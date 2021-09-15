package question2;

public class Employee {

    public static void main(String[] args) {
        Employe e1 = new Employe();
        e1.salary();
        Manager e2 = new Manager();
        e2.salary();
        Labour e3 = new Labour();
        e3.salary();
    }
}
class Employe {
    void salary(){
        System.out.println("The average salary of employee is $1500");
    }
}
class Manager extends Employe{
    private int incentive;

    @Override
    void salary() {
        System.out.println("The total salary of Manager is $2000");
    }
}
class Labour extends Employe{
    private int overTime;

    @Override
    void salary() {
        System.out.println("The total salary of Labour is $1000");
    }
}



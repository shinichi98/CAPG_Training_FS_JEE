package question2;

public class EmployeeMain {

    public static void main(String[] args) {
        Employe e1 = new Employe();
        e1.salary();
        Manager2 e2 = new Manager2();
        e2.salary();
        Labour2 e3 = new Labour2();
        e3.salary();
    }
}
class Employe {
    void salary(){
        System.out.println("The average salary of employee is xxxx");
    }
}
class Manager2 extends Employe{
    private int incentive;

    @Override
    void salary() {
        System.out.println("The total salary of Manager is xxxx");
    }
}
class Labour2 extends Employe{
    private int overTime;

    @Override
    void salary() {
        System.out.println("The total salary of Labour is xxxx");
    }
}



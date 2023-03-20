
public class Employee {
static String company;
String employee_Name;

 static void display(){
    System.out.println("Called from Employee Class");
}
static {
    System.out.println("I am called first");
}
    {
        System.out.println("Normal instance block");
    }
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.employee_Name="Harshada";
        e1.company="ABC";
        System.out.println(e1.employee_Name);
        System.out.println(e1.company);
        System.out.println("======================================");
        Employee e2 =  new Employee();
        System.out.println(e2.employee_Name);
        System.out.println(e2.company);
        e2.company="XYZ";
        System.out.println(e1.company);

        System.out.println(Employee.company);

        e1.display();
        Employee.display(); // class name. function name
        display(); //if it is within class

    }
}

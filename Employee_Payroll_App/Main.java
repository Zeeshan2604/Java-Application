package Employee_Payroll_App;

abstract class Employee{
    private String name;
    private int id;

    public Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName(){return name;}
    public int getId(){return id;}

    abstract double calculateSalary();

    @Override
    public String toString(){
        return "Employee[name"+name+", id="+id+", salary="+calculateSalary()+"]";
    }
}


class FullTimeEmployee extends Employee{
    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary){
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary(){
         return monthlySalary;
    }
}


public class Main {
    
}

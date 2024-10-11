
package btvn2;

public class Employee extends Person{
    private double Salary;

    public Employee(double Salary, String name, String SSN, int yob) {
        super(name, SSN, yob);
        this.Salary = Salary;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    @Override
    public double change(double newValue){
        setSalary(Salary+Salary*newValue);
        return newValue;
    }
}

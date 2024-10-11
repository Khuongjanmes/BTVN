
package btvn2;

public abstract class Person {
    protected String name, SSN;
    protected int yob;

    public Person(String name, String SSN, int yob) {
        this.name = name;
        this.SSN = SSN;
        this.yob = yob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    
    public int getAge(){
        return 2024 - yob;
    }

    @Override
    public String toString() {
        return  "name=" + name + ", SSN=" + SSN + ", yob=" + yob + '}';
    }

    public abstract double change(double newValue);
}
       

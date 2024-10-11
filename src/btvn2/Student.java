
package btvn2;
public class Student extends Person{
     private String SID, classID;
     private double GPA;

    public Student(String SID, String classID, double GPA, String name, String SSN, int yob) {
        super(name, SSN, yob);
        this.SID = SID;
        this.classID = classID;
        this.GPA = GPA;
    }

    public String getSID() {
        return SID;
    }

    public void setSID(String SID) {
        this.SID = SID;
    }

    public String getClassID() {
        return classID;
    }

    public void setClassID(String classID) {
        this.classID = classID;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    
    
    public int enrollYear(){
        return Integer.parseInt(SID.substring(2, 4));
    }
    
     @Override
    public double change(double GPA){
        return this.GPA = GPA;
    }
}

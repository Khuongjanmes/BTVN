/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class PersonList {

    public void printMenu(){
        System.out.println("StudentManagement System");
        System.out.println("1. Add Person");
        System.out.println("2. Update");
        System.out.println("3. Delete person by SSN");
        System.out.println("4. Sort student by age");
        System.out.println("5. GetMaxGPA");
        System.out.println("6. Exit");
    }
    
    public void add(Person p){
        if(checkExistId(p.getSSN()) == true ){
            System.out.println("Person is exist!!");
        } else {
        person.add(p);
        System.out.println("Add success!!");
        }
    }
    
    public boolean checkExistId(String SSN){ 
        for (Person s : person) {
                if (s.getSSN().equalsIgnoreCase(SSN)){
                    return true;
                }   
        } 
        return false;
    }
        

     ArrayList<Person> person = new ArrayList();
     Scanner sc = new Scanner(System.in);
    public void input(){
        int choice, schoice, echoice;
        do{
            System.out.println("1. Student");
            System.out.println("2. Employee");
            choice = sc.nextInt();
            
            switch (choice){
                case 1:
                       printMenu();
                       schoice = sc.nextInt();
                       sc.nextLine();
                       switch(schoice){
                           case 1:
                               System.out.print("Enter Name: ");
                               String n = sc.nextLine();
                               System.out.print("Enter SSN: ");
                               String ssn = sc.nextLine();
                               System.out.print("Enter year of birth: ");
                               int y = sc.nextInt();
                               sc.nextLine();
                               System.out.print("Enter student ID: ");
                               String sid = sc.nextLine();
                               System.out.print("Enter class ID: ");
                               String cid = sc.nextLine();
                               System.out.print("Enter GPA: ");
                               double gpa = sc.nextDouble();
                               Person stdent = new Student(sid, cid, gpa, n, ssn, y);
                               add(stdent);
                               break;
                           default:
                               System.out.println("Invalid choice in student menu");
                               break;
                       }
                       break;
                case 2:
                        printMenu();
                        echoice = sc.nextInt();
                        sc.nextLine();
                        switch(echoice){
                            case 1: 
                               System.out.print("Enter Name: ");
                               String n1 = sc.nextLine();
                               System.out.print("Enter SSN: ");
                               String ssn1 = sc.nextLine();
                               System.out.print("Enter year of birth: ");
                               break;
                            default:
                               System.out.println("Invalid choice in employee menu");
                               break;
                        }
                        break;
                default:    
                        System.out.println("Invalid choice");
            } 
        } while (choice != 0);
    }
}

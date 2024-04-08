/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prac7;

/**
 *
 * @author VuyoMthembu
 */
public class Member 
{
    //Declaring variables
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;
    
    //Constructor
    public Member(String name, int age, String phoneNumber, String address, double salary)
    {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
       
    }
    //Getter Methods
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    public String getAddress()
    {
        return address;
    }
        public double getSalary()
    {
        return salary;
    }
    
    //Setter Methods
    public void Name(String name)
    {
        this.name = name;
    }
    public void Age(int age)
    {
        this.age = age;
    }
    public void PhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    public void Address(String address)
    {
        this.address = address;
    }
        public void Salary(double salary)
    {
        this.salary = salary;
    }
        
    //Method
    public void printSalary()
    {
        System.out.println("Salary: " + salary);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prac7;

/**
 *
 * @author VuyoMthembu
 */
public class Employee extends Member 
{
    String specialization;
    
    //Constructor 
    public Employee(String name, int age, String phoneNumber, String address, double salary, String specialization)
    {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;  
    }
}

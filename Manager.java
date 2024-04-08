/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prac7;

/**
 *
 * @author VuyoMthembu
 */
public class Manager extends Member 
{
    String department;
    
 
    
     public Manager(String name, int age, String phoneNumber, String address, double salary, String department)
    {
        super(name, age, phoneNumber, address, salary);
        this.department = department; 
    }     
}

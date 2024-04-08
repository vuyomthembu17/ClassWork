/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prac7;

/**
 *
 * @author VuyoMthembu
 */
public class Test 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        //Creating the intersent of the Employee
        Employee emp = new Employee("Vuyo Mthembu", 22, "060 452 8742", "116 Long St", 10000, "Software Developer");
    
        //Creating the intersent of the Manager
        Manager manager = new Manager("Vuyo Mthembu", 22, "060 452 8742", "116 Long St", 10000, "Programmer");
        
        //Displaying The output of the Employee
        System.out.println("Employee Details: ");
        System.out.println("Name: " + emp.name);
        System.out.println("Age: " + emp.age);
        System.out.println("Phone Number: " + emp.phoneNumber);
        System.out.println("Addres: " + emp.address);
        emp.printSalary();
        System.out.println("specialization: " + emp.specialization);
        
        //Displaying The output of the Manager
        System.out.println("\nManager:");
         System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone Number: " + manager.phoneNumber);
        System.out.println("Addres: " + manager.address);
        manager.printSalary();
        System.out.println("Department: " + manager.department);
        
   }
    
}
    


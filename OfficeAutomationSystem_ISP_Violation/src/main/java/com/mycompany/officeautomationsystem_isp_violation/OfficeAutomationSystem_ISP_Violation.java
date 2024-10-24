/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.officeautomationsystem_isp_violation;

/**
 *
 * @author UBH Laptops
 */
public class OfficeAutomationSystem_ISP_Violation {

    public static void main(String[] args) {

     // Create an instance of Employee
        Worker employee = new Employee();
        System.out.println("Employee Details:");
        employee.responsibility();
        System.out.println("Salary: $" + employee.salary());
        System.out.println("Leave days: " + employee.leave());

        System.out.println();

        // Create an instance of Robot
        Worker robot = new Robot();
        System.out.println("Robot Details:");
        robot.responsibility();
        System.out.println("Salary: $" + robot.salary());  // This is not applicable
        System.out.println("Leave days: " + robot.leave());   // This is not applicable


    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.officeautomationsystem_isp;

/**
 *
 * @author UBH Laptops
 */
public class OfficeAutomationSystem_ISP {

    public static void main(String[] args) {
       Responsible employee = new Employee();
        Paid employeePaid = (Paid) employee;
        Leaveable employeeLeave = (Leaveable) employee;

        System.out.println("Employee Details:");
        employee.responsibility();
        System.out.println("Salary: $" + employeePaid.salary());
        System.out.println("Leave days: " + employeeLeave.leave());

        System.out.println();

        // Create an instance of Robot
        Responsible robot = new Robot();

        System.out.println("Robot Details:");
        robot.responsibility();
    
    }
}

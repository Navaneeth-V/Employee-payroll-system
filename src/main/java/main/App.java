package main;

import model.Employee;
import service.EmployeeService;
import service.EmployeeServiceImpl;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("1. Add Employee");
            System.out.println("2. List Employee");
            System.out.println("3. List Employee By Department");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.println("Enter your choice :");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Employee newEmployee = readEmployeeDetails(sc);
                    employeeService.addEmployee(newEmployee);
                    break;
                case 2:
                    employeeService.getAllEmployees().forEach((employee) -> System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSalary()));
                    break;
                case 3:
                    System.out.println("Enter department id");
                    int departmentId = sc.nextInt();
                    employeeService.ListEmployeesByDepartment(departmentId);
                    break;
                case 4:
                    Employee employee = readEmployeeDetails(sc);
                    employeeService.updateEmployee(employee.getId(), employee);
                    break;
                case 5:
                    System.out.println("Enter Id to delete");
                    Integer id = sc.nextInt();
                    employeeService.deleteEmployee(id);
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }

    public static Employee readEmployeeDetails(Scanner sc) {
        System.out.println("Enter ID");
        int id = sc.nextInt();
        System.out.println("Enter Name");
        String name = sc.next();
        System.out.println("Enter Designation");
        String designation = sc.next();
        System.out.println("Enter DepartmentId");
        int departmentId = sc.nextInt();
        System.out.println("Enter Salary");
        String salary = sc.next();

        Employee employee = new Employee();
        employee.setId(id);
        employee.setName(name);
        employee.setDesignation(designation);
        employee.setDepartmentId(departmentId);
        employee.setSalary(Double.parseDouble(salary));
        return employee;
    }
}
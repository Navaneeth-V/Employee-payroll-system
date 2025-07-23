package service;

import model.Employee;

import java.util.ArrayList;

public interface EmployeeServiceImpl {
    public void addEmployee();

    public Employee getEmployeeById(int id);

    public ArrayList<Employee> getAllEmployees();

    public void updateEmployee();

    public void deleteEmployee(int id);

    public void ListEmployeesByDepartment(int departmentId);
}

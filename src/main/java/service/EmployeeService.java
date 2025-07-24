package service;

import model.Employee;

import java.util.List;

public interface EmployeeService {
    public void addEmployee(Employee employee);

    public Employee getEmployeeById(int id);

    public List<Employee> getAllEmployees();

    public void updateEmployee(Employee employee);

    public void deleteEmployee(int id);

    public void ListEmployeesByDepartment(int departmentId);
}

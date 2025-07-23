package dao;

import model.Employee;

import java.util.List;

public interface EmployeeDao {

    void addEmployee(Employee employee);

    List<Employee> listEmployee();

    Employee getEmployeeById(int id);

    void updateEmployee(Employee employee);

    void deleteEmployee(int id);
}

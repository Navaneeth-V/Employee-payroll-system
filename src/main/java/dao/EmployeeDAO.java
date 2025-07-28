package dao;

import model.Employee;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDAO {

    void addEmployee(Employee employee) throws SQLException;

    List<Employee> listEmployee() throws SQLException;

    Employee getEmployeeById(int id) throws SQLException;

    List<Employee> listEmployeeByDepartment(int departmentId) throws SQLException;

    void updateEmployee(int id, Employee employee) throws SQLException;

    void deleteEmployee(int id) throws SQLException;
}

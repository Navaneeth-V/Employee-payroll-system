package dao;

import model.Employee;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDao {

    void addEmployee(Employee employee) throws SQLException;

    List<Employee> listEmployee() throws SQLException;

    Employee getEmployeeById(int id) throws SQLException;

    void updateEmployee(Employee employee) throws SQLException;

    void deleteEmployee(int id) throws SQLException;
}

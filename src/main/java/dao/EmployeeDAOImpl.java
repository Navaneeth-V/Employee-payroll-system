package dao;

import model.Employee;
import util.DBConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDao {

    @Override
    public void addEmployee(Employee employee) {

        Connection connection = DBConnection.getConnection();
        try {

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }
    }

    @Override
    public List<Employee> listEmployee() {
        return null;
    }

    @Override
    public Employee getEmployeeById(int id) {
        return null;
    }

    @Override
    public void updateEmployee(Employee employee) {
        // implementation
    }

    @Override
    public void deleteEmployee(int id) {
        // implementation
    }
}

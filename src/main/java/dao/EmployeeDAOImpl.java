package dao;

import model.Employee;
import util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {

    @Override
    public void addEmployee(Employee employee) throws SQLException {
        Connection connection = DBConnection.getConnection();
        String sql = "INSERT INTO employee VALUES(?,?,?,?,?)";
        try(PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, employee.getId());
            statement.setString(2, employee.getName());
            statement.setString(3, employee.getDesignation());
            statement.setInt(4, employee.getDepartmentId());
            statement.setDouble(5, employee.getSalary());
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }
    }

    @Override
    public List<Employee> listEmployee() throws SQLException {
        Connection connection = DBConnection.getConnection();
        List<Employee> employees = new ArrayList<>();
        String sql = "SELECT * FROM employee";

        try(PreparedStatement statement = connection.prepareStatement(sql)) {
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()) {
                Employee employee = new Employee();
                employee.setId(resultSet.getInt("id"));
                employee.setName(resultSet.getString("name"));
                employee.setDesignation(resultSet.getString("designation"));
                employee.setDepartmentId(resultSet.getInt("departmentId"));
                employee.setSalary(resultSet.getDouble("salary"));

                employees.add(employee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }
        return employees;
    }

    @Override
    public Employee getEmployeeById(int id) throws SQLException {
        Connection connection = DBConnection.getConnection();
        String sql = "SELECT * FROM employee WHERE id = ?";
        try(PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if(resultSet.next()) {
                Employee employee = new Employee();
                employee.setId(resultSet.getInt("id"));
                employee.setName(resultSet.getString("name"));
                employee.setDesignation(resultSet.getString("designation"));
                employee.setDepartmentId(resultSet.getInt("departmentId"));
                employee.setSalary(resultSet.getDouble("salary"));

                return employee;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }
        return null;
    }

    @Override
    public void updateEmployee(Employee employee) throws SQLException {
        Connection connection = DBConnection.getConnection();
        String sql = "update employee set name = ?, designation = ?, departmentId = ?, salary = ? where id = ?";
        try(PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, employee.getName());
            statement.setString(2, employee.getDesignation());
            statement.setInt(3, employee.getDepartmentId());
            statement.setDouble(4, employee.getSalary());
            statement.setInt(5, employee.getId());
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteEmployee(int id) throws SQLException {
        Connection connection = DBConnection.getConnection();
        String sql = "DELETE FROM employee WHERE id = ?";
        try(PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Employee> listEmployeeByDepartment(int departmentId) throws SQLException {
        List<Employee> employees = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        String sql = "SELECT * FROM employee WHERE departmentId = ?";
        try(PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, departmentId);
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()) {
                Employee employee = new Employee();
                employee.setId(resultSet.getInt("id"));
                employee.setName(resultSet.getString("name"));
                employee.setDesignation(resultSet.getString("designation"));
                employee.setDepartmentId(resultSet.getInt("departmentId"));
                employee.setSalary(resultSet.getDouble("salary"));

                employees.add(employee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }

        return employees;
    }
}

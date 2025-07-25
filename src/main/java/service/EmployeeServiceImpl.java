package service;

import dao.EmployeeDAOImpl;
import dao.EmployeeDao;
import model.Employee;

import java.util.List;

public class EmployeeServiceImpl {

    private final EmployeeDao employeeDao = new EmployeeDAOImpl();

    public void addEmployee(Employee employee) {
        try {
            employeeDao.addEmployee(employee);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Employee getEmployeeById(int id) {
        try {
            return employeeDao.getEmployeeById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Employee> getAllEmployees() {
        try {
            return employeeDao.listEmployee();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void updateEmployee(Employee employee) {
        try {
            employeeDao.updateEmployee(employee);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteEmployee(int id) {
        try {
            employeeDao.deleteEmployee(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ListEmployeesByDepartment(int departmentId) {
        try {
            employeeDao.listEmployee();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

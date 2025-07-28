package service;

import dao.EmployeeDAOImpl;
import dao.EmployeeDAO;
import model.Employee;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeDAO employeeDao = new EmployeeDAOImpl();

    @Override
    public void addEmployee(Employee employee) {
        try {
            employeeDao.addEmployee(employee);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Employee getEmployeeById(int id) {
        try {
            return employeeDao.getEmployeeById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Employee> getAllEmployees() {
        try {
            return employeeDao.listEmployee();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void updateEmployee(int id, Employee employee) {
        try {
            employeeDao.updateEmployee(id, employee);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteEmployee(int id) {
        try {
            employeeDao.deleteEmployee(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void ListEmployeesByDepartment(int departmentId) {
        try {
            employeeDao.listEmployeeByDepartment(departmentId);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package service;

import dao.EmployeeDAOImpl;
import dao.EmployeeDao;
import model.Employee;

import java.util.List;

public class EmployeeServiceImpl {

    private final EmployeeDao employeeDao = new EmployeeDAOImpl();

    public void addEmployee(Employee employee) {
        employeeDao.addEmployee(employee);
    }

    public Employee getEmployeeById(int id) {
        return employeeDao.getEmployeeById(id);
    }

    public List<Employee> getAllEmployees() {
        return employeeDao.listEmployee();
    }

    public void updateEmployee(Employee employee) {
        employeeDao.updateEmployee(employee);
    }

    public void deleteEmployee(int id) {
        employeeDao.deleteEmployee(id);
    }

    public void ListEmployeesByDepartment(int departmentId) {
        employeeDao.listEmployee();
    }
}

package layerdarch.eis.services;

import java.util.List;

import layerdarch.eis.dto.Employee;

public interface EmployeeService
{
 public Employee getEmployeeByid(int empId);
 public List<Employee> getEmployees();
 public List<Employee> getEmployeesByDept();
 public void deleteEmployee(int empId);
 
}
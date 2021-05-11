package layerdarch.eis.dao;

import java.util.List;

import layerdarch.eis.dto.Employee;

public interface EmployeeDao {
	 public Employee getEmployeeByid(int empId);
	 public List<Employee> getEmployees();
	 public List<Employee> getEmployeesByDept();
	 public void deleteEmployee(int empId);
}

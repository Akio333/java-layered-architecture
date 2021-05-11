package layerdarch.eis.services;

import java.util.List;

import layerdarch.eis.dao.EmployeeDao;
import layerdarch.eis.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeDao empDao;
	
	public EmployeeServiceImpl(EmployeeDao empDao) {
		this.empDao = empDao;
	}
	
	@Override
	public Employee getEmployeeByid(int empId) {
		Employee emp = empDao.getEmployeeByid(empId);
		return emp;
	}

	@Override
	public List<Employee> getEmployees() {
		System.out.println("Service - In getemployees");
		List<Employee> empList = empDao.getEmployees();
		return empList;
	}

	@Override
	public List<Employee> getEmployeesByDept() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		
	}

}

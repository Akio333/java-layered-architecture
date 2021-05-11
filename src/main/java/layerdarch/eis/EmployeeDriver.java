package layerdarch.eis;

import java.util.List;

import layerdarch.eis.dao.EmployeeDao;
import layerdarch.eis.dao.EmployeeDaoImpl;
import layerdarch.eis.dto.Employee;
import layerdarch.eis.services.EmployeeService;
import layerdarch.eis.services.EmployeeServiceImpl;

public class EmployeeDriver {
	public static void main(String args[]) {
		EmployeeDao empDao = new EmployeeDaoImpl();
		EmployeeService empService = new EmployeeServiceImpl(empDao);
		List<Employee> empList = empService.getEmployees();
		for ( Employee emp : empList)
			System.out.println(emp);
	}
}

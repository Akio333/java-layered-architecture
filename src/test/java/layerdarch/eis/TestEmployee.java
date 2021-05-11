package layerdarch.eis;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


import layerdarch.eis.dao.EmployeeDao;
import layerdarch.eis.dto.Employee;
import layerdarch.eis.services.EmployeeService;
import layerdarch.eis.services.EmployeeServiceImpl;

class TestEmployee {
	static EmployeeService employeeService = null;
	static EmployeeDao mockEmployeeDao = null;
	private static Employee emp1,emp2;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		mockEmployeeDao = Mockito.mock(EmployeeDao.class);
		employeeService = new EmployeeServiceImpl(mockEmployeeDao);
		
		emp1 = new Employee();
		emp1.setEmpno(1);
		emp1.setEmpName("Akio");
		emp1.setHireDate(LocalDate.of(2012, 2, 2));
		emp1.setSalary(20000);
		emp1.setJob("Dev");
		
		emp2 = new Employee();
		emp2.setEmpno(1);
		emp2.setEmpName("Ram");
		emp2.setHireDate(LocalDate.of(2016, 12, 2));
		emp2.setSalary(89300);
		emp2.setJob("Dev");

		Mockito.when(mockEmployeeDao.getEmployees()).thenReturn(Arrays.asList(emp1,emp2));
		
	} 
	@Test
	void getAllEmployeeTest() {
		List<Employee> allEmployee = employeeService.getEmployees();
		assertNotNull(allEmployee);
		
		assertEquals("[Employee [empno=1, empName=Akio, job=Dev, hireDate=2012-02-02, salary=20000.0, deptName=null], "
				+ "Employee [empno=1, empName=Ram, job=Dev, hireDate=2016-12-02, salary=89300.0, deptName=null]]", 
				allEmployee.toString());

		assertEquals(2, allEmployee.size());
	}
}

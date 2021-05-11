package layerdarch.eis.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import layerdarch.eis.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	List<Employee> lst = new ArrayList<Employee>();

	@Override
	public Employee getEmployeeByid(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.setEmpno(1);
		emp.setEmpName("Suyog");
		emp.setDeptName("RnD");
		emp.setHireDate(LocalDate.of(2021, 04, 8));
		emp.setJob("Developer");
		emp.setSalary(34000);
		lst.add(emp);
		
		Employee emp1 = new Employee();
		emp1.setEmpno(2);
		emp1.setEmpName("Raj");
		emp1.setDeptName("Accounts");
		emp1.setHireDate(LocalDate.of(2020, 03, 16));
		emp1.setJob("Manager");
		emp1.setSalary(38900);
		lst.add(emp1);
		
		Employee emp2 = new Employee();
		emp2.setEmpno(3);
		emp2.setEmpName("Bharat");
		emp2.setDeptName("Support");
		emp2.setHireDate(LocalDate.of(2016, 11, 8));
		emp2.setJob("L1-Support");
		emp2.setSalary(26000);
		lst.add(emp2);
		
		return lst;
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

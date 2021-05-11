package layerdarch.eis.dto;

import java.time.LocalDate;
public class Employee 
{ 
	private int empno;
	private String empName;
	private String job;
	private LocalDate hireDate;
	private double salary;
	private String deptName;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public LocalDate getHireDate() {
		return hireDate;
	}
	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", empName=" + empName + ", job=" + job + ", hireDate=" + hireDate
				+ ", salary=" + salary + ", deptName=" + deptName + "]";
	}
	
	

}
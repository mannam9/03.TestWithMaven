import static org.junit.Assert.*;

import org.junit.Test;

import com.fanniemae.payroll.Employee;
import com.fanniemae.payroll.ManagementEmployee;

public class ManagementEmployeeTest {

	@Test
	public void testHourlyWagePositive() {

		ManagementEmployee m = new ManagementEmployee(52000, 40);
		float wage = m.getHourlyWage();
		assertTrue(wage == 25);

	}

	@Test
	public void testHourlyWageNeg() {

		ManagementEmployee m = new ManagementEmployee(52000, 40);
		float wage = m.getHourlyWage();
		assertFalse(wage == 252);
	}

	@Test
	public void testWeeklySalaryPositive() {

		ManagementEmployee m = new ManagementEmployee(52000, 40);
		float weeklySalary = m.getWeeklySalary();
		assertTrue(weeklySalary == 1000);
	}

	@Test
	public void testWeeklySalaryNeg() {

		ManagementEmployee m = new ManagementEmployee(52000, 40);
		float weeklySalary = m.getWeeklySalary();
		assertFalse(weeklySalary == 1001);
	}
	
	@Test
	public void testMonthlySalaryPositive() {

		ManagementEmployee m = new ManagementEmployee(52000, 40);
		float monthlySalary = m.getMonthlySalary();
		assertTrue(monthlySalary == 4333.3333f);
	}
	
	@Test
	public void testMonthlySalaryNeg() {

		ManagementEmployee m = new ManagementEmployee(52000, 40);
		float monthlySalary = m.getMonthlySalary();
		assertFalse(monthlySalary == 4333.43334f);
	}
	
	@Test
	public void test() {
		Employee m = new ManagementEmployee(52000);
		float monthlySalary = m.getMonthlySalary();
		assertTrue("Salary:" + monthlySalary, monthlySalary == 4333.3333f);
	}
}

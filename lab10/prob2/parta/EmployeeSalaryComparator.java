package lab10.prob2.parta;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee> {
	private static final EmployeeNameComparator nameComparator = new EmployeeNameComparator();
	
	@Override
	public int compare(Employee e1, Employee e2) {
		// First compare by salary
		int salaryComparison;
		if(e1.salary == e2.salary) salaryComparison = 0;
		else if(e1.salary < e2.salary) salaryComparison = -1;
		else salaryComparison = 1;
		
		// If salaries are equal, use existing name comparator for consistency with equals
		if (salaryComparison == 0) {
			return nameComparator.compare(e1, e2);
		}
		
		return salaryComparison;
	}
}

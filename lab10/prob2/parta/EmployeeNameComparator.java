package lab10.prob2.parta;

import java.util.Comparator;

/* A functor, but not a closure */
public class EmployeeNameComparator implements Comparator<Employee> {
	private static final EmployeeSalaryComparator salaryComparator = new EmployeeSalaryComparator();
	
	@Override
	public int compare(Employee e1, Employee e2) {
		// First compare by name
		int nameComparison = e1.name.compareTo(e2.name);
		
		// If names are equal, use existing salary comparator for consistency with equals
		if (nameComparison == 0) {
			return salaryComparator.compare(e1, e2);
		}
		
		return nameComparison;
	}
}

package lab10.prob2.partb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeInfo {
	static enum SortMethod {BYNAME, BYSALARY};
	
	public void sort(List<Employee> emps, final SortMethod method) {
		class EmployeeComparator implements Comparator<Employee> {
			@Override
			public int compare(Employee e1, Employee e2) {
				if(method == SortMethod.BYNAME) {
					// First compare by name
					int nameComparison = e1.name.compareTo(e2.name);
					// If names are equal, compare by salary for consistency with equals
					if (nameComparison == 0) {
						return Integer.compare(e1.salary, e2.salary);
					}
					return nameComparison;
				} else {
					// First compare by salary
					int salaryComparison;
					if(e1.salary == e2.salary) salaryComparison = 0;
					else if(e1.salary < e2.salary) salaryComparison = -1;
					else salaryComparison = 1;
					
					// If salaries are equal, compare by name for consistency with equals
					if (salaryComparison == 0) {
						return e1.name.compareTo(e2.name);
					}
					return salaryComparison;
				}
			}
		}
		Collections.sort(emps, new EmployeeComparator());
	}
	
	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Tim", 50000));
		emps.add(new Employee("Andy", 60000));
		EmployeeInfo ei = new EmployeeInfo();
		ei.sort(emps, EmployeeInfo.SortMethod.BYNAME);
		System.out.println(emps);
		//same instance
		ei.sort(emps, EmployeeInfo.SortMethod.BYSALARY);
		System.out.println(emps);
	}
}

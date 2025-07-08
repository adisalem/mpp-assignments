package lab11.part2.prob11b;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {
	
	// TriFunction that takes: List<Employee>, salary threshold, starting letter -> filtered and sorted names
	public static final TriFunction<List<Employee>, Integer, Character, String> FILTER_AND_SORT_EMPLOYEES =
		(employees, salaryThreshold, startingLetter) -> 
			employees.stream()
				.filter(emp -> emp.getSalary() > salaryThreshold)
				.filter(emp -> emp.getLastName().charAt(0) >= startingLetter)
				.map(emp -> emp.getFirstName() + " " + emp.getLastName())
				.sorted()
				.collect(Collectors.joining(", "));
}

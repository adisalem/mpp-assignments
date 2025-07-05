package lab9.prob1.partB;

public class Employee {
	private String name;
	private int salary;
	int countDuplicates = 0;
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override 
	public String toString() {
		return "(" + name + ", " + salary + ")";
	}
	
public boolean equals(Employee e) {
    System.out.println("Comparing: this=" + this + " with e=" + e);
    System.out.println("Names equal? " + e.name.equals(name));
    System.out.println("Salaries equal? " + (e.salary == salary));
    boolean result = e.name.equals(name) && e.salary == salary;
    System.out.println("Final result: " + result);
    return result;
}
//	public boolean equals(Object ob) {
//		Employee e = (Employee)ob;
//		return e.name.equals(name) && e.salary == salary;
//	}
}

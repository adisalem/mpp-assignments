package lab3.prob1;


public class Person {

	private String name;
	Person(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false; 
		if(!(aPerson instanceof Person)) return false;
		Person p = (Person)aPerson;
		boolean isEqual = this.name.equals(p.name);
		return isEqual;
	}
	public static void main(String[] args) {
		PersonWithJob pwj = new PersonWithJob("Joe", 30000);
		Person p = new Person("Joe");
		
		System.out.println("Composition Solution Test:");
		System.out.println("pwj.equals(p)? " + pwj.equals(p)); // false - different types
		System.out.println("p.equals(pwj)? " + p.equals(pwj));   // false - different types
	}

}

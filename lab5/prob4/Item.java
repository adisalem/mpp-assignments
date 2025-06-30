package lab5.prob4;

public class Item {
	String name;
	
	// Package-private constructor - only accessible within the same package
	Item(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return name;
	}
}

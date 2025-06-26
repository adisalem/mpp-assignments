package lab3.prob3;

public class Condo extends Property {
	private int numberOfFloors;

	public Condo(Address address, int numberOfFloors) {
		super(address);
		this.numberOfFloors = numberOfFloors;
		computeRent();
	}

	public int getNumberOfFloors() {
		return numberOfFloors;
	}

	public void setNumberOfFloors(int numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
		computeRent();
	}

	@Override
	public double computeRent() {
		this.rent = 400 * numberOfFloors;
		return this.rent;
	}
}

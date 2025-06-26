package lab3.prob3;

public class Trailer extends Property {
	private static final double RENT = 500.0;

	public Trailer(Address address) {
		super(address);
		computeRent();
	}

	@Override
	public double computeRent() {
		this.rent = RENT;
		return this.rent;
	}
}

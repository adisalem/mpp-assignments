package lab3.prob3;

public class House extends Property {
	private double lotSize;

	public House(Address address, double lotSize) {
		super(address);
		this.lotSize = lotSize;
		computeRent();
	}

	public double getLotSize() {
		return lotSize;
	}

	public void setLotSize(double lotSize) {
		this.lotSize = lotSize;
		computeRent();
	}

	@Override
	public double computeRent() {
		this.rent = 0.1 * lotSize;
		return this.rent;
	}
}

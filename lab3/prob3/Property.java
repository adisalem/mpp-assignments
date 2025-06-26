package lab3.prob3;

public abstract class Property {
    protected Address address;
    protected double rent;

    public Property(Address address) {
        this.address = address;
        this.rent = 0.0;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public double getRent() {
        return rent;
    }

    public abstract double computeRent();

    public String getCity() {
        return address.getCity();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " at " + address.getStreet() +
                ", " + address.getCity() + " - Rent: $" + rent;
    }
}

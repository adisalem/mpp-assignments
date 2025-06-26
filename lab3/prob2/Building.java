package lab3.prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private List<Apartment> apartments;
    private double maintenanceCost;

    public Building(double maintenanceCost) {
        this.maintenanceCost = maintenanceCost;
        this.apartments = new ArrayList<>();
    }

    public void addApartment(Apartment apartment) {
        if (apartment != null) {
            apartments.add(apartment);
        }
    }

    public double calcProfit() {
        double totalRent = 0;
        for (Apartment apartment : apartments) {
            totalRent += apartment.getRent();
        }
        return totalRent - maintenanceCost;
    }

    public double getMaintenanceCost() {
        return maintenanceCost;
    }

    public void setMaintenanceCost(double maintenanceCost) {
        this.maintenanceCost = maintenanceCost;
    }

    public List<Apartment> getApartments() {
        return new ArrayList<>(apartments);
    }

    public int getApartmentCount() {
        return apartments.size();
    }

    @Override
    public String toString() {
        return "Building{apartments=" + apartments.size() +
                ", maintenanceCost=" + maintenanceCost +
                ", profit=" + calcProfit() + "}";
    }
}

package lab3.prob2;

import java.util.ArrayList;
import java.util.List;

public class Landlord {
    private List<Building> buildings;

    public Landlord() {
        this.buildings = new ArrayList<>();
    }

    public void addBuilding(Building building) {
        if (building != null) {
            buildings.add(building);
        }
    }

    public double calcProfits() {
        double totalProfit = 0;
        for (Building building : buildings) {
            totalProfit += building.calcProfit();
        }
        return totalProfit;
    }

    public List<Building> getBuildings() {
        return new ArrayList<>(buildings);
    }

    public int getBuildingCount() {
        return buildings.size();
    }

    public int getTotalApartmentCount() {
        int total = 0;
        for (Building building : buildings) {
            total += building.getApartmentCount();
        }
        return total;
    }

    @Override
    public String toString() {
        return "LandlordInfo{buildings=" + buildings.size() +
                ", totalApartments=" + getTotalApartmentCount() +
                ", totalProfit=" + calcProfits() + "}";
    }
}

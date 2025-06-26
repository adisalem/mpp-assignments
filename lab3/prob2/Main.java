package lab3.prob2;

/** 
 * Main class for testing the landlord profit calculation system.
 * 
 * This implementation follows proper object-oriented design principles
 * by using the public interface methods (addApartment, addBuilding) 
 * to populate the data structures, ensuring encapsulation is maintained.
 * The Main class can now be moved to a different package without breaking
 * the functionality.
 */
public class Main {

	public static void main(String[] args) {
		Landlord landlord = new Landlord();
		
		Building building1 = new Building(400);
		Building building2 = new Building(900);
		Building building3 = new Building(300);
		Building building4 = new Building(775);
		
		building1.addApartment(new Apartment(600));
		building1.addApartment(new Apartment(700));
		
		building2.addApartment(new Apartment(500));
		building2.addApartment(new Apartment(450));
		
		building3.addApartment(new Apartment(1100));
		building3.addApartment(new Apartment(650));
		
		building4.addApartment(new Apartment(6750));
		building4.addApartment(new Apartment(945));
		
		landlord.addBuilding(building1);
		landlord.addBuilding(building2);
		landlord.addBuilding(building3);
		landlord.addBuilding(building4);
		
		System.out.println("Landlord's Monthly Profit Report");
		System.out.println("================================");
		System.out.println("Building 1 profit: $" + building1.calcProfit());
		System.out.println("Building 2 profit: $" + building2.calcProfit());
		System.out.println("Building 3 profit: $" + building3.calcProfit());
		System.out.println("Building 4 profit: $" + building4.calcProfit());
		System.out.println("--------------------------------");
		System.out.println("Total Monthly Profit: $" + landlord.calcProfits());
		System.out.println("\nLandlord Info: " + landlord);
	}
}



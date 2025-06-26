package lab3.prob3;

import java.util.ArrayList;
import java.util.List;

/**
 * Admin class for managing properties and performing calculations.
 * Refactored to use polymorphism instead of instanceof checks.
 */
public class Admin {

	public static double computeTotalRent(Property[] properties) {
		double totalRent = 0;
		for (Property property : properties) {
			totalRent += property.computeRent();
		}
		return totalRent;
	}

	public static double computeTotalRent(Object[] objects) {
		List<Property> properties = new ArrayList<>();
		for (Object obj : objects) {
			if (obj instanceof Property) {
				properties.add((Property) obj);
			}
		}
		return computeTotalRent(properties.toArray(new Property[0]));
	}
}

package lab5.prob1.rulesets;

import java.awt.Component;

import lab5.prob1.gui.CDWindow;

/**
 * Rules:
 *  1. All fields must be nonempty 
 *  2. Price must be a floating point number with two decimal places 
 *  3. Price must be a number greater than 0.49. 
 */

public class CDRuleSet implements RuleSet {
	private CDWindow cdWin;

	@Override
	public void applyRules(Component ob) throws RuleException {
		cdWin = (CDWindow) ob;
		nonemptyRule();
		priceFormatRule();
		priceRangeRule();
	}
	
	private void nonemptyRule() throws RuleException {
		if (cdWin.getArtistValue().trim().isEmpty() ||
			cdWin.getTitleValue().trim().isEmpty() ||
			cdWin.getPriceValue().trim().isEmpty()) {
			throw new RuleException("All fields must be non-empty!");
		}
	}
	
	private void priceFormatRule() throws RuleException {
		String price = cdWin.getPriceValue().trim();
		try {
			Double.parseDouble(price);
			// Check if it has exactly 2 decimal places
			if (!price.matches("\\d+\\.\\d{2}")) {
				throw new RuleException("Price must have exactly two decimal places (e.g., 1.23)");
			}
		} catch (NumberFormatException e) {
			throw new RuleException("Price must be a valid number");
		}
	}
	
	private void priceRangeRule() throws RuleException {
		String price = cdWin.getPriceValue().trim();
		try {
			double priceValue = Double.parseDouble(price);
			if (priceValue <= 0.49) {
				throw new RuleException("Price must be greater than $0.49");
			}
		} catch (NumberFormatException e) {
			throw new RuleException("Price must be a valid number");
		}
	}
}

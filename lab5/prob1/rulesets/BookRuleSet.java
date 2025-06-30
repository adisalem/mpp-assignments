package lab5.prob1.rulesets;

import java.awt.Component;

import lab5.prob1.gui.*;


/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Isbn must be numeric and consist of either 10 or 13 characters
 * 3. If Isbn has length 10, the first digit must be 0 or 1
 * 4. If Isbn has length 13, the first 3 digits must be either 978 or 979
 * 5. Price must be a floating point number with two decimal places 
 * 6. Price must be a number greater than 0.49.
 *
 */
public class BookRuleSet implements RuleSet {
	private BookWindow bookWin;

	@Override
	public void applyRules(Component ob) throws RuleException {
		bookWin = (BookWindow) ob;
		nonemptyRule();
		isbnNumericRule();
		isbnLengthRule();
		isbnPrefixRule();
		priceFormatRule();
		priceRangeRule();
	}
	
	private void nonemptyRule() throws RuleException {
		if (bookWin.getIsbnValue().trim().isEmpty() ||
			bookWin.getTitleValue().trim().isEmpty() ||
			bookWin.getPriceValue().trim().isEmpty()) {
			throw new RuleException("All fields must be non-empty!");
		}
	}
	
	private void isbnNumericRule() throws RuleException {
		String isbn = bookWin.getIsbnValue().trim();
		if (!isbn.matches("\\d+")) {
			throw new RuleException("ISBN must be numeric");
		}
	}
	
	private void isbnLengthRule() throws RuleException {
		String isbn = bookWin.getIsbnValue().trim();
		if (isbn.length() != 10 && isbn.length() != 13) {
			throw new RuleException("ISBN must be either 10 or 13 characters long");
		}
	}
	
	private void isbnPrefixRule() throws RuleException {
		String isbn = bookWin.getIsbnValue().trim();
		
		// Rule 3: If ISBN has length 10, the first digit must be 0 or 1
		if (isbn.length() == 10) {
			char firstDigit = isbn.charAt(0);
			if (firstDigit != '0' && firstDigit != '1') {
				throw new RuleException("For 10-digit ISBN, first digit must be 0 or 1");
			}
		}
		
		// Rule 4: If ISBN has length 13, the first 3 digits must be either 978 or 979
		if (isbn.length() == 13) {
			String firstThree = isbn.substring(0, 3);
			if (!firstThree.equals("978") && !firstThree.equals("979")) {
				throw new RuleException("For 13-digit ISBN, first 3 digits must be 978 or 979");
			}
		}
	}
	
	private void priceFormatRule() throws RuleException {
		String price = bookWin.getPriceValue().trim();
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
		String price = bookWin.getPriceValue().trim();
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

# Lab 10 - Problem 2 Part A: Consistency with Equals

## Problem Analysis
I identified that the original comparators had consistency issues with the `Employee.equals()` method:

**Issue with NameComparator:**
- Original: Only compared by name
- Example: Employee("Joe", 150000) and Employee("Joe", 100000)
  - `NameComparator.compare()` returns 0 (equal for sorting)
  - `equals()` returns false (not actually equal)

**Issue with SalaryComparator:**
- Original: Only compared by salary  
- Example: Employee("Alice", 50000) and Employee("Bob", 50000)
  - `SalaryComparator.compare()` returns 0 (equal for sorting)
  - `equals()` returns false (not actually equal)

Both cases violate the consistency requirement: if `compare()` returns 0, then `equals()` should return true.

## Solution
I modified the `compare()` methods in both comparators to ensure consistency with equals:

**EmployeeNameComparator:**
- First compare by name using `name.compareTo()`
- If names are equal (comparison returns 0), then reuse the existing `EmployeeSalaryComparator`

**EmployeeSalaryComparator:**
- First compare by salary
- If salaries are equal (comparison returns 0), then reuse the existing `EmployeeNameComparator`

This ensures that both comparators return 0 only when both name AND salary are equal, making them consistent with the `Employee.equals()` method.

# Lab 10 - Problem 2 Part C: Consistency with Equals

## Problem Analysis
I identified that the original lambda expression had consistency issues with the `Employee.equals()` method:

**Issue with BYNAME sorting:**
- Original: Only compared by name
- Example: Employee("Joe", 150000) and Employee("Joe", 100000)
  - Lambda `compare()` returns 0 (equal for sorting)
  - `equals()` returns false (not actually equal)

**Issue with BYSALARY sorting:**
- Original: Only compared by salary  
- Example: Employee("Alice", 50000) and Employee("Bob", 50000)
  - Lambda `compare()` returns 0 (equal for sorting)
  - `equals()` returns false (not actually equal)

Both cases violate the consistency requirement: if `compare()` returns 0, then `equals()` should return true.

## Solution
I modified the lambda expression in the `sort()` method to ensure consistency with equals for both sorting methods:
- For BYNAME: I compare by name first, then by salary if names are equal
- For BYSALARY: I compare by salary first, then by name if salaries are equal

This ensures that the lambda comparator returns 0 only when both name AND salary are equal, making it consistent with the `Employee.equals()` method for both sorting approaches.

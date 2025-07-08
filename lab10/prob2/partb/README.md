# Lab 10 - Problem 2 Part B: Consistency with Equals

## Problem Analysis
I identified that the original `EmployeeComparator.compare()` method only compared by name OR salary, but never both. However, `Employee.equals()` requires both name AND salary to be equal.

**Example of inconsistency:**
- Employee("Joe", 150000) and Employee("Joe", 100000)
- When sorting BYNAME: `compare()` returns 0 (equal for sorting)
- `equals()` returns false (not actually equal)

## Solution
I modified the `compare()` method in the local `EmployeeComparator` class to ensure consistency with equals for both sorting methods:
- For BYNAME: I compare by name first, then by salary if names are equal
- For BYSALARY: I compare by salary first, then by name if salaries are equal

This ensures that `compare()` returns 0 only when both name AND salary are equal, making it consistent with the `Employee.equals()` method for both sorting approaches.

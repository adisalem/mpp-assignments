# Lab 9 Problem 1 Part B - equals() Method Override Issue

## Problem

The `removeDuplicates()` method fails because the `Employee` class doesn't properly override the `equals()` method.

## Issue Analysis

### Problematic Code
```java
public boolean equals(Employee e) {
    return e.name.equals(name) && e.salary == salary;
}
```

### Root Cause
- **Wrong signature**: `equals(Employee e)` doesn't override `Object.equals(Object obj)`
- **Partial functionality**: Works for direct calls but not for collection methods
- **Collections incompatibility**: `list.contains()` calls `Object.equals(Object obj)`, not `equals(Employee e)`

## Evidence

Running the code shows:
- Direct calls work: `e.equals(emp)` calls custom `equals(Employee e)` method ✓
- `removeDuplicates()` works (uses direct calls) ✓
- `list.contains()` fails (calls `Object.equals(Object obj)`, not custom method) ✗
- `listsAreEqual()` fails because it uses `contains()` ✗
- Result: `"Is answer correct? false"`

## Solution

```java
@Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Employee e = (Employee) obj;
    return e.name.equals(name) && e.salary == salary;
}


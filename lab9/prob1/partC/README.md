# Lab 9 Problem 1 Part C - Missing hashCode() Method

## Issue

I implemented `equals(Object obj)` correctly but `HashMap.containsKey()` still fails to detect duplicates.

### Root Cause
- **Missing `hashCode()` method** in Employee class
- HashMap requires both `equals()` AND `hashCode()` to work properly
- Without `hashCode()`, objects with same content get different hash codes and are stored in different buckets

### Evidence
Result: `"Is answer correct? false"`

## Solution

Added missing `hashCode()` method:

```java
@Override
public int hashCode() {
    return java.util.Objects.hash(name, salary);
}
```

## Result
After fix: `"Is answer correct? true"`

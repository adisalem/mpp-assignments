# Lab 3 Problem 1: Equals Method Symmetry Issue

## Problem
Original inheritance design violated equals symmetry:
- `p1.equals(p2)` → `false` (PersonWithJob.equals() rejects Person objects)
- `p2.equals(p1)` → `true` (Person.equals() accepts PersonWithJob objects)

## Solution
Replaced inheritance with composition:
- `PersonWithJob` now HAS-A `Person` instead of IS-A `Person`
- Both comparisons now return `false` (different types)
- Equals contract symmetry preserved

## Key Change
```java
// Before: public class PersonWithJob extends Person
// After:  public class PersonWithJob { private Person person; }
```
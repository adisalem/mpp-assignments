# Lab 9 Problem 1 Part D 

## Issue
The `Employee` class includes the mutable `visited` field in both `equals()` and `hashCode()` methods, violating Java's equals/hashCode contract when objects are used as HashMap keys.

## Problem
When `setVisited(true)` is called on an Employee already stored in HashMap, the object's hashCode changes and equals() behavior changes, making the object "lost" in the HashMap and breaking the duplicate removal algorithm.

## Solution
Remove the `visited` field from both `equals()` and `hashCode()` methods - only include immutable fields (name and salary) that define the Employee's business identity.

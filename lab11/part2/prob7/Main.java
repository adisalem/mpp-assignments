package lab11.part2.prob7;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(4, 5, -2, 0, -3, -1, -5, -4);
		//expected output: [0, -1, -2, -3, -4, 4, -5, 5]
		ordering1(intList);
		List<String> stringList = Arrays.asList("cba", "efg", "doe", "fie", "set");
		//expected output: [cba, fie, doe, efg, set]
		ordering2(stringList);
		
	}
	
	//Orders the integers according to this pattern:
	// 0, -1, 1, -2, 2, -3, 3, . . .
	//Using this ordering, this method sorts the list as part of 
	//a stream pipeline, and prints to the console
	public static void ordering1(List<Integer> list) {
		System.out.println(list.stream()
			.sorted((a, b) -> {
				// Special case for 0
				if (a == 0 && b == 0) return 0;
				if (a == 0) return -1;  // 0 comes first
				if (b == 0) return 1;
				
				// Get absolute values
				int absA = Math.abs(a);
				int absB = Math.abs(b);
				
				// If different absolute values, sort by absolute value
				if (absA != absB) {
					return Integer.compare(absA, absB);
				}
				
				// Same absolute value: negative comes before positive
				// -1 comes before 1, -2 comes before 2, etc.
				return Integer.compare(a, b);
			})
			.collect(Collectors.toList()));
	}
	
	//Orders words by first reversing each and comparing 
	//in the usual way.  So 
	//    cba precedes bed
	//since
	//    cba.reverse() precedes bed.reverse()
	//in the usual ordering
	//Using this ordering, this method sorts the list as part of 
	//a stream pipeline, and prints to the console
	public static void ordering2(List<String> words) {
		System.out.println(words.stream()
			.sorted((a, b) -> {
				String reversedA = new StringBuilder(a).reverse().toString();
				String reversedB = new StringBuilder(b).reverse().toString();
				return reversedA.compareTo(reversedB);
			})
			.collect(Collectors.toList()));
	}

}

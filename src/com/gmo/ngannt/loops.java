package com.gmo.ngannt;

public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// The for Loop
		for (int Increment = 0; Increment <= 5; Increment++) {
			System.out.println("Count is  ==> " + Increment);
		}

		System.out.println("<==== Next Count ====>");
		// This will print -- 5,4,3,2,1,0
		for (int Decrement = 5; Decrement >= 0; Decrement--) {
			System.out.println("Count is ==> " + Decrement);
		}

		System.out.println("<==== Next Count ====>");
		// This will print -- 0,2,4
		for (int Increment = 0; Increment <= 5; Increment += 2) {
			System.out.println("Skip every one another  ==> " + Increment);
		}

		// The break Keyword
		for (int Count = 0; Count <= 10; Count++) {
			if (Count == 6) {
				break;
			}
			System.out.println("Count is ==> " + Count);
		}
		System.out.println("You have exited the loop");

		// The continue Keyword
		for (int Count = 0; Count <= 5; Count++) {
			if (Count == 3) {
				continue;
			}
			System.out.println("Count is ==> " + Count);
		}

		// This will just print -- 3
		System.out.println("<==== Next Count ====>");
		for (int Count = 0; Count <= 5; Count++) {
			if (Count == 3) {
				System.out.println("Count is ==> " + Count);
				continue;
			}
		}

		// The while Loop

		int Count = 0;
		// This will print -- 5,10,15,20,25
		while (Count < 25) {
			Count = Count + 5;
			System.out.println("Count is ==> " + Count);
		}

		int CountOnce = 25;
		System.out.println("<==== Next Count ====>");
		// This will not print count even once
		while (CountOnce < 25) {
			CountOnce = CountOnce + 5;
			System.out.println("Count is ==> " + CountOnce);
		}

		// The do while Loop
		// This will print -- 5,10,15,20,25
		do {
			Count = Count + 5;
			System.out.println("Count is ==> " + Count);
		} while (Count < 25);
		System.out.println("<==== Next Count ====>");
		// This will just print once
		do {
			CountOnce = CountOnce + 5;
			System.out.println("Count is ==> " + CountOnce);
		} while (CountOnce < 25);

		// Enhanced for loop in Java
		String days[] = { "Mon", "Tue", "Wed", "Thr", "Fri", "Sat", "Sun" };

		// Enhanced for loop, this will automatically iterate on the array list
		for (String dayName : days) {
			System.out.println("Days ==> " + dayName);
		}

		System.out.println("<==== Normal For Loop ====>");
		// Normal for loop
		for (int i = 0; i < days.length; i++) {
			System.out.println("Days ==> " + days[i]);
		}
	}

}

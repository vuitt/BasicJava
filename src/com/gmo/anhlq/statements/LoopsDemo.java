package com.gmo.anhlq.statements;

public class LoopsDemo {
	public static void main(String[] args) {
		// This will print -- 0,1,2,3,4,5
		for (int increment = 0; increment <= 5; increment++) {
			System.out.println("count is  ==> " + increment);
		}

		System.out.println("<==== Next count ====>");
		// This will print -- 5,4,3,2,1,0
		for (int Decrement = 5; Decrement >= 0; Decrement--) {
			System.out.println("count is ==> " + Decrement);
		}

		System.out.println("<==== Next count ====>");
		// This will print -- 0,2,4
		for (int increment = 0; increment <= 5; increment += 2) {
			System.out.println("Skip every one another  ==> " + increment);
		}
		// This will print -- 0,1,2,3,4,5
		for (int count = 0; count <= 10; count++) {
			if (count == 6) {
				break;
			}
			System.out.println("count is ==> " + count);
		}
		System.out.println("You have exited the loop");
		// This will print -- 0,1,2,4,5
		for (int count = 0; count <= 5; count++) {
			if (count == 3) {
				continue;
			}
			System.out.println("count is ==> " + count);
		}

		// This will just print -- 3
		System.out.println("<==== Next count ====>");
		for (int count = 0; count <= 5; count++) {
			if (count == 3) {
				System.out.println("count is ==> " + count);
				continue;
			}
		}
		int count = 0;
		// This will print -- 5,10,15,20,25
		while (count < 25) {
			count = count + 5;
			System.out.println("count is ==> " + count);
		}

		int countOnce = 25;
		System.out.println("<==== Next count ====>");
		// This will not print count even once
		while (countOnce < 25) {
			countOnce = countOnce + 5;
			System.out.println("count is ==> " + countOnce);
		}

		count = 0;
		// This will print -- 5,10,15,20,25
		do {
			count = count + 5;
			System.out.println("count is ==> " + count);
		} while (count < 25);

		countOnce = 25;
		System.out.println("<==== Next count ====>");
		// This will just print once
		do {
			countOnce = countOnce + 5;
			System.out.println("count is ==> " + countOnce);
		} while (countOnce < 25);

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

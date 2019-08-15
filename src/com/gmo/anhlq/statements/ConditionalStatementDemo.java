package com.gmo.anhlq.statements;

public class ConditionalStatementDemo {

	public static void main(String[] args) {
		String sDay = "Sunday";
		int iDay = 7;

		if (sDay.equals("Sunday")) {
			System.out.println("Today is Sunday");
		}

		if (iDay == 7) {
			System.out.println("Today is Sunday");
		}

		sDay = "Saturday";
		iDay = 6;

		if (sDay.equals("Sunday")) {
			System.out.println("Today is Sunday");
		} else {
			System.out.println("Today is not Sunday");
		}

		if (iDay == 7) {
			System.out.println("Today is Sunday");
		} else {
			System.out.println("Today is not Sunday");

			sDay = "Monday";
			iDay = 1;

			if (sDay.equals("Sunday")) {
				System.out.println("Today is Sunday");
			} else if (sDay.equals("Saturday")) {
				System.out.println("Today is not Saturday");
			} else {
				System.out.println("Today is a Weekday");
			}

			if (iDay == 7) {
				System.out.println("Today is Sunday");
			} else if (iDay == 6) {
				System.out.println("Today is Saturday");
			} else {
				System.out.println("Today is a Weekday");
			}
		}

		iDay = 1;
		sDay = "Monday";

		switch (iDay) {
		case 1:
			System.out.println("Today is Monday");
			break;
		case 3:
			System.out.println("Today is Tuesday");
			break;
		case 4:
			System.out.println("Today is Wednesday");
			break;
		case 5:
			System.out.println("Today is Thursday");
			break;
		case 6:
			System.out.println("Today is Friday");
			break;
		case 7:
			System.out.println("Today is Saturday");
			break;
		default:
			System.out.println("Today is Sunday");
			break;
		}

		switch (sDay) {
		case "Monday":
			System.out.println("Today is Monday");
			break;
		case "Tuesday":
			System.out.println("Today is Tuesday");
			break;
		case "Wednesday":
			System.out.println("Today is Wednesday");
			break;
		case "Thursday":
			System.out.println("Today is Thursday");
			break;
		case "Friday":
			System.out.println("Today is Friday");
			break;
		case "Saturday":
			System.out.println("Today is Saturday");
			break;
		default:
			System.out.println("Today is Sunday");
			break;
		}
	}
}

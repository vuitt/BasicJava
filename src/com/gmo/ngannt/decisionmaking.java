package com.gmo.ngannt;

public class decisionmaking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// The if Statement
		String sDay = "Sunday";
		int iDay = 7;

		if (sDay.equals("Sunday")) {
			System.out.println("Today is Sunday");
		}

		if (iDay == 7) {
			System.out.println("Today is Sunday");
		}

		// The if then else Statement
		if (sDay.equals("Sunday")) {
			System.out.println("Today is Sunday");
		} else {
			System.out.println("Today is not Sunday");
		}

		if (iDay == 7) {
			System.out.println("Today is Sunday");
		} else {
			System.out.println("Today is not Sunday");
		}

		// The if then else Statement
		// String sDay1 = "Monday";
		int iDay1 = 1;

		if (sDay.equals("Sunday")) {
			System.out.println("Today is Sunday");
		} else if (sDay.equals("Saturday")) {
			System.out.println("Today is not Saturday");
		} else {
			System.out.println("Today is a Weekday");
		}

		if (iDay1 == 7) {
			System.out.println("Today is Sunday");
		} else if (iDay1 == 6) {
			System.out.println("Today is Saturday");
		} else {
			System.out.println("Today is a Weekday");
		}

		// The if then else if Statement
		// String sDay = "Monday";
		// int iDay = 1;

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

		// The switch Statement
		int iDay2 = 1;
		String sDay2 = "Monday";

		switch (iDay2) {
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

		switch (sDay2) {
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


import java.time.LocalDate;
import java.time.Month;
import java.util.Random;
import java.util.Scanner;

class Bill {
	double Enerchar = 0.0;
	double govtSubbsidy = 0.0;

	// Urban Calculation
	void Urban(double FinRead, String purpose) {
		if (purpose.equalsIgnoreCase("Domestic")) {
			if (FinRead > 0 && FinRead <= 100) {
				govtSubbsidy = 500;
				Enerchar = FinRead * 3.00;

				if (Enerchar < 500) {
					Enerchar = 500 - Enerchar;
				} else {
					Enerchar = Enerchar - 500;
				}
			} else if (FinRead > 100 && FinRead <= 200) {
				Enerchar = FinRead * 5.00;
			} else if (FinRead > 200) {
				Enerchar = FinRead * 7.00;
			}
		} else if (purpose.equalsIgnoreCase("Commercial")) {
			if (FinRead > 0 && FinRead <= 100) {
				Enerchar = FinRead * 5.00;
			} else if (FinRead > 100 && FinRead <= 200) {
				Enerchar = FinRead * 7.50;
			} else if (FinRead > 200) {
				Enerchar = FinRead * 10.00;
			}
		}
	}

	// Rural Calculation
	void Rural(double FinRead, String purpose) {
		if (purpose.equalsIgnoreCase("Domestic")) {
			if (FinRead > 0 && FinRead <= 100) {
				govtSubbsidy = 500;
				Enerchar = FinRead * 2.50 - govtSubbsidy;
			} else if (FinRead > 100 && FinRead <= 200) {
				Enerchar = FinRead * 4.00;
			} else if (FinRead > 200) {
				Enerchar = FinRead * 6.00;
			}
		} else if (purpose.equalsIgnoreCase("Commercial")) {
			if (FinRead > 0 && FinRead <= 100) {
				Enerchar = FinRead * 4.00;
			} else if (FinRead > 100 && FinRead <= 200) {
				Enerchar = FinRead * 6.50;
			} else if (FinRead > 200) {
				Enerchar = FinRead * 9.00;
			}
		}
	}
}

public class Ebill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bill b = new Bill();

		long login1 = 7575;
		System.out.println("Login Your MPBSE Account !");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		while (true) {
			System.out.println("\nEnter Your Password:");
			try {
				long login = Long.parseLong(sc.nextLine());

				if (login1 == login) {
					System.out.println("\n✅ Successfully Logged in!");
					System.out.println();
					break;
				} else {
					System.out.println("\n❌ Incorrect Password! Try Again.");
				}
			} catch (NumberFormatException e) {
				System.out.println("\n❌ Invalid input! Please enter only numbers as a password.");
			}
		}

		String region = null;
		try {
			System.out.println("Choose The Region (Urban/Rural) ?");
			region = sc.nextLine();

			if (!region.equalsIgnoreCase("Urban") && !region.equalsIgnoreCase("Rural")) {
				System.out.println("❌ Invalid Region! Please enter either 'Urban' or 'Rural'.");
				return;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		String purpose = null;
		try {
			System.out.println("Choose a Purpose (Domestic / Commercial) ?");
			purpose = sc.nextLine();
		} catch (Exception e) {
			System.out.println(e);
		}
		double currRead = 0;
		double PreRead = 0;

		try {
			System.out.println("Enter Current Reading:");
			currRead = Double.parseDouble(sc.nextLine());
		} catch (Exception e) {
			System.out.println(e);
		}

		try {
			System.out.println("Enter Previous Reading:");
			PreRead = Double.parseDouble(sc.nextLine());
		} catch (Exception e) {
			System.out.println(e);
		}

		double FinRead = currRead - PreRead;

		System.out.println("Enter Name:");
		String name = sc.nextLine();
		String k = name.substring(0, 1).toUpperCase();

		int min = 1000000;
		int max = 2000000;
		String ConNumber = k + (int) (Math.random() * (max - min + 1) + min);

		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		Random random = new Random();
		StringBuilder result = new StringBuilder(15);
		for (int i = 0; i < 15; i++) { // Generating 10 characters
			result.append(characters.charAt(random.nextInt(characters.length())));
		}
		System.out.println("Enter a Address:");

		String address = sc.nextLine();
		String mobile = "7610712047";

		// Fixed Charges
		double fixedChar = 324;
		double electriDuty = 89;
		double intrestsecurity = 8.79;

		// Check region and calculate the bill
		if (region.equalsIgnoreCase("Urban")) {
			b.Urban(FinRead, purpose);
		} else {
			b.Rural(FinRead, purpose);
		}
		// Final Bill Calculation
		float totalBill = (float) (b.Enerchar + fixedChar + electriDuty + intrestsecurity - b.govtSubbsidy);

		// Negative bill ko zero karne ka check
		totalBill = Math.max(0, totalBill);
		// Bill generate hone se pehle delay
		System.out.println("\n🔄 Generating your bill, please wait...");
		try {
			Thread.sleep(5000); // 5000 milliseconds = 5 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Date and Time Function
		LocalDate CurDate = LocalDate.now();
		Month CurMonth = CurDate.getMonth();
		int CurYear = CurDate.getYear();

		String Date = CurMonth + " " + CurYear;
		System.out.println();
		System.out.println();

		// Print Bill
		System.out.println("|--------------------------------------------------------- |");
		System.out.println("|           🔥 Electricity Bill - " + region.toUpperCase() + "                    |");
		System.out.println("|----------------------------------------------------------|");
		System.out.println("| Madhya Pradesh Paschim Kshetra Vidyut Vitran Company Ltd |");
		System.out.println("|         G.P.H. Compound, Pologround, Indore (M.P.)       | ");
		System.out.println("+----------------------------------------------------------+");
		System.out.println(" GST No." + 23 + result + ("1ZU") + "           Call Centre No. 1912");
		System.out.println("+----------------------------------------------------------+");
		System.out.println(" Date:-               " + Date + "                                    ");
		System.out.println("+----------------------------------------------------------+");
		System.out.println(" Consumer Number: " + ConNumber + "        Connection Type: " + purpose);
		System.out.println(" Mr/Ms. " + name + "                          DC/Zone: Mangliya");
		System.out.println(" Address: " + address + "       Division: Indore");
		System.out.println(" Mobile No.: " + mobile + "              Feeder Code: 856416656");
		System.out.println("+----------------------------------------------------------+");
		System.out.println("......................{Reading Detail}.....................");
		System.out.println(" Current Reading      Previous Reading       Units Consumed");
		System.out.println("    " + currRead + "                " + PreRead + "                 " + FinRead);
		System.out.println("+----------------------------------------------------------+");
		System.out.println(" {Billing Detail}...........................{Amount in INR}");
		System.out.println(" Energy Charges                                  ₹" + b.Enerchar);
		System.out.println(" Fixed Charge                                     ₹" + fixedChar);
		System.out.println(" Electricity Duty                                  ₹" + electriDuty);
		System.out.println(" Interest On Security Deposit (-)                  ₹" + intrestsecurity);
		System.out.println(" M.P. Govt. Subsidy Amount (-)                      ₹" + b.govtSubbsidy);
		System.out.println("+----------------------------------------------------------+");
		System.out.println(" [ Total Amount Payable ]                       ₹" + totalBill);
		System.out.println("+----------------------------------------------------------+");

	}
}

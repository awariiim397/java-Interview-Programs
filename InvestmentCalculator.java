package ma;

	import java.util.Scanner;

	public class InvestmentCalculator {

	    // Method for RD Calculator
	    public static void calculateRD() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter Monthly Deposit (P): ");
	        double monthlyDeposit = scanner.nextDouble();

	        System.out.print("Enter Annual Interest Rate (%): ");
	        double annualInterestRate = scanner.nextDouble();

	        System.out.print("Enter Time Period (Years): ");
	        double timePeriod = scanner.nextDouble();

	        // RD Calculation
	        double r = annualInterestRate / 100;
	        int n = 12; // Compounding 12 times per year
	        double t = timePeriod;

	        double maturityValue = monthlyDeposit * ((Math.pow((1 + r / n), n * t) - 1) / (1 - Math.pow((1 + r / n), -1)));
	        System.out.printf("Maturity Value (RD): %.2f\n", maturityValue);
	    }

	    // Method for SWP Calculator
	    public static void calculateSWP() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter Total Investment Amount: ");
	        double investmentAmount = scanner.nextDouble();

	        System.out.print("Enter Monthly Withdrawal Amount: ");
	        double withdrawalAmount = scanner.nextDouble();

	        System.out.print("Enter Annual Interest Rate (%): ");
	        double annualInterestRate = scanner.nextDouble();

	        System.out.print("Enter Time Period (Years): ");
	        double timePeriod = scanner.nextDouble();

	        // SWP Calculation
	        double monthlyRate = (annualInterestRate / 100) / 12;
	        double remainingAmount = investmentAmount;

	        for (int i = 0; i < timePeriod * 12; i++) {
	            remainingAmount = (remainingAmount - withdrawalAmount) * (1 + monthlyRate);
	        }

	        System.out.printf("Remaining Balance (SWP): %.2f\n", remainingAmount);
	    }

	    // Method for STP Calculator
	    public static void calculateSTP() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter Total Amount to Transfer: ");
	        double transferAmount = scanner.nextDouble();

	        System.out.print("Enter Monthly Transfer Amount: ");
	        double monthlyTransferAmount = scanner.nextDouble();

	        System.out.print("Enter Source Fund Annual Interest Rate (%): ");
	        double sourceFundRate = scanner.nextDouble();

	        System.out.print("Enter Target Fund Annual Interest Rate (%): ");
	        double targetFundRate = scanner.nextDouble();

	        double sourceFundBalance = transferAmount;
	        double targetFundBalance = 0;
	        double monthlySourceRate = (sourceFundRate / 100) / 12;
	        double monthlyTargetRate = (targetFundRate / 100) / 12;

	        while (sourceFundBalance > 0 && monthlyTransferAmount > 0) {
	            // Ensure transfer doesn't exceed remaining balance
	            double transfer = Math.min(monthlyTransferAmount, sourceFundBalance);
	            sourceFundBalance = (sourceFundBalance - transfer) * (1 + monthlySourceRate);
	            targetFundBalance = targetFundBalance * (1 + monthlyTargetRate) + transfer;
	        }

	        System.out.printf("Final Source Fund Balance (STP): %.2f\n", sourceFundBalance);
	        System.out.printf("Final Target Fund Balance (STP): %.2f\n", targetFundBalance);
	    }

	    // Main method with menu
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("\n--- Investment Calculator Menu ---");
	            System.out.println("1. RD Calculator");
	            System.out.println("2. SWP Calculator");
	            System.out.println("3. STP Calculator");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    calculateRD();
	                    break;
	                case 2:
	                    calculateSWP();
	                    break;
	                case 3:
	                    calculateSTP();
	                    break;
	                case 4:
	                    System.out.println("Exiting the program.");
	                    break;
	                default:
	                    System.out.println("Invalid choice! Please select a valid option.");
	            }
	        } while (choice != 4);

	        scanner.close();
	    }
	}


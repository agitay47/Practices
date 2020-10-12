package ClassAndObjects;

import java.util.Scanner;

public class LoanClass_Project {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter annual interest rate
        System.out.println("Enter annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        // Enter number of years
        System.out.println("Enter number of years: ");
        int numberOfYears = input.nextInt();

        //// Enter loan amount
        System.out.println("Enter loan amount: ");
        double loanAmount = input.nextDouble();

        // Create a Loan object
        Loan loan = new Loan(annualInterestRate,numberOfYears,loanAmount);

        // Display loan date, monthly payment, and total payment
        System.out.printf("The loan was created on %s\n" + "The monthly payment is %.2f\nThe total payment is %.2f\n",
                loan.getLoanDate().toString(), loan.getMonthlyPayment(),loan.getTotalPayment());
    }
}

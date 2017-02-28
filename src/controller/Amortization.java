package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Amortization {

	public Loan loan;

	public Amortization()
	{
		
	}

	public Amortization(Loan loan1)
	{
	loan = loan1;
	}
	




	
	public double calculatePrinciplePaid(double monthlyPayment, double monthlyInterest)
	{
		double sum = monthlyPayment - monthlyInterest;
		return sum;
	}
	
	public double calculateEndingBalance(double currentBal, double prinPaid)
	{
		double g = currentBal - prinPaid;
		return g;
	}
	
	public double moneyFormat(double num)
	{
		double check = (int)((num * 100));
		double g = (check / 100);
		return g;
	}
	
	public String doAmortization()
	{
		String tableOutput = "<table border='2'>";
		double balance = loan.getPrinciple();
	tableOutput+="<tr>";
	tableOutput+="<th>Month</th>";
	tableOutput+="<th>Payment</th>";
	tableOutput+="<th>Interest Paid</th>";
	tableOutput+="<th>Principal Paid</th>";
	tableOutput+="<th>Ending Balance</th>";
	tableOutput+="</tr>";
	for(int month=1; month<=loan.getLoanTerm(); month++)
	{
		tableOutput+="<tr>";
		
	tableOutput+="<td>" + month +  "</td>";
	tableOutput+="<td> $" + moneyFormat(loan.getMonthlyPayment()) + "</td>";
	double interestPaid = loan.getLoanRate() * balance; 
	tableOutput+=" <td> $" + moneyFormat(interestPaid) + "</td>";
	double pinPaid = loan.getMonthlyPayment() - interestPaid;
	tableOutput+="<td> $" + moneyFormat(pinPaid) + " </td>";
	balance = balance - pinPaid;
	tableOutput+=" <td> $" + moneyFormat(balance) + "</td>";

	tableOutput+="</tr>";
		}
	
	tableOutput += "</table>";
		return tableOutput;
	
	}
		
}



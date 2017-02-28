package controller;
public class Loan {
	
double principle;
double loanRate; 
int loanTerm; 
double monthlyPayment;


	
	public Loan()
	{
		
	}

	public Loan(double principle1, double loanRate1, int loanTerm1)
	{
		principle = principle1;
		loanRate = loanRate1;
		loanTerm = loanTerm1;
		monthlyPayment = ((principle * loanRate) /
				((1-(Math.pow((1+loanRate),-loanTerm)))));
	}

	
	//public double calculateMonthlyPayment()
	//{
	//	double monthlyPayment = ((principle * loanRate) /
	//			((1-(Math.pow((1+loanRate),-loanTerm)))));
	//	
	//	return monthlyPayment;
	//}

	/**
	 * @return the principle
	 */
	public double getPrinciple() {
		return principle;
	}

	/**
	 * @param principle the principle to set
	 */
	public void setPrinciple(double principle) {
		this.principle = principle;
	}

	/**
	 * @return the loanRate
	 */
	public double getLoanRate() {
		return loanRate;
	}

	/**
	 * @param loanRate the loanRate to set
	 */
	public void setLoanRate(double loanRate) {
		this.loanRate = loanRate;
	}

	/**
	 * @return the loanTerm
	 */
	public int getLoanTerm() {
		return loanTerm;
	}

	/**
	 * @param loanTerm the loanTerm to set
	 */
	public void setLoanTerm(int loanTerm) {
		this.loanTerm = loanTerm;
	}

	/**
	 * @return the monthlyPayment
	 */
	public double getMonthlyPayment() {
		return monthlyPayment;
	}

	/**
	 * @param monthlyPayment the monthlyPayment to set
	 */
	public void setMonthlyPayment(double monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}
	
	
}




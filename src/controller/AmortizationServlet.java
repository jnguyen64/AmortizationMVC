package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StuffServlet
 */
@WebServlet(description = "this does stuff with loans", urlPatterns = { "/LoanTable" })
public class AmortizationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AmortizationServlet() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		double principle = Double.parseDouble(request.getParameter("loanPrinciple"));
		double loanRate = Double.parseDouble(request.getParameter("loanRate"))/100 ;
		int loanTerm = Integer.parseInt(request.getParameter("loanTerm"));
		
		
		Loan loan = new Loan(principle, loanRate, loanTerm);

		Amortization amor = new Amortization(loan);
		String url = "amortization.jsp";
		
		String msg = "";
		msg += "<p> Here are the results for your loan:</p>";
		msg += "<p> Loan Principle: $" + principle + "</p>";
		msg += "<p>  Loan term (months):" +  loanTerm +  " months  </p>";
		msg += "<p>  Loan Rate: " + (loanRate*100)  +  "% (monthly rate) </p>";
		
		msg += amor.doAmortization();
		
			request.setAttribute("msg", msg);
			RequestDispatcher dispatcher = request.getRequestDispatcher(url);
			dispatcher.forward(request,response);
	}
		
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
}

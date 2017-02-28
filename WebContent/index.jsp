<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Amortization Values</title>
</head>
<body>
	<h1>Amortization Values</h1>

	<form name="loanValues" action="LoanTable" method="post">
		<label>Loan Principal:</label> <input type="text" name="loanPrinciple" />
		<label>Loan Term (in months):</label> <input type="text" name="loanTerm" /> <label>Loan
			Monthly Rate:</label> <input type="text" name="loanRate" /> <input type="submit"
			name="btnSubmit" value="Go!" />

	</form>
</body>
</html>
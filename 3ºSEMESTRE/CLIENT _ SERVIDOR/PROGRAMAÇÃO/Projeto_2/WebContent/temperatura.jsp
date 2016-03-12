<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>

	<h2>Conversão de Temperatura</h2>
	<TABLE BORDER=1>

		<TR>
			<TD>CELSIUS</TD>
			<TD>FAHRENHEIT</TD>
	
				<%
					int i;
					for (i = -40; i <= 100; i += 10) {
				%>
				<TR>
					<TD> <% out.print(i); %> </TD>
		
					<TD> <%	out.print((9 / 5) * i + 32); %>	</TD>
				</TR>
				<%
					}
				%>
		</TR>
	
	</TABLE>

</body>
</html>
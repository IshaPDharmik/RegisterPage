package FirstServlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/register")
public class Register extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String FirstName= request.getParameter("Firstname");
		String LastName= request.getParameter("Lastname");
		String FatherName= request.getParameter("Fathername");
		String MotherName= request.getParameter("Mothername");
		String DateOfBirth = request.getParameter("DOB");
		String Age = request.getParameter("Age");
		String  Contact= request.getParameter("Contact");
		String AadharNo= request.getParameter("AadharCard Number");
		String Email= request.getParameter("email");
		String password= request.getParameter("Password");
		String Address= request.getParameter("Address");
		String City= request.getParameter("City");
		String Country= request.getParameter("Country");
		String State= request.getParameter("State");
		String Gender = request.getParameter("gender");
		String Degree= request.getParameter("Degree");
		String PassingYr = request.getParameter("Passing Year");
		
		
		
		System.out.println(FirstName);
		System.out.println(LastName);
		System.out.println(FatherName);
		System.out.println(MotherName);
		System.out.println(DateOfBirth);
		System.out.println(Age);
		System.out.println(Contact);
		System.out.println(AadharNo);
		System.out.println(Email);
		System.out.println(password);
		System.out.println(Address);
		System.out.println(City);
		System.out.println(Country);
		System.out.println(State);
		System.out.println(Gender);
		System.out.println(Degree);
		System.out.println(PassingYr);
		
		
	PrintWriter out= response.getWriter();
		out.println(FirstName);
		out.println(LastName);
		out.println(FatherName);
		out.println(MotherName);
		out.println(DateOfBirth);
		out.println(Age);
		out.println(Contact);
		out.println(AadharNo);
		out.println(Email);
		out.println(password);
		out.println(Address);
		out.println(City);
		out.println(Country);
		out.println(State);
		out.println(Gender);
		out.println(Degree);
		out.println(PassingYr);
		
		
	}
	}


package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Student;
import services.FormationsServices;


/**
 * Servlet implementation class StudentsListServlet
 */
@WebServlet(urlPatterns={"/studentslist"})
public class StudentsListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// create an empty list to contain all students
		private List<Student> students = new ArrayList<Student>();
		// create a variable to contain one student
		private FormationsServices studentsServices = FormationsServices.getInstance();
    /**
     * Default constructor. 
     */
    public StudentsListServlet() {
    	this.students = studentsServices.getStudents();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("STUDENTS", students);
		
		request.getRequestDispatcher("/WEB-INF/studentslist.jsp").forward(request, response);
	}
	}

}

package servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Student;
import services.FormationsServices;


@WebServlet(urlPatterns={"/studentdetails"})
public class StudentDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private FormationsServices studentsServices = FormationsServices.getInstance();
    private Student student;
    /**
     * Default constructor. 
     */
    public StudentDetailsServlet() {}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		student = this.studentsServices.getStudentByName(request.getParameter("name"));
		
		if (student == null) {
			response.sendRedirect(request.getContextPath() + "/home");
			return;
		}
		
		request.setAttribute("student", student);
		
		request.getRequestDispatcher("/WEB-INF/studentdetails.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

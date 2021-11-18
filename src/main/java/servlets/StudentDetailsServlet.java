package servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Formation;
import models.Student;
import services.FormationsServices;


/**
 * Servlet implementation class StudentDetailsServlet
 */
@WebServlet("/studentdetails")
public class StudentDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private FormationsServices studentsServices = FormationsServices.getInstance();
    private Student student;
    /**
     * Default constructor. 
     */
    public StudentDetailsServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		student = this.studentsServices.getStudentByName(request.getParameter("name"), "firstname");
		
		if (student == null) {
			response.sendRedirect(request.getContextPath() + "/home");
			return;
		}
		request.setAttribute("student", student);
		
		request.getRequestDispatcher("/WEB-INF/formationdetails.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
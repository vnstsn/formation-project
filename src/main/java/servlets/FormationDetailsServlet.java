package servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Formation;
import services.FormationsServices;


/**
 * Servlet implementation class FormationDetailsServlet
 */
@WebServlet(urlPatterns={"/formationdetails"})
public class FormationDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private FormationsServices formationsServices = FormationsServices.getInstance();
    private Formation formation;
	/**
     * Default constructor. 
     */
    public FormationDetailsServlet() {}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		formation = this.formationsServices.getFormationByName(request.getParameter("title"));
		
		if (formation == null) {
			response.sendRedirect(request.getContextPath() + "/home");
			return;
		}
		request.setAttribute("formation", formation);
		
		request.getRequestDispatcher("/WEB-INF/formationdetails.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

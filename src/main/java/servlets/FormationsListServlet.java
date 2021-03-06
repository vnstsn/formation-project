package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Formation;
import services.FormationsServices;


/**
 * Servlet implementation class FormationsListServlet
 */
@WebServlet(urlPatterns = {"/formationslist"})
public class FormationsListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// create an empty list to contain all formations
	private List<Formation> formations = new ArrayList<Formation>();
	// create a variable to contain a single formation
	private FormationsServices formationsServices = FormationsServices.getInstance();
	
    /**
     * Default constructor. 
     */
    public FormationsListServlet() {
        this.formations = formationsServices.getFormations();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("formations", formations);
		
		request.getRequestDispatcher("/WEB-INF/formationslist.jsp").forward(request, response);
	}

	

}

package services;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import personne.Personne;
import personne.Ressources;

/**
 * Servlet implementation class Ajouter
 */
@WebServlet("/Ajouter")
public class Ajouter extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Ressources ressource = Ressources.Init();
       
    /**	
     * @see HttpServlet#HttpServlet()
     */
    public Ajouter() {
        super();
        // TODO Auto-generated constructor stub
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
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
		String name = request.getParameter("pName");
		String pDate = request.getParameter("pDateNaiss");

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("y-M-d");
		LocalDate dateFormatted = LocalDate.parse(pDate, formatter);
		
		ressource.getGroupe().Ajouter(new Personne(dateFormatted, name));
		
		request.setAttribute("name", name);
		request.getRequestDispatcher("/list.jsp").forward(request, response);
		
		
	}

}

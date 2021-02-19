package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TempConverter;

/**
 * Servlet implementation class getFTempServlet
 */
@WebServlet("/getFTempServlet")
public class getFTempServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getFTempServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Variables to be gathered from the forms
		String userTemp = request.getParameter("userTemp");	// User input in degrees
		int tempType = 2;
		
		// Creates an object with parameters
		TempConverter userTemperature = new TempConverter(Integer.parseInt(userTemp), tempType);

		request.setAttribute("userTempReading", userTemperature);
		
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
	}

}

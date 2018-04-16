package web;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domian.Data;
import domian.Papir;
import java_EE.ejb.RestKlientLocal;

/**
 * Servlet implementation class TestRest
 */
@WebServlet("/TestRest")
public class TestRest extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB private RestKlientLocal ejb;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestRest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Papir papir = new Papir();
		papir.setId_ISIN("US0378331005");
		papir.setCurrency("USD");
		papir.setMicCode("XNGS");
		List<Data> list = ejb.search(papir);
		response.getWriter().append(list.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

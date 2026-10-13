package br.com.aplcurso.controller.estado;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.aplcurso.dao.EstadoDAO;


@WebServlet(name ="EstadoVerificarSigla", urlPatterns = {"/EstadoVerificarSigla"})
public class EstadoVerificarSigla extends HttpServlet {
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		response.setContentType("text/plain;charset=iso-8859-1");
		try {
			String sigla = request.getParameter("sigla");
			String idParametro = request.getParameter("id");
			int id = (idParametro == null) || idParametro.isBlank() ? 0 : Integer.parseInt(idParametro);
			
			if (sigla == null || sigla.isBlank()) {
				response.getWriter().write("0");
				return;
			}
			
			EstadoDAO dao = new EstadoDAO();
			response.getWriter().write(dao.siglaExiste(sigla, id) ? "1" : "0");
			
		} catch (Exception ex) {
			System.out.println("Problemas no Servlet ao validar sigla! Erro: " + ex.getMessage());
		}
	}
       
    

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response);
	}

    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}

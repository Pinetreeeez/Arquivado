package br.com.aplcurso.controller.estado;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.aplcurso.model.Estado;
import br.com.aplcurso.dao.EstadoDAO;
import br.com.aplcurso.dao.GenericDAO;


@WebServlet(name ="EstadoCarregar", urlPatterns = {"/EstadoCarregar"})
public class EstadoCarregar extends HttpServlet {
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=iso-8859-1");
		try {
			
			int id = Integer.parseInt(request.getParameter("id"));
			
			GenericDAO estadoDao = new EstadoDAO();
			Estado oEstado = (Estado) estadoDao.carregar(id);
			
			request.setAttribute("estado", oEstado);
			request.getRequestDispatcher("/cadastros/estado/estadoCadastrar.jsp").forward(request, response);
		} catch (Exception ex) {
			System.out.println("Problema no Servelet EstadoCarregar! Erro:  "+ ex.getMessage());
			ex.printStackTrace();
		}
	}
       
	
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}

package br.com.aplcurso.controller.estado;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.aplcurso.dao.EstadoDAO;
import br.com.aplcurso.dao.GenericDAO;



@WebServlet(name = "EstadoExcluir", urlPatterns = {"/EstadoExcluir"})
public class EstadoExcluir extends HttpServlet {
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=iso-8859-1");
        
        int id = Integer.parseInt(request.getParameter("id"));
	
        try {
        	GenericDAO dao = new EstadoDAO();
        	if (dao.excluir(id)) {
        		response.getWriter().write("1");
        	} else {
        		response.getWriter().write("0");
        	}
        } catch (Exception e) {
        	System.out.println("Problemas no Servelet EstadoExcluir! Erro: " + e.getMessage());
        	e.printStackTrace();
        }
     }
	
	 @Override
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      processRequest(request, response);
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

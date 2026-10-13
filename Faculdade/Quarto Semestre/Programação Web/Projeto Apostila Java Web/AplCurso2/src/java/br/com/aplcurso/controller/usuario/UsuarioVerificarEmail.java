package br.com.aplcurso.controller.usuario;

import br.com.aplcurso.dao.UsuarioDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "UsuarioVerificarEmail", urlPatterns = {"/UsuarioVerificarEmail"})
public class UsuarioVerificarEmail extends HttpServlet {
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		response.setContentType("text/plain;charset=iso-8859-1");
		try {
			String email = request.getParameter("email");
			String idParametro = request.getParameter("id");
			// Se o id for null ou vazio ele é transformado em 0, o ? age como um if/else
		int id = (idParametro == null || idParametro.isBlank() ? 0 : Integer.parseInt(idParametro));
		
		if (email == null || email.isBlank()) {
			response.getWriter().write("0");
			return;
		}
		
		UsuarioDAO dao = new UsuarioDAO();
		//Se true o valor é 1 (que significa que existe), se for falso é 0 (não existe)
		response.getWriter().write(dao.emailExiste(email, id) ? "1" : "0");
		
		} catch (Exception ex) {
			System.out.println("Problemas no Servlet ao validar email! Erro:" + ex.getMessage());
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

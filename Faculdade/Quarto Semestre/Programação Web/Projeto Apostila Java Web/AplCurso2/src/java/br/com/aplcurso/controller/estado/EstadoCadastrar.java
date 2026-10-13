package br.com.aplcurso.controller.estado;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.aplcurso.model.Estado;
import br.com.aplcurso.dao.EstadoDAO;


@WebServlet(name = "EstadoCadastrar", urlPatterns = {"/EstadoCadastrar"})
public class EstadoCadastrar extends HttpServlet {
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
		try {
			//Mesma lógica que o UsuarioCadastrar mas pro estado
			
			EstadoDAO dao = new EstadoDAO();
			
			int id = Integer.parseInt(request.getParameter("id"));
			String nomeEstado = request.getParameter("nomeEstado");
			String sigla = request.getParameter("siglaEstado");
			
			nomeEstado = (nomeEstado == null) ? "": nomeEstado.trim();
			sigla = (sigla == null) ? "": sigla.trim().toUpperCase();
			
			if (nomeEstado.isBlank() || nomeEstado.length() > 100 || sigla.length() != 2 || !sigla.matches("[A-Z]{2}")){
				// Isso é para campos em branco ou fora do padrão, sigla é só com 2 letras
				response.getWriter().write("5");
			} else if (dao.siglaExiste(sigla, id)) {
				// Sigla já cadastrada em outro estado
				response.getWriter().write("6");
			} else {
				Estado oEstado = new Estado();
				oEstado.setId(id);
				oEstado.setnomeEstado(nomeEstado);
				oEstado.setsiglaEstado(sigla);
				
				if (dao.cadastrar(oEstado)) {
					response.getWriter().write("1");
				} else {
					response.getWriter().write("0");
				}
			}
		} catch (Exception ex) {
			System.out.println("Problemas no Servlet ao cadastrar Estado! Erro: " + ex.getMessage());
		}
	}
       
	
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
	
	@Override
    public String getServletInfo() {
        return "Short description";
    }

}

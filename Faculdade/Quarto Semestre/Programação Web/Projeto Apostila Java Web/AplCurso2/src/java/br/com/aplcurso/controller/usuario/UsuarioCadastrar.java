package br.com.aplcurso.controller.usuario;

import java.util.Date;
import br.com.aplcurso.model.Usuario;
import br.com.aplcurso.utils.DocumentoValidador;
import br.com.aplcurso.dao.UsuarioDAO;
import br.com.aplcurso.utils.EmailValidador;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "UsuarioCadastrar", urlPatterns = {"/UsuarioCadastrar"})
public class UsuarioCadastrar extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            
            UsuarioDAO dao = new UsuarioDAO();
            
            int id = Integer.parseInt(request.getParameter("id"));
            String nome = request.getParameter("nome");
            Date dataNascimento = java.sql.Date.valueOf(request.getParameter("datanascimento"));
            String cpf = request.getParameter("cpf");
            String email = request.getParameter("email");
            //Pra verificar se o email esta vazio e para nunca ser null. Se não veio valor ele troca null por uma string vazia.
            email = (email == null) ? "" : email.trim();   
            String senha = request.getParameter("senha");

            //tratamento para o campo salario R$1.000,00
            String salarioStr = request.getParameter("salario");
            // Remove "R$", espaços e pontos de milhar, e troca a vírgula por ponto
            salarioStr = salarioStr.replace("R$", "")     // remove "R$"
                           .replace(".", "")       // remove ponto de milhar
                           .replace(",", ".")      // troca vírgula decimal por ponto
                           .trim();                // remove espaços extras

            double salario = Double.parseDouble(salarioStr);
            
            //Tratamento para o CPF
            if (!DocumentoValidador.isDocumentoValido(cpf)){
                //verifica se cpf é valido
                response.getWriter().write("3");
            } else if (dao.cpfExiste(cpf)&& id == 0){
                //verifica se cpf já esta cadastrado
                response.getWriter().write("4");
            } else if (nome.isEmpty() || nome.isBlank() || salario <= 0 || 
                       email.isBlank() || email.isEmpty() || senha.isBlank() ||
                       senha.isEmpty()) {
                //verifica inconsistencias em outros atributos do cadastro
                response.getWriter().write("5");
             // Verifica se o email esta no formato de um email correto
            } else if (!EmailValidador.isEmailValido(email)){
            	response.getWriter().write("7");
            } else if (dao.emailExiste(email, id)) {
            	// Verifica se o email já é cadastrado para outro usuario
            	response.getWriter().write("6");
            }  else {
                //passou nas validacoes - grava dados
                Usuario oUsuario = new Usuario();
                oUsuario.setId(id);
                oUsuario.setNome(nome);
                oUsuario.setCpf(cpf);
                oUsuario.setDataNascimento(dataNascimento);
                oUsuario.setEmail(email);
                oUsuario.setSenha(senha);
                oUsuario.setSalario(salario);

                if (dao.cadastrar(oUsuario)){
                    response.getWriter().write("1");               
                } else {
                    response.getWriter().write("0");
                }
            }
        } catch (Exception ex){
             System.out.println("Problemas no Servlet ao cadastrar Usuario! Erro: " + ex.getMessage());
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

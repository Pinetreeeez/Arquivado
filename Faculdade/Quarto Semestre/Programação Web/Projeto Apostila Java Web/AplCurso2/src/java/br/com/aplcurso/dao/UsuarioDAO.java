package br.com.aplcurso.dao;

import java.util.List;
import br.com.aplcurso.model.Usuario;   
import br.com.aplcurso.utils.SingleConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UsuarioDAO implements GenericDAO{
    
    private Connection conexao;
    
    public UsuarioDAO() throws Exception{
        conexao = SingleConnection.getConnection();
    }
    
    @Override
    public Boolean cadastrar(Object objeto) {
        Usuario oUsuario = (Usuario) objeto;
        Boolean retorno=false;
        if (oUsuario.getId()== 0) {
            retorno = this.inserir(oUsuario);
        }else{
            retorno = this.alterar(oUsuario);
        }
        return retorno; 
    }

    @Override
    public Boolean inserir(Object objeto) {
        Usuario oUsuario = (Usuario) objeto;
        PreparedStatement stmt = null;
        String sql = "insert into usuario (nome,datanascimento, cpf, email, senha, salario) "
                + "values (?,?,?,?,?,?)";  
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, oUsuario.getNome());        
            stmt.setDate(2,new java.sql.Date(oUsuario.getDataNascimento().getTime()));
            stmt.setString(3, oUsuario.getCpf());
            stmt.setString(4, oUsuario.getEmail());
            stmt.setString(5, oUsuario.getSenha());
            stmt.setDouble(6, oUsuario.getSalario());
            stmt.execute();
            conexao.commit();
            return true;
        } catch (Exception ex) {
            try {
                System.out.println("Problemas ao cadastrar a Usuário! Erro: "+ex.getMessage());
                ex.printStackTrace();
                conexao.rollback();
            } catch (SQLException e) {
                System.out.println("Erro:"+e.getMessage());
                e.printStackTrace();
            }
            return false;
        } 
    }

    @Override
    public Boolean alterar(Object objeto) {
        Usuario oUsuario = (Usuario) objeto;
        PreparedStatement stmt = null;
        String sql = "update usuario set nome=?, datanascimento=?, cpf=?, email=?, senha=?, salario=? "
                + "where id=?";  
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, oUsuario.getNome());        
            stmt.setDate(2,new java.sql.Date(oUsuario.getDataNascimento().getTime()));
            stmt.setString(3, oUsuario.getCpf());
            stmt.setString(4, oUsuario.getEmail());
            stmt.setString(5, oUsuario.getSenha());
            stmt.setDouble(6, oUsuario.getSalario());
            stmt.setInt(7, oUsuario.getId());
            stmt.execute();
            conexao.commit();
            return true;
        } catch (Exception ex) {
            try {
                System.out.println("Problemas ao alterar a Usuário! Erro: "+ex.getMessage());
                ex.printStackTrace();
                conexao.rollback();
            } catch (SQLException e) {
                System.out.println("Erro:"+e.getMessage());
                e.printStackTrace();
            }
            return false;
        }  
    }

    @Override
    public Boolean excluir(int numero) {
        PreparedStatement stmt = null;
        String sql = "delete from usuario where id=?";  
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, numero);
            stmt.execute();
            conexao.commit();
            return true;
        } catch (Exception ex) {
            try {
                System.out.println("Problemas ao excluir o Usuário! Erro: "+ex.getMessage());
                ex.printStackTrace();
                conexao.rollback();
            } catch (SQLException e) {
                System.out.println("Erro:"+e.getMessage());
                e.printStackTrace();
            }
            return false;
        }  
    }

    @Override
    public Object carregar(int numero) {
        String sql = "Select * from usuario where id=?";
        Usuario oUsuario = null;
        
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) 
        {
            stmt.setInt(1, numero);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                oUsuario = new Usuario();                
                oUsuario.setId(rs.getInt("id"));
                oUsuario.setNome(rs.getString("nome"));
                oUsuario.setCpf(rs.getString("cpf"));
                oUsuario.setEmail(rs.getString("email"));
                oUsuario.setSalario(rs.getDouble("salario"));
                oUsuario.setDataNascimento(rs.getDate("datanascimento"));
            }
            
            return oUsuario;
            
        } catch (SQLException ex) {
            System.out.println("Erro ao listar usuários: " + ex.getMessage());
            ex.printStackTrace();
        }
        
        return oUsuario; 
    }

    @Override
    public List<Object> listar() {
        List<Object> resultado = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "Select * from usuario order by id";               
        try {
            stmt = conexao.prepareStatement(sql);
            rs=stmt.executeQuery();           
            while (rs.next()) {                
                Usuario oUsuario = new Usuario();
                oUsuario.setId(rs.getInt("id"));
                oUsuario.setNome(rs.getString("nome"));
                oUsuario.setCpf(rs.getString("cpf"));
                oUsuario.setEmail(rs.getString("email"));
                oUsuario.setSalario(rs.getDouble("salario"));
                oUsuario.setDataNascimento(rs.getDate("datanascimento"));
                resultado.add(oUsuario);
            }
        }catch (SQLException ex) {
            System.out.println("Erro ao listar usuários: " + ex.getMessage());
            ex.printStackTrace();
        }
        return resultado; 
    }
    
     public boolean cpfExiste(String cpf) {
        String sql = "SELECT COUNT(*) as quantidade_cpf FROM usuario WHERE cpf = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, cpf);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                if (rs.getInt("quantidade_cpf") > 0)
                    return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
     
     //Função pra checar se existe algum outro usuario com esse email
     // Mesma lógica que o cpfExiste acima só que adaptado pra email
     public boolean emailExiste(String email, int idIgnorar) {   
    	 	// O Count(*) conta quantas linhas atendem á condição. Se der 0 o email ta livre e se der 1 ou mais já existe.
    	 	//Esse lower(email) = lower(?) converte os dois lados para minusculos antes de comparar (tipo Joao@gmail e joao@gmail seriam considerados diferentes). 
    	 	// O "id <> ?" significa "diferente de" e ele tem dois propósitos:
    	 	// Na inclusão o id é 0 (por causa que no construtor do usuario que o jefferson fez o id é 0) e nenhum usuario tem id 0, então id <> 0 não exclui ninguem e a busca olha todos. 
    	 	// Na alteração o id é o do usuário que você está editando, sem essa condição, ao editar o usuario e não mudar e-mail, o sistema acharia o e-mail do usuario e diria “já cadastrado”, o que seria um erro.
    	    // Eu pesquisei e esses "?" são parâmetros que são preenchidos depois na ordem que aparecem (sendo o primeiro o email e o segundo o id).
    	    String sql = "SELECT COUNT(*) AS qtd FROM usuario " 
    	    		+ "WHERE lower(email) = lower(?) AND id <> ?"; 
    	    try (PreparedStatement stmt = conexao.prepareStatement(sql)) {  
    	    	// Esses setString e setInt vai preencher os "?". Eu botei um trim pra deixar tirar os espaços do começo e do fim do email.
    	        stmt.setString(1, email.trim()); 
    	        stmt.setInt(2, idIgnorar);
    	        try (ResultSet rs = stmt.executeQuery()) {
    	        	if (rs.next()) {
    	        		// O rs.getInt le o numero da coluna "qtd", no ">0" se a contagem for 0 o email ta livre e vai retornar false (se for 1 não vai tar disponivel). 
    	        		return rs.getInt("qtd") > 0;}
    	        }
    	    } catch (SQLException e) {
    	        e.printStackTrace();
    	    }
    	    return false;
    	}
     
}

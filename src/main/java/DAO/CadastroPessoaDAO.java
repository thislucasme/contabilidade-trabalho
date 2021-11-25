package DAO;

import ENTIDADES.Pessoa;
import database.factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class CadastroPessoaDAO {
    public void save(Pessoa pessoa){
        String sql = "insert into pessoa(nome, endereco, telefone) values(?,?,?)";
        
        Connection conn =  null;
        PreparedStatement pstm = null;
        
        try{
               //criar conexao com o banco de dados
               conn = ConnectionFactory.criarConexaoMysql();
               
               //criando PreparedStatment para executar a query
               pstm = conn.prepareStatement(sql);
               
               pstm.setString(1, pessoa.getNome());
               pstm.setString(2, pessoa.getEndereco());
               pstm.setString(3, pessoa.getTelefone());
               
               //executar a query
               pstm.execute();
               
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

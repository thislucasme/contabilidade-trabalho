package database.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    
    private static final String USERNAME = "root";
    private static final String PASS = "gemmaN123_";
    private static final String DATABASE_NAME = "contabilidade";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/"+DATABASE_NAME;
    
    public static final Connection criarConexaoMysql() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASS);
        return connection;
    }
    
    public static void main(String[] args) throws Exception{
        Connection conn = criarConexaoMysql();
        
        if(conn != null){
            System.out.println("Conexao ok!");
            conn.close();
        }else{
            System.out.println("Erro ao se connectar ao banco de dados!");
            conn.close();
        }
    }
}

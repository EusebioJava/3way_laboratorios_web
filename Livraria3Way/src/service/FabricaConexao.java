package service;
import java.sql.*;
public class FabricaConexao {
	static final String url = "jdbc:postgresql://localhost:5432/Livraria";
	static final String usuario = "3way";
	static final String senha = "123456";
	public static Connection getConexao() throws SQLException {
		try{
			Class.forName("org.postgresql.Driver");
			return DriverManager.getConnection(url,usuario,senha);
		}catch(ClassNotFoundException e){
			throw new SQLException(e.getMessage());
		}	
	}
}

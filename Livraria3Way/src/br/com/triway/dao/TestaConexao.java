package br.com.triway.dao;
import java.sql.*;
//import java.sql.Connection;
//import java.sql.SQLException;

import service.FabricaConexao;

public class TestaConexao {
	public static void main(String[] args) {
		Connection con;
		try {
			con = FabricaConexao.getConexao();
			if(con!=null)
				System.out.println("Conexao estabelecida!");
				con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
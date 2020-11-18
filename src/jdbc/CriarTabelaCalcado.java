package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaCalcado {
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection conexao = FabricaConexao.getConexao();
		
		String sql = "CREATE TABLE IF NOT EXISTS calcado ("
				+ "nome VARCHAR(80) PRIMARY KEY,"
				+ "cor VARCHAR(40) NOT NULL,"
				+ "numero INT NOT NULL"
				+ ")";
		
		Statement stmt = conexao.createStatement();
		stmt.execute(sql);
		
		System.out.println("Tabela criada com sucesso!!!");
		conexao.close();

	}

}

package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelePlaneta {
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection conexao = FabricaConexao.getConexao();
		
		String sql = "CREATE TABLE IF NOT EXISTS planeta ("
				+ "nome VARCHAR(80) PRIMARY KEY,"
				+ "cor VARCHAR(40) NOT NULL,"
				+ "galaxia VARCHAR(40) NOT NULL,"
				+ "menor_temperatura DOUBLE NOT NULL,"
				+ "maior_temperatura DOUBLE NOT NULL,"
				+ "quantidade_satelite INT NOT NULL"
				+ ")";
		
		Statement stmt = conexao.createStatement();
		stmt.execute(sql);
		
		System.out.println("Tabela criada com sucesso!!!");
		conexao.close();

	}
}

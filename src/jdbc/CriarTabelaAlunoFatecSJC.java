package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaAlunoFatecSJC {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection conexao = FabricaConexao.getConexao();
		
		String sql = "CREATE TABLE IF NOT EXISTS alunofatec ("
				+ "nome VARCHAR(80) PRIMARY KEY,"
				+ "curso VARCHAR(40) NOT NULL,"
				+ "periodo VARCHAR(10) NOT NULL"
				+ ")";
		
		Statement stmt = conexao.createStatement();
		stmt.execute(sql);
		
		System.out.println("Tabela criada com sucesso!!!");
		conexao.close();

	}

}

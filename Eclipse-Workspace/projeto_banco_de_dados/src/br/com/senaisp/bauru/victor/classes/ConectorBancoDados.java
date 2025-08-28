package br.com.senaisp.bauru.victor.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConectorBancoDados {
	private static ConectorBancoDados instancia = null;
	private String connStr;
	//Objeto de conexão SQL
	private Connection conn;
	private ConectorBancoDados() throws SQLException {
		connStr = "jdbc:sqlite:c:\\javalibs\\producao.db";
		conn = DriverManager.getConnection(connStr);
		criarEstrutura();
		}
	private void criarEstrutura() {
		String tabela = """
				CREATE TABLE IF NOT EXISTS produto (
    id        INTEGER         PRIMARY KEY AUTOINCREMENT
                              NOT NULL,
    descricao TEXT (100)      NOT NULL,
    saldo     NUMERIC (15, 2) NOT NULL,
    preco     NUMERIC (15, 2) NOT NULL
				);
				""";
		try {
			Statement stmt = conn.createStatement();
			stmt.execute(tabela);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	//Isso é chamado pattern Singleton
	public static ConectorBancoDados getInstancia() throws SQLException {
		if (instancia == null) {
			instancia = new ConectorBancoDados();
		}
		return instancia;
	}
	public String getConnStr() {
		return connStr;
	}
	public Connection getConnection() {
		return conn;
	}
}


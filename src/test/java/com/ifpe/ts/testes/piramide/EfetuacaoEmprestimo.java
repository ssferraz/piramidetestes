package com.ifpe.ts.testes.piramide;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.sql.Timestamp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ifpe.ado.emprestimo.RepositorioEmprestimo;
import com.ifpe.emprestimo.Emprestimo;
import com.ifpe.utils.DbUtils;

public class EfetuacaoEmprestimo {

	private static DbUtils db = new DbUtils();
	
	@Before
	public void setUp() throws Exception {
		db.abrirConexao();
	}

	@Test
	public void efetuaEmprestimoTest() throws SQLException {
		RepositorioEmprestimo repositorio = new RepositorioEmprestimo();
		String data = new Timestamp(System.currentTimeMillis()).toString();
		Emprestimo e = new Emprestimo("1408701", "1", data);
		int i = repositorio.efetuarEmprestimo(e);
		assertEquals(1, i);
	}
		
	@After
	public void close() throws Exception {
		db.fecharConexao();
	}

}

package com.ifpe.ts.testes.piramide;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ifpe.ado.emprestimo.RepositorioEmprestimo;
import com.ifpe.utils.DbUtils;

public class FinalizacaoEmprestimo {

	private static DbUtils db = new DbUtils();
	
	@Before
	public void setUp() throws Exception {
		db.abrirConexao();
	}

	@Test
	public void finalizaEmprestimoTest() throws SQLException {
		RepositorioEmprestimo repositorio = new RepositorioEmprestimo();
		int i = repositorio.removerEmprestimo(1);
		assertEquals(1, i);
	}
	
	
	@After
	public void close() throws Exception {
		db.fecharConexao();
	}

}

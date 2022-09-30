package com.ifpe.ts.testes.piramide;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ifpe.ado.professor.RepositorioProfessor;
import com.ifpe.utils.DbUtils;

public class RemocaoProfessor {
	
	private static DbUtils db = new DbUtils();
	
	@Before
	public void setUp() throws Exception {
		db.abrirConexao();
	}

	
	@Test
	public void remocaoProfessorTest() throws SQLException {
		RepositorioProfessor repositorio = new RepositorioProfessor();
		int i = repositorio.remover("1408701");
		assertEquals(1, i);
	}
	
	@After
	public void close() throws Exception {
		db.fecharConexao();
	}

}

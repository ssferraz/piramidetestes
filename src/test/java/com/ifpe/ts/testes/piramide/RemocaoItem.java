package com.ifpe.ts.testes.piramide;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ifpe.ado.item.RepositorioItem;
import com.ifpe.utils.DbUtils;

public class RemocaoItem {

	private static DbUtils db = new DbUtils();
	
	@Before
	public void setUp() throws Exception {
		db.abrirConexao();
	}

	
	@Test(expected = SQLException.class)
	public void remocaoItemTest() throws SQLException {
		RepositorioItem repositorio = new RepositorioItem();
		int i = repositorio.remover("1");
		assertEquals(1, i);
	}
	
	
	@After
	public void close() throws Exception {
		db.fecharConexao();
	}

}

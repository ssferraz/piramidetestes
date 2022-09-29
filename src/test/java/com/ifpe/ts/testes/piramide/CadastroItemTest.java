package com.ifpe.ts.testes.piramide;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ifpe.ado.item.RepositorioItem;
import com.ifpe.item.Item;
import com.ifpe.utils.DbUtils;

public class CadastroItemTest {

	private static DbUtils db = new DbUtils();
	
	@Before
	public void setUp() throws Exception {
		db.abrirConexao();
	}

	
	@Test(expected = SQLException.class)
	public void cadastroItemTest() throws SQLException {
		Item item = new Item("1", "Calendário");
		RepositorioItem repositorio = new RepositorioItem();
		repositorio.inserir(item);
		assertFalse(throwException());
	}
	
	private boolean throwException() throws SQLException{
        throw new SQLException();
    }
	
	@After
	public void close() throws Exception {
		db.fecharConexao();
	}

}

package teste;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import clase.Matematica;

public class MatematicaTest {
	
	private Matematica matematica;
	@BeforeClass
	public static void beforeClass() {
		System.out.println("apelat inainte de tot");
	}
	
	@Before
	public void creeazaObiectMatematica() {
		this.matematica = Matematica.getInstantaMatematica();
	}
	
	@Test
	public void testSingleton() {
		Matematica m1 = Matematica.getInstantaMatematica();
		Matematica m2 = Matematica.getInstantaMatematica();
		assertSame(m1, m2);
	}
	
	
	@Test
	public void testSumaCorecta() {
		assertEquals(5, matematica.suma(-1, 6));
	}
	
	@Test
	public void testSumaAcelasiNumar() {
		int numar = 3;
		assertEquals(numar * 2, matematica.suma(numar, numar));
	}
	
	@Test
	public void testSumaRaportCorect() {
		assertEquals(2, matematica.raport(4, 2),0.1);
	}
	
	@Test
	public void testRaportCuRezultatDouble() {
		assertEquals(2.5, matematica.raport(5, 2),0.01);
	}
	
	@Test
	public void testRaportShouldThrowException() {
		try {
			matematica.raport(56, 0);
			fail("Metoda raport nu arunca exceptie");
		} catch(IllegalArgumentException e) {
		}
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testRaportThrowException() {
		matematica.raport(49, 0);
	}
	
	@Test
	public void testVerificaPar() {
		assertTrue(matematica.estePar(2));
		assertTrue(matematica.estePar(0));
		assertTrue(matematica.estePar(-2));
	}
	
	@Test 
	public void testNumerePareOvidiu() {
		List<Integer> lista = new ArrayList<>();
		lista.add(0);
		lista.add(2);
		lista.add(4);
		lista.add(6);
		assertEquals(lista, matematica.nNumerePare(4));
		
	}
	
	public void returneazaListaNrPare() {
		assertEquals(4, matematica.nNumerePare(4).size());
	}
	
	public void testListaNumere() {
		List<Integer> lista = matematica.nNumerePare(4);
		for(int i = 0; i < 4; i++) {
			assertTrue(matematica.estePar(lista.get(i)));
		}
	}
	
	@Test
	public void testListaNull() {
		assertNull(matematica.nNumerePare(0));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testListaNrNegative() {
		matematica.nNumerePare(-3);
	}
	
	@Test
	public void testListaNrCresc() {
		List<Integer> lista = matematica.nNumerePare(4);
		for(int i=0;i < lista.size()-1;i++) {
			assertTrue(lista.get(i)<lista.get(i+1));
		}
	}

}

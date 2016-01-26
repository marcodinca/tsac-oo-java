package cragnolini.simone.test.commercialista;

import static org.junit.Assert.*;

import org.junit.Test;

import cragnolini.simone.commercialista.Imprenditore;

public class ImprenditoreTest {

	@Test
	public void testCalcolaParcella() {
		
		Imprenditore i = new Imprenditore("Test", "Test", "000", "000", "Test", 99);
		int parcella = i.calcolaParcella();

		assertEquals(500 * 1000, parcella);
		
		i.setNumeroFatture(100);
		// TODO assertEquals(500 * 1000, parcella);
		
	}

}

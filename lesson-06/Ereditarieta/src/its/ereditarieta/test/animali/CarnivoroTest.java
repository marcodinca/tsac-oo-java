package its.ereditarieta.test.animali;

import static org.junit.Assert.*;

import org.junit.Test;

import its.ereditarieta.animali.Carnivoro;

public class CarnivoroTest {

	@Test
	public void testVerso() {
		Carnivoro c = new Carnivoro();
		c.setNumeroZampe(3);
		assertEquals("BHO?", c.verso());
	}
	
	@Test
	public void testPredaPreferita() {
		Carnivoro c = new Carnivoro();
		c.setNumeroZampe(3);
		assertEquals("Dipende(nte)", c.predaPreferita());
	}

}

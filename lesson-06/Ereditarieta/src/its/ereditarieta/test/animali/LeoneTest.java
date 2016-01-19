package its.ereditarieta.test.animali;

import static org.junit.Assert.*;

import org.junit.Test;

import its.ereditarieta.animali.Leone;

public class LeoneTest {

	@Test
	public void testVerso() {
		Leone l = new Leone();
		assertEquals("Ruggito", l.verso());
	}

	@Test
	public void testPredaPreferita() {
		Leone l = new Leone();
		assertEquals("Gazzella", l.predaPreferita());
	}

}

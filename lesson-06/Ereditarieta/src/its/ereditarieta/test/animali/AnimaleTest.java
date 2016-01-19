package its.ereditarieta.test.animali;

import static org.junit.Assert.*;

import org.junit.Test;

import its.ereditarieta.animali.Animale;

public class AnimaleTest {

	@Test
	public void testVerso() {
		Animale a = new Animale();
		a.setNumeroZampe(4);
		assertEquals(4, a.getNumeroZampe());
	}

}

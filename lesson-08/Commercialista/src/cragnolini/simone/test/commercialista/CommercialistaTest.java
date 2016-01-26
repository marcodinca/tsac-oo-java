package cragnolini.simone.test.commercialista;

import static org.junit.Assert.*;

import org.junit.Test;

import cragnolini.simone.commercialista.*;

public class CommercialistaTest {

	@Test
	public void testTotaleIncasso() {
		Dipendente angelo = new Dipendente("Angelo", "Rossi", "000");
		Imprenditore marco = new Imprenditore("Marco", "Verdi", "000", "000", "Ferramenta di Marco", 99);
		LiberoProfessionista paolo = new LiberoProfessionista("Paolo", "Bianchi", "000", "000", 15);

		Cliente[] clienti = new Cliente[] {
				angelo,
				marco,
				paolo
		};
		
		Commercialista c = new Commercialista();
		c.setClienti(clienti);
		
		assertEquals(607500, c.totaleIncasso());
		
	
	}

}

package commercialista.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import commercialista.Commercialista;
import commercialista.Dipendente;
import commercialista.Imprenditore;
import commercialista.LiberoProfessionista;

@RunWith(Suite.class)
@SuiteClasses({Commercialista.class, Dipendente.class, Imprenditore.class, LiberoProfessionista.class})
public class AllTests {

}

package commercialista.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import commercialista.*;

@RunWith(Suite.class)
@SuiteClasses({Cliente.class, Commercialista.class, Dipendente.class, Imprenditore.class, LiberoProfessionista.class})
public class AllTests {

}

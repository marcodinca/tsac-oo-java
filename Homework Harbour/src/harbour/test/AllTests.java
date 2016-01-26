package harbour.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import harbour.game.*;

@RunWith(Suite.class)
@SuiteClasses({Aereo.class, Gioco.class, Invasore.class, PortoNavale.class, Sottomarino.class})
public class AllTests {

}

package videoteca.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import videoteca.*;

@RunWith(Suite.class)
@SuiteClasses({BluRay.class, Cassetta.class, Dvd.class, Film.class, Supporto.class, Videoteca.class})
public class TestVideotecaSuite {
		
}

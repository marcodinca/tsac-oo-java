package its.ereditarieta.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import its.ereditarieta.animali.Animale;
import its.ereditarieta.test.animali.CarnivoroTest;
import its.ereditarieta.test.animali.LeoneTest;

@RunWith(Suite.class)
@SuiteClasses({Animale.class, CarnivoroTest.class, LeoneTest.class})
public class AllTests {

}

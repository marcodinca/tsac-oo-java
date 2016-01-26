import static org.junit.Assert.*;

import org.junit.Test;

public class TestTest {

	@Test
	public void testSum() {
		double s1 = Floating.sum(5.6, 5.8);
	    System.out.println(s1);
	    
	    double s2 = Floating.sum(1.6, 5.8);
	    s2 += 4;
	    System.out.println(s2);
	    
	    
	    
	    assertEquals("", 11.4, s1, 0.00000001);	    

	}

}

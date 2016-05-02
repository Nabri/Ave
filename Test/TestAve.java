import static org.junit.Assert.assertEquals;

import org.junit.Test;

import progra2.AveNadadora;
import progra2.AveVoladora;

public class TestAve {

	@Test
	public void testAveQueVuela() {
		AveVoladora ave1 = new AveVoladora (10.0);
		
		assertEquals ("El ave vuela" , ave1.aveQueVuela());
	}
	
	@Test
	public void testPesoDelAve () {
		AveVoladora ave1 = new AveVoladora (10.5);
		
		assertEquals (10.5,ave1.pesoDelAve(),0.01);
	}
	
	
	@Test
	public void testAveQueNada () {
		AveNadadora ave1 = new AveNadadora (5.5, "Negro");
			
		assertEquals (true, ave1.aveQueNada());
		
	}
	
	@Test
	public void testPesoYColorDelAve () {
		AveNadadora ave1 = new AveNadadora (5.5, "Negro");
			
		assertEquals (5.5, ave1.pesoDelAve(), 0.01);
		assertEquals ("Negro", ave1.colorDelAve());
	}

}

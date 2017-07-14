import static org.junit.Assert.*;

import org.junit.Test;

import com.fanniemae.payroll.dao.CarRepository;


public class CarTest {

	@Test
	public void tesSizeFor10Items() {
		CarRepository carRep = new CarRepository();
		
		int size = carRep.findMaps().size();
		
		assertTrue("Size is: " + size, size==10);
		
		//fail("Not yet implemented");
	}
	
	@Test
	public void tesSizeFor11Items() {
		CarRepository carRep = new CarRepository();
		
		int size = carRep.findMaps().size();
		
		assertTrue("Size is: " + size, size==11);
		
		//fail("Not yet implemented");
	}

}

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.fanniemae.payroll.ManagementEmployee;
import com.fanniemae.payroll.dao.IQuery;
import com.fanniemae.payroll.dao.SalesTaxRepository;
import com.fanniemae.payroll.dao.ShoppingRepository;

public class SalesTaxList {

	@Test
	public void testIfNYExist() {
		//fail("Not yet implemented");
		SalesTaxRepository s = new SalesTaxRepository();
		ArrayList<String> taxList = s.findAll();
		
		boolean isNewYorkAvailable = false;
		
		for (String x : taxList) {
			System.out.println(x);
			isNewYorkAvailable = x.contains("NY");
			
			if (isNewYorkAvailable)
				break;
			
			//System.out.println(x);
		}
		
		assertTrue(isNewYorkAvailable);
		
	}

	@Test
	public void testShoppingList(){
		IQuery<String> s= new ShoppingRepository();
		
		ArrayList<String> list = s.findAll();
		System.out.println(list);
		int size = list.size();
		assertTrue(size >4 );
		
	}
	
	
	
}

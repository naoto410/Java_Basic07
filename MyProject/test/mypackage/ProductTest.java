package mypackage;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductTest {
	@Test
	void testgetName() {
		Product pro = new Product("商品x", 10.0);
		String name = pro.getName();
		assertEquals("商品x", name, "nameが一致しません！");
	}
	
	@Test
	void testgetPrice() {
		Product pro = new Product("商品x", 10.0);
		double price = pro.getPrice();
		assertEquals(10.0, price, 0.01, "priceが一致しません！");
	}
}
package mypackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
class ShoppingCartTest {
	@Test
	void testAddItem() {
		ShoppingCart cart = new ShoppingCart();
		Product pro = new Product("商品x", 80.0);
		
		cart.addItem(pro);
		cart.getItemCount();
		assertEquals(1, cart.getItemCount(), "商品が正しく追加されていません。");
	}
	
	@Test
	void testAddItemMax() {
		ShoppingCart cart = new ShoppingCart();
		Product pro1 = new Product("商品x", 90.0);
		Product pro2 = new Product("商品x", 90.0);
		Product pro3 = new Product("商品x", 90.0);
		
		cart.addItem(pro1);
		cart.addItem(pro2);
		cart.addItem(pro3);
		
		assertEquals(270.0, cart.getTotalPrice(), "カートがいっぱいです");
	}
	
	@Test
	void testTotalPrice() {
		ShoppingCart cart = new ShoppingCart();
		Product pro = new Product("商品x", 80.0);
		Product pro2 = new Product("商品x", 80.0);
		
		cart.addItem(pro);
		cart.addItem(pro2);
		
		assertEquals(160.0, cart.getTotalPrice(), "合計金額が正しく計算されていません");
	}
}
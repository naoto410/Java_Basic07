package mypackage;

public class Main {
	public static void main(String[] args) {
		Product productA = new Product("商品A", 50.0);
		Product productB = new Product("商品B", 30.0);
		Product productC = new Product("商品C", 20.0);

		ShoppingCart cart = new ShoppingCart();

		cart.addItem(productA);
		cart.addItem(productB);
		cart.addItem(productC);

		double totalPrice = cart.getTotalPrice();
		System.out.println("ショッピングカートの合計金額: $" + totalPrice);
	}
}
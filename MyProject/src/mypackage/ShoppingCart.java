package mypackage;

class ShoppingCart {
	private Product[] items;
	private int itemCount;
	private static final int MAX_ITEMS = 3;
	
	public int getItemCount() {
		return itemCount;
	}

	public ShoppingCart() {
		items = new Product[MAX_ITEMS];
		itemCount = 0;
	}

	public void addItem(Product product) {
		if (itemCount < MAX_ITEMS) {
			items[itemCount] = product;
			itemCount++;
		} else {
			System.out.println("カートがいっぱいです。商品を追加できません。");
		}
	}

	public double getTotalPrice() {
		double total = 0.0;
		for (int i = 0; i < itemCount; i++) {
			total += items[i].getPrice();
		}

		return total;
	}
}
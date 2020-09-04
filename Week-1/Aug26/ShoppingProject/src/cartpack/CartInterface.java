package cartpack;

import java.util.ArrayList;

import prodpack.Product;

public interface CartInterface {
	
	String addCartItem(int id, int quantity);
	String removeCartItem(int id, int quantity);
	String editCartItem(int id, int quantity);
	String getCart();
	int checkout();
	
}

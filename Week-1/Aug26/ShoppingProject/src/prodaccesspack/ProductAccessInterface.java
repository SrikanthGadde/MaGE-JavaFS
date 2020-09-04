package prodaccesspack;

import java.util.ArrayList;
import java.util.HashMap;

import prodpack.Product;
// Client contract
public interface ProductAccessInterface {
	
	 String addProduct(Product prod);
	 ArrayList<Product>  getAllProducts();
	 Product getAProductbyId(int id);
	 Product getAProductbyName(String name);
	 String editProduct(Product p);
	 String delProduct(int id);
	 
		String addCartItem(int id, int quantity);
		String removeCartItem(int id);
		String editCartItem(int id, int quantity);
		HashMap<Product, Integer> getCart();
		int checkout();
	 
}
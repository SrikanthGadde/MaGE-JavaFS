package cartpack;

import java.util.ArrayList;
import java.util.HashMap;

import prodpack.Product;
import prodaccesspack.ProductAccess;

public class Cart implements CartInterface{
	
	public HashMap<Product, Integer> alist = new HashMap<Product, Integer>();
	ProductAccess products = new ProductAccess();
	
	@Override
	public String addCartItem(int id, int quantity) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public String removeCartItem(int id, int quantity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String editCartItem(int id, int quantity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCart() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int checkout() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	

}

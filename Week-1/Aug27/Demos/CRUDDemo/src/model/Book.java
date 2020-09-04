package model;

public class Book {
	//variables need not be same
	private int bId;
	private String name;
	private int bPrice;
	
	public Book(int bId, String name, int bPrice) {
		super();
		this.bId = bId;
		this.name = name;
		this.bPrice = bPrice;
	}
	
	public int getbId() {
		return bId;
	}

	public String getName() {
		return name;
	}

	public int getbPrice() {
		return bPrice;
	}

	@Override
	public String toString() {
		return "Book [bId=" + bId + ", name=" + name + ", bPrice=" + bPrice + "]";
	}
	
	
	
}
 
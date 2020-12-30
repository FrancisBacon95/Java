public class GroceryItemWithStore extends GroceryItem {
	private String store;
	/////Constructor/////
	public GroceryItemWithStore(String n, double p, int c, String s) {
		super(n, p, c);
		this.store = s;
	}
	
	/////toString()/////
	public String toString() {
		return name+"  $"+price+"   "+count+"    $"+this.amount()+"     "+store;
	}
}

public class PNUCSESTORE {
	public static void main(String[] args) {
		GroceryItem item1 = new GroceryItem("Apples",30.1, 5);
		GroceryItem item2 = new GroceryItem("Garlic",40.2, 4);
		GroceryItem item3 = new GroceryItem("Orange",50.0, 3);
		GroceryItem item4 = new GroceryItem("Grapes",60.4, 2);
		GroceryItem item5 = new GroceryItem("Banana",70.5, 1);
		System.out.println(" NAME    PRICE  COUNT");
		System.out.println(item1.toString());
		System.out.println(item2.toString());
		System.out.println(item3.toString());
		System.out.println(item4.toString());
		System.out.println(item5.toString());
	}
}

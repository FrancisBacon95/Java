public class MYFRIDGE {
	public static void main(String[] args) {
		GroceryItem item1 = new GroceryItemWithStore("Apples",30.1, 5, "Emart");
		GroceryItem item2 = new GroceryItemWithStore("Garlic",40.2, 4, "GS25");
		GroceryItem item3 = new GroceryItemWithStore("Orange",50.0, 3, "CU");
		GroceryItem item4 = new GroceryItemWithStore("Grapes",60.4, 2, "MiniStop");
		GroceryItem item5 = new GroceryItemWithStore("Banana",70.5, 1," LotteMart");
		System.out.println("NAME    PRICE  COUNT  AMOUNT    STORE");
		System.out.println(item1.toString());
		System.out.println(item2.toString());
		System.out.println(item3.toString());
		System.out.println(item4.toString());
		System.out.println(item5.toString());
		
		double total=item1.amount()+item2.amount()+item3.amount()+item4.amount()+item5.amount();
		System.out.println("                      TOTAL: $"+total);
	}
}

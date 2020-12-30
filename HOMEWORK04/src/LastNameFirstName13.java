public class LastNameFirstName13 {
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
		
		System.out.println("\n2-1) get() the data fields of the first grocery item");
		System.out.println("Name = "+item1.getName()+"  price = "+item1.getPrice()+"  count = "+item1.getCount());
		System.out.println(" NAME    PRICE  COUNT");
		System.out.println(item1.getName()+"  $"+item1.getPrice()+"   "+item1.getCount());
		
		System.out.println("\n2-2) set() the data fields of the second grocery item");
		System.out.println(" NAME    PRICE  COUNT");
		item2.setName("Papaya");
		item2.setPrice(800);
		item2.setCount(8);
		System.out.println(item2.getName()+"  $"+item2.getPrice()+"   "+item2.getCount());
		
		System.out.println("\n2-3) For the remaining three grocery items, use getCount() and setCount() to increase the count by 100");
		System.out.println(" NAME    PRICE  COUNT");
		int tmp_count;
		tmp_count=item3.getCount()+100;
		item3.setCount(tmp_count);
		tmp_count=item4.getCount()+100;
		item4.setCount(tmp_count);
		tmp_count=item5.getCount()+100;
		item5.setCount(tmp_count);
		System.out.println(item3.toString());
		System.out.println(item4.toString());
		System.out.println(item5.toString());
	}
}

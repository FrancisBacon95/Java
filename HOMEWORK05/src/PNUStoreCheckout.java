public class PNUStoreCheckout {
	public static void main(String[] args) {
		//1) Create NotCheapStore that has a name as "PNUStore"
		NotCheapStore PNUStore = new NotCheapStore ("PNUStore");
		
		//2) Add each item to the PNUStore by enterItem.
		PNUStore.enterItem(new Candy("Peanut Butter Fudge", 1.33, 89));
		PNUStore.enterItem(new Candy("Peanut Butter Fudge", 2.25, 399));
		PNUStore.enterItem(new IceCream("Vanilla Ice Cream",105));
		PNUStore.enterItem(new Sundae("Choc. Chip Ice Cream",145, "Hot Fudge", 50));
		PNUStore.enterItem(new Cookie("Oatmeal Raisin Cookies", 4, 399));
		
		//3) Using PNUStore's toString(), Display items in PNUStore like receipt.
		//   And prices of all items are expressed in dollars.
		System.out.println(PNUStore);
		
		//4) Using PNUStore's numberOfItems(), totalCost(), totalTax(),
		//   Display the PNUStore's number of items and total cost, total tax, sum of total cost and tax.
		//   And tax and cost are expressed in dollars.
		System.out.println("Number of items: " + PNUStore.numberOfItems());
		System.out.println("Total cost: " + PNUStore.totalCost());
		System.out.println("Total tax: " + PNUStore.totalTax());
		System.out.println("Cost + Tax: " + (PNUStore.totalCost() + PNUStore.totalTax())+"\n\n");
		
		//5) Using PNUStore's clear(), Initialize the PNUStore's cash_register as empty state.
		PNUStore.clear();
		
		//6) Add each item to the PNUStore by enterItem.
		PNUStore.enterItem(new IceCream("Strawberry Ice Cream",145));
		PNUStore.enterItem(new Sundae("Vanilla Ice Cream",105, "Caramel", 50));
		PNUStore.enterItem(new Candy("Gummy Worms", 1.33, 89));
		PNUStore.enterItem(new Cookie("Chocolate Chip Cookies", 4, 399));
		PNUStore.enterItem(new Candy("Salt Water Taffy", 1.5, 209));
		PNUStore.enterItem(new Candy("Candy Corn",3.0, 109));
		
		//7) Using PNUStore's toString(), Display items in PNUStore like receipt.
		//   And prices of all items are expressed in dollars.
		System.out.println(PNUStore);
		
		//8) Using PNUStore's numberOfItems(), totalCost(), totalTax(),
		//   Display the PNUStore's number of items and total cost, total tax, sum of total cost and tax.
		//   And tax and cost are expressed in dollars.		
		System.out.println("Number of items: " + PNUStore.numberOfItems());
		System.out.println("Total cost: " + PNUStore.totalCost());
		System.out.println("Total tax: " + PNUStore.totalTax());
		System.out.println("Cost + Tax: " + (PNUStore.totalCost() + PNUStore.totalTax())+"\n\n");
	}
}

//1) All variables in NotCheapStore are expressed as "private".
public class NotCheapStore {
	// 2) store_name, address, phone_num: Store's name, address, phone number
	private String store_name;
	private String address="PNU load 33-1";
	private String phone_num="010-8624-7756";
	
	// 3) cash_register: The Checkout object of the object
	//   (An object that contains information about all items in the store)
	private Checkout cash_register;
	
	// 4) Constructor taking name as parameters.
	NotCheapStore(String n) {
		store_name = n;
		cash_register= new Checkout();
	};
	// 5) enterItem(NotCheapStoreItem item)
	// This function takes NotCheapStoreItem's object as a parameter and uses enterItem_Checkout(NotCheapStoreItem's object) of "obeject's cash_register".
	// Through this, item is added to "cash_register's ArrayList of the object".
	public void enterItem(NotCheapStoreItem item) {
		(this.cash_register).enterItem_Checkout(item);
	}
	// 6) clear()
	// This function uses clear_Checkout(NotCheapStoreItem's object) of "obeject's cash_register".
	// Through this, Initialize cash_register's ArrayList of the object to empty state.".
	public void clear() {
		(this.cash_register).clear_Checkout();
	}
	
	// 7) numberOfItems()
	// This function uses numberOfItems_Checkout() of "obeject's cash_register".
	// Through this, return size of cash_register's ArrayList of the object".
	public int numberOfItems() {
		return (this.cash_register).numberOfItems_Checkout();
	}
	
	// 8) numberOfItems()
	// This function uses totalCost_Checkout() of "obeject's cash_register".
	// Through this, return sum of element's price in cash_register's ArrayList.
	public float totalCost() {
		return (float)(this.cash_register).totalCost_Checkout();
	}
	
	// 9) numberOfItems()
	// This function uses totalTax_Checkout() of "obeject's cash_register".
	// Through this, return sum of element's tax in cash_register's ArrayList.
	public float totalTax() {
		return (float)(this.cash_register).totalTax_Checkout();
	}
	
	// 10) toString()
	// This function uses item_information() of "obeject's cash_register".
	// Through this, function gets information of cash_register's items.
	// And return the store name and information of cash_register's items.
	public String toString() {
		return this.store_name+"\n--------------\n"+(this.cash_register).item_information();
	}
}

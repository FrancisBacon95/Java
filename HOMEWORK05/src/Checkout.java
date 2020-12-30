import java.util.ArrayList;

// 1) Checkout object has a member variable of ArrayList that expressed as "private".
public class Checkout {
	// 2) Item_list: a ArrayList of NotCheapStoreItem.
	private ArrayList<NotCheapStoreItem> Item_list= new ArrayList<NotCheapStoreItem>();
	
	// 3) Constructor taking no parameters.
	Checkout(){};
	
	// 4) enterItem_Checkout(NotCheapStoreItem item)
	// Add a NotCheapStoreItem' object to Item_list
	public void enterItem_Checkout(NotCheapStoreItem item){
		(this.Item_list).add(item);
	}
	
	// 5) clear_Checkout()
	// Initialize the Item_list as empty state.
	public void clear_Checkout() {
		this.Item_list=new ArrayList<NotCheapStoreItem>();
	}
	
	// 6) Return the size of Item_list.
	public int numberOfItems_Checkout() {
		return Item_list.size();
	}
	
	// 7) Gets the sum of the prices of all items in "Item_list".
	//    And convert this from cents to dollars and return this.
	public double totalCost_Checkout() {
		int sum_cents = 0;
		for(int i=0;i<Item_list.size();i++) {
			sum_cents += (Item_list.get(i)).Cost();
		}
		return Double.parseDouble(centToDollarsAndCents(sum_cents));
	}
	
	// 8) Gets the sum of the prices of all items in "Item_list".
	//    And Create a temporary NotCheapStoreItem's object to get the tax rate.
	//    Multiply these two to get the total tax.
	//    finally convert this from cents to dollars and return this.
	public double totalTax_Checkout() {
		double tmp=this.totalCost_Checkout()*(new NotCheapStoreItem()).Tax_rate();
		return Math.round(tmp*100)*0.01;
	}
	
	// 9) Gets the information of all items in "Item_list".
	//    And make String type's "answer" like receipt.
	//    Return "answer" like receipt.
	public String item_information() {
		String answer="";
		for(int i=0;i<Item_list.size();i++) {
			String tmp_name=(Item_list.get(i)).Name();
			String tmp_cost=centToDollarsAndCents((Item_list.get(i)).Cost());
			answer += tmp_name +"        "+ tmp_cost +"\n\n";
		}
		return answer;
	}
	
	// 10) Convert parameter's value from cents to dollars and Return this.
	public String centToDollarsAndCents(int cents) {
		return Double.toString(cents*0.01);
	}
}

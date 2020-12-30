// 1) All variables in NotCheapStoreItem are expressed as "protected".
public class NotCheapStoreItem {
	
	// 2) tax_rate: Static is used to tax all products equally.
	protected static double tax_rate= 0.02; 
	
	// 3) name: item's name
	protected String name;
	
	// 4) cost: item's price(//Express in cents)
	protected int cost;
	
	// 5) Constructor taking price and name as parameters.
	NotCheapStoreItem(){name="NONAME"; cost=0;}
	NotCheapStoreItem(String n, int c) {
		name = n;
		cost = c;
	}
	
	// 6) Name(), Cost(), Tax_rate(): Function that returns protected variable
	public String Name()     {return name;}
	public int Cost()     {return cost;}
	public double Tax_rate() {return tax_rate;}
}

// 7) candy inherits NotCheapStoreItem.
//    All variables in Candy are expressed as "private".
class Candy extends NotCheapStoreItem {
	
	// 8) Purchase: The purchase quantity of the object
	private double Purchase;
	
	// 9) Weight_cost: Dollars per pound of the object
	private int Weight_cost;
	
	// 10) Constructor taking price and purchase quantity, Dollars per pound as parameters.
	//     The final cost calculated through purchase quantity and Dollars per pound 
	//     and the name of the item are stored in "name" and "cost" through super().
	//     ( final cost: Purchase*Weight_cost )
	//     Also, each value is saved in the variables "Purchase" and "weight_cost" of Candy object. 
	Candy(String name, double purchase, int weight_cost){
		super(purchase+" lbs.@ "+weight_cost*0.01+"/lb.\n"+name+"      ", (int)Math.round(purchase*weight_cost));
		Purchase=purchase;
		Weight_cost=weight_cost;
	}
	
	// 11) It is overriding with a function that outputs cost by using "purchase" and "weight_cost". 
	@Override
	public int Cost() {return (int)Math.round(Purchase*Weight_cost);}
}

// 12) Cookie inherits NotCheapStoreItem.
//    All variables in Cookie are expressed as "private".
class Cookie extends NotCheapStoreItem {
	
	// 13) Purchase: The purchase quantity of the object
	private double Purchase;
	
	// 14) Count_cost: Dollars per pound of the object
	private int Count_cost;
	
	// 15) Constructor taking price and purchase quantity, Dollars per dozen as parameters.
	//     The final cost calculated through purchase quantity and Dollars per dozen 
	//     and the name of the item are stored in "name" and "cost" through super().
	//	   ( final cost: Count_cost/(12/Purchase) )
	//     Also, each value is saved in the variables "Purchase" and "Count_cost" of Candy object.
	Cookie(String name, int purchase, int count_cost){
		super(purchase+" @ "+count_cost*0.01+"/dz.\n"+name, (int)Math.round(count_cost/(12/purchase)));
		Purchase=purchase;
		Count_cost=count_cost;
	}
	
	// 16) It is overriding with a function that outputs cost by using "purchase" and "Count_cost". 
	@Override
	public int Cost() {return (int)Math.round(Count_cost/(12/Purchase));}
}

// 17) IceCream inherits NotCheapStoreItem.
class IceCream extends NotCheapStoreItem {
	
	// 18) Constructor taking price and name as parameters.
	//     price and name are stored in "name" and "cost" through super().
	IceCream(String name, int cost){
		super(name, cost);
	}
}

// 19) Sundae inherits IceCream.
//    Toppping_cost in Sundae are expressed as "private".
class Sundae extends IceCream {
	private int Toppping_cost;
	// 20) Constructor taking Icecream's name and price, topping's name and price as parameters.
	//     The final cost calculated through icecream's price+ topping's price  
	//     and the name of the item are stored in "name" and "cost" through super().
	Sundae(String IceCream_name, int IceCream_cost, String topping_name, int topping_cost){
		super(IceCream_name+" with\n"+topping_name+"          ",IceCream_cost);
		Toppping_cost=topping_cost;
	}
	// 21) It is overriding with a function that outputs cost by using icecream's price and topping's price.
	@Override
	public int Cost() {return cost+Toppping_cost;}
}


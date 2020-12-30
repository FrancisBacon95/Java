public class GroceryItem {
    protected String name;
    protected double price;
    protected int count;
    /////Constructor/////
    GroceryItem(){
        name = "no name";
        price = 9999.99;
        count = 999;
    }
    GroceryItem(String n, double p, int c ){
        name = n;
        price = p;
        count = c;
    }
    /////ToString/////
    public String toString() {
        return name+"  $"+price+"   "+count+"    "+this.amount();
    }
    
    /////Set Series/////
    public void setName(String n) {
        name= n;
    }
    public void setPrice(double p) {
        price= p;
    }
    public void setCount(int c) {
        count= c;
    }
    
    /////Get Series/////
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getCount() {
        return count;
    }
    
    /////AMOUNT/////
    public double amount() {
        return price*count;
    }
}
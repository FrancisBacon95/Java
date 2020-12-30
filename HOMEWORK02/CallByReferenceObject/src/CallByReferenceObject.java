public class CallByReferenceObject {
	public static void main(String[] args) {
 		myNumber Number1 = new myNumber();
 		myNumber Number2 = new myNumber();
 		Number1.num = 1;
 		Number2.num = 2;
 		System.out.println("num1: " + Number1.num + " num2: " + Number2.num);
		swap(Number1, Number2);
	 	System.out.println("num1: " + Number1.num + " num2: " + Number2.num);
 	}
	public static void swap(myNumber Number1, myNumber Number2) {
		int tmp;
		tmp=Number1.num;
		Number1.num = Number2.num;
		Number2.num = tmp;
	}
}
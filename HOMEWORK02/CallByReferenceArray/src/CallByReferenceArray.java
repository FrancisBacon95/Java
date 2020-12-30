public class CallByReferenceArray {
	public static void main(String[] args) {
		 int [] num1 = new int[1];
		 int [] num2 = new int[1];
		 num1[0] = 0; num2[0] = 1;
		 System.out.println("num1: " + num1[0] + " num2: " + num2[0]);
		 swap(num1, num2);
		 System.out.println("num1: " + num1[0] + " num2: " + num2[0]);
	}
	public static void swap(int[] num1, int[] num2) {
		int [] tmp=new int[1];
		tmp[0]=num1[0];
		num1[0]=num2[0];
		num2[0]=tmp[0];
	}
}


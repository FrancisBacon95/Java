package homework03;
import java.util.Scanner;

public class problem1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		// input information of r1
		String[] sentence= {" 1. Sample test "," 2. First my data test"," 3. Second my data test "};
		for (int k=0; k < sentence.length; k++) {
			System.out.printf("=======%s=======\n",sentence[k]);
			double[] r1_info =new double[4];
			System.out.println("=== r's information ===");
			System.out.printf("data input (x, y, width, height) : ");
			for(int i=0; i < r1_info.length; i++) { r1_info[i]=scan.nextDouble();}
			MyRectangle2D r1= new MyRectangle2D(r1_info[0],r1_info[1],r1_info[2],r1_info[3]);
			double r1_area=r1.getArea();
			double r1_perimeter=r1.getPerimeter();
			System.out.printf("r1's area : %.2f\n",r1_area);
			System.out.printf("r1's perimeter : %.2f\n",r1_perimeter);
			
			double[] x_y= new double[2];
			System.out.println("=== r1.contains(x, y) ===");
			System.out.printf("data input (x, y) : ");
			for(int i=0; i < x_y.length; i++) { x_y[i]=scan.nextDouble();}
			System.out.printf("r1.contains(%.2f, %.2f) : ", x_y[0],x_y[1]);
			System.out.printf("%B\n\n",r1.contains(x_y[0],x_y[1]));
			
			double[] ex1_info =new double[4];
			System.out.println("=== r1.contains(MyRectangle2D r) ===");
			System.out.printf("data input (x, y, width, height) : ");
			for(int i=0; i < ex1_info.length; i++) { ex1_info[i]=scan.nextDouble();}
			System.out.printf("r1.contains(new MyRectangle2D(%.2f, %.2f, %.2f, %.2f)) : ",ex1_info[0],ex1_info[1],ex1_info[2],ex1_info[3]);
			System.out.printf("%B\n\n", r1.contains(new MyRectangle2D(ex1_info[0],ex1_info[1],ex1_info[2],ex1_info[3])));

			System.out.println("=== r1.overlaps(MyRectangle2D r) ===");
			System.out.printf("data input (x, y, width, height) : ");
			for(int i=0; i < ex1_info.length; i++) { ex1_info[i]=scan.nextDouble();}
			System.out.printf("r1.overlaps(new MyRectangle2D(%.2f, %.2f, %.2f, %.2f)) : ",ex1_info[0],ex1_info[1],ex1_info[2],ex1_info[3]);
			System.out.printf("%B\n\n", r1.overlaps(new MyRectangle2D(ex1_info[0],ex1_info[1],ex1_info[2],ex1_info[3])));
		}
	}
}

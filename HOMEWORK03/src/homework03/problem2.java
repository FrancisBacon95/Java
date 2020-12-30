package homework03;
import java.util.Scanner;
import java.util.Arrays;

public class problem2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String[] sentence= {" 1. Sample test "," 2. First my data test"," 3. Second my data test "};
		for(int k=0; k<sentence.length; k++) {
			System.out.printf("=======%s=======\n",sentence[k]);
			System.out.printf("Number of points : ");
			int num_pts;
			num_pts=scan.nextInt();
			System.out.printf("Enter %d points : ",num_pts);
			double[][] sample_input= new double[2][num_pts];
			for(int i=0;i<num_pts;i++) {
				sample_input[0][i]=scan.nextFloat();
				sample_input[1][i]=scan.nextFloat();
			}
			MyRectangle2D sample_r = getRectangle(sample_input);
			
			System.out.printf("The bounding rectangle's center (%.2f,%.2f), width %.2f, height %.2f\n\n\n", 
				sample_r.point[0],sample_r.point[1],sample_r.w_h[0],sample_r.w_h[1]);
		}
	}
	
	public static MyRectangle2D getRectangle(double[][] points) {
		Arrays.sort(points[0]);
		Arrays.sort(points[1]);
		
		double max_x = points[0][points[0].length-1];
		double max_y = points[1][points[1].length-1];
		double min_x = points[0][0];
		double min_y = points[1][0];
		
		double width  = max_x - min_x;
		double height = max_y - min_y;
		double x      = (max_x + min_x)/2;
		double y      = (max_y + min_y)/2;
		
		return new MyRectangle2D(x, y, width, height);
	}
}
package homework03;

public class MyRectangle2D {
	double[] point;
	double[] w_h;
	//No-arg Constructor
	MyRectangle2D(){
		point = new double[] {0,0};
		w_h   = new double[] {1,1};
	}
	//general Constructor
	MyRectangle2D(double x, double y, double w, double h){
		point = new double[] {x,y};
		w_h   = new double[] {w,h};
	}
	
	//Function : getArea()
	public double getArea() {
		return (w_h[0])*(w_h[1]);
	}
	
	//Function : getPerimeter()
	//Return : Perimeter of this Rectangle
	public double getPerimeter() {
		return 2*w_h[0]+2*w_h[1];
	}
	
	//Function : contains(double x, double y)
	public boolean contains(double x, double y) {
		if( x>=point[0]-(w_h[0]/2) && 
			x<=point[0]+(w_h[0]/2) &&
			y>=point[1]-(w_h[1]/2) && 
			y<= point[1]+(w_h[1]/2)) {
			return true;
		}else {
			return false;
		}
	}
	
	//Function : contains(MyRectangle2D r)
	public boolean contains(MyRectangle2D r) {
		double[][] a=this.getVertex();
		double[][] b=r.getVertex();
		if( a[0][0]<=b[0][0] && a[0][1]>=b[0][1] && 
			a[1][0]>=b[1][0] && a[1][1]>=b[1][1] && 
			a[2][0]>=b[2][0] && a[2][1]<=b[2][1] && 
			a[3][0]<=b[3][0] && a[3][1]<=b[3][1]) {
			return true;
		}else{
			return false;
		}
	}
	
	//Function : overlaps(MyRectangle2D r)
	public boolean overlaps(MyRectangle2D r) {
		double[][] b=r.getVertex();
		for(int i=0;i<4;i++) {
			if( this.contains(b[i][0], b[i][1]) ) {return true;}
		}
		return false;
	}
	
	//Function : getVertex()
	//Return : 4 Vertex of this Rectangle
	public double[][] getVertex() {
		return new double[][] { 
			{point[0]-(w_h[0]/2),point[1]+(w_h[1]/2)}, 
			{point[0]+(w_h[0]/2),point[1]+(w_h[1]/2)}, 
			{point[0]+(w_h[0]/2),point[1]-(w_h[1]/2)}, 
			{point[0]-(w_h[0]/2),point[1]-(w_h[1]/2)} 
		};
	}
}

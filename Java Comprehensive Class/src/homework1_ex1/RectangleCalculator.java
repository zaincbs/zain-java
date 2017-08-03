/**
 * 
 */
package homework1_ex1;

/**
 * @author zijaz
 *
 */
public class RectangleCalculator {

	/**
	 * 
	 */
	private double width = 0;
	private double length = 0;
	
	public RectangleCalculator(double x, double y) {
		// TODO Auto-generated constructor stub
		width = x;
		length = y;
	}

	public double area( ){
		return width*length;
	}
	
	public double  perimter( ){
		return 2*(width+length);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}

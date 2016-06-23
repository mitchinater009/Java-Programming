/**
 * 
 */

/**
 * @author EricRoberts
 *
 */
public class averageSpeed {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double kilometers = 14.0;
		double mile = kilometers / 1.6;
		
		double speed = (45.0 * 60.0 + 30.0) / (60.0 * 60.0);
		double mph = mile / speed;
		
		
		System.out.println("The runner's average speed is "+mph+" miles per hour.");

	}

}

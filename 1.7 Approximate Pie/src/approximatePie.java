/**
 * 
 */

/**
 * @author EricRoberts
 *
 */
public class approximatePie {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double i = 4*(1.0 - (1/3) + (1/5) - (1/7) + (1/9) - (1/11));
		double k = 4*(1.0 - (1/3) + (1/5) - (1/7) + (1/9) - (1/11) + (1/13));
		System.out.println(+i+" and "+k);
	}

}

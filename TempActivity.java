/**
 * 
 */
package objectDemoandtemp;

/**
 * @author colleenpalmer
 *date: 2/8/18
 */
import java.util.Scanner;
public class TempActivity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numTempF;
		int numTempC;
Scanner scnr= new Scanner(System.in);
		numTempC = scnr.nextInt();
		numTempF = ((numTempC * 9) / 5) +32;
		
		System.out.println("The temperature is " + numTempF + " degrees Farenheit.");
		System.out.println("The temperature is " + numTempC + " degrees Celcius.");
	}

}

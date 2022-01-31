package assignment;

public class AmpersandRow {
    /**
     * Exercise: Using a for loop, complete the printRowOfAmpersands() method so that it prints a row of
     * ampersands (&).  The number of ampersands it should print is passed via the int parameter, howMany.
     *
     * For example, when called by: printRowAmpersands(5);
     * The method prints: &&&&&
     *
     * @param howMany the number of ampersands to print.
     */
    public void printRowOfAmpersandsWithFor(int howMany) {
    	for (int i = 0; i < howMany; i++) {
    		System.out.print("&");
    	}
    }
    
    public void printRowOfAmpersandsWithWhile(int howMany) {
    	while (howMany > 0) {
    		System.out.print("&");
    		howMany--;
    	}
    }
}

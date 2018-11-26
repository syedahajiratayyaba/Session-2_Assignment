import java.lang.*;

public class Highest {

    	public static void main(String[] args) {
			
		int  h1 = 4, h2 = 9, h3 = 5;

        if( h1 >= h2 && h1 >= h3)								// h1 is compared with h2 and h3
            System.out.println(h1 + " is the highest number.");

        else if (h2 >= h1 && h2 >= h3)							// h2 is compared with h1 & h3
            System.out.println(h2 + " is the highest number.");

        else													// l
            System.out.println(h3 + " is the highest number.");
	
	}
}

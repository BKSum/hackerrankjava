/**
 * 
 */
package introduction;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * @author Brandon
 *
 */
public class Loops {

	/**
	 * @param args
	 */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();  
        for(int i=1; i<=10;i++){
        	System.out.println(new StringBuilder().append(N).append(" x ").append(i).append(" = ").append(N*i));
        }  
        in.close();
    }

}

package main;
import java.io.*;
import java.util.Scanner;
/**
 * <h1>Simple Calculators</h1>
 * The Calc program implements an application that
 * Simply add ,sub,mult,dibvi,modulastow given integer number and print the output on the screen.
 * 
 * @author Mamun
 *@version 1.0
 *@since 2018-10-29
 */


public class Calc {
	
	/**
	 * This method is used to addition two integers number.
	 * @param valu1 This is the first parameter of this method
	 * @param valu2 This is the second parameter of this method
	 * @return Sum of valu1 and valu2
	 */
	public int add(int valu1, int valu2){
		return valu1 + valu2;
	}
	
	/**
	 * This method is used to subtraction  two integers number.
	 * @param valu1 This is the first parameter of this method
	 * @param valu2 This is the second parameter of this method
	 * @return subtraction of valu1 and valu2
	 */
	
	public int sub(int valu1, int valu2){
		return valu1 - valu2;
	}
	
	/**
	 * This method is used to multiply two integers number.
	 * @param valu1 This is the first parameter of this method
	 * @param valu2 This is the second parameter of this method
	 * @return multiplication of valu1 and valu2
	 */
	public int mult(int valu1, int valu2){
		return valu1 * valu2;
	}
	
	/**
	 * This method is used to divide two integers number.
	 * @param valu1 This is the first parameter of this method
	 * @param valu2 This is the second parameter of this method
	 * @return division of valu1 and valu2
	 */
	public int divi(int valu1, int valu2){
		return valu1 / valu2;
	}
	
	/**
	 * This method is used to modulas two integers number.
	 * @param valu1 This is the first parameter of this method
	 * @param valu2 This is the second parameter of this method
	 * @return percentage of valu1 and valu2
	 */
	public int mudulas(int valu1, int valu2){
		return valu1 % valu2;
	}
	
	
	
	
	

	public static void main(String[] args) {
		Calc run = new Calc();
		int valu1, valu2;
		Scanner input = new Scanner(System.in);
		//valu1 = run.addNextInt();
		//valu2 = run.addNextInt();
		System.out.println(run.add(3,5));
		System.out.println(run.sub(3,5));
		System.out.println(run.mult(3,5));
		System.out.println(run.divi(8,2));
		System.out.println(run.mudulas(10,3));
	
		
		

	}

}

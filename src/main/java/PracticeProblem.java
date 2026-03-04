/**
 * File: Converting Data Types
 * Author: Mr. Kalisz
 * Date Created: Mar 4, 2026
 * Date Last Modified: Mar 4, 2026
 */

import java.util.Scanner;


public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
	}

	public static void q1() {
		Scanner input = new Scanner(System.in);
		double i;
		System.out.print("Input an integer: ");
		i = input.nextDouble();

		int d = (int)i;

		System.out.println(d+3);
	}

	public static void q2() {
		Scanner input = new Scanner(System.in);
		String w;
		System.out.print( "Input a number: ");
		w = input.nextLine();

		String x = w+"4";

		System.out.println(Double.parseDouble(x)+2);




	}

	public static void q3() {
		Scanner input = new Scanner(System.in);
		double r;
		System.out.print("Input a radius: ");
		r = input.nextDouble();

		double w = r;
		
		Double re = 3.14 * Math.pow(w, 2); 

		System.out.println(re);







	}

	public static void q4() {
		Scanner input = new Scanner(System.in);
		String a;
		System.out.print("Input a number: ");
		a = input.nextLine();

		double b = Double.parseDouble(a);

		double c = Math.floor(b * 12);

		System.out.println(c);



	}

}

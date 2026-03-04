

class Notes {
	public static void main(String[] args) {

		char c;
		int i;
		double d;
		String s;
		boolean b;

		//primitive vs non-primitive
		//lowercase - primitive - can't be broken down
		//uppercase - non-primtive - can be broken down into smaller data types

		//primtive data type conversion - typecasting

		//int -> double

		i = 5;
		d = i;

		System.out.println(i);
		System.out.println(d);

		//int -> char

		i = 76;

		System.out.println((char)i);

		//double -> char
		//double -> int -> char
		
		d = 76.5;
		System.out.println((char)i);

		//double -> int

		d = 5.5;
		i = (int)d;

		System.out.println(d);
		System.out.println(i);

		//char -> int

		c = 'a';
		System.out.println((int)c);
		
		//char -> double
		c = 'a';
		System.out.println((double)c);

		//forced conversion to String -> parsing
		//Is the string must only have compatible data inside it.
		//when parsing to an int, it must have only digits
		//when parsing to a double, it must either have only digits, or only digits and a single decimal point.


		//String -> int
		s = "159";
		System.out.println(s + 5);

		i = Integer.parseInt(s);
		System.out.println(i+5);

		//String -> double
		s = "159.555";
		System.out.println(s + 5);

		d = Double.parseDouble(s);
		System.out.println(d+5);

		s = "true";

		b = Boolean.parseBoolean(s);
		System.out.println(!b);

		//String -> char
		c = s.charAt(0);
		System.out.println(c);

		//int -> String
		i = 5;
		s = i + "";
		System.out.println(i + "");
	}
}

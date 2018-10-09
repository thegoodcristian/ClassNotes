package com.weekOne;

public class dayOne {

	public static void main(String[] args) {

		short s = 128;
		int i = 13333;
		long l = 12421531757813L;
		float f = (float) 56.7; // can use lower-case f or capital F
		double d = 56.7;
		char c = '@';
		boolean bool = true;

		// this is a constant and cannot change
		final String TEST = "hello";
		// TEST = "no way"; we can't do this

		System.out.println(9 % 5);

		s++; // post increment
		s--;

		++s; // pre-increment

		String words = "This is a sentence";
		words += " and I added some words...";
		System.out.println(words);
		
		int nums = 5;
		nums += 12;
		System.out.println(nums); // same as nums = nums + 12
		
		//implicit casting example (widening conversion)
		//java does this automatically
		int age = 35;
		double myAge = age;
		System.out.println(myAge); // prints 35.0
		
		//explicit casting example (narrowing conversion)
		//when going from a more precise datatype to less precise
		double shoppingTotal = 258.54;
		int newTotal = (int) shoppingTotal; //truncates anything past the decimal point
		System.out.println(newTotal);
		
		/*
		 * Primitive types are stored on stack, reference points are stored on heap
		 *
		 * 
		 * Order of Precedence
		 *
		 * 1.Increment and decrement 2.Positive and negative 3.Multiplication, division,
		 * and remainder 4.addition and subtraction
		 *
		 *
		 */

	}

}

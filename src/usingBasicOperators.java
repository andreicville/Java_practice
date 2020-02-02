
public class usingBasicOperators {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		System.out.println("      **********    The Arithmetic Operators:    *********");
		System.out.println("A = " + a + " and B = " + b);
		System.out.println("Sum: " + (a+b));
		System.out.println("Difference: " + (a-b));
		System.out.println("Product: " + (a*b));
		System.out.println("Result: " + (a/b));
		System.out.println("Remainder: " + (a%b));
		System.out.println("Increment: " + (a++));
		System.out.println("Decrement: " + (b--));
		
		System.out.println("      **********    The Relational Operators:    *********");
		System.out.println("A = " + a + " and B = " + b);
		
		System.out.println("Equal to, == : " + (a == b));
		System.out.println("Not Equal to, != : " + (a != b));
		System.out.println("Greater than, a > b : " + ( a > b));		
		System.out.println("Less than, a < b : " + (b--));
		System.out.println("Greater than or equal to, a >= b :" + (a >= b));
		System.out.println("Less than or equal to, a <= b :" + (a <= b));
		
		System.out.println("      **********    The Bitwise Operators:    *********");
		System.out.println("A = " + a + " and B = " + b);
		System.out.println("Bitwise and, & : " + (a & b));
		System.out.println("Bitwise or, | : " + (a | b));
		System.out.println("Bitwise XOR, ^ : " + (a ^ b));
		System.out.println("Bitwise compliment, ~A : " + (~a));
		System.out.println("Bitwise left shit, A <<2 : " + (a<<2));
		System.out.println("Bitwise right shift, A >> 2: " + (a>>2));
		System.out.println("Bitwise zero fill right shift, A >>> 2 : " + (a>>>2));
		
		System.out.println("      **********    The Logical Operators:    *********");
		Boolean c = true,d = false;
		System.out.println("C = " + c + " and D = " + d);
		System.out.println("Logical and, && : " + (c && d));
		System.out.println("Logical or, || : " + (c || d));
		System.out.println("Logical not, ! (A && B) : " + (!(c && d)));
		
		System.out.println("      **********    The Assignment Operators:    *********");
		b = 2;
		System.out.println("A = " + a + " and B = " + b);
		System.out.println("Simple assignement, A = B : " + (a=b));
		System.out.println("Add AND assignement, A += B : " + (a+=b));
		System.out.println("Subtract AND assignement, " + a + " -= " + b + " : " + (a-=b));
		System.out.println("Multiply AND assignement, " + a + " *= " + b + " : " + (a*=b));
		System.out.println("Devide AND assignement, " + a + " /= " + b + " : " + (a/=b));
		System.out.println("Modulus AND assignement, " + a + " %= " + b + " : " + (a%=b));
		System.out.println("Left Shift AND assignement, " + a + " <<= " + b + " : " + (a<<=b));
		System.out.println("Right shift AND assignement, " + a + " >>= " + b + " : " + (a>>=b));
		System.out.println("Bitwise AND assignement, " + a + " &= " + b + " : " + (a&=b));
		System.out.println("Bitwise exclusive OR assignement, " + a + " ^= " + b + " : " + (a^=b));
		System.out.println("Bitwise inmclusive OR assignement, " + a + " |= " + b + " : " + (a|=b));
		
		
		

	}

}

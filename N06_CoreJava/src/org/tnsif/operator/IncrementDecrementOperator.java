
package org.tnsif.operator;

public class IncrementDecrementOperator {

	public static void main(String[] args) {
		int x=23,y=6;
		int res1=x++ + ++y;  //23+7
		System.out.println(res1);
		System.out.println(x); //24
		System.out.println(y); //7
		System.out.println("Result2:");
		int res2=x-- + --y;
		System.out.println(res2);
		System.out.println(x); 
		System.out.println(y); 
		
	}

}

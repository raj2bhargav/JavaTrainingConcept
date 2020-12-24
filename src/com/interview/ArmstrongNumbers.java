package com.interview;

public class ArmstrongNumbers {
	
	//153 --> Armstrong Number
	//1*1*1 = 1
	//5*5*5 = 125
	//3*3*3 = 27
	//1+125+27 = 153
	//407, 0, 1 and 370 and 371
	
	
	public static void main(String[] args) {
		
		isArmStrongNumber(153);
		isArmStrongNumber(100);
		isArmStrongNumber(307);
		isArmStrongNumber(370);
		
	}
	
	public static void isArmStrongNumber(int num) {
		int cube = 0;
		int r;
		int t;
		
		t = num;
		
		while(num > 0) {
			r = num % 10;
			num = num / 10;
			
			cube = cube + (r*r*r);
		}
		
		if(t == cube) {
			System.out.println("number is armstrong number");
		}
		else {
			System.out.println("number is not armstring number");
		}
	}

}

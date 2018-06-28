package Java_3_29;

import java.util.Scanner;

public class MathRondom {
	 static Scanner s =new Scanner(System.in);
		Scanner s1=new Scanner(System.in);
	    static double num1=s.nextInt();
		  static double num2=s.nextInt();
	public static int GetEvenNum(double num1,double num2){
		
		//产生num1到num2之间的随机数
		 int s2=(int)num1+(int)(Math.random()*(num2-num1));
		if(s2%2==0){//判断随机数是否为偶数
			return s2;
		}else
			return s2+1;
	}
public static void main(String[] args) {
	System.out.println(GetEvenNum(num1, num2));
}
}

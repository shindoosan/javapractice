package com.human.ex;

public class javaclass4
{

	public static void main(String[] args) // 아무거나 쓰면 안되고 자바문법만 써야됨
	{
		//1. 사용자로부터 2개의정수를받아서첫번째정수를두번째정수로나누었을때의몫과나머지를계산하는프로그램을작성하라.
		// 입력값 10, 3
		//출력값몫은 3 나머지는 1
		
		int a=10;
		int b=3;
		System.out.print("출력값의 몫:");
		System.out.println(a/b);
		
		System.out.print("나머지 :");
		System.out.println(a%b);
					
		
		//2.사용자로부터하나의정수를받아서정수의세제곱값을계산하여출력하는프로그램을작성하라. 
		//입력값이 3이면 출력값이 3*3*3=27을출력하면된다.
		
		int c=3;
		c=c*c*c;
		System.out.println(c);
		
		//3.사용자로부터 3개의정수를받아서변수x,y,z에저장하고다음수식(x*y-z)의결과를출력하는프로그램을작성하라.
		//입력값 1,2,3	출력값 1*2-3=-1

		int x=1;
		int y=2;
		int z=3;
		System.out.println(x*y-z);
		
        //4. 세자리로이루어진숫자를입력받은후에각각의자리수를분리하고이자리수를출려가는프로그램을작성하라
		//입력값 :375 	출력값 3백 7십 5

		int g=435;
		System.out.print(g/100);
		System.out.print("백");
		System.out.print((g/10)%10);
		System.out.print("십");
		System.out.println(g%10);
		
		//5.다음수식의값을계산하여서화면에출력하라. x의값은사용자로부터입력받는다.
		//f(x)=(x3-20)/(x-7)
		//        ex)x3은 x의 3제곱으로 x를 3번곱한것과같다 x*x*x
		//입력값 : 10
		//출력값 : 326.6666 

		double xy=10;
		xy=(Math.pow(xy,3))/(xy-7);
		System.out.println(xy);
				
        //6. 2차원광간에서두점사이의거리를계산하는프로그램을작성한다.
		//입력값 :
		//첫번째점 x1,y1 :10 20
		//두번째점 x2,y2 :30 40
		//출력값
		//거리는 28.28471
	
		//a^2+b^2=c^2이니까
		// 밑변은 x2-x1 =20 , 윗변은 y2- y1 =20
		
		int xx =30-10;
		int yy =40-20;
		xx=xx*xx;
		yy=yy*yy;
		int s = xx+yy;
		System.out.println(Math.sqrt(s));
				
		int tt =2;
		int tg =10;
		
		System.out.println(Math.pow(tg,tt));
	
				
		
		
		
		
		
	}
}

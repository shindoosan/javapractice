package com.human.ex;

public class javaclass 
{

	public static void main(String[] args) // 아무거나 쓰면 안되고 자바문법만 써야됨
	{	//메인에서 사용할수 있는 문법을 배우는 과정
		//System.out.println("상수"); 상수도 데이터여서 자료형에 맞춰서 사용해야한다.
		//자료형마다 해당 상수가 있다.
		
		//boolean 상수
		System.out.println(true); // 아무거나 쓴게 아니고 boolean 상수를 사용한것임
		System.out.println(false); // 안에 true1이나 false3쓰면 에러뜸
		//System.out.println(); 많은 기능중 하나는 매개변수가 상수이면
		//상수를 화면에 그대로 출력하고 줄을 바꾼다.
		
		
		//char 문자형 상수 유니코드 1개
		//문자상수는 기본적으로 앞뒤에 ''를 사용하여 표시한다.
		//System.out.println(a); 에러. 이유는 따옴표쓰질 않음, a에 대해 약속된 바가 없다.	
		System.out.println('a');	
		
		//가 문자를 화면에 출력하려면 어떻게 해야할까요?
		System.out.println('가');
		
		/*유니코드로 출력하고 싶으면\\u 다음에 코드를 넣으면된다.*/

		System.out.println('\u0041'); // 0041 유니코드로 A
		System.out.println('\u0042'); // 0042 유니코드로 B 더알고싶으면 유니코드 표
		
		//byte, short, int 자료형은 대부분 int형. 상수처리 해당 자료형의 범위가 맞는 숫자를 넣으면 상수처리됨
		//숫자를 넣으면 상수처리됨
		//int형 상수의 경우 소수점없는 숫자를 범위에 맞게 기술하면된다.
		//-1123123~~ 12120000 등
		System.out.println(21312); // int형
		System.out.println(-21312); 
		//System.out.println(100000000000); //에러가 나는 이유는 int형상수 범위를 넘어가고 int형상수가 아니여서
		
		//long형 자료형
		//소수점이 없는 숫자 long 숫자범위를 벗어나지 않는 숫자끝에 소문자 ㅣ
		//또는 대문자 L을 붙이면된다.
		System.out.println(100000000000l); // 
		System.out.println(100000000000L); // 
		

		System.out.println(100); // 같이표기되는 같은상수지만 4바이트
		System.out.println(100l);// 이건 long형이니까 8바이트임.
		
		//실수형 float형 상수
		//소수점이 있는 수끝에 f, F를 붙여서 표시한다
		System.out.println(3.14f);
		System.out.println(3.134F);
		System.out.println(3f);
		System.out.println(3.f);
		System.out.println(.14f);
		
		//실수형 double형 상수
		//소수점이 있는 수는 double상수 , 숫자 끝에 D,d 넣으면 double상수
		System.out.println(3.333d);
		System.out.println(3.333D);
		System.out.println(.3d);
		System.out.println(3.123e-4); // E표기법 EX) e4 = *10000, 10의 4승 e-4 = 10의 -4승
		
		//string형 상수 문자열상수
		//문자열 상수는 ""로 묶어서 표현한다.
		System.out.println("he\nll\tow\"lloworld!");
		
		//1 , '1', "1" 3가지가 메모리에 올라가 있는 모양은 다르다.
		
		//상수의 연산 + *  - % 등 
		//일단 숫자는 수의 연산이 된다.
		//문자열은 + 연산만 가능하다.
		//수+문자열은 문자열이 된다.
		//수+수는 ==수 , 문자열+문자열 == 문자열
		System.out.println(5+6); // 수와 수
		System.out.println(5.2d+2.6d); // 수와 수 중에 실수
		System.out.println(9+"인생"); // 수와 문자열
		System.out.println("안녕"+"인생"); // 문자열과 문자열
		System.out.println(9+9+"인생"); // 앞에 수끼리 연산되서 18인생인 되고
		System.out.println("인생"+9+9); // 인생과 9가 먼저 연산되서 인생9라는 문자열이된다음 뒤에 수랑 연산하는
		//것이기 때문에 인생 99가 된다.
		
		



		
		
	}

}

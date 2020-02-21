package com.human.ex;

public class javaclass2
{

	public static void main(String[] args) // 아무거나 쓰면 안되고 자바문법만 써야됨
	{
		//변수
		//자료형 변수형 = 자료형의 상수;
		
		//boolean형의 변수를 생성해서 true를 찍어보자.
		boolean abc= true;
		
		//변수를 출력하는 방법
		System.out.println(abc);
		
		//변수의 bool형 false를 넣어서 찍어보자.
		boolean tt= false; // abc가 안되는 이유 : 변수명은 유일해야한다.
		System.out.println(tt); // 변수명은 식별자이고 식별자는 유일해야한다.
		
		//식별자는 되도록 알기쉽게 하고 변수명을 알수 있어야한다. 나중에 알아보자.
		
		// abc2 변수에 값을 찍어본다음 abc2값을 true로 변경한다음
		// 다시 abc2변수를 찍어보자.
		boolean abc2= true;
		System.out.println(abc2); //그냥 찍으면 에러나는데? ""없이
		abc2= false; //
		System.out.println(abc2); 
		
		//1. abc2값을 false로 변경하고
		//2. abc2값을 abc1값으로 변경한다음
		//3. abc2값을 출력해보자.
		
		abc2= false;
		abc2=abc;
		System.out.println(abc2);
				
				
				
		
		
		
		
		
	}
}

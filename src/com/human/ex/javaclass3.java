package com.human.ex;

public class javaclass3
{

	public static void main(String[] args) // 아무거나 쓰면 안되고 자바문법만 써야됨
	{
		//byte, short
		byte b1;
		b1=10;
		System.out.println(b1);
		
		short s1=11;
		System.out.println(s1);
		
		//둘다 할당해야 쓸수 있다. 할당안하면 에러남. 할당되지않은 변수는 사용할수 없다.
		
		int i1=10;
		System.out.println(i1);
		
		i1=20;
		i1=3*20+10; // 연산식이 실행된 다음에 i1에 저장된다.
		i1=10+3*20; // 계산결과 상위 계산과 비교해서 같다.
		// 우선순위를 고려해서 실행된다.
		System.out.println(i1);
		
		//1. i1의 값을 10으로 변경
		//2. 기존i1 값에 10을 추가하여 i1에 저장
		//3. i1 값을 출력
		
		i1=10;
		i1=i1+10; //i1+=10도 같은의미인데 사용하지말것. 헷갈린다고함.
		System.out.println(i1);
		
		//1.i2변수를 선언하여 10을 넣고
		//2.i2와 i1을 더한 값을 새로 선언한 i3에 넣어
		//3.i3를 출력해보자
		
		int i2=10;
		int i3=i1+i2;
		System.out.println(i3);
		System.out.println(i1+i2);
		
		long l1=10l;
		System.out.println(l1);
				
		// float a=1.4; 에러
		float a=1.4f;
		System.out.println(a);
		
		double b=3.14; // double쓸것
		System.out.println(b);
		
		String str="helloworld!"; // string에서 첫S는무조건 대문자임 아니면 오류남
		System.out.println(str);		
		
		//카페에 문제 올려드림 입력 변수에 데이터를 넣으시면됨
		//double b=3.14;
		//문제를 풀고 정답을 카페의 댓글로 제출하시오.
		
		System.out.println(Math.sqrt(9));
		
		
		
		
		

		System.out.println(023); // 0을 붙이면 8진수

		System.out.println(0x12); // 0x를 붙이면 16진수 둘다 출력은 10진수
		
		
		
		
		
	}
}

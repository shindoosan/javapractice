package com.human.ex;

public class JavaClass7 {

	public static void main(String[] args) {
		//두 수를 입력받아서 더하는 프로그램
		//스캐너 생성
		java.util.Scanner sc=new java.util.Scanner(System.in);
		//첫번째 숫자 입력 받기
		System.out.println("첫번째 수를 입력하세요.");
		String str=sc.nextLine();
		int i1=Integer.parseInt(str);
		//사용자가 입력한 숫자가 인트형 변수 i1에 들어간다.
		
		//두번째 숫자 입력받기
		System.out.println("두번째 수를 입력하세요.");
		str=sc.nextLine();
		int i2=Integer.parseInt(str);
		//사용자가 입력한 숫자가 인트형 변수 i2에 들어간다.
		
		System.out.println("입력한 두 수의 합은?"+(i1+i2)+"입니다.");
		
		
		
	}

}
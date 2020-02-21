package com.human.ex;

public class Javaclass6 {

	public static void main(String[] args) {
		//사용자 입력을 받아보자.
		//사용자가 키보드로 입력한 데이터를 프로그램에서 받아서 처리하는 것 : 사용자 입력
		//int a
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("문자열을 입력해주세요>>");
		String str1=scanner.nextLine(); //사용자 입력을 받아 문자열로 리턴해주는 함수
		System.out.println(str1+"을 입력하셨습니다.");
		
		//사용자 입력은 모두 문자열이다. 
		//숫자를 사용자로부터 받으려면 문자열을 숫자로 변경하는 함수를 사용한다.
		System.out.println("정수를 입력해 주세요>>");
		str1=scanner.nextLine();
		int i1=Integer.parseInt(str1);
		System.out.println("입력한 정수:"+i1);
		
		//문제1. 사용자에게 두 개의 수를 입력받아 더해서 출력해보자.
		String str2=scanner.nextLine();
		String str3=scanner.nextLine();
		int i2=Integer.parseInt(str2);
		int i3=Integer.parseInt(str3);
		System.out.println(i2+i3);
		
		System.out.println("프로그램종료");		
		scanner.close();
		
		
		
	}
	

}

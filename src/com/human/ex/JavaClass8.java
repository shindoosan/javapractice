package com.human.ex;

public class JavaClass8 {

	public static void main(String[] args) {
		//다음과 같이 키를 cm 단위로 입력받아 m 단위로 바꿔서 출력하는 프로그램(소수점 이하 두 자리)
		//실행결과 
		//키를 입력하세요(cm):187
		//m로 변환된 결과는 1.87m입니다.
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("키를 입력하세요(cm):");	
		String str=sc.nextLine();
		double d1=Double.parseDouble(str);
		System.out.println("m으로 변환된 결과는"+(d1/100)+"m입니다.");

		//상자의 부피를 구하는 프로그램을 작성하여 보자. 부피는 길이*너비*높이로 계산된다. 길이, 너비, 높이는 모두 double형의 실수로 입력받아 보자.
		//실행결과
		//상자의 가로, 세로, 높이를 한번에 입력:30 30 30
		//상자의 부피는 27000.000000입니다.
		System.out.print("상자의 가로,세로,높이를 한번에입력");
		java.util.Scanner s1=new java.util.Scanner(System.in);
		str=s1.next();
		double w=Double.parseDouble(str);
		double l=Double.parseDouble(str);
		double h=Double.parseDouble(str);
		str=s1.nextLine();
		System.out.println("상자의 부피는"+(w+l+h)+"입니다.");
		
		//면적의 단위인 평을 제곱미터로 환산하는 프로그램을 작성하라. 1평을 3.3m^2이다. 기호 상수를 이용하여 1평당 제곱미터를 나타내라.
		System.out.print("평을 입력하세요:");
		String s2=sc.nextLine();
		double i1=Double.parseDouble(s2);
		i1=i1+3.3;
		System.out.println(i1+"평방미터입니다.");
		
		//물리학에서 운동에너지는 E=mv^2/2.0으로 계산된다. 운동에너지(E)를 계산하는 프로그램을 작성하여 보자.
		java.util.Scanner s3=new java.util.Scanner(System.in);
		System.out.println("질량:");
		str=s3.nextLine();
		double b=Double.parseDouble(str);
		System.out.println("속도:");
		str=s3.nextLine();
		double b1=Double.parseDouble(str);
		System.out.println("운동에너지:"+b1);
		
	
		
		//다음과 같이 실행되도록 구현하시오.
		java.util.Scanner s4=new java.util.Scanner(System.in);
		System.out.println("당신의 이름은 무엇입니까?");
		String q1=s4.nextLine();
		System.out.println("당신의 나이는 몇살입니까?");
		String w1=s4.nextLine();
		int w2=Integer.parseInt(w1);
		System.out.println("당신의 키는 얼마입니까?");
		double e1=s4.nextDouble();
		System.out.println("당신의 몸무게는 얼마입니까?");
		double e2=s4.nextDouble();
		System.out.println("당신의 몸무게는"+e2+",나이는"+w1+",키는"+e1+",몸무게는"+e2+"입니다.");
		
		s4.close();
	
		
		
	}

}

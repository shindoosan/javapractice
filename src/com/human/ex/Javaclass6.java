package com.human.ex;

public class Javaclass6 {

	public static void main(String[] args) {
		//����� �Է��� �޾ƺ���.
		//����ڰ� Ű����� �Է��� �����͸� ���α׷����� �޾Ƽ� ó���ϴ� �� : ����� �Է�
		//int a
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("���ڿ��� �Է����ּ���>>");
		String str1=scanner.nextLine(); //����� �Է��� �޾� ���ڿ��� �������ִ� �Լ�
		System.out.println(str1+"�� �Է��ϼ̽��ϴ�.");
		
		//����� �Է��� ��� ���ڿ��̴�. 
		//���ڸ� ����ڷκ��� �������� ���ڿ��� ���ڷ� �����ϴ� �Լ��� ����Ѵ�.
		System.out.println("������ �Է��� �ּ���>>");
		str1=scanner.nextLine();
		int i1=Integer.parseInt(str1);
		System.out.println("�Է��� ����:"+i1);
		
		//����1. ����ڿ��� �� ���� ���� �Է¹޾� ���ؼ� ����غ���.
		String str2=scanner.nextLine();
		String str3=scanner.nextLine();
		int i2=Integer.parseInt(str2);
		int i3=Integer.parseInt(str3);
		System.out.println(i2+i3);
		
		System.out.println("���α׷�����");		
		scanner.close();
		
		
		
	}
	

}

package com.human.ex;

public class JavaClass7 {

	public static void main(String[] args) {
		//�� ���� �Է¹޾Ƽ� ���ϴ� ���α׷�
		//��ĳ�� ����
		java.util.Scanner sc=new java.util.Scanner(System.in);
		//ù��° ���� �Է� �ޱ�
		System.out.println("ù��° ���� �Է��ϼ���.");
		String str=sc.nextLine();
		int i1=Integer.parseInt(str);
		//����ڰ� �Է��� ���ڰ� ��Ʈ�� ���� i1�� ����.
		
		//�ι�° ���� �Է¹ޱ�
		System.out.println("�ι�° ���� �Է��ϼ���.");
		str=sc.nextLine();
		int i2=Integer.parseInt(str);
		//����ڰ� �Է��� ���ڰ� ��Ʈ�� ���� i2�� ����.
		
		System.out.println("�Է��� �� ���� ����?"+(i1+i2)+"�Դϴ�.");
		
		
		
	}

}
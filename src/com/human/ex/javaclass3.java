package com.human.ex;

public class javaclass3
{

	public static void main(String[] args) // �ƹ��ų� ���� �ȵǰ� �ڹٹ����� ��ߵ�
	{
		//byte, short
		byte b1;
		b1=10;
		System.out.println(b1);
		
		short s1=11;
		System.out.println(s1);
		
		//�Ѵ� �Ҵ��ؾ� ���� �ִ�. �Ҵ���ϸ� ������. �Ҵ�������� ������ ����Ҽ� ����.
		
		int i1=10;
		System.out.println(i1);
		
		i1=20;
		i1=3*20+10; // ������� ����� ������ i1�� ����ȴ�.
		i1=10+3*20; // ����� ���� ���� ���ؼ� ����.
		// �켱������ ����ؼ� ����ȴ�.
		System.out.println(i1);
		
		//1. i1�� ���� 10���� ����
		//2. ����i1 ���� 10�� �߰��Ͽ� i1�� ����
		//3. i1 ���� ���
		
		i1=10;
		i1=i1+10; //i1+=10�� �����ǹ��ε� �����������. �򰥸��ٰ���.
		System.out.println(i1);
		
		//1.i2������ �����Ͽ� 10�� �ְ�
		//2.i2�� i1�� ���� ���� ���� ������ i3�� �־�
		//3.i3�� ����غ���
		
		int i2=10;
		int i3=i1+i2;
		System.out.println(i3);
		System.out.println(i1+i2);
		
		long l1=10l;
		System.out.println(l1);
				
		// float a=1.4; ����
		float a=1.4f;
		System.out.println(a);
		
		double b=3.14; // double����
		System.out.println(b);
		
		String str="helloworld!"; // string���� ùS�¹����� �빮���� �ƴϸ� ������
		System.out.println(str);		
		
		//ī�信 ���� �÷��帲 �Է� ������ �����͸� �����ø��
		//double b=3.14;
		//������ Ǯ�� ������ ī���� ��۷� �����Ͻÿ�.
		
		System.out.println(Math.sqrt(9));
		
		
		
		
		

		System.out.println(023); // 0�� ���̸� 8����

		System.out.println(0x12); // 0x�� ���̸� 16���� �Ѵ� ����� 10����
		
		
		
		
		
	}
}

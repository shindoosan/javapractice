package com.human.ex;

public class javaclass2
{

	public static void main(String[] args) // �ƹ��ų� ���� �ȵǰ� �ڹٹ����� ��ߵ�
	{
		//����
		//�ڷ��� ������ = �ڷ����� ���;
		
		//boolean���� ������ �����ؼ� true�� ����.
		boolean abc= true;
		
		//������ ����ϴ� ���
		System.out.println(abc);
		
		//������ bool�� false�� �־ ����.
		boolean tt= false; // abc�� �ȵǴ� ���� : �������� �����ؾ��Ѵ�.
		System.out.println(tt); // �������� �ĺ����̰� �ĺ��ڴ� �����ؾ��Ѵ�.
		
		//�ĺ��ڴ� �ǵ��� �˱⽱�� �ϰ� �������� �˼� �־���Ѵ�. ���߿� �˾ƺ���.
		
		// abc2 ������ ���� ������ abc2���� true�� �����Ѵ���
		// �ٽ� abc2������ ����.
		boolean abc2= true;
		System.out.println(abc2); //�׳� ������ �������µ�? ""����
		abc2= false; //
		System.out.println(abc2); 
		
		//1. abc2���� false�� �����ϰ�
		//2. abc2���� abc1������ �����Ѵ���
		//3. abc2���� ����غ���.
		
		abc2= false;
		abc2=abc;
		System.out.println(abc2);
				
				
				
		
		
		
		
		
	}
}

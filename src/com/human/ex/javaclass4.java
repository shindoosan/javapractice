package com.human.ex;

public class javaclass4
{

	public static void main(String[] args) // �ƹ��ų� ���� �ȵǰ� �ڹٹ����� ��ߵ�
	{
		//1. ����ڷκ��� 2�����������޾Ƽ�ù��°�������ι�°�����γ����������Ǹ��������������ϴ����α׷����ۼ��϶�.
		// �Է°� 10, 3
		//��°����� 3 �������� 1
		
		int a=10;
		int b=3;
		System.out.print("��°��� ��:");
		System.out.println(a/b);
		
		System.out.print("������ :");
		System.out.println(a%b);
					
		
		//2.����ڷκ����ϳ����������޾Ƽ������Ǽ�������������Ͽ�����ϴ����α׷����ۼ��϶�. 
		//�Է°��� 3�̸� ��°��� 3*3*3=27������ϸ�ȴ�.
		
		int c=3;
		c=c*c*c;
		System.out.println(c);
		
		//3.����ڷκ��� 3�����������޾Ƽ�����x,y,z�������ϰ��������(x*y-z)�ǰ��������ϴ����α׷����ۼ��϶�.
		//�Է°� 1,2,3	��°� 1*2-3=-1

		int x=1;
		int y=2;
		int z=3;
		System.out.println(x*y-z);
		
        //4. ���ڸ����̷�������ڸ��Է¹����Ŀ��������ڸ������и��ϰ����ڸ���������������α׷����ۼ��϶�
		//�Է°� :375 	��°� 3�� 7�� 5

		int g=435;
		System.out.print(g/100);
		System.out.print("��");
		System.out.print((g/10)%10);
		System.out.print("��");
		System.out.println(g%10);
		
		//5.���������ǰ�������Ͽ���ȭ�鿡����϶�. x�ǰ�������ڷκ����Է¹޴´�.
		//f(x)=(x3-20)/(x-7)
		//        ex)x3�� x�� 3�������� x�� 3�����ѰͰ����� x*x*x
		//�Է°� : 10
		//��°� : 326.6666 

		double xy=10;
		xy=(Math.pow(xy,3))/(xy-7);
		System.out.println(xy);
				
        //6. 2���������������������ǰŸ�������ϴ����α׷����ۼ��Ѵ�.
		//�Է°� :
		//ù��°�� x1,y1 :10 20
		//�ι�°�� x2,y2 :30 40
		//��°�
		//�Ÿ��� 28.28471
	
		//a^2+b^2=c^2�̴ϱ�
		// �غ��� x2-x1 =20 , ������ y2- y1 =20
		
		int xx =30-10;
		int yy =40-20;
		xx=xx*xx;
		yy=yy*yy;
		int s = xx+yy;
		System.out.println(Math.sqrt(s));
				
		int tt =2;
		int tg =10;
		
		System.out.println(Math.pow(tg,tt));
	
				
		
		
		
		
		
	}
}

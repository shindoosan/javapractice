package com.human.ex;

public class JavaClass8 {

	public static void main(String[] args) {
		//������ ���� Ű�� cm ������ �Է¹޾� m ������ �ٲ㼭 ����ϴ� ���α׷�(�Ҽ��� ���� �� �ڸ�)
		//������ 
		//Ű�� �Է��ϼ���(cm):187
		//m�� ��ȯ�� ����� 1.87m�Դϴ�.
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Ű�� �Է��ϼ���(cm):");	
		String str=sc.nextLine();
		double d1=Double.parseDouble(str);
		System.out.println("m���� ��ȯ�� �����"+(d1/100)+"m�Դϴ�.");

		//������ ���Ǹ� ���ϴ� ���α׷��� �ۼ��Ͽ� ����. ���Ǵ� ����*�ʺ�*���̷� ���ȴ�. ����, �ʺ�, ���̴� ��� double���� �Ǽ��� �Է¹޾� ����.
		//������
		//������ ����, ����, ���̸� �ѹ��� �Է�:30 30 30
		//������ ���Ǵ� 27000.000000�Դϴ�.
		System.out.print("������ ����,����,���̸� �ѹ����Է�");
		java.util.Scanner s1=new java.util.Scanner(System.in);
		str=s1.next();
		double w=Double.parseDouble(str);
		double l=Double.parseDouble(str);
		double h=Double.parseDouble(str);
		str=s1.nextLine();
		System.out.println("������ ���Ǵ�"+(w+l+h)+"�Դϴ�.");
		
		//������ ������ ���� �������ͷ� ȯ���ϴ� ���α׷��� �ۼ��϶�. 1���� 3.3m^2�̴�. ��ȣ ����� �̿��Ͽ� 1��� �������͸� ��Ÿ����.
		System.out.print("���� �Է��ϼ���:");
		String s2=sc.nextLine();
		double i1=Double.parseDouble(s2);
		i1=i1+3.3;
		System.out.println(i1+"�������Դϴ�.");
		
		//�����п��� ��������� E=mv^2/2.0���� ���ȴ�. �������(E)�� ����ϴ� ���α׷��� �ۼ��Ͽ� ����.
		java.util.Scanner s3=new java.util.Scanner(System.in);
		System.out.println("����:");
		str=s3.nextLine();
		double b=Double.parseDouble(str);
		System.out.println("�ӵ�:");
		str=s3.nextLine();
		double b1=Double.parseDouble(str);
		System.out.println("�������:"+b1);
		
	
		
		//������ ���� ����ǵ��� �����Ͻÿ�.
		java.util.Scanner s4=new java.util.Scanner(System.in);
		System.out.println("����� �̸��� �����Դϱ�?");
		String q1=s4.nextLine();
		System.out.println("����� ���̴� ����Դϱ�?");
		String w1=s4.nextLine();
		int w2=Integer.parseInt(w1);
		System.out.println("����� Ű�� ���Դϱ�?");
		double e1=s4.nextDouble();
		System.out.println("����� �����Դ� ���Դϱ�?");
		double e2=s4.nextDouble();
		System.out.println("����� �����Դ�"+e2+",���̴�"+w1+",Ű��"+e1+",�����Դ�"+e2+"�Դϴ�.");
		
		s4.close();
	
		
		
	}

}

package com.human.ex;

public class javaclass 
{

	public static void main(String[] args) // �ƹ��ų� ���� �ȵǰ� �ڹٹ����� ��ߵ�
	{	//���ο��� ����Ҽ� �ִ� ������ ���� ����
		//System.out.println("���"); ����� �����Ϳ��� �ڷ����� ���缭 ����ؾ��Ѵ�.
		//�ڷ������� �ش� ����� �ִ�.
		
		//boolean ���
		System.out.println(true); // �ƹ��ų� ���� �ƴϰ� boolean ����� ����Ѱ���
		System.out.println(false); // �ȿ� true1�̳� false3���� ������
		//System.out.println(); ���� ����� �ϳ��� �Ű������� ����̸�
		//����� ȭ�鿡 �״�� ����ϰ� ���� �ٲ۴�.
		
		
		//char ������ ��� �����ڵ� 1��
		//���ڻ���� �⺻������ �յڿ� ''�� ����Ͽ� ǥ���Ѵ�.
		//System.out.println(a); ����. ������ ����ǥ���� ����, a�� ���� ��ӵ� �ٰ� ����.	
		System.out.println('a');	
		
		//�� ���ڸ� ȭ�鿡 ����Ϸ��� ��� �ؾ��ұ��?
		System.out.println('��');
		
		/*�����ڵ�� ����ϰ� ������\\u ������ �ڵ带 ������ȴ�.*/

		System.out.println('\u0041'); // 0041 �����ڵ�� A
		System.out.println('\u0042'); // 0042 �����ڵ�� B ���˰������ �����ڵ� ǥ
		
		//byte, short, int �ڷ����� ��κ� int��. ���ó�� �ش� �ڷ����� ������ �´� ���ڸ� ������ ���ó����
		//���ڸ� ������ ���ó����
		//int�� ����� ��� �Ҽ������� ���ڸ� ������ �°� ����ϸ�ȴ�.
		//-1123123~~ 12120000 ��
		System.out.println(21312); // int��
		System.out.println(-21312); 
		//System.out.println(100000000000); //������ ���� ������ int����� ������ �Ѿ�� int������� �ƴϿ���
		
		//long�� �ڷ���
		//�Ҽ����� ���� ���� long ���ڹ����� ����� �ʴ� ���ڳ��� �ҹ��� ��
		//�Ǵ� �빮�� L�� ���̸�ȴ�.
		System.out.println(100000000000l); // 
		System.out.println(100000000000L); // 
		

		System.out.println(100); // ����ǥ��Ǵ� ����������� 4����Ʈ
		System.out.println(100l);// �̰� long���̴ϱ� 8����Ʈ��.
		
		//�Ǽ��� float�� ���
		//�Ҽ����� �ִ� ������ f, F�� �ٿ��� ǥ���Ѵ�
		System.out.println(3.14f);
		System.out.println(3.134F);
		System.out.println(3f);
		System.out.println(3.f);
		System.out.println(.14f);
		
		//�Ǽ��� double�� ���
		//�Ҽ����� �ִ� ���� double��� , ���� ���� D,d ������ double���
		System.out.println(3.333d);
		System.out.println(3.333D);
		System.out.println(.3d);
		System.out.println(3.123e-4); // Eǥ��� EX) e4 = *10000, 10�� 4�� e-4 = 10�� -4��
		
		//string�� ��� ���ڿ����
		//���ڿ� ����� ""�� ��� ǥ���Ѵ�.
		System.out.println("he\nll\tow\"lloworld!");
		
		//1 , '1', "1" 3������ �޸𸮿� �ö� �ִ� ����� �ٸ���.
		
		//����� ���� + *  - % �� 
		//�ϴ� ���ڴ� ���� ������ �ȴ�.
		//���ڿ��� + ���길 �����ϴ�.
		//��+���ڿ��� ���ڿ��� �ȴ�.
		//��+���� ==�� , ���ڿ�+���ڿ� == ���ڿ�
		System.out.println(5+6); // ���� ��
		System.out.println(5.2d+2.6d); // ���� �� �߿� �Ǽ�
		System.out.println(9+"�λ�"); // ���� ���ڿ�
		System.out.println("�ȳ�"+"�λ�"); // ���ڿ��� ���ڿ�
		System.out.println(9+9+"�λ�"); // �տ� ������ ����Ǽ� 18�λ��� �ǰ�
		System.out.println("�λ�"+9+9); // �λ��� 9�� ���� ����Ǽ� �λ�9��� ���ڿ��̵ȴ��� �ڿ� ���� �����ϴ�
		//���̱� ������ �λ� 99�� �ȴ�.
		
		



		
		
	}

}

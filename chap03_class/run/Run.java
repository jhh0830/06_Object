package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Coffee;
// default ���� ������ Ŭ������
//   �ٸ� ��Ű���� ������ ��� �����ٰ� �� �� ����
//   ��, ���� ��Ű���� ������ ��� ��� ����

public class Run {

	public static void main(String[] args) {

		// Coffee ��� Ŭ����
		// == ���� ���� Ŭ����(Ŀ�� ������ ���� �뵵)
		// == Ŀ�Ǹ�(String), ����(int), �ɼ�(char), ������(char)
		// �ѹ��� String, int, char, char�� �� ���� �� �ִ�
		// "�迭����" �ڷ���
		// > Ŭ���� == ����� ���� �ڷ���
		
		
		// Coffee Ŭ������ �̿��ؼ� ��ü ����
		// Ŭ������ ��ü�� = new Ŭ������();
		// �ڷ��� ������ = ��;
		// > Ŭ���� == �����ڷ���, ��ü == �����ڷ�������
		
		
		
		Coffee c = new Coffee();
		// null, 0, '', '' ���� �ʱ�ȭ�� ���¿����� ����
		// > heap ������ ������� �� ��� jvm �� �⺻������ �ʱ�ȭ
		System.out.println(c.information());
		// �� �ֱ�
		// cf.coffeeName = "�Ƹ޸�ī��"
		// > ĸ��ȭ�� �߱� ������ ���� ���ٺҰ� (is not visible)
		// setter �޼ҵ带 ���� ���������� ���� ����
		c.setCoffeeName("�Ƹ޸�ī��");
		c.setPrice(2000);
		c.setOption('h');
		c.setSize('s');
		
		// �ٽ� �ѹ� ���
		System.out.println(c.information());
		// ��ü ���� == �ν��Ͻ�ȭ
		// ��ü == �ν��Ͻ�
		Coffee c2 = new Coffee();
		
		// ���ֱ�
		c2.setCoffeeName("��");
		c2.setPrice(3000);
		c2.setOption('c');
		c2.setSize('M');
		
		
		// ���
		System.out.println(c2.information());
		
		System.out.println("-----");
		System.out.println(c);
		System.out.println(c2);
		// > �ؽ��ڵ� ���
		
		Coffee c3 = c;
		// > "�Ƹ޸�ī��", 2000, 'h', 's';
		System.out.println(c3.information());
		System.out.println(c);
		System.out.println(c3);
		// > ���� ����
		
		c3.setCoffeeName("�ݵ���");
		c3.setOption('C');
		
		System.out.println(c3.information());
		System.out.println(c.information()); // �Ƹ޸�ī��..?
		// > ���� ���簡 �Ǿ��� ������ ���� ����Ǿ���!! (�ݵ���)
	}

}

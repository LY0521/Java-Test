package com.neuedu;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println(a);
		System.out.println(b);
		
		//����һ��0��1000�����������λ���ĺͣ�����345�Ľ����3+4+5��12
		//ע���ֽ����ּȿ����ȳ���ģҲ������ģ���
		int c = 345;
		int g = c%10;
		int s = c/10%10;
		int b1 = c/100;
		
		
		//�����¶Ⱥ������¶Ȼ���ת�����ӻ��϶ȱ�����϶���ֻҪ��ȥ32������5�ٳ���9�����ˣ�
		//�����϶�ת�ɻ��϶ȣ�ֱ�ӳ���9������5���ټ���32����
		double sheshi=35.5;
		double huashi = sheshi*9/5+32;
		System.out.println(huashi);
		double sheshi1 = (huashi -32)*5/9;
		System.out.println(sheshi1);
		
		//����һ������Ĵ�д��ĸA~Z��ת��ΪСд��ĸ��
		char daxie = 'A';
		char xiaoxie = (char)(daxie+32);
		System.out.println(xiaoxie);
		
	}

}

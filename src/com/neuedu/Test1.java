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
		
		//给定一个0～1000的整数，求各位数的和，例如345的结果是3+4+5＝12
		//注：分解数字既可以先除后模也可以先模后除
		int c = 345;
		int g = c%10;
		int s = c/10%10;
		int b1 = c/100;
		
		
		//华氏温度和摄氏温度互相转换，从华氏度变成摄氏度你只要减去32，乘以5再除以9就行了，
		//将摄氏度转成华氏度，直接乘以9，除以5，再加上32即行
		double sheshi=35.5;
		double huashi = sheshi*9/5+32;
		System.out.println(huashi);
		double sheshi1 = (huashi -32)*5/9;
		System.out.println(sheshi1);
		
		//给定一个任意的大写字母A~Z，转换为小写字母。
		char daxie = 'A';
		char xiaoxie = (char)(daxie+32);
		System.out.println(xiaoxie);
		
	}

}

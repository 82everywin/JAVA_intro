package oopEx;

import java.util.Arrays;

public class StaticEx3 {

	//static int[] in = {(int)(Math.random()*5),(int)(Math.random()*5)};
	
	int[] in = {(int)(Math.random()*5),(int)(Math.random()*5)};
	
	public static void main(String[] args) {
		
		StaticEx3 ex3 = new StaticEx3();
		System.out.println(Arrays.toString(ex3.in));
		
		StaticEx3 ex4 = new StaticEx3();
		System.out.println(Arrays.toString(ex4.in));
		
		
		// java Helloworld --> java.exe HelloWorld.class �����ض�..--> Ŭ�����δ��ѳ��� HelloWorld.class ã�´�.--> ������ �� Ŭ������
		// �޸𸮿� �ε���Ų��. --> ����ƽ �ʱ�ȭ --> ���α׷�����(main�޼��� ȣ��)--> ��ü ����... 
		
		// ���𸣰ڴٸ�..�׷� static �� ������?? --> Ŭ������.. �׸��� static �޼��峪 �ʵ�� ��ü���� ȣ�Ⱑ���ϴ�. 
		// �� static �� ��ü..
	}

}

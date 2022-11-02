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
		
		
		// java Helloworld --> java.exe HelloWorld.class 실행해라..--> 클래스로더한놈이 HelloWorld.class 찾는다.--> 있으면 이 클래스를
		// 메모리에 로딩시킨다. --> 스테틱 초기화 --> 프로그램실행(main메서드 호출)--> 객체 생성... 
		
		// 정모르겠다면..그럼 static 은 누구꺼?? --> 클래스꺼.. 그말은 static 메서드나 필드는 객체없이 호출가능하다. 
		// 선 static 후 객체..
	}

}

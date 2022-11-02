package oopEx;
/*
 * 이 클래스에서는 static 과 final 이라는 개념을 배울겁니다.
 * 
 * static은 자바에서 정적 이라는 개념으로 통용됩니다. 정적의 반대는 동적 --> 객체는 전부 동적입니다. 
 * 
 */
public class StaticExam {
	
	int a;
	static int b;
	
	//초기화 블럭
	static{ //STATIC 클래스이기 때문에 먼저 호출, 초기화됨--0으로 자동으로 초기화됨.   
		System.out.println(" b의 값 : "+ b);
	}
	
	// static 메서드
	static void a() {
		
	}
	
	static void b() {
		
	}
	
	
	// PIE 값을 리턴하는 메서드 정의 합니다. -> static 정적임.클래스것..
	public static double getPI() {
		return Math.PI; 
	}
	// static : 정적 요소는 클래스가 로드된 직후 초기화 되기때문에 소유권이 클래스에 있다라고 한다. 
	// 해서 정적 요소라 한다. 
	public static void main(String[] args) {
		//static(정적개념) -> non-static(동적개념) 접근 못함 
		//doSome();
		System.out.println("main 호출됨..");
		
		// 객체 생성 객체것... 
		// 클래스.non-static메서드 --> 객체 생성 (new)을 한 후, 메서드를 접근해야 함. 
		new StaticExam().doSome(); 
		
		// 반지름이 2인 구체의 체적구하기...
		double res = 2* 2 * getPI();
	}
	
	// PIE를 리턴하는 객체 메서드 정의
	 public double getPieInst() {
		 return getPI();
	 }
	 
	 
	 // non -static(doSome)메서드를 호출하려면 그 메서드도 non-static(doSome2)이어야함.
	 void doSome2() {
		 	doSome();
	 }
	 // non-static method define
	 // 객체것...즉.. non-static 메서드는 반드시 non-static 에서만 호출 가능하다.
	 void doSome() {
	 }
	 
}

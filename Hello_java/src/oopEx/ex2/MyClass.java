package oopEx.ex2;

//외부 패키지의 클래스(외부 API)를 가져올 때는 import를 사용..
import oopEx.*; // 이 패키지의 모든 API을 import한단 의미 

public class MyClass extends YourClass {

	public MyClass() { //생성자를 통해서 super() 불러옴 ...상속이니까
		super();	
	}
	// YourClass yoo; // 객체 참조 // yourclass는 oopEx 패키지에 있으므로
	// public 없으면 같은 패키지 내에서 접근 가능
	// public이 있어야 다른 패키지에서도 접근이 가능함
	
	// doSome 오버라이딩 ..모든 것이 똑같고 바디만 변경
	protected void doSome() {
		System.out.println("상속받음 ");
	}
	
	public static void main(String[] args) {
		 new MyClass().doSome();
	}
}

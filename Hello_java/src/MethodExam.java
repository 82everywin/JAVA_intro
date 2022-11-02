
public class MethodExam { // class body

	public static void main(String[] args) { // method body
		/*
		 * 자바의 메서드(method) : 메서드란 클래스가 객체화 되어 수행될 때 특정 기능을 정의한것을 말합니다. 자세한 내용은 객체지향 시간에 다시 배웁니다. 
		 * 메서드는 특징을 가지고 있는데, {키워드} {static(option 이라는 뜻)} returnType(R or P or void)
		 *  methodName({Parameter}){//메서드 body}
		 *  
		 *  static 메서드에서 호출할 수 있는 메서드는 static 뿐이다. 꼭 기억하세요!!!
		 *  
		 */
		a(); // a 메서드 call(호출함)
		boolean result = b();		// b()를 호출해서 결과값은 담겠다는 것. 
		boolean result2 = c();
		
		// 논리 연산자 &, | 예제..
		if(result & result2) { //false
			System.out.println("b()의 리턴값은 true 입니다.");
		}
		if(result | result2) { // true
			System.out.println("c()의 리턴값은 false입니다. ");
		}
		
		if(result) { // true
			System.out.println("b() 의 리턴값은 true 입니다. ");
		}
		/*
		if(!result2) {
			System.out.println(result2);
		}
		*/
	}
	
	static boolean b() {
		System.out.println("b() 입니다.");
		return true;
	}
	
	static boolean c() {
		System.out.println("c() 입니다.");
		return false;
	}
	
	/* void : returnType
	 * a : methodName
	 * () : ({Parameter})
	 * {} : 메서드 body
	 */
	static void a() { // 메서드를 정의(Define) 했다라고 합니다.
		//main() 를 제외한 나머지 메서드는 호출(call) 되기 전엔 실행이 되질 않습니다. 
		System.out.println("이건 a 메서드의 실행문입니다.");
	}
}

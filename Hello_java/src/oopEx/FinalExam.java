package oopEx;

/*
 * 자바의 final 키워드 : final은 불변하다는 의미의 키워드 입니다. 
 * 사용될 수 있는 곳은 클래스 옆, 필드옆, 메서드옆, 메서드파라미터옆, 메서드 지역내...
 * 즉 거의 모든 군데에 사용 가능합니다.
 * 
 * 클래스에 사용될 경우엔 상속 불가로 선언한다는 뜻 입니다. 만약 final 클래스를 상속시엔 컴파일 에러가 뜹니다. 
 * abstract와 반대
 * 메서드 파라미터에 쓰이는 경우엔 파라미터 값 변경 금지
 * 메서드 내부에 쓰이는 경우엔 값 변경 금지
 * 필드에 쓰이는 경우도 값 변경 금지.. 
 */

/*
 * static final : 자바의 상수 개념... 
 * 
 * 상수 : 상수랑 항상 일정한 값을 갖는 수의 형태입니다. 
 * 반대의 개념으론 변수가 있겠네요.
 * 
 * 상수는 static final 을 조합으로 해서 선언하며, 반드시 선언과 동시에 초기화 되어야 합니다. 당연히 상수기 때문이죠. 
 * 상수는 위의 특징때문에 변수명을 모두 대문자로 표현하는 특징을 가지고 있습니다. 스타크래프트의 인터페이스 연상하세요. 
 * 
 */

class A{
	// public 없으면 같은 패키지 내에서 접근 가능
	
	YourClass yoo;
	
	public static final int ALL_REGIEON_UNITS_LIMIT = 200;
	
	
	void doSome(final int b) {
		// 메서드를 호출할 떄 (3)으로만 고정되어야 할 때 위처럼 final을 넣어준다. 
		// b=100;
	}
}
class Terra{
	int unitCnt;
	public Terra( ) {
		
	}
}
class Zerg{
	int unitCnt;
	public Zerg() {
		if(unitCnt <= A.ALL_REGIEON_UNITS_LIMIT) {
			//유닛생성.. 
		}
		else {
			System.out.println("유닛은 200을 초과할 수 없습니다. ");
		}
	}
}
class Protoss{
	int unitCnt;
	
	public Protoss() {
		
	}
}


public class FinalExam extends A {
	
	void doSome(){//기본 생성자 호출
		
	}
	
	public static void main(String[] args) {
		new A().doSome(3); // doSome은 non-static이므로 new로 객체 생성후 해줌. main==static에서는..
		
	}
}

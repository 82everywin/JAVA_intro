package oopEx;
/*
 * interface는 기능을 상속해주는데 주목적이었고, 또한 다중 상속을 하는데도 목적이 있다. 
 * interface는 클래스가 아니기 때문에 생성자를 가질 수 없고, 그렇기 떄문에 자신의 interface를
 * 생성할 수 없다. 하지만 상속을 받은 자식 클래스의 Ref type으로는 존재 가능하다(다형성 기억하세요)
 * interface 내에는 메서드와 필드 두개만을 선언할 수 있는데, 아래와 같은 규칙이 적용된다.
 * 1. 모든 메서드 public abstract 키워드를 컴파일시에 적용된다.(넣건 말건 상관없음)
 * 2. 모든 필드는 무조건 상수(constant)로 선언이 되어야 한다. 
 * 2.1 자바에서 상수는 public static final로 선언한다.(상수란 변경 불가의 변수임. 변수와 반대 개념)
 * 2.2 따라서 모든 필드는 컴파일시에 자동으로 위 키워드가 적용된다(넣건 말건 상관없음)
 */
public interface Attackable {
	//메서드 선언
	//정의가 아님 why..{}로 묶인 바디가 없기 때문에
	public abstract void attack(String target);
}

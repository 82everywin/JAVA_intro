/*
 * 자바변수 : 모든 프로그램이 그렇듯 자바도 변수를 사용해서 테이터를 가공, 연산, 저장, 출력을 합니다.
 * 자바의 변수 크게 두가지로 나뉘는데, 객체변수(Reference), 지역변수(Local variable)로 나뉩니다. 
 * 이중 객체변수는 나중에 배울건데, 기본 규칙은 지역 변수와 다르지 않습니다. (차이점은 나중에 배움) 
 * 
 * 규칙
 * 1. 지역 변수는 보통 메서드(Method) 내에서 선언(Declaration)된 변수를 뜻합니다.
 * 2. 지역 변수는 값을 대입(Assign) 하기 전엔 값이 없습니다. 이 변수를 출력문에 넣으면 에러가 유발됩니다. 
 * 3. 변수를 처음 선언할 떈 반드시 변수에 담길 값과 같은 타입이거나 큰 타입으로 선언해야 합니다. 
 * 4. 지역 변수를 중복선언 하게 되면 Duplicated 에러가 발생합니다. 
 * 5. 변수는 선언, 대입, 초기화(Initialized) 등을 이용해서 사용합니다. 
 * 
 */
public class JavaVariableExam {

	public static void main(String[] args) {
		
		
		byte b,c,d; // 변수 선언.
		b=1; // 변수에 값 대입(Assign)
		c=2;
		d=3;
		
		byte e = b; // 변수 초기화 
		
		short s = 10000; 
		
		short s2= e; // 작은 타입의 Data 를 큰 타입에 대입한다. 문제없음...
		
		b = (byte) s2; // type 캐스팅.. 
		byte b2 = (byte)s; //다운 캐스팅 
		System.out.println("Sssss-->>"+ b2 );
		
		//s = b + c:  // P 타입끼리의 연산은 연산 전에 두 타입을 Default Type으로 복사 후 타입으로 연산이 되기 때문에 
		// 위 식은 컴파일 에러임. 
		// 단!!!!! Default 타입(int)보다 큰타입(정수타입은 long, 그리고 실수)를 만나면 무조건 큰 타입이나, 실수로 복사 및 연산된다. 
		int i = b + c;
		
	
		
		
		System.out.println("int 의 가장 큰 값 "+ Integer.MAX_VALUE);
		System.out.println("int 의 가장 작은 값"+ Integer.MIN_VALUE);	
		System.out.println(i);
		/*
		 * Typing casting 연산 : 로직상 같은 타입의 큰값(큰타입 --> 이건 객체)의 값을 작은 타입에 대입해야 할 경우가 있는데 (객체도 포함됨), 
		 * 이떄 사용되는 연산이 캐스팅 연산이다. 이 연산자는(type)을 사용하여 구현하는데, 기본적으로 사칙연산보다 우선순위가 빠르다(꼭 기억!!!) 
		 * 또 이 연산자는 영향을 미치는 항이 우측에 있는 값 하나에만 적용이 된다는 것 또한 꼭 기억해야함. 
		 * 만약 수치 데이터에서 이 연산을 사용할 경우, 경우에 따라서는 비트가 삭제되기 떄문에 값이 변하게 된다. 
		 */
		long lo = 1L; // long 타입은 뒤에 'L' 붙여주기
		
		i = i + (int) lo;
		
		System.out.println(10 + 10); // Literal Data : 코드 내에 변수가 아닌 값으로만 연산이 될 때 자바에서 해당 값의 형태를  
		// 확인 후 기본 데이터 타입을 생성 후 연산을 하는 데이터들.. 
		
		// 실수 데이터 타입.. Default type은 double(8byte)입니다. 
		// 실수 타입은 메모리 크기와 상관없이 무조건 정수타입보다 크게 취급됩니다. 
		
		// float 초기화..
		float f= 1.1F; // float을 초기화할 경우엔 값 끝에 f or F을 넣어야 합니다. 
		
		// long에 float 대입
		lo = (long) f;
		System.out.println(lo);
		
		double db = 3.14f;
		
	}
}

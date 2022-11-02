import java.util.Arrays;

/*
 * 자바의 배열 : 먼저 배열은 객체이다. 즉 Rtype (Reference type)이라는 뜻입니다. 
 * 때문에 우리가 배웠던 Ptype 의 변수를 사용하는 형태와는 틀립니다. 
 * 배열은 수학적 언어에서 파생되었기 떄문에 대부분 이름에서부터 어려워 하는데 절대 그렇지 않습니다.
 * 편히 보세요.
 * 
 */
public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.out.println("안녕하세요!"+args[0]+"님");
		// 배열 생성식.. 
		
		int[] arr1; // arr1을 int 값들을 담는 배열 변수로 선언함..
		// 배열의 특징은 아래처럼 배열의 크기만 지정을 해도 각 타입의 기본값으로 초기화 되어집니다.
		// 정수 타입 0, 실수 타입 0.0, 객체(Rtype)null, boolean false
		
		arr1 = new int[10];// 10개의 length 를 가진 배열을 생성합니다. // 마지막 index는 length-1입니다. 
		
		double arr2[]=new double[5];
		
		// 위의 두 배열 아파트의 메모리주소(Hashcode)를 출력해볼까요.. 
		System.out.println(arr1);
		System.out.println(arr2);
		
		// 배열의 호수 표시
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		
		// 배열의 속성을 호출하여 length 확인하기.. 
		System.out.println(arr1.length);
		System.out.println(arr1.length-1);
		
		// 값 넣기..
		arr1[0]=1;
		System.out.println(arr1[0]);
		
		// 배열의 값으로 뭐가 있는지 문자열로 출력하는 방법.. 
		System.out.println(Arrays.toString(arr1));
		
		// 배열이 초기화.
		char[] ch1= {'a','b','c'};
		char[] ch2 = new char[] {'d','e','f'};
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		// for을 이용한 배열값 접근
	
		for (int i = 0; i < ch1.length; i++) {
			System.out.println(ch1[i]);
			
		}
		
		// 이문장 반드시 기억하기~~!!
		/*
		 * 앞으로 제가 객체는 무엇과 무엇을 가지고 있죠? 라고 물어보면 자동으로 속성과 메소드요. 라고 답해주세요. 
		 * 이중 배열객체만 속성만을 가지고 있습니다. 
		 */
		
		
		// new// JVM에게 객체를 만들라는 키워드입니다. 어떤 객체를 만들지는 new 다음에 배열타입표식을 넣습니다.
	}

}

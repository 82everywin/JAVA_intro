import java.io.IOException;

public class CharDataTypeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 키보드의 첫 문자하나만 입력 받는 코드를 정의합니다. (참고로 한글 아닌 영문자나, 숫자등만 쓰세요) 
		System.out.print("문자 하나 입력 하세요 : ");
		// 입력받은 값을 int로 대입합니다. 
		/*
		 * try {
			int data = System.in.read();
			System.out.println("입력한 문자는 : "+ (char)data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		// 문자 데이터 char --> 하나의 문자만 표현하는 데이터 타입입니다. ''를 이용해서 문자값을 대입하거나 정수를 대입해도 됩니다.
		char faName = '노';
		System.out.println("faName은 " + faName);
		System.out.println("문자를 숫자로 --> "+(int)faName );
		faName = 45432;
		System.out.println("16진수로 바꾸기--> "+ Integer.toHexString(45432));
		faName = '\ub178'; //유니코드
		System.out.println("---> "+faName);
		
		// char 2byte, 정수값이고 , 정수와 호환하려 할 떄는 int로 호환된다. 
		
		char upperA = 'A';  // 아스키 65
		
		// 타입캐스팅 : int -> char로 타입캐스팅 
		char aa =(char)( upperA + 1); // int > char 이므로 upperA가 int로 바뀜  //66='B' 
		System.out.println("초기화시 char로 타입캐스팅---> " + aa); // 타입캐스팅을 통해 char로 대입받아서 출력. 
		
		// 변수초기화 : upperA + 1 은 int이므로 변수 초기화를 할 때 int로 설정 (int결과값을 그대로 받음) 
		int aa1 = upperA + 1;
		System.out.println("int로 변수초기화---> "+ aa1); 
		System.out.println("int로 변수초기화후 char로 타입캐스팅 ---> "+(char)aa1); // int를 결과를 받아 char로 타입캐스팅후 출력.
		
		// 논리형 타입인 boolean.. 
		// 조건문에서 실행문을 분기할 떄 사용합니다. 메모리는 신경안써도 됩니다. 
		boolean  firAxle = false; // 거짓값
		boolean thirdAxle = true; // 참값
		}

}

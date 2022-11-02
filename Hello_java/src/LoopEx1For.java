/* 
 * 자바의 반복문  : 로직상 실행을 반복적으로 해야할 경우 사용합니다. 
 * 종류로는 for, while, do{}while(); 이 있으며,
 * for가 가장 많이 쓰입니다.
 * 참고로 알아도 그만 몰라도 그만인 정보 하나 드리자면, for는 보통 반복해야할 범위를 알고 있을 떄 주로 사용되며 
 * while은 무한정 반복하다 특정 조건이 만족되면 탈출(break)할 떄 사용됩니다. 
 * do{}while();은 조건과 상관없이 무조건 한번은 실행 해야하는 경우에 사용됩니다.(DB연결등..)
 */
public class LoopEx1For {

	public static void main(String[] args) {
		// 무한루프 for 구문.. 알아만 두세요..쓸일 없음..
		// for(;;);
		
		for(int i=0,j=10;i<10;i++,j--) {
			System.out.println(i);
			System.out.println(j);
		}
		
		
		// 1~10까지의 누적합을 구해봅니다.
		int result =0;
		for(int i=1;i<=10;i++) {
			result+=i;
		}
		System.out.println("1~10까지의 누적합은 "+ result + "입니다.");
		
		//구구단 만들기 
		/*
		 *  3 * 1 = 3
		 *  ...
		 *  3 * 9 = 27 
		 */
		
		int total =0;  // 곱결과를 담는 변수 
		int dan =3;
		System.out.println("=="+dan+"단 시작 ==");
		for(int i=1;i<=9;i++) {
			total=dan*i;
			System.out.println(""+dan+" * "+ i+" = "+ total);
		}
		
		//루프문에서 조건에 따라서 제어 하는 방법을 알아봅니다.
		//break; --> 이 구문을 만나면 가장 가까운 loop의 블락 밖으로 탈출합니다.
		//continue; --> 이건 이  이후에 있는 실행 구문은 건너띄고 조건식으로 되돌아 가라는 명령어 입니다.
		//위의 두 키워드는 필수적으로 조건문과 같이 구현되어야 합니다. 
		
		
		int dan2=5;
		int res= 0;
		
		for (int i = 1; i <=9; i++) {
			//if(i>6) // 6곱의 결과까지만 보고 싶을 때..
				//break;
			res=dan2*i;
			if(res%2 != 0)
				continue;
			System.out.println(dan2 + " * "+ i + " = " + res);
		}
		
		
	}

}

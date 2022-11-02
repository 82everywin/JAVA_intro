
public class ForEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 다중 FOR 구문 : for 내부에 for을 구현하는 로직...
		 * 2중 정도만 거의 사용하고 3중은 잘 사용하지 않습니다..
		 * 다중 for 에서는 내부의 변수의 Scope(존재범위)와 실행문의 위치(Inner or Outer)를 잘 파악하는게 중요합니다. 
		 */
		for (int i = 0; i < 10; i++) {//Inner for 시작
			for (int j = 0; j < 10; j++) {// Outer for 시작
				//	i=0; j=0~9 10번 루프 
			
			}//Inner for End.. 
		} // Outer for End..
		
		// 구구단 만들기 
		Outer : for (int i = 2; i < 10; i++) { // 단 for 시작  // Outer Label for 선언..
			System.out.println("==="+ i+"단 시작 ===");
			
			if(i%2==0)
				//break;
				//continue;
			Inner : for (int j = 1; j < 10; j++) { // 단 피연산 시작 // Inner Label for 선언..
				int res = i*j;
				if(res%2!=0)
					// break;
					// continue;
				System.out.println(i+"×"+j+"="+res);
			}
					System.out.println("===="+i+"단 끝 ===");
		}// 단 for 끝..
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

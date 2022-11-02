
public class Fruit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 여러분이 과수원을 한다고 가정합니다. 
		 * 재배 종목은 사과, 오렌지, 키위 입니다. 
		 * 
		 * 각 과실별 하루 생산량은 9,5,3 입니다. 
		 * 
		 * 퀴즈 : 위 과수원의 하루 총 생산량과 시간당 생산량을 출력시키세요.
		 * 총 생산량은 정수이고, 시간당 생산량은 실수여야 합니다. 
		 * 반드시 한번의 casting 연산과, 리터럴 데이터를 사용하세요. 
		 * 
		 * 만약 변수에 대해서 자신이 없으신 분은 변수 없이 연산만 해도 됩니다. 
		 * 아니신 분들은 최대한 변수를 활용하도록 하세요.
		 */
		
		int apple, orange, kiwi; 
		apple = 9;
		orange = 5;
		kiwi = 3;
		
		int total=apple+orange+kiwi;
		System.out.println("총 생산량 : " + total);
		
		float avg =(float)total/24;  
		System.out.println("시간당 생산량 : " + avg);
		
	}

}

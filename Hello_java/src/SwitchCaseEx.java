
public class SwitchCaseEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// if(ch > 'A'){
//	}
		int a = 2;
		switch(a) { // 정수(int)이하만 들어올 수 있음... 문자열 안됨... 
		case 0 : 
			System.out.println("값은 0 입니다. ");
			break;
			
		case 1: 
			System.out.println("값은 1 입니다. ");
			break;
		case 2:
			System.out.println("값은 2 입니다. ");
			break;
		default:
			System.out.println("값은 3이거나 이상입니다. ");
		}
		
		double avg= 10.0; // 평점이라고 치고..
		char grade;
		// 평점 9이상은 무조건 학점이 A라는 switch case
		
		switch ((int)avg) {
		case 10:
		case 9:
			grade='A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7: 
			grade ='C';
			break;
		default:
			grade = 'F';
			break;
		}
		System.out.println("당신의 학점은  "+ grade + " 입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

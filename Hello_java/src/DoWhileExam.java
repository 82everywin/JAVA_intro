import javax.swing.JOptionPane;

/*
 * do{실행블럭}while(조건식);--> 반드시 ; 들어가야 합니다. 
 */
public class DoWhileExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		do {
			a--;
			if (a == 98)
				break;
			System.out.println("do의 실행문///");
		} while (a > 0);

		System.out.println("이건 main() 실행문..");

		// do while 을 이용해서 아래처럼 로직을 작성하세요.
		/*
		 * 1. 프로그램 시작 --> 국어점수 입력하세요 : (팝업) --> 입력 받은 점수가 0 ~100 사이라면 점수 출력후 프로그램 종료
		 * 출력시키고 끝내세요. 
		 * 2. 만약 틀린 점수인 경우 '점수가 틀렸습니다.' 팝업 출력후 재입력 받도록 하세요.
		 * 3. 다음은 영어, 수학 점수를 입력받으시고, 조건은 위와 같아요.. 만약 틀린 점수면 '점수 입력하세요'라고 반복 나와야 합니다. 
		 * 4. 모두 올바른 점수가 입력되면, 총점, 평균, 평점(0.0~10.0), 학점을 출력하세요.
		 * 5. 학점의 기준은 9점 이상은 A++, 8점 이상은 A, 7점 이상은 B,나머진 F로 출력시키세요.
		 */
		
		boolean isCor = true;
		int kor,eng,math,total=0; // 한 라인에 , 를 구분으로 나열할 경우 같은 타입 선언임.. 그리고 마지막에 total만 0으로 초기화 
		int fCount = 0; // 틀린값을 담는 변수
		do {
			if (fCount != 0) { // fCount 점수 틀렸을 경우 증가시킵니다.
				JOptionPane.showMessageDialog(null, "국어 점수가 올바르지 않습니다.\n 재입력하세요.");
			}
			kor = Integer.parseInt(JOptionPane.showInputDialog("국어점수를 입력하세요(0~100)"));
			if (kor >= 0 && kor <= 100) { // 올바른지 검증 if...
				System.out.println("국어점수는" + kor + "입니다.");
				total += kor;
				fCount=0; // 기존에 틀린 점수를 많이 입력시 이 변수는 0보다 높은 값으로 되어집니다. 
				// 따라서 올바른 값일 경우 다음 과목을 위해 0으로 초기화 해줍니다. 
				break;
				// isCor = false;
			}
			// 이 코드가 실행이 된다는 의미는 위에서 break가 안되었다는 말.. 따라서 fCount를 증가시킨다.
			fCount++;
		} while (isCor);

		do { // 영어 점수 do~while
			eng = Integer.parseInt(JOptionPane.showInputDialog("영어점수를 입력하세요(0~100)"));
			if(eng<0 || eng >100) {
				JOptionPane.showMessageDialog(null,"영어 점수가 올바르지 않습니다.\n 재입력하세요.");
				continue;
			}
			System.out.println("영어 점수는 "+eng +"입니다.");
			total += eng;
			break;
		}while(isCor);
		
		do { // 수학 점수 do~while
			math = Integer.parseInt(JOptionPane.showInputDialog("수학점수를 입력하세요(0~100)"));
			if(math<0 || math >100) {
				JOptionPane.showMessageDialog(null,"점수가 올바르지 않습니다.\n 재입력하세요.");
				continue;
			}
			System.out.println("수학 점수는 "+math +"입니다.");
			total += math;
			break;
		}while(isCor);

		// 학점 구하기 .. 학점은 평균을 10으로 나눠서 int로 변환하면 됩니다. 
		double avg = total/3.0;
		char grade;
		
		switch((int)(avg/10)) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		default :
			grade ='F';
		}
		
		System.out.println("총점은 "+ total+"입니다");
		System.out.println("평균은"+avg + "입니다. ");
		System.out.println("평점은"+(avg/10.0) + "입니다. ");
		// 소수점 한자리로 출력하는 구문  -> printf 인걸 기억! 
		System.out.printf("평균(소수점 한자리) : %.1f",avg);
		System.out.println("학점은"+ grade + "입니다.");
		
		// switch+~case break; 나올 수 있지만,
		// if, elseif break 쓰지 않음. 
	}
}

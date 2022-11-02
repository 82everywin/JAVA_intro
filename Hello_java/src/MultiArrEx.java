import javax.swing.JOptionPane;

public class MultiArrEx {

	public static void main(String[] args) {

		//다중배열 : 배열내부에 다시 배열을 정의하는 것.. 필요에 따라서 무한대로 생성할 수 있지만, 그렇게 만든 넘은 나중에 욕먹습니다. 
		// 해서 2중 배열 이상은 잘 쓰질 않으니 참고하세요.
		
		int[] xi[]=new int[3][4]; //Grid --> 격자// 앞의 3은 Row 뒤의 4sms Column을 생각하세요. 3*4 총 12개의 가구수가 생성됨.
		
		// xi 아파트에 몇동이 존재하는지 확인..
		System.out.println(xi.length);
		// 0번째 동에는 몇가구가 존재하는지 확인 => 0~3번째 동 모두 4개의 가구가 나올 것. 3행 4열 --> 1행당(1개의 동당) 4개의 열 (4가구수)
		System.out.println(xi[0].length);
		
		//값을 주고 초기화 하는 문법..
		int[][] xi2 = {{1,2,3,4},{5,6,7,8}};// {}하나가 ROW 즉, 동이 된다. {}에 값을 주면 각 가구가 생성되면서 값이 할당됨 
		//int[][] xi2 = new int[][] {{1,2,3,4},{5,6,7,8}}; // 참고로만 알아두세요.
		System.out.println(xi2.length);
		
		for (int i = 0; i < xi2.length; i++) {
			// 여기서부터 i는 동번호를 나타내는 변수로 활용된다. 
			for (int j = 0; j < xi2[i].length; j++) {
				System.out.println("xi2 아파트의 "+i+ "(index)동의 호수는"+xi2[i][j]+"입니다. ");
			}
		}
		
		
		/*
		 * 응용문제 한번 해보기...
		 * 
		 * 1. 싱글 배열을 이용해서 한명의 학생의 국영수 점수를 입력 받아 총점,평균, 학점을 출력해보세요. 
		 * 조건은 각 과목의 점수는 100점 이하여야하고, 틀린 점수의 과목에서 루프를 반복합니다. 
		 * 
		 * 2. 다중 배열을 이용해서 3명의 점수를 출력해봅니다. 과목 수는 위와 동일하고, 조건도 같습니다. 
		 * 위의 문제가 해결되면 지금의 문제는 훨씬 수월할 것입니다. 
		 * 
		 */
		
		// 1번. 단일의 학생 
		String[] subject = {"국어", "수학", "영어"};
		int[] score = new int[subject.length+1];
		double avg;
		char grade;
		
		for (int i = 0; i < subject.length; i++) {
			
		do {
			score[i]=Integer.parseInt(JOptionPane.showInputDialog(subject[i]+"점수 입력 : "));
			if(score[i]>=0 && score[i]<=100)
			{
				score[subject.length]+=score[i];
				System.out.println(subject[i]+"점수 :"+ score[i]);
				break;
			}
			JOptionPane.showMessageDialog(null,subject[i]+"점수 오류\n 재입력하세요.");
		}while(score[i]>100 || score[i]<0);
		
		}
		avg=score[subject.length]/3.0;
		
		
		// 2번. 3명의 학생
		//-> File. MultiArrExQ2 파일에 존재 
		
		
		
		
		
		
		
		
	}

}

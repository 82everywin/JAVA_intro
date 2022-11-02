import javax.swing.JOptionPane;

public class MultiArrExQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] info = {"국어", "수학", "영어"};
		int[][] scores = new int[3][info.length+1]; // 다중배열  : int[학생][과목+1(총점을 계산하기 위함)]
		double avg;
		char grade;
		
		for (int i = 0; i < 3; i++) { // 학생 Outer 
			System.out.println("==학생"+ (i+1) + "점수==");
			for (int j = 0; j < info.length; j++) {// 과목 Inner
				do {
					scores[i][j]=Integer.parseInt(JOptionPane.showInputDialog(info[j]+"점수 입력 : "));
					if(scores[i][j]>=0 && scores[i][j]<=100)
					{
						scores[i][info.length]+=scores[i][j];
						System.out.println(info[j]+"점수 : "+scores[i][j]);
						break;
					}
					JOptionPane.showMessageDialog(null,info[j]+"점수 오류\n 재입력하세요.");
				}while(scores[i][j]>100 || scores[i][j]<0);
			}
			avg = scores[i][info.length]/3.0;
			switch((int)(avg/10)) {
			case 10:
			case 9:
				grade ='A';
				break;
			case 8:
				grade = 'B';
				break;
			default:
				grade = 'F';
				break;
					
			}
			System.out.println("총점은 : "+ scores[i][info.length]);
			System.out.println("평균은 : "+ avg);
			System.out.println("학점은 : "+ grade);
		}

	}

	
}

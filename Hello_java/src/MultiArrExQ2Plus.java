import javax.swing.JOptionPane;

public class MultiArrExQ2Plus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] info ={ {"학생1","학생2","학생3"},{"국어", "수학", "영어"}};
		int[][] scores = new int[info[0].length][info[1].length+1]; // 다중배열  : int[학생][과목+1(총점을 계산하기 위함)]
		double avg;
		char grade;
		
		for (int i = 0; i < 1; i++) { // info의 과목를 표현하기 위해 생성. 즉 index =1 만을 나타내기 위함 
			for (int j = 0; j < info[0].length; j++) {  // 
				System.out.println("== "+info[i][j]+"점수 =="); // 과목 
				for (int k = 0; k < info[1].length; k++) {
					do {
						scores[j][k]=Integer.parseInt(JOptionPane.showInputDialog(info[i+1][k]+"점수 입력 : "));
						if(scores[j][k]>=0 && scores[j][k]<=100) {
							scores[j][info[1].length]+=scores[j][k];
							System.out.println(info[i][j]+"의 "+ info[i+1][k]+"점수 : "+ scores[j][k]);
							break;
						}
						JOptionPane.showMessageDialog(null, "점수 오류 \n 재입력하세요");
					}while(scores[j][k]>100 || scores[j][k]<0);
				}
			avg = scores[j][info[1].length]/3.0;
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
			System.out.println("총점은 : "+ scores[j][info[1].length]);
			System.out.println("평균은 : "+ avg);
			System.out.println("학점은 : "+ grade);
			}
		}

	}

	
}

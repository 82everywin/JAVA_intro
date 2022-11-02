import javax.swing.JOptionPane;

public class ScoreEx2 {

	public static void main(String[] args) {
		// 과목명을 담는 문자열 배열 생성합니다. 
		String[] subject = {"국어","영어","수학"};
		// 점수를 담을 배열을 생성합니다. 
		int[] scores=new int[subject.length+1];
		double avg;
		
//		do {
//			//System.out.println(subject[0]+ "점수 입력:");
//			scores[0]=Integer.parseInt(JOptionPane.showInputDialog(subject[0]+"점수 입력 :"));
//			//총점 (마지막 index)에 점수 대입 
//			scores[subject.length] += scores[0];
//			System.out.println(scores[0]);
//		}while(scores[0]>100 || scores[0]<0);
		
		// for로 do~while 묶기 이용 --> 전체로 바꾸어서 점수 입력해보는 것이ㅣㅈ !! 
		for (int i = 0; i < subject.length; i++) {
			do {
				scores[i]=Integer.parseInt(JOptionPane.showInputDialog(subject[i]+"점수 입력 :"));
				if(scores[i]<100 && scores[i]>0)
				{	
				scores[subject.length]+=scores[i];
				System.out.println(subject[i]+"점수 :"+ scores[i]);
				break;
				}
		}while(scores[i]>100 || scores[i]<0);
		}
		System.out.println("총점 : " + scores[subject.length]);
	}

}

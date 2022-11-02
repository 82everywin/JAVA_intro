import javax.swing.JOptionPane;

public class WhileExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		//조건식이나, 논리값이 들어갑니다. 
//		int a=3;
//		while(a>0){
//			System.out.println("while의 실행문..");
//			a--;
//		}
		//JOptionPane.showMessageDialog(null, "헬로우월드"); //메세지 출력 팝업 API
		
		boolean isCorrect = false;
		
		while(!isCorrect) {
			String score = JOptionPane.showInputDialog("점수를 입력하세요(0~100)"); // Text 입력 팝업 API
			int s =	Integer.parseInt(score); // 문자열로 되어진 정수를 int로 parsing 한다.
			if(s>100 || s<0) {				
				JOptionPane.showMessageDialog(null, "올바르지 않은 점수입니다.\n재입력하세요."); //메세지 출력 팝업 API
				continue;
			}
			
			System.out.println("당신의 점수는"+s+" 점입니다.");
			//break;
			isCorrect=true;
		}
	}
}

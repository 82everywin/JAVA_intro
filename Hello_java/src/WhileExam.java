import javax.swing.JOptionPane;

public class WhileExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		//���ǽ��̳�, ������ ���ϴ�. 
//		int a=3;
//		while(a>0){
//			System.out.println("while�� ���๮..");
//			a--;
//		}
		//JOptionPane.showMessageDialog(null, "��ο����"); //�޼��� ��� �˾� API
		
		boolean isCorrect = false;
		
		while(!isCorrect) {
			String score = JOptionPane.showInputDialog("������ �Է��ϼ���(0~100)"); // Text �Է� �˾� API
			int s =	Integer.parseInt(score); // ���ڿ��� �Ǿ��� ������ int�� parsing �Ѵ�.
			if(s>100 || s<0) {				
				JOptionPane.showMessageDialog(null, "�ùٸ��� ���� �����Դϴ�.\n���Է��ϼ���."); //�޼��� ��� �˾� API
				continue;
			}
			
			System.out.println("����� ������"+s+" ���Դϴ�.");
			//break;
			isCorrect=true;
		}
	}
}

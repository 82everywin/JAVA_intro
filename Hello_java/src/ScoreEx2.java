import javax.swing.JOptionPane;

public class ScoreEx2 {

	public static void main(String[] args) {
		// ������� ��� ���ڿ� �迭 �����մϴ�. 
		String[] subject = {"����","����","����"};
		// ������ ���� �迭�� �����մϴ�. 
		int[] scores=new int[subject.length+1];
		double avg;
		
//		do {
//			//System.out.println(subject[0]+ "���� �Է�:");
//			scores[0]=Integer.parseInt(JOptionPane.showInputDialog(subject[0]+"���� �Է� :"));
//			//���� (������ index)�� ���� ���� 
//			scores[subject.length] += scores[0];
//			System.out.println(scores[0]);
//		}while(scores[0]>100 || scores[0]<0);
		
		// for�� do~while ���� �̿� --> ��ü�� �ٲپ ���� �Է��غ��� ���̤Ӥ� !! 
		for (int i = 0; i < subject.length; i++) {
			do {
				scores[i]=Integer.parseInt(JOptionPane.showInputDialog(subject[i]+"���� �Է� :"));
				if(scores[i]<100 && scores[i]>0)
				{	
				scores[subject.length]+=scores[i];
				System.out.println(subject[i]+"���� :"+ scores[i]);
				break;
				}
		}while(scores[i]>100 || scores[i]<0);
		}
		System.out.println("���� : " + scores[subject.length]);
	}

}

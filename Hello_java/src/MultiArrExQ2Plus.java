import javax.swing.JOptionPane;

public class MultiArrExQ2Plus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] info ={ {"�л�1","�л�2","�л�3"},{"����", "����", "����"}};
		int[][] scores = new int[info[0].length][info[1].length+1]; // ���߹迭  : int[�л�][����+1(������ ����ϱ� ����)]
		double avg;
		char grade;
		
		for (int i = 0; i < 1; i++) { // info�� ���� ǥ���ϱ� ���� ����. �� index =1 ���� ��Ÿ���� ���� 
			for (int j = 0; j < info[0].length; j++) {  // 
				System.out.println("== "+info[i][j]+"���� =="); // ���� 
				for (int k = 0; k < info[1].length; k++) {
					do {
						scores[j][k]=Integer.parseInt(JOptionPane.showInputDialog(info[i+1][k]+"���� �Է� : "));
						if(scores[j][k]>=0 && scores[j][k]<=100) {
							scores[j][info[1].length]+=scores[j][k];
							System.out.println(info[i][j]+"�� "+ info[i+1][k]+"���� : "+ scores[j][k]);
							break;
						}
						JOptionPane.showMessageDialog(null, "���� ���� \n ���Է��ϼ���");
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
			System.out.println("������ : "+ scores[j][info[1].length]);
			System.out.println("����� : "+ avg);
			System.out.println("������ : "+ grade);
			}
		}

	}

	
}

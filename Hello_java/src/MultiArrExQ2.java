import javax.swing.JOptionPane;

public class MultiArrExQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] info = {"����", "����", "����"};
		int[][] scores = new int[3][info.length+1]; // ���߹迭  : int[�л�][����+1(������ ����ϱ� ����)]
		double avg;
		char grade;
		
		for (int i = 0; i < 3; i++) { // �л� Outer 
			System.out.println("==�л�"+ (i+1) + "����==");
			for (int j = 0; j < info.length; j++) {// ���� Inner
				do {
					scores[i][j]=Integer.parseInt(JOptionPane.showInputDialog(info[j]+"���� �Է� : "));
					if(scores[i][j]>=0 && scores[i][j]<=100)
					{
						scores[i][info.length]+=scores[i][j];
						System.out.println(info[j]+"���� : "+scores[i][j]);
						break;
					}
					JOptionPane.showMessageDialog(null,info[j]+"���� ����\n ���Է��ϼ���.");
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
			System.out.println("������ : "+ scores[i][info.length]);
			System.out.println("����� : "+ avg);
			System.out.println("������ : "+ grade);
		}

	}

	
}

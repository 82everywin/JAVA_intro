import javax.swing.JOptionPane;

public class MultiArrEx {

	public static void main(String[] args) {

		//���߹迭 : �迭���ο� �ٽ� �迭�� �����ϴ� ��.. �ʿ信 ���� ���Ѵ�� ������ �� ������, �׷��� ���� ���� ���߿� ��Խ��ϴ�. 
		// �ؼ� 2�� �迭 �̻��� �� ���� ������ �����ϼ���.
		
		int[] xi[]=new int[3][4]; //Grid --> ����// ���� 3�� Row ���� 4sms Column�� �����ϼ���. 3*4 �� 12���� �������� ������.
		
		// xi ����Ʈ�� ��� �����ϴ��� Ȯ��..
		System.out.println(xi.length);
		// 0��° ������ ����� �����ϴ��� Ȯ�� => 0~3��° �� ��� 4���� ������ ���� ��. 3�� 4�� --> 1���(1���� ����) 4���� �� (4������)
		System.out.println(xi[0].length);
		
		//���� �ְ� �ʱ�ȭ �ϴ� ����..
		int[][] xi2 = {{1,2,3,4},{5,6,7,8}};// {}�ϳ��� ROW ��, ���� �ȴ�. {}�� ���� �ָ� �� ������ �����Ǹ鼭 ���� �Ҵ�� 
		//int[][] xi2 = new int[][] {{1,2,3,4},{5,6,7,8}}; // ����θ� �˾Ƶμ���.
		System.out.println(xi2.length);
		
		for (int i = 0; i < xi2.length; i++) {
			// ���⼭���� i�� ����ȣ�� ��Ÿ���� ������ Ȱ��ȴ�. 
			for (int j = 0; j < xi2[i].length; j++) {
				System.out.println("xi2 ����Ʈ�� "+i+ "(index)���� ȣ����"+xi2[i][j]+"�Դϴ�. ");
			}
		}
		
		
		/*
		 * ���빮�� �ѹ� �غ���...
		 * 
		 * 1. �̱� �迭�� �̿��ؼ� �Ѹ��� �л��� ������ ������ �Է� �޾� ����,���, ������ ����غ�����. 
		 * ������ �� ������ ������ 100�� ���Ͽ����ϰ�, Ʋ�� ������ ���񿡼� ������ �ݺ��մϴ�. 
		 * 
		 * 2. ���� �迭�� �̿��ؼ� 3���� ������ ����غ��ϴ�. ���� ���� ���� �����ϰ�, ���ǵ� �����ϴ�. 
		 * ���� ������ �ذ�Ǹ� ������ ������ �ξ� ������ ���Դϴ�. 
		 * 
		 */
		
		// 1��. ������ �л� 
		String[] subject = {"����", "����", "����"};
		int[] score = new int[subject.length+1];
		double avg;
		char grade;
		
		for (int i = 0; i < subject.length; i++) {
			
		do {
			score[i]=Integer.parseInt(JOptionPane.showInputDialog(subject[i]+"���� �Է� : "));
			if(score[i]>=0 && score[i]<=100)
			{
				score[subject.length]+=score[i];
				System.out.println(subject[i]+"���� :"+ score[i]);
				break;
			}
			JOptionPane.showMessageDialog(null,subject[i]+"���� ����\n ���Է��ϼ���.");
		}while(score[i]>100 || score[i]<0);
		
		}
		avg=score[subject.length]/3.0;
		
		
		// 2��. 3���� �л�
		//-> File. MultiArrExQ2 ���Ͽ� ���� 
		
		
		
		
		
		
		
		
	}

}

import javax.swing.JOptionPane;

/*
 * do{�����}while(���ǽ�);--> �ݵ�� ; ���� �մϴ�. 
 */
public class DoWhileExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		do {
			a--;
			if (a == 98)
				break;
			System.out.println("do�� ���๮///");
		} while (a > 0);

		System.out.println("�̰� main() ���๮..");

		// do while �� �̿��ؼ� �Ʒ�ó�� ������ �ۼ��ϼ���.
		/*
		 * 1. ���α׷� ���� --> �������� �Է��ϼ��� : (�˾�) --> �Է� ���� ������ 0 ~100 ���̶�� ���� ����� ���α׷� ����
		 * ��½�Ű�� ��������. 
		 * 2. ���� Ʋ�� ������ ��� '������ Ʋ�Ƚ��ϴ�.' �˾� ����� ���Է� �޵��� �ϼ���.
		 * 3. ������ ����, ���� ������ �Է¹����ð�, ������ ���� ���ƿ�.. ���� Ʋ�� ������ '���� �Է��ϼ���'��� �ݺ� ���;� �մϴ�. 
		 * 4. ��� �ùٸ� ������ �ԷµǸ�, ����, ���, ����(0.0~10.0), ������ ����ϼ���.
		 * 5. ������ ������ 9�� �̻��� A++, 8�� �̻��� A, 7�� �̻��� B,������ F�� ��½�Ű����.
		 */
		
		boolean isCor = true;
		int kor,eng,math,total=0; // �� ���ο� , �� �������� ������ ��� ���� Ÿ�� ������.. �׸��� �������� total�� 0���� �ʱ�ȭ 
		int fCount = 0; // Ʋ������ ��� ����
		do {
			if (fCount != 0) { // fCount ���� Ʋ���� ��� ������ŵ�ϴ�.
				JOptionPane.showMessageDialog(null, "���� ������ �ùٸ��� �ʽ��ϴ�.\n ���Է��ϼ���.");
			}
			kor = Integer.parseInt(JOptionPane.showInputDialog("���������� �Է��ϼ���(0~100)"));
			if (kor >= 0 && kor <= 100) { // �ùٸ��� ���� if...
				System.out.println("����������" + kor + "�Դϴ�.");
				total += kor;
				fCount=0; // ������ Ʋ�� ������ ���� �Է½� �� ������ 0���� ���� ������ �Ǿ����ϴ�. 
				// ���� �ùٸ� ���� ��� ���� ������ ���� 0���� �ʱ�ȭ ���ݴϴ�. 
				break;
				// isCor = false;
			}
			// �� �ڵ尡 ������ �ȴٴ� �ǹ̴� ������ break�� �ȵǾ��ٴ� ��.. ���� fCount�� ������Ų��.
			fCount++;
		} while (isCor);

		do { // ���� ���� do~while
			eng = Integer.parseInt(JOptionPane.showInputDialog("���������� �Է��ϼ���(0~100)"));
			if(eng<0 || eng >100) {
				JOptionPane.showMessageDialog(null,"���� ������ �ùٸ��� �ʽ��ϴ�.\n ���Է��ϼ���.");
				continue;
			}
			System.out.println("���� ������ "+eng +"�Դϴ�.");
			total += eng;
			break;
		}while(isCor);
		
		do { // ���� ���� do~while
			math = Integer.parseInt(JOptionPane.showInputDialog("���������� �Է��ϼ���(0~100)"));
			if(math<0 || math >100) {
				JOptionPane.showMessageDialog(null,"������ �ùٸ��� �ʽ��ϴ�.\n ���Է��ϼ���.");
				continue;
			}
			System.out.println("���� ������ "+math +"�Դϴ�.");
			total += math;
			break;
		}while(isCor);

		// ���� ���ϱ� .. ������ ����� 10���� ������ int�� ��ȯ�ϸ� �˴ϴ�. 
		double avg = total/3.0;
		char grade;
		
		switch((int)(avg/10)) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		default :
			grade ='F';
		}
		
		System.out.println("������ "+ total+"�Դϴ�");
		System.out.println("�����"+avg + "�Դϴ�. ");
		System.out.println("������"+(avg/10.0) + "�Դϴ�. ");
		// �Ҽ��� ���ڸ��� ����ϴ� ����  -> printf �ΰ� ���! 
		System.out.printf("���(�Ҽ��� ���ڸ�) : %.1f",avg);
		System.out.println("������"+ grade + "�Դϴ�.");
		
		// switch+~case break; ���� �� ������,
		// if, elseif break ���� ����. 
	}
}


public class SwitchCaseEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// if(ch > 'A'){
//	}
		int a = 2;
		switch(a) { // ����(int)���ϸ� ���� �� ����... ���ڿ� �ȵ�... 
		case 0 : 
			System.out.println("���� 0 �Դϴ�. ");
			break;
			
		case 1: 
			System.out.println("���� 1 �Դϴ�. ");
			break;
		case 2:
			System.out.println("���� 2 �Դϴ�. ");
			break;
		default:
			System.out.println("���� 3�̰ų� �̻��Դϴ�. ");
		}
		
		double avg= 10.0; // �����̶�� ġ��..
		char grade;
		// ���� 9�̻��� ������ ������ A��� switch case
		
		switch ((int)avg) {
		case 10:
		case 9:
			grade='A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7: 
			grade ='C';
			break;
		default:
			grade = 'F';
			break;
		}
		System.out.println("����� ������  "+ grade + " �Դϴ�.");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

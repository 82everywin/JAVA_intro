import java.io.IOException;

public class CharDataTypeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ű������ ù �����ϳ��� �Է� �޴� �ڵ带 �����մϴ�. (����� �ѱ� �ƴ� �����ڳ�, ���ڵ ������) 
		System.out.print("���� �ϳ� �Է� �ϼ��� : ");
		// �Է¹��� ���� int�� �����մϴ�. 
		/*
		 * try {
			int data = System.in.read();
			System.out.println("�Է��� ���ڴ� : "+ (char)data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		// ���� ������ char --> �ϳ��� ���ڸ� ǥ���ϴ� ������ Ÿ���Դϴ�. ''�� �̿��ؼ� ���ڰ��� �����ϰų� ������ �����ص� �˴ϴ�.
		char faName = '��';
		System.out.println("faName�� " + faName);
		System.out.println("���ڸ� ���ڷ� --> "+(int)faName );
		faName = 45432;
		System.out.println("16������ �ٲٱ�--> "+ Integer.toHexString(45432));
		faName = '\ub178'; //�����ڵ�
		System.out.println("---> "+faName);
		
		// char 2byte, �������̰� , ������ ȣȯ�Ϸ� �� ���� int�� ȣȯ�ȴ�. 
		
		char upperA = 'A';  // �ƽ�Ű 65
		
		// Ÿ��ĳ���� : int -> char�� Ÿ��ĳ���� 
		char aa =(char)( upperA + 1); // int > char �̹Ƿ� upperA�� int�� �ٲ�  //66='B' 
		System.out.println("�ʱ�ȭ�� char�� Ÿ��ĳ����---> " + aa); // Ÿ��ĳ������ ���� char�� ���Թ޾Ƽ� ���. 
		
		// �����ʱ�ȭ : upperA + 1 �� int�̹Ƿ� ���� �ʱ�ȭ�� �� �� int�� ���� (int������� �״�� ����) 
		int aa1 = upperA + 1;
		System.out.println("int�� �����ʱ�ȭ---> "+ aa1); 
		System.out.println("int�� �����ʱ�ȭ�� char�� Ÿ��ĳ���� ---> "+(char)aa1); // int�� ����� �޾� char�� Ÿ��ĳ������ ���.
		
		// ���� Ÿ���� boolean.. 
		// ���ǹ����� ���๮�� �б��� �� ����մϴ�. �޸𸮴� �Ű�Ƚᵵ �˴ϴ�. 
		boolean  firAxle = false; // ������
		boolean thirdAxle = true; // ����
		}

}

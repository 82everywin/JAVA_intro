
public class ForEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ���� FOR ���� : for ���ο� for�� �����ϴ� ����...
		 * 2�� ������ ���� ����ϰ� 3���� �� ������� �ʽ��ϴ�..
		 * ���� for ������ ������ ������ Scope(�������)�� ���๮�� ��ġ(Inner or Outer)�� �� �ľ��ϴ°� �߿��մϴ�. 
		 */
		for (int i = 0; i < 10; i++) {//Inner for ����
			for (int j = 0; j < 10; j++) {// Outer for ����
				//	i=0; j=0~9 10�� ���� 
			
			}//Inner for End.. 
		} // Outer for End..
		
		// ������ ����� 
		Outer : for (int i = 2; i < 10; i++) { // �� for ����  // Outer Label for ����..
			System.out.println("==="+ i+"�� ���� ===");
			
			if(i%2==0)
				//break;
				//continue;
			Inner : for (int j = 1; j < 10; j++) { // �� �ǿ��� ���� // Inner Label for ����..
				int res = i*j;
				if(res%2!=0)
					// break;
					// continue;
				System.out.println(i+"��"+j+"="+res);
			}
					System.out.println("===="+i+"�� �� ===");
		}// �� for ��..
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

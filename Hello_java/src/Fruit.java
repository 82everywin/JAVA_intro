
public class Fruit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * �������� �������� �Ѵٰ� �����մϴ�. 
		 * ��� ������ ���, ������, Ű�� �Դϴ�. 
		 * 
		 * �� ���Ǻ� �Ϸ� ���귮�� 9,5,3 �Դϴ�. 
		 * 
		 * ���� : �� �������� �Ϸ� �� ���귮�� �ð��� ���귮�� ��½�Ű����.
		 * �� ���귮�� �����̰�, �ð��� ���귮�� �Ǽ����� �մϴ�. 
		 * �ݵ�� �ѹ��� casting �����, ���ͷ� �����͸� ����ϼ���. 
		 * 
		 * ���� ������ ���ؼ� �ڽ��� ������ ���� ���� ���� ���길 �ص� �˴ϴ�. 
		 * �ƴϽ� �е��� �ִ��� ������ Ȱ���ϵ��� �ϼ���.
		 */
		
		int apple, orange, kiwi; 
		apple = 9;
		orange = 5;
		kiwi = 3;
		
		int total=apple+orange+kiwi;
		System.out.println("�� ���귮 : " + total);
		
		float avg =(float)total/24;  
		System.out.println("�ð��� ���귮 : " + avg);
		
	}

}

package oopEx;

/*
 * �ڹ��� final Ű���� : final�� �Һ��ϴٴ� �ǹ��� Ű���� �Դϴ�. 
 * ���� �� �ִ� ���� Ŭ���� ��, �ʵ忷, �޼��忷, �޼����Ķ���Ϳ�, �޼��� ������...
 * �� ���� ��� ������ ��� �����մϴ�.
 * 
 * Ŭ������ ���� ��쿣 ��� �Ұ��� �����Ѵٴ� �� �Դϴ�. ���� final Ŭ������ ��ӽÿ� ������ ������ ��ϴ�. 
 * abstract�� �ݴ�
 * �޼��� �Ķ���Ϳ� ���̴� ��쿣 �Ķ���� �� ���� ����
 * �޼��� ���ο� ���̴� ��쿣 �� ���� ����
 * �ʵ忡 ���̴� ��쵵 �� ���� ����.. 
 */

/*
 * static final : �ڹ��� ��� ����... 
 * 
 * ��� : ����� �׻� ������ ���� ���� ���� �����Դϴ�. 
 * �ݴ��� �������� ������ �ְڳ׿�.
 * 
 * ����� static final �� �������� �ؼ� �����ϸ�, �ݵ�� ����� ���ÿ� �ʱ�ȭ �Ǿ�� �մϴ�. �翬�� ����� ��������. 
 * ����� ���� Ư¡������ �������� ��� �빮�ڷ� ǥ���ϴ� Ư¡�� ������ �ֽ��ϴ�. ��Ÿũ����Ʈ�� �������̽� �����ϼ���. 
 * 
 */

class A{
	// public ������ ���� ��Ű�� ������ ���� ����
	
	YourClass yoo;
	
	public static final int ALL_REGIEON_UNITS_LIMIT = 200;
	
	
	void doSome(final int b) {
		// �޼��带 ȣ���� �� (3)���θ� �����Ǿ�� �� �� ��ó�� final�� �־��ش�. 
		// b=100;
	}
}
class Terra{
	int unitCnt;
	public Terra( ) {
		
	}
}
class Zerg{
	int unitCnt;
	public Zerg() {
		if(unitCnt <= A.ALL_REGIEON_UNITS_LIMIT) {
			//���ֻ���.. 
		}
		else {
			System.out.println("������ 200�� �ʰ��� �� �����ϴ�. ");
		}
	}
}
class Protoss{
	int unitCnt;
	
	public Protoss() {
		
	}
}


public class FinalExam extends A {
	
	void doSome(){//�⺻ ������ ȣ��
		
	}
	
	public static void main(String[] args) {
		new A().doSome(3); // doSome�� non-static�̹Ƿ� new�� ��ü ������ ����. main==static������..
		
	}
}

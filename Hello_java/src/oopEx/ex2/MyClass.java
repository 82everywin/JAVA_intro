package oopEx.ex2;

//�ܺ� ��Ű���� Ŭ����(�ܺ� API)�� ������ ���� import�� ���..
import oopEx.*; // �� ��Ű���� ��� API�� import�Ѵ� �ǹ� 

public class MyClass extends YourClass {

	public MyClass() { //�����ڸ� ���ؼ� super() �ҷ��� ...����̴ϱ�
		super();	
	}
	// YourClass yoo; // ��ü ���� // yourclass�� oopEx ��Ű���� �����Ƿ�
	// public ������ ���� ��Ű�� ������ ���� ����
	// public�� �־�� �ٸ� ��Ű�������� ������ ������
	
	// doSome �������̵� ..��� ���� �Ȱ��� �ٵ� ����
	protected void doSome() {
		System.out.println("��ӹ��� ");
	}
	
	public static void main(String[] args) {
		 new MyClass().doSome();
	}
}

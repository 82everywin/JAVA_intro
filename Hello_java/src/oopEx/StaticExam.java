package oopEx;
/*
 * �� Ŭ���������� static �� final �̶�� ������ ���̴ϴ�.
 * 
 * static�� �ڹٿ��� ���� �̶�� �������� ���˴ϴ�. ������ �ݴ�� ���� --> ��ü�� ���� �����Դϴ�. 
 * 
 */
public class StaticExam {
	
	int a;
	static int b;
	
	//�ʱ�ȭ ��
	static{ //STATIC Ŭ�����̱� ������ ���� ȣ��, �ʱ�ȭ��--0���� �ڵ����� �ʱ�ȭ��.   
		System.out.println(" b�� �� : "+ b);
	}
	
	// static �޼���
	static void a() {
		
	}
	
	static void b() {
		
	}
	
	
	// PIE ���� �����ϴ� �޼��� ���� �մϴ�. -> static ������.Ŭ������..
	public static double getPI() {
		return Math.PI; 
	}
	// static : ���� ��Ҵ� Ŭ������ �ε�� ���� �ʱ�ȭ �Ǳ⶧���� �������� Ŭ������ �ִٶ�� �Ѵ�. 
	// �ؼ� ���� ��Ҷ� �Ѵ�. 
	public static void main(String[] args) {
		//static(��������) -> non-static(��������) ���� ���� 
		//doSome();
		System.out.println("main ȣ���..");
		
		// ��ü ���� ��ü��... 
		// Ŭ����.non-static�޼��� --> ��ü ���� (new)�� �� ��, �޼��带 �����ؾ� ��. 
		new StaticExam().doSome(); 
		
		// �������� 2�� ��ü�� ü�����ϱ�...
		double res = 2* 2 * getPI();
	}
	
	// PIE�� �����ϴ� ��ü �޼��� ����
	 public double getPieInst() {
		 return getPI();
	 }
	 
	 
	 // non -static(doSome)�޼��带 ȣ���Ϸ��� �� �޼��嵵 non-static(doSome2)�̾����.
	 void doSome2() {
		 	doSome();
	 }
	 // non-static method define
	 // ��ü��...��.. non-static �޼���� �ݵ�� non-static ������ ȣ�� �����ϴ�.
	 void doSome() {
	 }
	 
}

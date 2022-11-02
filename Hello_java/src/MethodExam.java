
public class MethodExam { // class body

	public static void main(String[] args) { // method body
		/*
		 * �ڹ��� �޼���(method) : �޼���� Ŭ������ ��üȭ �Ǿ� ����� �� Ư�� ����� �����Ѱ��� ���մϴ�. �ڼ��� ������ ��ü���� �ð��� �ٽ� ���ϴ�. 
		 * �޼���� Ư¡�� ������ �ִµ�, {Ű����} {static(option �̶�� ��)} returnType(R or P or void)
		 *  methodName({Parameter}){//�޼��� body}
		 *  
		 *  static �޼��忡�� ȣ���� �� �ִ� �޼���� static ���̴�. �� ����ϼ���!!!
		 *  
		 */
		a(); // a �޼��� call(ȣ����)
		boolean result = b();		// b()�� ȣ���ؼ� ������� ��ڴٴ� ��. 
		boolean result2 = c();
		
		// �� ������ &, | ����..
		if(result & result2) { //false
			System.out.println("b()�� ���ϰ��� true �Դϴ�.");
		}
		if(result | result2) { // true
			System.out.println("c()�� ���ϰ��� false�Դϴ�. ");
		}
		
		if(result) { // true
			System.out.println("b() �� ���ϰ��� true �Դϴ�. ");
		}
		/*
		if(!result2) {
			System.out.println(result2);
		}
		*/
	}
	
	static boolean b() {
		System.out.println("b() �Դϴ�.");
		return true;
	}
	
	static boolean c() {
		System.out.println("c() �Դϴ�.");
		return false;
	}
	
	/* void : returnType
	 * a : methodName
	 * () : ({Parameter})
	 * {} : �޼��� body
	 */
	static void a() { // �޼��带 ����(Define) �ߴٶ�� �մϴ�.
		//main() �� ������ ������ �޼���� ȣ��(call) �Ǳ� ���� ������ ���� �ʽ��ϴ�. 
		System.out.println("�̰� a �޼����� ���๮�Դϴ�.");
	}
}

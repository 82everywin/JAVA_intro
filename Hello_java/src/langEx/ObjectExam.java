package langEx;
/*
 * Object Ŭ������ �̸����� �˾ƺ���..
 */
public class ObjectExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ObjectExam o1= new ObjectExam(); 
		ObjectExam o2= o1; 
	
		System.out.println(o1);
		System.out.println(o2);
		
		//object�� equals()�� �̿��ؼ� ���� ��ü���� Ȯ���غ���. 
		boolean isSameObj= o1.equals(o2);
		
		
		if(isSameObj) {
			System.out.println("o1�� o2�� ���� ��ü�Դϴ�.");
		}else {
			System.out.println("o1�� o2�� �ٸ� ��ü�Դϴ�.");
		}
		
		//���� ��ü ���θ� ���ϴ� ������  == �� ���ϴ�. equals ���� �����ϸ� ���� ���Դϴ�.
		if(o1==o2) {
			System.out.println("���� ��ü(�������� ����) �Դϴ�. ");
		}else {
			System.out.println("�ٸ� ��ü�Դϴ�.");
		}
		
	}

}

package oopEx;
/*
 * Wrapper Class : �ڹٿ��� ���Ǵ� Ptype �� ���õ� ������ Ŭ������ ���� �� Ŭ�������� ���մϴ�. 
 * �� Ŭ�������� �̿��ϸ� �� Ptype �� �� ���� ������ �ս��� Ȱ�� �� �� �ֽ��ϴ�. 
 */
public class WrapperClassExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = -123566743;
		
		String aa = String.valueOf(a);
		System.out.println(Integer.parseInt(aa)+1);
		
		Integer ik = Integer.valueOf(10); // �Ķ������ ���� ���� Integer ��ü �����ϴ� �޼��� ȣ��.. 
		
		int res = ik +1; 
	}

}

import java.util.Arrays;

/*
 * �ڹ��� �迭 : ���� �迭�� ��ü�̴�. �� Rtype (Reference type)�̶�� ���Դϴ�. 
 * ������ �츮�� ����� Ptype �� ������ ����ϴ� ���¿ʹ� Ʋ���ϴ�. 
 * �迭�� ������ ���� �Ļ��Ǿ��� ������ ��κ� �̸��������� ����� �ϴµ� ���� �׷��� �ʽ��ϴ�.
 * ���� ������.
 * 
 */
public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.out.println("�ȳ��ϼ���!"+args[0]+"��");
		// �迭 ������.. 
		
		int[] arr1; // arr1�� int ������ ��� �迭 ������ ������..
		// �迭�� Ư¡�� �Ʒ�ó�� �迭�� ũ�⸸ ������ �ص� �� Ÿ���� �⺻������ �ʱ�ȭ �Ǿ����ϴ�.
		// ���� Ÿ�� 0, �Ǽ� Ÿ�� 0.0, ��ü(Rtype)null, boolean false
		
		arr1 = new int[10];// 10���� length �� ���� �迭�� �����մϴ�. // ������ index�� length-1�Դϴ�. 
		
		double arr2[]=new double[5];
		
		// ���� �� �迭 ����Ʈ�� �޸��ּ�(Hashcode)�� ����غ����.. 
		System.out.println(arr1);
		System.out.println(arr2);
		
		// �迭�� ȣ�� ǥ��
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		
		// �迭�� �Ӽ��� ȣ���Ͽ� length Ȯ���ϱ�.. 
		System.out.println(arr1.length);
		System.out.println(arr1.length-1);
		
		// �� �ֱ�..
		arr1[0]=1;
		System.out.println(arr1[0]);
		
		// �迭�� ������ ���� �ִ��� ���ڿ��� ����ϴ� ���.. 
		System.out.println(Arrays.toString(arr1));
		
		// �迭�� �ʱ�ȭ.
		char[] ch1= {'a','b','c'};
		char[] ch2 = new char[] {'d','e','f'};
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		// for�� �̿��� �迭�� ����
	
		for (int i = 0; i < ch1.length; i++) {
			System.out.println(ch1[i]);
			
		}
		
		// �̹��� �ݵ�� ����ϱ�~~!!
		/*
		 * ������ ���� ��ü�� ������ ������ ������ ����? ��� ����� �ڵ����� �Ӽ��� �޼ҵ��. ��� �����ּ���. 
		 * ���� �迭��ü�� �Ӽ����� ������ �ֽ��ϴ�. 
		 */
		
		
		// new// JVM���� ��ü�� ������ Ű�����Դϴ�. � ��ü�� �������� new ������ �迭Ÿ��ǥ���� �ֽ��ϴ�.
	}

}

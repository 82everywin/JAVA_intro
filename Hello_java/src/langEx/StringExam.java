package langEx;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringExam {

	public static void main(String[] args) throws UnsupportedEncodingException {

		String a= "abc";
		String b= "de";
		String c= "fg";
		String d= "abc";

		if(a == d ) {
			System.out.println("���� ���ڿ� ��ü�̱� ������ ���� �����ϴ�.");
		}else {
			System.out.println("Ʋ�� ��ü�̸�, ���� Ʋ���� ���δ� ��");
		}
		
		System.out.println((int)'A');
		byte[] bArr = {65,66,67,68,69};// �� �빮�� A~E����...
		
		// �� �迭�� ���� �����ڸ� �̿��ؼ� ���ڿ� ��ü�� �����Ѵ�. 
		String bString = new String(bArr);//byte->string ���ڸ� ���ڷ� �����ϴ� String ��ü ����
		System.out.println(bString);
		bArr = new byte[] {97,98,99};
		//UTF-8 ���ڼ����� ���ڵ��Ͽ� ���ڿ� ����
		bString = new String(bArr,"ISO8859-1");
		System.out.println(bString);
		
		
		String name = "������";
		// String �޼��带 �̿��ؼ� �̸����� byte �迭�� ��ȯ �� �޴´�. 
		byte[] bName = name.getBytes();
		//System.out.println(Arrays.toString(bName));
		
		// ���� �̸� �迭���� 0~3 ������ �����Ͽ� �ٽ� ���ڿ��� �����Ѵ�. 
		name = new String(bName,0,4);
		System.out.println(name);
		String name1 = new String(bName,0,bName.length,"ISO8859-1");
		System.out.println(name1);
		
		String str = "abc"; //��������� str == a �� ������ ���� 
		str = new String(str); // �����ڸ� �������μ� ��ü�� ������. �� ������ �ٸ� ��ü�� �� �� str != a 
		// value == "abc" �� ���� ���� 
		
		//Garbage Collector : �ڹ��� JVM ���� �ִ� ������ �������α׷�.. ���⼭ ���ϴ� ������� Ref(����)�� �Ҿ����, �� ���̻� �������� �ʴ� ��ü�� ���մϴ�. 
		// �̷��� ��ü�� �޸𸮸� �Һ��ϱ� ������ �ڹ����α׷��� ������ �����϶� �ڵ����� �����⸦ �������ִ� ������ �մϴ�. 
		
		
		if(str == a) {
			System.out.println("���� ��ü�Դϴ�.");
		}else {
			System.out.println("�ٸ� ��ü�Դϴ�.");
		}
		
		System.out.println(str.length()); //���ڿ� ���� �޼���
		
		String myEmail = "82everywin@naver.com";
		 
		char ch = myEmail.charAt(10);
		//System.out.println(ch);
		
		//myEmail�� �������鼭 �� ������ ���� ����غ���..
		for (int i = 0; i < myEmail.length(); i++) {
			ch = myEmail.charAt(i);
			if(ch=='@') {
				System.out.println(i + "���� ���ڰ� "+ ch + "�Դϴ�. ");
				break;
			}
		}
		System.out.println(ch);
		
		
		
		
		
		
		
		
		
		
	}


}

package oopEx;

import java.util.Scanner;

public class StringExam {

	// static �ʵ� ����.. ������ �빮�ڿ� ���� ī���� �����Դϴ�. 
	// id�� �빮�ڳ� ������ ��� �Ʒ��� ������ �������Ѽ� �� ���� ����� �����Դϴ�. 
	
	static int upperChCount, digitCount =0; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ��� : ");
		String email = sc.next();
		
		//�̸��� �и� 
		String id, server = null;
		
		//@���δ� �E�Կ�..�� ���״ϱ�...
		id = email.substring(0,email.indexOf('@'));
		server = email.substring(email.indexOf('@')+1);
		
		//��� ���ǰ˻縦 �޼���� ���� �ҰԿ�.
		// 1. ���� �˻� �غ��Կ�..
		if(correctLength(id)) {
			//����� ���´ٸ� ���̴� ok�Դϴ�.
			isUpperOrDigit(id);
			
			if(upperChCount ==0) {
				System.out.println("ID���� �ݵ�� �빮�ڰ� �ϳ��̻� ���ԵǾ�� �մϴ�. �� ID : "+ id);
				return;	
			}else if(digitCount == 0) {
				System.out.println("ID���� �ݵ�� ���ڰ� �ϳ��̻� ���ԵǾ�� �Դϴ�. �� ID : "+ id);
				return;	
			}else {
				System.out.println("�ùٸ� ���̵� �����Դϴ�. ȸ������ ����.. ");
			}
		}else {
			System.out.println("id�� 8~12�ڸ� �����Դϴ�. ");
			System.out.println("�� id ���� : "+ id.length());
			
		}
	}
	static boolean correctLength(String id) {// id�� �˻��ؼ� ���ǵ� ���̸� true, �ƴϸ� false ���Ͻ�ŵ�ϴ�. 
		if (id.length() >= 8 && id.length() <= 12)
			return true;
		return false; 
	}

	//id�� ���� �빮�� or ���� ���̽� ���� �޼��� ���� 
	static void isUpperOrDigit(String id) {
		//id ��ü�� loop ���鼭 �� ������ ������ �ľ��մϴ�. 
		// ���� �빮���̰ų�, ������ ��� ���� static Ŭ���� ������ ������ŵ�ϴ�. 
		for (int i = 0; i < id.length(); i++) {
			
			char ch = id.charAt(i);//���ڸ� �ϳ��� �и���..
			// �빮�� ���� �˻�.. char type ���ǽ� �ѹ� �߾����ϴ�. 
			if(Character.isUpperCase(ch)) {
				//�빮�� ī��Ʈ ����...
				upperChCount++;
				//�ϳ� �����Ǿ�����.. ���� ������ skip..
				continue;
			}else if(Character.isDigit(ch)) {
				//���� ī��Ʈ ����..
				digitCount++;
				continue;
			}
			
		}
	}
}


public class IFEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Random �ϰ� 0.0 ~ 0.9999999999999999999 ( double ������ ����ϴ� ��������) �� double�� �����ϴ� API�� �����μ���. ���̾�
		//double r = Math.random();
		//System.out.println((int)(r*10)+1);
		
		//ASCII ���ڼ��� 0~z ������ ������ ���ڸ� �߻��ϵ��� �մϴ�. 
		char ch =(char)(int)((Math.random()*74+1)+48);
//		System.out.println("�߻��� ���ڴ� : "+ (char)i);
		
		if(ch > '0') { // ���ڹ��� ã�� ����..
			if(ch <='9') { // ���� ���� ����.. ���� �߻�!! 
				System.out.println("�߻��� ���ڴ� ���� ���� "+ ch + "�Դϴ�.");
			}else{
				if(ch < 'A'){
				System.out.println("�߻��� ���ڴ� ���ڿ� ���빮�� ������ Ư������ "+ ch + "�Դϴ�.");
				}else {
					if (ch <='Z') {
						System.out.println("�߻��� ���ڴ� ���빮�� ����"+ch+ "�Դϴ�.");
					}else {
						if(ch<'a') {
							System.out.println("�߻��� ���ڴ� ���빮�ڿ� ���ҹ��ڻ����� Ư������  "+ch+ "�Դϴ�.");
						}else {
							if(ch<='z') {
								System.out.println("�߻��� ���ڴ� ���ҹ��� ����"+ch+"�Դϴ�.");
							}else {
								System.out.println("�߻��� ���ڴ� ���ҹ��� ���� Ư������ "+ch+"�Դϴ�.");
								
							}
						}
					}
				}
			}
		}
	
		// �������ڸ� �̿��ؼ� ���� ����� ������ ���ϴ�. 
	
		//1. �������� �Ǻ��ϱ�..
		if( ch >= '0'&& ch<='9') {
			System.out.println("���� �߻� :" + ch);
			}
		else if(ch < 'A') {
			// ���ڿ� ���빮�� ������ Ư�� ã��..
			System.out.println("���ڿ� ���빮�� ������ Ư�� �߻� : "+ ch );
		} 
		else if(ch <= 'Z'){
			// ���빮�� ã��
			System.out.println("���빮�� �߻� :"+ ch);
		}
		else if(ch<'a') {
			// ������ ������ Ư�� ã��
			System.out.println("������ ������ Ư�� �߻� : "+ ch);
		}
		else if(ch<'z') {
			// ���ҹ��� ã��
			System.out.println("���ҹ��� �߻� :"+ ch );	
		}
		
		// 3���� ���...java API�� �̿��ؼ� ���� ������ �����غ���. 
		// ����(char)�� ���õ� ��� ������ ������ �ִ� Ŭ������ �ִµ� �̸��� charcter �̴�. 
		// �� Ŭ������ �̿��ϸ� �ξ� ���ϰ� ����(���)�� ������ �� �ִ�.
		
		if(Character.isDigit(ch))
			System.out.println("���� �߻� "+ ch);
		else if(Character.isUpperCase(ch))
			System.out.println("���빮�� �߻�"+ch);
		else if(Character.isLowerCase(ch))
			System.out.println("���ҹ��� �߻�"+ch);
		else
			System.out.println("Ư�� �߻� "+ ch);
			
	}
}

/*
 * �ڹ��� ���ǹ�
 * 
 * �ڹٿ����� ���ǿ� ���� ���� ������ �б� �ǵ��� �ϴ� �б⹮�� �ΰ� �ֽ��ϴ�. 
 * 
 * �����δ� if, else if, else ����  if ������, switch(�񱷰�){case �񱳰� : true �� ���౸�� break
 * case �񱳰� : true �� ���౸�� break, case �񱳰� : true �� ���౸�� break, default
 * }�� �ֽ��ϴ�. 
 * 
 * ���� 90% �̻��� if ������ ���ǹ����� Ȱ���ϰ�, �������� switch~case ������ ����մϴ�. 
 * 
 * if(���ǽ� or ����)�� ���Ϸ� �Ǵ� else�� ��Ʈ��, �Ǵ� if, else if(���ǽ�) ������ ������ ����
 * �پ��ϰ� ���� �� �� �ֽ��ϴ�. ���� �� ���ǹ� if, else if, else ���ο��� �ʿ信  ���� �Ǵٸ� ���ǽ��� 
 * ��ø�� �� �ֽ��ϴ�. 
 * 
 */
public class IFEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int axle = 4; //���� �赵��..
		
		if(axle == 1 ) {//�ݵ�����??
			System.out.println("�ݵ����� �����ۿ��� �ǳ׾� �ݴϴ�. ");
			System.out.println("�ŷɴ��� ��������ϴ�.");
		}else if(axle==2) {//��������?
			System.out.println("�������� �����ۿ��� �ǳ׾� �ݴϴ�.");
		}else if(axle==3) {//��������?? 
			System.out.println("�������� �����ۿ��� �ǳ׾� �ݴϴ�.");
		}else {// else���� ���ǽ��� ���� �� �����ϴ�. 
			System.out.println("������ �������̱���...�� ��� ������ �װ� �ָ�... ");
		}
	}

}

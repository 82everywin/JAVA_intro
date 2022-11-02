package oopEx.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExceptionEx1 {
	
	// ���� �̸��� , ����� �޼����� �ָ� �ش� ���Ͽ� �޼����� ����ؼ� ���� ������ �ϴ� �޼��� �����մϴ�.
	static void saveMessage(String fileName, byte[] b)throws FileNotFoundException, IOException {
		
		FileOutputStream fos = null;
		
		fos = new FileOutputStream(fileName);
		fos.write(new byte[] {65,66,67});
		fos.flush();
		fos.close();
	}
	// �־��� ������ ã�Ƽ� ������ �����ϴ� �޼��� ����.. 
	static int getMessage(String fileName) throws IOException {
		FileInputStream fis = new FileInputStream(fileName);
		int i = fis.read();
		return i;
		
	}
	
	public  static void main(String[] args) throws FileNotFoundException, IOException {
		 
		// ���� �ڵ鸵 1�� ��� : ���α׷��Ӱ� ���ܰ� �߻��� �ڵ� ����� try{}�� ���Ѵ�. 
		// ���⼭ ���� : try�� catch() �� �� ������ ���Ǵµ�, try ������ ����� ������ ������������ ����Ѵ�. 
		// �� catch���� ����ҰŸ� try �ۿ��� �����ؾ� �Ѵ�. 
	
		// ���� �ڵ鸵 2�� ��� : ���ܰ� �߻��� �� �ִ� �ڵ���� �ִ� �޼��峪 �����ڿ��� ���ܸ�  try~catch ���� ���� ��쿣
		// ������, �޼��� ����� ���� throws �� �̿��ؼ� ���ܰ� �߻��� �ڵ尡 ������ ���� ����� �մϴ�. �̷��� �����Ϸ��� �������� ���ݴϴ�. 
		// �� �˷��� ������ ��츸 �ش�˴ϴ�.
		// throws�� ���� �� ���� ������ �Ѵٴ� �ǹ��Դϴ�. ������� �ǹ̴� ���ܰ� �߻��ϸ� �߻��� ���� ��ü�� ȣ���� �� (caller)���� �����Ѵٴ�
		// �ǹ� �Դϴ�. �̷��� ��� ������ ���, �ƹ��� catch���� �ʴ´ٸ� �ᱹ�� ���α׷��� ���� ������  ������������ ����ǰ� �˴ϴ�. 
		// �� �������� catch�� �ؾ� �Ѵٴ� �ǹ��Դϴ�. 
		
		// �Ϻη� Ʋ�� �����̸��� �༭ ������ ���� �� ���ܸ� �߻���ŵ�ϴ�. 
		try {
		int i = getMessage("yourdata.dat");
		}catch (IOException e1) {
			System.out.println(e1.getMessage());
		}
		
		
//		int a = 10, b=0;
//		try {
//				System.out.println(a/ b);
//		}catch(ArithmeticException e) {
//			System.out.println("0���� ���� �� �����ϴ�. �� �Է� �ٶ��ϴ�. \n �ϰ� ���� �ι��� �� : "+b);
//			System.out.println(e.getMessage());
//		}
		
		/*
		 * ���� catch �ϴ� ���
		 * �ڵ� ������ �ϳ� �̻��� ���ܰ� �߻������ ��쿡 �ڵ鸵 �ϴ� ����� �˾ƺ��ϴ�. 
		 */
		
		//File���ٰ� byte data�� ���鼭 �߻��Ǵ� ���� �ڵ鸵..
		
		
		
		
		
		
		
	}
}

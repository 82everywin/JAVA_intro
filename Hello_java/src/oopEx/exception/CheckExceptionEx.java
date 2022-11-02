package oopEx.exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * �˷��� ���� �׽�Ʈ �غ��� : �˷��� ���ܶ� Exception ���� Ÿ������ RuntimeException ������ ���ܸ� ������ ��� ���ܸ� ���Ѵ�. 
 * �� ���ܴ� �����Ͻÿ� �����Ϸ��� �����ϱ� ������(�ֳĸ� ���ܰ� �߻��� �� �ִٰ� �̹� ����Ǿ��� ������) ���α׷��Ӱ� ���� �ڵ鸵(Exception Handling)
 * �� ���� ���� �ÿ� ������ ������ �߻��ȴ�. �ݴ�� RuntimeException ���� ���ܵ��� �����Ϸ��� �������� �ʴ� �����̴�. �� �ڵ鸵�� ���� ���� ���
 * ���ܰ� �߻��Ǹ� ���α׷��� �� ������ ������������ ����ȴ�.
 */
public class CheckExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���ڿ��� ���Ͽ� �����ϴ� ����.. ���⼭ ���Ǵ� ��� API�� ��� �˷��� ���ܵ��̴�.
		String message="�ڹ� ���ϸ����ӤӤ�";
		
		String fileName = "myFirstFile.txt";
		
		File file = new File(fileName);
		
		//��Ʈ���� �̿��ؼ� File �� �����͸� ���� API ���...���߿� ���ϴ�. 
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(file);
			fw.write(message);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}


public class StarArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ���� �����迭�̶��� ���̴ϴ�. �̳�(��)�� Outer �迭�� �����ϰ� Inner �迭�� �������� �ʿ�ÿ� �����ϴ� �� ���մϴ�.
		 * �˾Ƶ� �׸� ���� �׸��Դϴ�. 
		 */
		
		char[] stars[] = new char[10][];
		
		// ��ü�� ���α׷� �������Ŀ� �����˴ϴ�. ��ü�� JVM�� ����� �ݴϵ�. 
		
		for(int i=0;i<stars.length;i++) {
			stars[i] = new char[i+1];
			for(int j=0;j<stars[i].length;j++) {
				// ���� �� ������ ���� �־��̴ٰϴ�.
				stars[i][j]='*';
				System.out.print(stars[i][j]);
			}
			System.out.println();
		}
		
	}

}

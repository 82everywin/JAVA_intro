package oopEx;

public class StaticEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ��������  2�� ��ü�� ���� ���ϱ�.. 
		StaticExam s = new StaticExam();
		double res = s.getPieInst();
		//double res = new StaticExam().getPieInst();
		// getPieInst()�� non-static�̹Ƿ� ��ü��. ��, new�� ���� ��ü������ �ؾ� �Ѵ�. 
		
		//double res= 2* 2* StaticExam.getPI();
		// getPI()�� static �̹Ƿ� Ŭ������. ��, new�� ���� �ʰ� �޼��� ���𰡴�;
		res = StaticExam.getPI();//s.getPI();
		
	}
}

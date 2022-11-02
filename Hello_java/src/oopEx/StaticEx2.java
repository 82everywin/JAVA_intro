package oopEx;

public class StaticEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 반지름이  2인 구체의 면적 구하기.. 
		StaticExam s = new StaticExam();
		double res = s.getPieInst();
		//double res = new StaticExam().getPieInst();
		// getPieInst()는 non-static이므로 객체것. 즉, new를 통해 객체생성을 해야 한다. 
		
		//double res= 2* 2* StaticExam.getPI();
		// getPI()는 static 이므로 클래스것. 즉, new를 하지 않고도 메서드 선언가능;
		res = StaticExam.getPI();//s.getPI();
		
	}
}

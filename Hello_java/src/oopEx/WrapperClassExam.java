package oopEx;
/*
 * Wrapper Class : 자바에서 사용되는 Ptype 에 관련된 내용을 클래스로 정의 한 클래스들을 뜻합니다. 
 * 이 클래스들을 이용하면 각 Ptype 의 더 많은 정보를 손쉽게 활용 할 수 있습니다. 
 */
public class WrapperClassExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = -123566743;
		
		String aa = String.valueOf(a);
		System.out.println(Integer.parseInt(aa)+1);
		
		Integer ik = Integer.valueOf(10); // 파라미터의 값을 가진 Integer 객체 리턴하는 메서드 호출.. 
		
		int res = ik +1; 
	}

}

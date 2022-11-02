package langEx;
/*
 * Object 클래스의 이모저모 알아보기..
 */
public class ObjectExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ObjectExam o1= new ObjectExam(); 
		ObjectExam o2= o1; 
	
		System.out.println(o1);
		System.out.println(o2);
		
		//object의 equals()를 이용해서 같은 객체인지 확인해본다. 
		boolean isSameObj= o1.equals(o2);
		
		
		if(isSameObj) {
			System.out.println("o1과 o2는 같은 객체입니다.");
		}else {
			System.out.println("o1과 o2는 다른 객체입니다.");
		}
		
		//같은 객체 여부를 비교하는 연산자  == 를 봅니다. equals 보다 간편하면 많이 쓰입니다.
		if(o1==o2) {
			System.out.println("같은 객체(참조값이 같은) 입니다. ");
		}else {
			System.out.println("다른 객체입니다.");
		}
		
	}

}

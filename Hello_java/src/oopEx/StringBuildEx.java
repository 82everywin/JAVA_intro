package oopEx;

public class StringBuildEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb  = new StringBuilder("abc");
		System.out.println(sb.capacity());
		sb = new StringBuilder(1000);
		System.out.println(sb.capacity());
		
		System.out.println(sb.length());
		System.out.println(sb.append("hi"));
		System.out.println(sb.insert(2," hello hi  "));

		System.out.println(sb);
		
		String sb2 = "abc";
		sb=null;
		sb= new StringBuilder("abc");
		
		//String 객체와 StringBuilder 객체간의 equals() 를 사용시엔 StringBuilder 객체로는 값 비교가 안됩니다.
		// 이유는 객체타입이 String 아닐 경우엔 false를 리턴하도록 오버라이팅되었기 떄문입니다.
		// 때문에 반드시 두 객체의 값을 비교시엔 StringBuiler의 toString 을 호출하여 타입 일치를 해주셔야 합니다. 
		if(sb2.equals(sb.toString())) {
			System.out.println("값이 같습니다.");
		}
	}

}

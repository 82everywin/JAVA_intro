package langEx;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringExam {

	public static void main(String[] args) throws UnsupportedEncodingException {

		String a= "abc";
		String b= "de";
		String c= "fg";
		String d= "abc";

		if(a == d ) {
			System.out.println("같은 문자열 객체이기 떄문에 값도 같습니다.");
		}else {
			System.out.println("틀린 객체이며, 값이 틀린지 여부는 모름");
		}
		
		System.out.println((int)'A');
		byte[] bArr = {65,66,67,68,69};// 영 대문자 A~E까지...
		
		// 위 배열의 값을 생성자를 이용해서 문자열 객체로 생성한다. 
		String bString = new String(bArr);//byte->string 숫자를 문자로 변경하는 String 객체 생성
		System.out.println(bString);
		bArr = new byte[] {97,98,99};
		//UTF-8 문자셋으로 인코딩하여 문자열 생성
		bString = new String(bArr,"ISO8859-1");
		System.out.println(bString);
		
		
		String name = "한현승";
		// String 메서드를 이용해서 이름값을 byte 배열로 변환 후 받는다. 
		byte[] bName = name.getBytes();
		//System.out.println(Arrays.toString(bName));
		
		// 위의 이름 배열에서 0~3 까지만 추출하여 다시 문자열로 생성한다. 
		name = new String(bName,0,4);
		System.out.println(name);
		String name1 = new String(bName,0,bName.length,"ISO8859-1");
		System.out.println(name1);
		
		String str = "abc"; //여기까지는 str == a 가 완전히 같음 
		str = new String(str); // 생성자를 만듦으로서 객체가 생성됨. 즉 완전히 다른 객체가 된 것 str != a 
		// value == "abc" 만 같은 것임 
		
		//Garbage Collector : 자바의 JVM 내에 있는 쓰레기 수집프로그램.. 여기서 말하는 쓰레기는 Ref(참조)를 잃어버린, 즉 더이상 참조되지 않는 객체를 말합니다. 
		// 이러한 객체는 메모리만 소비하기 때문에 자바프로그램이 휴지기 상태일때 자동으로 쓰레기를 수집해주는 역할을 합니다. 
		
		
		if(str == a) {
			System.out.println("같은 객체입니다.");
		}else {
			System.out.println("다른 객체입니다.");
		}
		
		System.out.println(str.length()); //문자열 길이 메서드
		
		String myEmail = "82everywin@naver.com";
		 
		char ch = myEmail.charAt(10);
		//System.out.println(ch);
		
		//myEmail을 루프돌면서 각 문자의 값을 출력해보자..
		for (int i = 0; i < myEmail.length(); i++) {
			ch = myEmail.charAt(i);
			if(ch=='@') {
				System.out.println(i + "번쨰 문자가 "+ ch + "입니다. ");
				break;
			}
		}
		System.out.println(ch);
		
		
		
		
		
		
		
		
		
		
	}


}

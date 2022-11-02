
public class IFEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Random 하게 0.0 ~ 0.9999999999999999999 ( double 범위가 허용하는 범위까지) 의 double을 리턴하는 API를 익혀두세요. 많이씀
		//double r = Math.random();
		//System.out.println((int)(r*10)+1);
		
		//ASCII 문자셋중 0~z 사이의 랜덤한 문자를 발생하도록 합니다. 
		char ch =(char)(int)((Math.random()*74+1)+48);
//		System.out.println("발생한 문자는 : "+ (char)i);
		
		if(ch > '0') { // 숫자범위 찾기 시작..
			if(ch <='9') { // 숫자 범위 학인.. 숫자 발생!! 
				System.out.println("발생한 문자는 숫자 문자 "+ ch + "입니다.");
			}else{
				if(ch < 'A'){
				System.out.println("발생한 문자는 숫자와 영대문자 사이의 특수문자 "+ ch + "입니다.");
				}else {
					if (ch <='Z') {
						System.out.println("발생한 문자는 영대문자 문자"+ch+ "입니다.");
					}else {
						if(ch<'a') {
							System.out.println("발생한 문자는 영대문자와 영소문자사이의 특수문자  "+ch+ "입니다.");
						}else {
							if(ch<='z') {
								System.out.println("발생한 문자는 영소문자 문자"+ch+"입니다.");
							}else {
								System.out.println("발생한 문자는 영소문자 이후 특수문자 "+ch+"입니다.");
								
							}
						}
					}
				}
			}
		}
	
		// 논리연산자를 이용해서 위의 결과를 도출해 봅니다. 
	
		//1. 숫자인지 판별하기..
		if( ch >= '0'&& ch<='9') {
			System.out.println("숫자 발생 :" + ch);
			}
		else if(ch < 'A') {
			// 숫자와 영대문자 사이의 특문 찾기..
			System.out.println("숫자와 영대문자 사이의 특문 발생 : "+ ch );
		} 
		else if(ch <= 'Z'){
			// 영대문자 찾기
			System.out.println("영대문자 발생 :"+ ch);
		}
		else if(ch<'a') {
			// 영문자 사이의 특문 찾기
			System.out.println("영문자 사이의 특문 발생 : "+ ch);
		}
		else if(ch<'z') {
			// 영소문자 찾기
			System.out.println("영소문자 발생 :"+ ch );	
		}
		
		// 3번쨰 방법...java API를 이용해서 위의 로직을 구현해본다. 
		// 문자(char)에 관련된 모든 정보를 가지고 있는 클래스가 있는데 이름이 charcter 이다. 
		// 이 클래스를 이용하면 훨씬 편리하게 로직(결과)를 구현할 수 있다.
		
		if(Character.isDigit(ch))
			System.out.println("숫자 발생 "+ ch);
		else if(Character.isUpperCase(ch))
			System.out.println("영대문자 발생"+ch);
		else if(Character.isLowerCase(ch))
			System.out.println("영소문자 발생"+ch);
		else
			System.out.println("특문 발생 "+ ch);
			
	}
}

package oopEx;

import java.util.Scanner;

public class StringExam {

	// static 필드 선언.. 목적은 대문자와 숫자 카운팅 목적입니다. 
	// id에 대문자나 숫자인 경우 아래의 변수르 증가시켜서 이 값을 사용할 예정입니다. 
	
	static int upperChCount, digitCount =0; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("이메일 입력하세요 : ");
		String email = sc.next();
		
		//이메일 분리 
		String id, server = null;
		
		//@여부는 뺼게요..다 알테니깐...
		id = email.substring(0,email.indexOf('@'));
		server = email.substring(email.indexOf('@')+1);
		
		//모든 조건검사를 메서드로 정의 할게요.
		// 1. 길이 검사 해볼게요..
		if(correctLength(id)) {
			//여기로 들어온다면 길이는 ok입니다.
			isUpperOrDigit(id);
			
			if(upperChCount ==0) {
				System.out.println("ID에는 반드시 대문자가 하나이상 포함되어야 합니다. 니 ID : "+ id);
				return;	
			}else if(digitCount == 0) {
				System.out.println("ID에는 반드시 숫자가 하나이상 포함되어야 함니다. 니 ID : "+ id);
				return;	
			}else {
				System.out.println("올바른 아이디 조합입니다. 회원가입 성공.. ");
			}
		}else {
			System.out.println("id는 8~12자리 사이입니다. ");
			System.out.println("너 id 길이 : "+ id.length());
			
		}
	}
	static boolean correctLength(String id) {// id를 검색해서 조건된 길이면 true, 아니면 false 리턴시킵니다. 
		if (id.length() >= 8 && id.length() <= 12)
			return true;
		return false; 
	}

	//id의 값중 대문자 or 숫자 케이스 검증 메서드 정의 
	static void isUpperOrDigit(String id) {
		//id 전체를 loop 돌면서 각 문자의 범위를 파악합니다. 
		// 만약 대문자이거나, 숫자인 경우 위의 static 클래스 변수를 증가시킵니다. 
		for (int i = 0; i < id.length(); i++) {
			
			char ch = id.charAt(i);//문자를 하나씩 분리함..
			// 대문자 여부 검사.. char type 강의시 한번 했었습니다. 
			if(Character.isUpperCase(ch)) {
				//대문자 카운트 증가...
				upperChCount++;
				//하나 증가되었으니.. 숫자 검증은 skip..
				continue;
			}else if(Character.isDigit(ch)) {
				//숫자 카운트 증가..
				digitCount++;
				continue;
			}
			
		}
	}
}

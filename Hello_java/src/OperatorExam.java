/*
 * 자바의 연산자
 * 
 * 프로그램 로직을 작성하다보면 많은 연산자를 사용하게 됩니다.
 * 여기서는 연산자의 종류와 의미 등을 파악할것으로,순서도 배우게 될 것입니다.
 * 프로그램은 실행시 기본적으로 위에서 아래로,좌에서 우로 실행되는데,좌에서 우로 실행시 연산자의 우선순위에 따라서 순서가 틀려집니다. 
 * 아래는 연산자의 종류와 이름등을 실행순이 높은 순으로 리스팅합니다. 
 * 
 * 1.최고 연산자(제일 빠름) : .(Dot.. 객체시간에 배웁니다), ()(괄호)
 * 2.단항 연산자 : 바로 우측항에만 영향을 미치는 연산자입니다. (casting), ++/--(선행 증감),!(not)
 * 3.산술 연산자 : 4칙 연산(+,-,÷,×), %(모둘러,나머지 연산자)
 * 4.쉬프트 연산자 : >>, <<, >>>
 * 5.관계 연산자 : >,<,<=,>=,==(같다),!=(같지 않다)
 * 6.비트 연산자 : 책보세요..
 * 7.논리 연산자 : &(AND),|(OR),&&, ||, --> 두 개 이상의 논리르 연산하는 연산식.. 
 * 8.삼항 연산자 : 조건식 ? 결과가 true시 리턴(return)값 : false시 리턴값
 * 9.(배정)대입 연산자 : =,+=,-=
 * 10.후행 연산자 : ++,--
 *  최단산쉬 관비논삼
 */

public class OperatorExam { // class body

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1; 
		int b = ++a; //선행증가.. a의 값을 먼저 1 증가하고 결과값을 b에 대입한다.
		System.out.println(a + " : " + b);

		int c = 1 + ++b; // b-->3 + 1 =c
		System.out.println(c + " : " + b);
		
		c=--a + b;
		System.out.println(c);// c: 4, a:1, b:3
		
		int d= c--; // d=4, (연산 후 c의 값이 줄어듬)c=3
		System.out.println(d + " : " + c);
		
		a=1;b=2;c=3;
		d = ++a + --b + c++;
	    //d : 6(=2+1+3), 결과 전  a:2,b:1,c:3 , 결과 후 a:2,b:1,c:4
		 
		boolean isMale;
		isMale = true; 
		
		// % : 모듈러, 나머지 연산자
		int gender; 
		gender = 2 % 2; 
		
		// 삼항 연산자 : '1 % 2'의 결과값이 0이면  Female(여자)리턴, 아니면  Male(남자) 리턴
		char sex = 2 % 2 == 0?'F':'M' ;
		
		
		if(gender == 0 ) {
			System.out.println("당신은 "+ sex );
		}
		else {
			System.out.println("당신은" + sex );
		}
		
		
		//Shift 연산을 하기위해서 비트를 먼저 봅니다. 
		a = 1;
		b = a<<2; // 000...1 : 값을 왼쪽(<<)2번 옮김 ---> 000...100
		c = b>>3; // 000...100 : 값을  오른쪽(>>) 3번 옮김 ---> 000...000
		c = -128; 
		d = c>>>3;
		
		
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		System.out.println(Integer.toBinaryString(c));
		System.out.println("111111100000000000".length());
		System.out.println(d);
		
		char z= 'z';
		if(z<='A') {
			System.out.println("영대문자 이하의 특수문자이거나, 숫자이겠네요..");
		}else {
			System.out.println("영대문자 A 초과하는 문자네요..");
		}
		
		
		// 배정대입 연산자... 자기 자신의 값에 연산 후에 그 결과값을 자신의 변수에 다시 넣는다는 의미... 사칙,쉬프트 연산자등을 모두 사용가능함. 
		
		a = 0;
		// a = a + 1;
		a+=1;
		
		a = 0; 
		
		for(int i =1 ; i<=10; i++) {
			a+=i;
		}
		System.out.println("1 ~ 10까지의 누적 합 :" + a);
		
		
		
		
		
		
		
	}

}

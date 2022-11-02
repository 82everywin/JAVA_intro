package oopEx;

public interface TerranUnitProper { //테란 유닛에 대한 속성 정보만을 선언한 interface 
	
	/*
	 * 인터페이스내에 선언되는 필드는 무조건 상수이며, 공유 개념이기 때문에 public static final 을 적용받음
	 * 또한 자바에서는 이런 상수는 변수명을 전부 대문자로 한다(타 프로그램도 비슷함) 
	 */

	public static final int DEATH_HP =0;
	//int DEATH_HP =0;
}

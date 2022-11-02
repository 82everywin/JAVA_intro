package oopEx;

public class Medic extends Terran {

	public Medic() {
		super("메딕");
	}

	// 치료를 하는 healing 메서드 정의 
	public void healing()	{
		System.out.println("메딕이 주변에 있는 테란 유닛을 치료합니다.");
	}

	@Override
	public void Speak() {
		// TODO Auto-generated method stub
		System.out.println("메딕이 응답합니다..");
	}
}

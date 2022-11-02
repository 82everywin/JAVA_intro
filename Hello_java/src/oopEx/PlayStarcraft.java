package oopEx;

public class PlayStarcraft {
	public static void main(String[] args) {
		// 객체를 생성하는 생성식. ClassName Ref변수 = new Class 의 생성자를 호출(); // Heap 메모리영역에 객체를 생성한다. 
		
		SCV scv4 = new SCV("SCV4","이병", 0, 60); // Instantiation(인스턴스화)과정
		Marine marine = new Marine("Marine", "이병", 0, 40);
		FireBet firebet = new FireBet("FireBet", "상등병", 0, 40);
		Medic medic = new Medic(); //default 생성자
		
		// 추상클래스의 Ref 테스트 코드..
		Terran t = marine;
		
		
		
		
		// Terran 객체를 하나 생성해봅시다. 
		// 실제 게임에서는 이 객체가 필요없지만 다형성 예를 돌기위해 생성해봅시다. 
		// Terran terran = new Terran("테란슈퍼");
		 
//		terran = scv4; // Super type으로 하위 instance를 Ref 한 경우.. 다형성의 한 예;;
//		SCV scv5 = (SCV) terran; // terran(super)이 하위 SCV를 Ref할 순없다. 상속관계이므로.. 마찬가지로 다형성의 한 예..
		// 적절한 Type Casting이 이루어져야 함의 한 예임..
		
	
		Terran[] units = {scv4,marine,firebet,medic};
		
//		terran = (SCV) units[0];
		//terran.attack("프로토스");
		
//		for(Terran t : units) { // 이건 향상된 for구문..나중에 설명할게요
//		System.out.println(t.toString()); // 다형성의 원리에 의해 Ref하는 Instance의 toString()이 호출된다. 
//		}
		
		for(int i =0; i<units.length;i++) {
		//	if(i==0) {
				Terran anyUnit = units[(int)(Math.random()*4)];
				System.out.println(anyUnit.toString());
				
				// 공격기능의 interface를 상속 받은 공격 유닛만 attack 하도록 호출한다. 당연히 오버라이드(implement)된 메서드가 호출된다. 
				if(anyUnit instanceof Attackable)
					((Attackable) anyUnit).attack("프로토스");
				if(anyUnit instanceof Medic)
					((Medic)anyUnit).healing(); // 연산자 우선순위
				if(anyUnit instanceof SteamPack)
					((SteamPack) anyUnit).SteamPack();
		//}
		}
		
	

//		System.out.println(scv4);
//		System.out.println(marine);
//		System.out.println(firebet);
		
		
		/*
		 * 객체지향의 다형성(Polymorphism) : 다형성이란 상속관계에 있는 특정 객체를  Ref 할때, Super, Super의 Super 또는 자신의 
		 * 타입으로 Ref 할 수 있는 형태를 뜻합니다.이때 주의해야 할 점은 생성된 객체 즉 클래스의 생성자를 호출하여 만들어진 객체의 실제
		 * 클래스 Type은 메모리에서 사라질 떄 까지 절대 불변하다는 것입니다. 하지만, Ref 타입은 Super 타입으로 되어졌을 때는 적절하게
		 * casting 을 하지 않으면 컴파일 에러가 유발합니다. 또한,객체의 클래스에만 정의되어진 메서드를 부모타입으로 Ref 했을 때 호출하게
		 * 되면 컴파일 에러를 유발합니다. 따라서 적절히 Type Casting을 통해 호출해야 합니다.  
		 */
	}
}


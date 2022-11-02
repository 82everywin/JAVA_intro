package oopEx;

public class SCV extends Terran{
	
	// 속성정의(멤버필드)
	// EnCapsulation : 일명 캡슐화.. 속성이나 메서드등을 자신의 클래스 외에 외부에서 접근(Access) 하지 못하도록 보호하는 개념.
	// JAVA에서는 private 이라는 키워드를 선언하면 가장 강력한 캡슐화를 적용할 수 있다. 반대로 public은 가장 느슨한 개념이다... 즉 누구나 접근 가능하다. 
	 String name; // SCV 이름 필드
    String rank; // 계급
    int kill;
	 int hp =60;// 상태의 수칫값
	
	/*
	 * 생성자(Constructor) : 클래스에서 실제 객체를 생성시켜주는 역할을 하는 코드.. 
	 * 또한 생성자를 이용해서 객체의 필드를 원하는 값으로 초기화 하는 역할도 한다. 
	 * 역할 3 : 생성자를 통해 클래스의 객체를 생성하는 가이드 라인을 제공하는 역할을 한다.. 개념을 이해 하시면 됨..
	 * 이러한 역할을 하는 생성자는 기본적으로 프로그래머가 정의를 하나도 하지 않을 경우엔 컴파일러가 컴파일시에 자동으로 넣어준다 
	 * 이를 기본 생성자라고 한다. 이 기본 생성자는 파라미터가 하나도 없는 생성자이다. 
	 * 만약, 프로그래머가 하나 이상의 생성자를 정의하면 캄퍼일러는 더이상 기본 생성자를 제공하지 않는다. ---> 매우 중요함. 
	
	 * 생성자의 형식(문법): 생성자의 정의 문법은 리턴타입이 없는 메서드로 생각하면 쉽다. 단 이름은 반드시 클래스명과 같아야 한다. 
	 * 필요에 따라서 파라미터를 추가할 수 있다. 이렇게 정의된 생성자를 통해 객체를 원하는대로 초기화해서 생성할 수 있도록 하는데 주 목적이 있다. 
	 * 메서드 : ex> public void move() //  생성자 : ex> public move()
	 */
	 
	 
	// 기본 생성자  
//	public SCV() {
//		
//		name = null;
//		rank = null;
//		kill =0;
//		hp = 0; 
//	}
	 
	public SCV(String name) {
		super("테란 SCV"); // 부모의 정의된 생성자(Terran(String unitType){})를 명시적으로 호출한다... 
		// 이유는 부모가 생성자를 정의하면 기본생성자는 더이상 지원되지 않기 떄문에 
		// 자식 입장에서는 명시적으로 정의된 생성자중 하나를 호출해야 한다. 
		// 코드 생성자에서 super는 한번밖에 사용이 안됨
		this.name= name;
	}

	
	public SCV(String name, String rank) {
		// this() 생성자 코드. 이미 정의된 다른 생성자를 호출할 때 사용한다. 
		// 단, 반드시 생성자 첫머리에서만 허용되고, 한번밖에 호출 할 수 없다.
		this(name);
		// this ==> 내 자신의 객체를 나타낸다. this.--> 자신객체가 소유하고 있는 필드나 메서드를 호출 할때 사용한다. 
		this.rank = rank;
	}
	
	public SCV(String name, String rank,int kill) {
		this(name,rank);
		this.kill=kill;
	}
	
	/*
	 * 생성자(메서드) Signature : 이 개념은 생성자의 메서드에 동일하게 정의 된다. 
	 * 먼저 Signature 라는 개념은 메서드(이후 메서드로 통일함)의 파라미터의 특징을 말한다. 
	 * 파라미터의 갯수,순서,타입이 모두 같은 경우엔 Signature가 같다라고 인식한다.(메서드 이름이 같은 경우에만..) 
	 * 만약 위 3의 Signature 중 하나라도 틀린 경우엔 Signature로 인식하여, 중복 메서드 정의가 아니라고 판단한다. 
	 * 이렇게 하나의 메서드명 또는 생성자 명으로 시그니쳐만 틀리게 정의하는 것은 메서드 오버로딩(Overloading)이라고 한다. 
	 */
	// 생성자 오버로딩 기억하세요. 
	public SCV(String name, String rank,int kill,int hp) {
		this(name,rank,kill);
		this.hp=hp;
	}
	
	// SCV 객체의 속성을 리턴하는 getter 정의
	public String getName(){
		return name;
	}
	public int getHp() {
		return hp;
	}
	public int getKill() {
		return kill;
	}
	public String getRank() {
		return rank;
	}
	
	public void getAttack() {
		if(this.hp == TerranUnitProper.DEATH_HP )
			System.out.println("SCV가 전사했습니다.");
	}
	//set --> 처음에 변수를 정의하고, 나중에 값이 변경될 때, 변경이 되는 값이 생성될때
	public void setHp(int hp) {//200
		
		if(this.hp==60) { // if는 탈출구문이 없음. --> 조건이 맞는 한 계속 됨. 
			System.out.println("현재 피가 충분합니다.");
			return; // void 메서드에서 return 을 호출하면 명시적으로 메서드를 끝낸다는 의미입니다. 
			// 더이상 아래의 if문으로 내려가지 않고, 이 메서드를 끝냄. 
		}
		if(this.hp<60) {
			this.hp += hp; 
		}
	}
	
	public void setKill(int kill) {
		this.kill += kill;
	}
	
	// 이동 메서드 정의
	public void move(int x, int y ){//메서드 파라미터.. 이 메서드가 수행해야 할 일중에 필요한 정보를 받아야 한다면 이 파라미터에 타입변수, 타입 변수 형태로 선언한다. 
		System.out.println(name + "이(가)["+x + ","+y+"]로 이동했습니다." );
		}

	//공격 메서드 정의
	public void attack(String target) {
		System.out.println(name + "이(가)"+ target+"을 용접봉으로 공격합니다.");
	}
	
	// SCV의 속성을 문자열로 출력하는 toString() 재정의
	public String toString( ) { 
		return super.toString()+ "\n이름 : " + this.name + " 계급 : "+ this.rank + " 피통 : "+ this.hp + " kills : "+ this.kill; 
	}
	
	@Override
	public void Speak() {
		// TODO Auto-generated method stub
		System.out.println("SCV가 말합니다.");
	}
}

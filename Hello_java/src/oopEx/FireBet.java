package oopEx;

public class FireBet extends Terran implements SteamPack{
	
	 String name; 
    String rank; 
    int kill;
	 int hp =60;
	
	
	public FireBet(String name) {
		super("테란 파이어벳"); // 부모의 정의된 생성자(Terran(String unitType){})를 명시적으로 호출한다... 
		// 이유는 부모가 생성자를 정의하면 기본생성자는 더이상 지원되지 않기 떄문에 
		// 자식 입장에서는 명시적으로 정의된 생성자중 하나를 호출해야 한다. 
		// 코드 생성자에서 super는 한번밖에 사용이 안됨
		this.name= name;
	}

	
	public FireBet(String name, String rank) {
		// this() 생성자 코드. 이미 정의된 다른 생성자를 호출할 때 사용한다. 
		// 단, 반드시 생성자 첫머리에서만 허용되고, 한번밖에 호출 할 수 없다.
		this(name);
		// this ==> 내 자신의 객체를 나타낸다. this.--> 자신객체가 소유하고 있는 필드나 메서드를 호출 할때 사용한다. 
		this.rank = rank;
	}
	
	public FireBet(String name, String rank,int kill) {
		this(name,rank);
		this.kill=kill;
	}
	
	public FireBet(String name, String rank,int kill,int hp) {
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
	
	//set --> 처음에 변수를 정의하고, 나중에 값이 변경될 때, 변경이 되는 값이 생성될때
	public void setHp(int hp) {//200
		
		if(this.hp==50) { // if는 탈출구문이 없음. --> 조건이 맞는 한 계속 됨. 
			System.out.println("현재 피가 충분합니다.");
			return; // void 메서드에서 return 을 호출하면 명시적으로 메서드를 끝낸다는 의미입니다. 
			// 더이상 아래의 if문으로 내려가지 않고, 이 메서드를 끝냄. 
		}
		if(this.hp<50) {
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
		System.out.println(name + "이(가)"+ target+"을화염방사기로 공격합니다...");
	}
	
	// SCV의 속성을 문자열로 출력하는 toString() 재정의
	public String toString( ) { 
		return super.toString()+ "\n이름 : " + this.name + " 계급 : "+ this.rank + " 피통 : "+ this.hp + " kills : "+ this.kill; 
	}


	@Override
	public void Speak() { // implement : 바디가 없는 추상 메서드를 자식 클래스에서 재정의(바디를 추가하여 내용을 넣는 것) 하는 것을 말한다. 
		// 여기서 주의해야 할 것은 문법상 내용은 의미가 없다라는 것.. 바디를 넣는 순간 컴파일러는 재정의 했다라고 간주한다. 
		System.out.println("Need Fire!!");
	}


	@Override
	public void SteamPack() {
		// TODO Auto-generated method stub
		System.out.println("파이어벳이 스팀팩을 이용해서 이속과 공속이 증가합니다. ");
	}
	
	
	
	
}

package oopEx;

// Attactable�� �������̽��� ��ӹ޾ұ� ������ �ڽ� ��ӹ��� Marine Ŭ���� �ڽ� ���� abstract (�߻�Ŭ����)�� �Ǿ�� �Ѵ�.. 
// �ƴϸ� Marine�� Attackable�� �޼��带 �������̵��ϰų�
public class Marine extends Terran implements Attackable,SteamPack {
	
	 String name; 
    String rank; 
    int kill;
	 int hp =60;
	
	
	public Marine(String name) {
		super("�׶� ����"); // �θ��� ���ǵ� ������(Terran(String unitType){})�� ��������� ȣ���Ѵ�... 
		// ������ �θ� �����ڸ� �����ϸ� �⺻�����ڴ� ���̻� �������� �ʱ� ������ 
		// �ڽ� ���忡���� ��������� ���ǵ� �������� �ϳ��� ȣ���ؾ� �Ѵ�. 
		// �ڵ� �����ڿ��� super�� �ѹ��ۿ� ����� �ȵ�
		this.name= name;
	}

	
	public Marine(String name, String rank) {
		// this() ������ �ڵ�. �̹� ���ǵ� �ٸ� �����ڸ� ȣ���� �� ����Ѵ�. 
		// ��, �ݵ�� ������ ù�Ӹ������� ���ǰ�, �ѹ��ۿ� ȣ�� �� �� ����.
		this(name);
		// this ==> �� �ڽ��� ��ü�� ��Ÿ����. this.--> �ڽŰ�ü�� �����ϰ� �ִ� �ʵ峪 �޼��带 ȣ�� �Ҷ� ����Ѵ�. 
		this.rank = rank;
	}
	
	public Marine(String name, String rank,int kill) {
		this(name,rank);
		this.kill=kill;
	}
	
	public Marine(String name, String rank,int kill,int hp) {
		this(name,rank,kill);
		this.hp=hp;
	}
	
	// SCV ��ü�� �Ӽ��� �����ϴ� getter ����
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
	
	//set --> ó���� ������ �����ϰ�, ���߿� ���� ����� ��, ������ �Ǵ� ���� �����ɶ�
	public void setHp(int hp) {//200
		
		if(this.hp==50) { // if�� Ż�ⱸ���� ����. --> ������ �´� �� ��� ��. 
			System.out.println("���� �ǰ� ����մϴ�.");
			return; // void �޼��忡�� return �� ȣ���ϸ� ��������� �޼��带 �����ٴ� �ǹ��Դϴ�. 
			// ���̻� �Ʒ��� if������ �������� �ʰ�, �� �޼��带 ����. 
		}
		if(this.hp<50) {
			this.hp += hp; 
		}
	}
	
	public void setKill(int kill) {
		this.kill += kill;
	}
	
	// �̵� �޼��� ����
	public void move(int x, int y ){//�޼��� �Ķ����.. �� �޼��尡 �����ؾ� �� ���߿� �ʿ��� ������ �޾ƾ� �Ѵٸ� �� �Ķ���Ϳ� Ÿ�Ժ���, Ÿ�� ���� ���·� �����Ѵ�. 
		System.out.println(name + "��(��)["+x + ","+y+"]�� �̵��߽��ϴ�." );
		}

	//���� �޼��� ����
	public void attack(String target) {
		System.out.println(name + "��(��)"+ target+"�� ��������� �����մϴ�.");
	}
	
	// SCV�� �Ӽ��� ���ڿ��� ����ϴ� toString() ������
	public String toString( ) { 
		return super.toString()+ "\n�̸� : " + this.name + " ��� : "+ this.rank + " ���� : "+ this.hp + " kills : "+this.kill ;
	}

	@Override
	public void Speak() {
		// TODO Auto-generated method stub
		System.out.println("������ �����ϰ� �����մϴ�. ");
	}

	@Override
	public void SteamPack() {
		// TODO Auto-generated method stub
		System.out.println("������ �������� ����޾Ƽ� �̼Ӱ� ������ �����մϴ�.");
	}


	}
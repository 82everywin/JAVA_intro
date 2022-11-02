package oopEx;

public class SCV extends Terran{
	
	// �Ӽ�����(����ʵ�)
	// EnCapsulation : �ϸ� ĸ��ȭ.. �Ӽ��̳� �޼������ �ڽ��� Ŭ���� �ܿ� �ܺο��� ����(Access) ���� ���ϵ��� ��ȣ�ϴ� ����.
	// JAVA������ private �̶�� Ű���带 �����ϸ� ���� ������ ĸ��ȭ�� ������ �� �ִ�. �ݴ�� public�� ���� ������ �����̴�... �� ������ ���� �����ϴ�. 
	 String name; // SCV �̸� �ʵ�
    String rank; // ���
    int kill;
	 int hp =60;// ������ ��ĩ��
	
	/*
	 * ������(Constructor) : Ŭ�������� ���� ��ü�� ���������ִ� ������ �ϴ� �ڵ�.. 
	 * ���� �����ڸ� �̿��ؼ� ��ü�� �ʵ带 ���ϴ� ������ �ʱ�ȭ �ϴ� ���ҵ� �Ѵ�. 
	 * ���� 3 : �����ڸ� ���� Ŭ������ ��ü�� �����ϴ� ���̵� ������ �����ϴ� ������ �Ѵ�.. ������ ���� �Ͻø� ��..
	 * �̷��� ������ �ϴ� �����ڴ� �⺻������ ���α׷��Ӱ� ���Ǹ� �ϳ��� ���� ���� ��쿣 �����Ϸ��� �����Ͻÿ� �ڵ����� �־��ش� 
	 * �̸� �⺻ �����ڶ�� �Ѵ�. �� �⺻ �����ڴ� �Ķ���Ͱ� �ϳ��� ���� �������̴�. 
	 * ����, ���α׷��Ӱ� �ϳ� �̻��� �����ڸ� �����ϸ� į���Ϸ��� ���̻� �⺻ �����ڸ� �������� �ʴ´�. ---> �ſ� �߿���. 
	
	 * �������� ����(����): �������� ���� ������ ����Ÿ���� ���� �޼���� �����ϸ� ����. �� �̸��� �ݵ�� Ŭ������� ���ƾ� �Ѵ�. 
	 * �ʿ信 ���� �Ķ���͸� �߰��� �� �ִ�. �̷��� ���ǵ� �����ڸ� ���� ��ü�� ���ϴ´�� �ʱ�ȭ�ؼ� ������ �� �ֵ��� �ϴµ� �� ������ �ִ�. 
	 * �޼��� : ex> public void move() //  ������ : ex> public move()
	 */
	 
	 
	// �⺻ ������  
//	public SCV() {
//		
//		name = null;
//		rank = null;
//		kill =0;
//		hp = 0; 
//	}
	 
	public SCV(String name) {
		super("�׶� SCV"); // �θ��� ���ǵ� ������(Terran(String unitType){})�� ��������� ȣ���Ѵ�... 
		// ������ �θ� �����ڸ� �����ϸ� �⺻�����ڴ� ���̻� �������� �ʱ� ������ 
		// �ڽ� ���忡���� ��������� ���ǵ� �������� �ϳ��� ȣ���ؾ� �Ѵ�. 
		// �ڵ� �����ڿ��� super�� �ѹ��ۿ� ����� �ȵ�
		this.name= name;
	}

	
	public SCV(String name, String rank) {
		// this() ������ �ڵ�. �̹� ���ǵ� �ٸ� �����ڸ� ȣ���� �� ����Ѵ�. 
		// ��, �ݵ�� ������ ù�Ӹ������� ���ǰ�, �ѹ��ۿ� ȣ�� �� �� ����.
		this(name);
		// this ==> �� �ڽ��� ��ü�� ��Ÿ����. this.--> �ڽŰ�ü�� �����ϰ� �ִ� �ʵ峪 �޼��带 ȣ�� �Ҷ� ����Ѵ�. 
		this.rank = rank;
	}
	
	public SCV(String name, String rank,int kill) {
		this(name,rank);
		this.kill=kill;
	}
	
	/*
	 * ������(�޼���) Signature : �� ������ �������� �޼��忡 �����ϰ� ���� �ȴ�. 
	 * ���� Signature ��� ������ �޼���(���� �޼���� ������)�� �Ķ������ Ư¡�� ���Ѵ�. 
	 * �Ķ������ ����,����,Ÿ���� ��� ���� ��쿣 Signature�� ���ٶ�� �ν��Ѵ�.(�޼��� �̸��� ���� ��쿡��..) 
	 * ���� �� 3�� Signature �� �ϳ��� Ʋ�� ��쿣 Signature�� �ν��Ͽ�, �ߺ� �޼��� ���ǰ� �ƴ϶�� �Ǵ��Ѵ�. 
	 * �̷��� �ϳ��� �޼���� �Ǵ� ������ ������ �ñ״��ĸ� Ʋ���� �����ϴ� ���� �޼��� �����ε�(Overloading)�̶�� �Ѵ�. 
	 */
	// ������ �����ε� ����ϼ���. 
	public SCV(String name, String rank,int kill,int hp) {
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
	
	public void getAttack() {
		if(this.hp == TerranUnitProper.DEATH_HP )
			System.out.println("SCV�� �����߽��ϴ�.");
	}
	//set --> ó���� ������ �����ϰ�, ���߿� ���� ����� ��, ������ �Ǵ� ���� �����ɶ�
	public void setHp(int hp) {//200
		
		if(this.hp==60) { // if�� Ż�ⱸ���� ����. --> ������ �´� �� ��� ��. 
			System.out.println("���� �ǰ� ����մϴ�.");
			return; // void �޼��忡�� return �� ȣ���ϸ� ��������� �޼��带 �����ٴ� �ǹ��Դϴ�. 
			// ���̻� �Ʒ��� if������ �������� �ʰ�, �� �޼��带 ����. 
		}
		if(this.hp<60) {
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
		System.out.println(name + "��(��)"+ target+"�� ���������� �����մϴ�.");
	}
	
	// SCV�� �Ӽ��� ���ڿ��� ����ϴ� toString() ������
	public String toString( ) { 
		return super.toString()+ "\n�̸� : " + this.name + " ��� : "+ this.rank + " ���� : "+ this.hp + " kills : "+ this.kill; 
	}
	
	@Override
	public void Speak() {
		// TODO Auto-generated method stub
		System.out.println("SCV�� ���մϴ�.");
	}
}

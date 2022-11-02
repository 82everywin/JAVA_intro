package oopEx;

public class PlayStarcraft {
	public static void main(String[] args) {
		// ��ü�� �����ϴ� ������. ClassName Ref���� = new Class �� �����ڸ� ȣ��(); // Heap �޸𸮿����� ��ü�� �����Ѵ�. 
		
		SCV scv4 = new SCV("SCV4","�̺�", 0, 60); // Instantiation(�ν��Ͻ�ȭ)����
		Marine marine = new Marine("Marine", "�̺�", 0, 40);
		FireBet firebet = new FireBet("FireBet", "��", 0, 40);
		Medic medic = new Medic(); //default ������
		
		// �߻�Ŭ������ Ref �׽�Ʈ �ڵ�..
		Terran t = marine;
		
		
		
		
		// Terran ��ü�� �ϳ� �����غ��ô�. 
		// ���� ���ӿ����� �� ��ü�� �ʿ������ ������ ���� �������� �����غ��ô�. 
		// Terran terran = new Terran("�׶�����");
		 
//		terran = scv4; // Super type���� ���� instance�� Ref �� ���.. �������� �� ��;;
//		SCV scv5 = (SCV) terran; // terran(super)�� ���� SCV�� Ref�� ������. ��Ӱ����̹Ƿ�.. ���������� �������� �� ��..
		// ������ Type Casting�� �̷������ ���� �� ����..
		
	
		Terran[] units = {scv4,marine,firebet,medic};
		
//		terran = (SCV) units[0];
		//terran.attack("�����佺");
		
//		for(Terran t : units) { // �̰� ���� for����..���߿� �����ҰԿ�
//		System.out.println(t.toString()); // �������� ������ ���� Ref�ϴ� Instance�� toString()�� ȣ��ȴ�. 
//		}
		
		for(int i =0; i<units.length;i++) {
		//	if(i==0) {
				Terran anyUnit = units[(int)(Math.random()*4)];
				System.out.println(anyUnit.toString());
				
				// ���ݱ���� interface�� ��� ���� ���� ���ָ� attack �ϵ��� ȣ���Ѵ�. �翬�� �������̵�(implement)�� �޼��尡 ȣ��ȴ�. 
				if(anyUnit instanceof Attackable)
					((Attackable) anyUnit).attack("�����佺");
				if(anyUnit instanceof Medic)
					((Medic)anyUnit).healing(); // ������ �켱����
				if(anyUnit instanceof SteamPack)
					((SteamPack) anyUnit).SteamPack();
		//}
		}
		
	

//		System.out.println(scv4);
//		System.out.println(marine);
//		System.out.println(firebet);
		
		
		/*
		 * ��ü������ ������(Polymorphism) : �������̶� ��Ӱ��迡 �ִ� Ư�� ��ü��  Ref �Ҷ�, Super, Super�� Super �Ǵ� �ڽ��� 
		 * Ÿ������ Ref �� �� �ִ� ���¸� ���մϴ�.�̶� �����ؾ� �� ���� ������ ��ü �� Ŭ������ �����ڸ� ȣ���Ͽ� ������� ��ü�� ����
		 * Ŭ���� Type�� �޸𸮿��� ����� �� ���� ���� �Һ��ϴٴ� ���Դϴ�. ������, Ref Ÿ���� Super Ÿ������ �Ǿ����� ���� �����ϰ�
		 * casting �� ���� ������ ������ ������ �����մϴ�. ����,��ü�� Ŭ�������� ���ǵǾ��� �޼��带 �θ�Ÿ������ Ref ���� �� ȣ���ϰ�
		 * �Ǹ� ������ ������ �����մϴ�. ���� ������ Type Casting�� ���� ȣ���ؾ� �մϴ�.  
		 */
	}
}


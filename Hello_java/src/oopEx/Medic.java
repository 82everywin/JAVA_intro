package oopEx;

public class Medic extends Terran {

	public Medic() {
		super("�޵�");
	}

	// ġ�Ḧ �ϴ� healing �޼��� ���� 
	public void healing()	{
		System.out.println("�޵��� �ֺ��� �ִ� �׶� ������ ġ���մϴ�.");
	}

	@Override
	public void Speak() {
		// TODO Auto-generated method stub
		System.out.println("�޵��� �����մϴ�..");
	}
}

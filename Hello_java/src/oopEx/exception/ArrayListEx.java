package oopEx.exception;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.omg.PortableInterceptor.ForwardRequest;

public class ArrayListEx {

	ArrayList<Integer>al1=new ArrayList<Integer>();
	List al2=new ArrayList();
	Collection al3 = new ArrayList();
	
	al1=(ArrayList)al3;
	
	//Array
	al1.add(5);
	al1.add(4);
	al1.add(3);
	al1.add(2);
	al1.add(1);
	al1.add(0);
	al1.add(3);// �ߺ� ������ �߰�
	//al1.add("5"); // �ٸ�Ÿ���� ������ �߰�..
	
//	for(int i=0;i<al1.size();i++) {
//		//Element(������)�� ������ get(index  i)�� �̿��ؼ� ����. 
//		//ArrayList�� ������ Type ������ ���� ������ �⺻������ Object ������ add �ȴ�..
//		//Object obj=al1.get(i);
//		Integer itg = al1.get(i);
//		System.out.println(itg);
//	}
	
	//List�� Ư�� �κм¸� �����ؼ� ArrayList�� �����ڿ� �����غ���. 
	List ll = al1.subList(1,4); // 1~3 index�� �����͸� �κ������� �����Ͽ� List�� ��´�. 
	for(Integer i: ll) { // ���� for ����.. ll List�� for ������ ������ �ڵ����� ���鼭 �� ��Ҹ� �����Ѵ�. 
		// ���� ll�� Integer type ���� Ÿ�������� �Ǿ��⿡ ����Ÿ�Ե� �翬�� Integer ��ü�̴�. 
		// ���� ���ϵǴ� ��ü�� Ref�ϴ� ������ ù �׿� �ְ� �Ǹ� (ex: Integer i)���ϵǴ� ��Ұ�ü�� i�� ref�ϰ� �ȴ�. 
		System.out.println(i);
	}	
	//���ð����� ��� ����޴� Collection Ŭ������ �޼��带 �̿��ؼ� List ������ ������ ����(sort)�غ��ϴ�.
	ArrayList<String> list3= new ArrayList<String>();
	list3.add("������");
	list3.add("�̸��");
	list3.add("�ڱ���");
	list3.add("�빫��");
	list3.add("Iron man");
	list3.add("Super Man");
	list3.add("Bat Man");
	list3.add("Captin America");

	//Collection�� Sort() �޼��带 �̿��ϸ� ���������� �⺻���� ���Ľ����ش�. 
	Collection.sor(list3);
	for(String s : list3) {
		System.out.println(s);
	}
	System.out.println(al1.retainAl1(ll));
	
}

}

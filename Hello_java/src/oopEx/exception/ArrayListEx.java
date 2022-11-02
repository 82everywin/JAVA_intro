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
	al1.add(3);// 중복 데이터 추가
	//al1.add("5"); // 다른타입의 데이터 추가..
	
//	for(int i=0;i<al1.size();i++) {
//		//Element(데이터)를 얻어낼때는 get(index  i)를 이용해서 얻어낸다. 
//		//ArrayList를 생성시 Type 지정을 하지 않으면 기본적으로 Object 형으로 add 된다..
//		//Object obj=al1.get(i);
//		Integer itg = al1.get(i);
//		System.out.println(itg);
//	}
	
	//List의 특정 부분셋만 추출해서 ArrayList의 생성자에 전달해본다. 
	List ll = al1.subList(1,4); // 1~3 index의 데이터만 부분적으로 추출하여 List에 담는다. 
	for(Integer i: ll) { // 향상된 for 구문.. ll List를 for 루프가 끝까지 자동으로 돌면서 각 요소를 리턴한다. 
		// 현재 ll은 Integer type 으로 타입지정이 되었기에 리턴타입도 당연히 Integer 객체이다. 
		// 따라서 리턴되는 객체를 Ref하는 변수를 첫 항에 넣게 되면 (ex: Integer i)리턴되는 요소객체를 i가 ref하게 된다. 
		System.out.println(i);
	}	
	//전시간에서 잠시 언급햇던 Collection 클래스의 메서드를 이용해서 List 내부의 값들을 정렬(sort)해봅니다.
	ArrayList<String> list3= new ArrayList<String>();
	list3.add("문재인");
	list3.add("이명박");
	list3.add("박근혜");
	list3.add("노무현");
	list3.add("Iron man");
	list3.add("Super Man");
	list3.add("Bat Man");
	list3.add("Captin America");

	//Collection의 Sort() 메서드를 이용하면 오름차순을 기본으로 정렬시켜준다. 
	Collection.sor(list3);
	for(String s : list3) {
		System.out.println(s);
	}
	System.out.println(al1.retainAl1(ll));
	
}

}

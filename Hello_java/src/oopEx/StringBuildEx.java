package oopEx;

public class StringBuildEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb  = new StringBuilder("abc");
		System.out.println(sb.capacity());
		sb = new StringBuilder(1000);
		System.out.println(sb.capacity());
		
		System.out.println(sb.length());
		System.out.println(sb.append("hi"));
		System.out.println(sb.insert(2," hello hi  "));

		System.out.println(sb);
		
		String sb2 = "abc";
		sb=null;
		sb= new StringBuilder("abc");
		
		//String ��ü�� StringBuilder ��ü���� equals() �� ���ÿ� StringBuilder ��ü�δ� �� �񱳰� �ȵ˴ϴ�.
		// ������ ��üŸ���� String �ƴ� ��쿣 false�� �����ϵ��� ���������õǾ��� �����Դϴ�.
		// ������ �ݵ�� �� ��ü�� ���� �񱳽ÿ� StringBuiler�� toString �� ȣ���Ͽ� Ÿ�� ��ġ�� ���ּž� �մϴ�. 
		if(sb2.equals(sb.toString())) {
			System.out.println("���� �����ϴ�.");
		}
	}

}

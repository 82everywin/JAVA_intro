
public class StarArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 동적 가변배열이란걸 볼겁니다. 이넘(놈)은 Outer 배열만 생성하고 Inner 배열은 동적으로 필요시에 생성하는 걸 뜻합니다.
		 * 알아도 그만 몰라도 그만입니다. 
		 */
		
		char[] stars[] = new char[10][];
		
		// 객체는 프로그램 시작이후에 생성됩니다. 객체는 JVM이 만들어 줍니디. 
		
		for(int i=0;i<stars.length;i++) {
			stars[i] = new char[i+1];
			for(int j=0;j<stars[i].length;j++) {
				// 이제 각 가구에 값를 넣어줄겁니다.
				stars[i][j]='*';
				System.out.print(stars[i][j]);
			}
			System.out.println();
		}
		
	}

}

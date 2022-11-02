/*
 * 자바의 조건문
 * 
 * 자바에서는 조건에 따라서 실행 구문이 분기 되도록 하는 분기문을 두고 있습니다. 
 * 
 * 종류로는 if, else if, else 등의  if 구문과, switch(비굣값){case 비교값 : true 시 실행구문 break
 * case 비교값 : true 시 실행구문 break, case 비교값 : true 시 실행구문 break, default
 * }이 있습니다. 
 * 
 * 이중 90% 이상은 if 구문을 조건문으로 활용하고, 나머지가 switch~case 구문을 사용합니다. 
 * 
 * if(조건식 or 논리값)은 단일로 또는 else를 세트로, 또는 if, else if(조건식) 등으로 목적에 따라서
 * 다양하게 구현 할 수 있습니다. 위의 각 조건문 if, else if, else 내부에는 필요에  따라서 또다른 조건식이 
 * 중첩될 수 있습니다. 
 * 
 */
public class IFEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int axle = 4; //낡은 쇠도끼..
		
		if(axle == 1 ) {//금도끼니??
			System.out.println("금도끼를 나무꾼에게 건네어 줍니다. ");
			System.out.println("신령님이 사라졌습니다.");
		}else if(axle==2) {//은도끼니?
			System.out.println("은도끼를 나무꾼에게 건네어 줍니다.");
		}else if(axle==3) {//동도끼니?? 
			System.out.println("동도끼를 나무꾼에게 건네어 줍니다.");
		}else {// else에는 조건식을 넣을 수 없습니다. 
			System.out.println("정직한 나무꾼이구나...이 모든 도끼를 네게 주마... ");
		}
	}

}

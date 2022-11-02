package oopEx.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExceptionEx1 {
	
	// 파일 이름과 , 출력할 메세지를 주면 해당 파일에 메세지를 출력해서 파일 생성을 하는 메서드 정의합니다.
	static void saveMessage(String fileName, byte[] b)throws FileNotFoundException, IOException {
		
		FileOutputStream fos = null;
		
		fos = new FileOutputStream(fileName);
		fos.write(new byte[] {65,66,67});
		fos.flush();
		fos.close();
	}
	// 주어진 파일을 찾아서 내용을 전달하는 메서드 정의.. 
	static int getMessage(String fileName) throws IOException {
		FileInputStream fis = new FileInputStream(fileName);
		int i = fis.read();
		return i;
		
	}
	
	public  static void main(String[] args) throws FileNotFoundException, IOException {
		 
		// 예외 핸들링 1번 방법 : 프로그래머가 에외가 발생할 코드 블락은 try{}로 감싼다. 
		// 여기서 주의 : try와 catch() 는 한 쌍으로 사용되는데, try 내에서 선언된 변수는 직역변수임을 명심한다. 
		// 즉 catch에서 사용할거면 try 밖에서 선언해야 한다. 
	
		// 예외 핸들링 2번 방법 : 예외가 발생될 수 있는 코드블럭이 있는 메서드나 생성자에서 예외를  try~catch 하지 않을 경우엔
		// 생성자, 메서드 선언부 끝에 throws 를 이용해서 예외가 발생될 코드가 있음을 선언 해줘야 합니다. 이래야 컴파일러가 컴파일을 해줍니다. 
		// 단 알려진 예외인 경우만 해당됩니다.
		// throws는 선언 및 예외 전가를 한다는 의미입니다. 전가라는 의미는 예외가 발생하면 발생한 예외 객체를 호출한 놈 (caller)에게 전달한다는
		// 의미 입니다. 이렇게 계속 전가될 경우, 아무도 catch하지 않는다면 결국엔 프로그램이 예외 떄문에  비정상적으로 종료되게 됩니다. 
		// 즉 언젠가는 catch를 해야 한다는 의미입니다. 
		
		// 일부러 틀린 파일이름을 줘서 파일을 읽을 때 예외를 발생시킵니다. 
		try {
		int i = getMessage("yourdata.dat");
		}catch (IOException e1) {
			System.out.println(e1.getMessage());
		}
		
		
//		int a = 10, b=0;
//		try {
//				System.out.println(a/ b);
//		}catch(ArithmeticException e) {
//			System.out.println("0으로 나눌 수 없습니다. 재 입력 바랍니다. \n 니가 넣은 두번쨰 수 : "+b);
//			System.out.println(e.getMessage());
//		}
		
		/*
		 * 다중 catch 하는 방법
		 * 코드 블럭에서 하나 이상의 예외가 발새오디는 경우에 핸들링 하는 방법을 알아봅니다. 
		 */
		
		//File에다가 byte data를 쓰면서 발생되는 예외 핸들링..
		
		
		
		
		
		
		
	}
}

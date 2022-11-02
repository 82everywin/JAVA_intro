package oopEx.exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 알려진 예외 테스트 해보기 : 알려진 예외란 Exception 하위 타입으로 RuntimeException 이하의 예외를 제외한 모든 예외를 말한다. 
 * 이 예외는 컴파일시에 컴파일러가 관여하기 떄문에(왜냐면 예외가 발생할 수 있다고 이미 선언되었기 떄문에) 프로그래머가 예외 핸들링(Exception Handling)
 * 을 하지 않을 시엔 컴파일 에러가 발생된다. 반대로 RuntimeException 하위 예외들은 컴파일러가 관여하지 않는 예외이다. 단 핸들링을 하지 않은 경우
 * 예외가 발생되면 프로그램은 그 시점에 비정상적으로 종료된다.
 */
public class CheckExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열을 파일에 저장하는 예제.. 여기서 사용되는 모든 API는 모두 알려진 예외들이다.
		String message="자바 파일만들기ㅣㅣㅣ";
		
		String fileName = "myFirstFile.txt";
		
		File file = new File(fileName);
		
		//스트링을 이용해서 File 에 데이터를 쓰는 API 사용...나중에 배웁니다. 
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(file);
			fw.write(message);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

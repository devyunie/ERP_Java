package Chapter2;

import java.text.AttributedCharacterIterator.Attribute;

import javax.swing.tree.ExpandVetoException;

// 클래스 : 공통된 속성과 기능을 정의해둔 것
//[접근제어자] class 클래스명 { 속성, 기능 }
class ExampleCalss1 {
	// 속성 : 클래스가 가질수 있는 정보나 상태
	// 일반적으로 변수로 표현

	// 인스턴스 변수 : 각 인스턴스마다 독립적으로 값을 가지는 변수
	int attribute1;
	double attribute2;

	// 클래스 변수 : 해당 클래스로 생성괸 모든 인스턴스가 공유하는 변수
	// 필드 앞에 static 키워드를 사용하여 지정
	// 인스턴스 없이 클래스에 직접 접근할 수 있다
	static int staticAttribute;

	// 기능 : 클래스가 가질수 있는 행동이나 작업 (메서드)
	// [접근제어자] 반환타입 메서드명 (매개변수타입 매개변수명[,...])
	// {메서드 기능 구현}
	//인스턴스 메서드 : 인스턴스를 생성한 후 사용 할 수 있는 메서드
	//인스턴스 필드를 사용하는 기능에 대해서 인스턴스 메서드를 사용
	int method1(int arg1) {
		// 기능 구현
		// 반환 타입 void가 아니면 반드시 return으로 결과값을 반환해야 함
		return arg1 * arg1;

	}
	//클래스 메서드 : 인스턴스 생성없이 클래스로만 호출 가능한 메서드
	//반환타입 앞에 static 키워드를 붙여서 사용
	//인스턴스 필드를 사용하지 않는 메서드에 주로 사용됨
	//인스턴스 필드를 사용할수 없다.
//	static void staticMethod() {
//		System.out.println(attribute1);
//		method1(5);
//	}
}




//스마트폰
// = 속성 = 
//- 제조사 -> String
//- 제조일자 -> String
//- 모델명 ->  -> String
//- 전화번호 -> String
//- 어플리스트 -> String[]
//- 전원 상태 -> boolean
// = 기능 =
//- 스마트폰 정보보기 -> 제조사, 제조일자, 모델명, 전화번호 
//- 통화 걸기 -> 전화번호만 입력 
//- 어플 설치 -> 어플리케이션 이름 받아와 어플리스트에 추가
//- 문자 보내기  -> 전화번호, 문자내용 
//- 전원 누르기

class SmartPhone {

	String manufacturer; // 제조사
	String manufacturerDate; // 제조일자
	String modelName; // 모델명
	String telNumber; // 전화번호
	String[] appList = new String[0]; // 앱리스트
	boolean powerStatus; // 전원 상태

	void printInformation() {
		System.out.println("===== 정보 =====");
		System.out.println("제조사: :" + manufacturer);
		System.out.println("제조일자: " + manufacturerDate);
		System.out.println("모델명: " + modelName);
		System.out.println("전화번호: " + telNumber);
	}

	void call(String toTelNumber) {
		System.out.println(telNumber + "가 " + toTelNumber + " 로 전화를 걸었습니다");
	}

	void appInstall(String appName) {
		String[] newApplist = new String[appList.length + 1];
		for (int index = 0; index < appList.length; index++) {
			newApplist[index] = appList[index];
		}
		newApplist[newApplist.length - 1] = appName;
		appList = newApplist;
	}

	void sendMessage(String toTelNumber, String message) {
		System.out.println(telNumber + "가 " + toTelNumber + "에게 " + message + "를 전송했습니");
	}

	void pressPowerBuffon() {
		powerStatus = !powerStatus;
	}

}

//한국인
//=속성=
//이름
//나이
//국적 
class Korean {
	String name;
	int age;
	static String nationality = "대한민국";

}

//삼각함수
//빗변 구하기
//둘레 구하기
//sin 구하기
//cos 구하기
//tan 구하기
class TriangleMath {
	
//------------------------------------------------------------------------------	
	//PI, getCircleArea(double)은 SRP원칙에 위배됨 -> 단일책임원
	static final double PI = 3.1415;

	static double getCircleArea(double radius) {
		if(radius<=0) return 0;
		double area = radius * radius * PI;
		return area;
	}
//-------------------------------------------------------------------------------
	static double getHypotenuse(double bottom, double height) {

		if (bottom <= 0 || height <= 0)
			return 0;

		double hypotenuse2 = Math.pow(height, 2) + Math.pow(height, 2);
		double hypotenuse = Math.sqrt(hypotenuse2);

		return hypotenuse;
	}

	static double getcircumference(double bottom, double height, double hypotenuse) {
		if (bottom <= 0 || height <= 0 || hypotenuse <= 0)
			return 0;
		double circumference = bottom + height + hypotenuse;
		return circumference;
	}

	static double getSin(double hypotenuse, double height) {
		if (hypotenuse <= 0 || height <= 0)
			return 0;
		double sin = height / hypotenuse;
		return sin;
	}
}

public class ClassAndObject {

	public static void main(String[] args) {
		// 인스턴스 : 특정 클래스로 정의된 것을 실체화한 객체
		// 클래스명 참조변수명 = new 클래스명();
		ExampleCalss1 instance1 = new ExampleCalss1(); // new ExampleCalaa1 -> 인스턴스
		ExampleCalss1 instance2 = new ExampleCalss1();
		new ExampleCalss1().attribute1 = 30; // ->인스턴스 생성하지만 메모리 할당 및 초기화 불가

		// 인스턴스가 가지고 있는 속성 접근 방법
		// 인스턴스.속성명;
		instance1.attribute1 = 10;
		instance2.attribute2 = 20;

		System.out.println(instance1.attribute1);
		System.out.println(instance2.attribute2);

		// 인스턴스가 가지고 있는 메서드 호출 방법
		// 인스턴스.메서드명(매개변수....)
		int methodResult = instance1.method1(5);
		System.out.println(methodResult);

		instance1.staticAttribute = 10;
		instance2.staticAttribute = 33;
		System.out.println(instance1.staticAttribute);
		System.out.println(instance2.staticAttribute);
		System.out.println(ExampleCalss1.staticAttribute);
		System.out.println("--------------------------");
		SmartPhone ipPhone1 = new SmartPhone();
		SmartPhone galaxt1 = new SmartPhone();

		ipPhone1.manufacturer = "apple";
		ipPhone1.manufacturerDate = "2024-07-12";
		ipPhone1.modelName = "아이폰 15 프로";
		ipPhone1.telNumber = "010-1234-5678";
		ipPhone1.powerStatus = false;

		System.out.println(ipPhone1.manufacturer);
		System.out.println(galaxt1.manufacturer);
		System.out.println(galaxt1.powerStatus);

		ipPhone1.printInformation();
		galaxt1.printInformation();
		ipPhone1.sendMessage("010-1111-2222", "안녕하세");

		Korean korean1 = new Korean();
		Korean korean2 = new Korean();

		korean1.name = "홍길동";
		korean1.age = 20;

		korean1.name = "이영지";
		korean1.age = 30;

		korean1.nationality = "한국";
		System.out.println(korean1.nationality);
		System.out.println(korean2.nationality);

		// TriangleMath triangleMath = new TriangleMath();

		double bottom = 3;
		double height = 4;
		double hypotenuse = TriangleMath.getHypotenuse(bottom, height);
		System.out.println(hypotenuse);
	}

}

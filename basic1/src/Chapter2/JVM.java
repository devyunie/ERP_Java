package Chapter2;

import java.lang.reflect.Method;

//JVM : Java Virtual Machine 자바 가상 기계
//실제 컴파일된 코드를 실행하는 기계
//별도의 메모리 구조를 가지고 있음

//Method Area(메서드 영역)
//-> 모든 곳에서 공유가능한 영역, 각 클래스의 구조를 저장하고 있음

//Heap Area(힙 영역)
//-> 모든 곳에서 공유 가능한 영역, 인스턴스 혹은 배열과 같은 new 연산자를 통해 생성된 객체들이 저장되는 영역

//Stack Area(스택 영역)
//-> 각 스레드(실행 중인 프로세스) 별로 독립적으로 존재하는 영역, 메서드 호출과 로컬 변수에 대한 정보가 저장
//각 코드블럭 마다 하나의 스택 생성


class ExampleClass2 {
	int instanceVariable;
	static int staticVariable;
	
	void instanceMethod() {
		int instanceMethodVariable = 10;
	}
	
	static void staticMethod() {
		int staticMethodVariable = 10;
	}
	
	
}



public class JVM {

	public static void main(String[] args) {
		
		int localVariable1 = 20;
		double localVariable2 =3.5;
		
		if(localVariable1 > 0) {
			int codeBlock1 = 30;
			localVariable1 = codeBlock1;
		}
		System.out.println(localVariable1);
		
		ExampleClass2 instance1 = new ExampleClass2();
		ExampleClass2 instance2 = new ExampleClass2();
		
		instance1.instanceVariable = 10;
		instance1.staticVariable = -99;
		
		instance2.instanceVariable = 55;
		
		instance1.instanceMethod();
		
		method1(localVariable1);
		System.out.println(localVariable1);
		method2(instance1);
		System.out.println(instance1.instanceVariable);
	}
	static void method1(int arg) {
		arg=99999;
	}

	static void method2(ExampleClass2 arg) {
		arg.instanceVariable = 99999;
	}
	
	
}
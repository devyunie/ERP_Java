package chapter2_sub;

//chapter2에 선언된 AccessModifier 클래스는
//접근제어자가 public 이기 때문에 외부 패키지에서 import가
import Chapter2.AccessModifier;

//chapter2 packge에 선언된 AccessModifierRun 클래스는
//접근제어자가 default(package)이기 때문에 외부패키지에서 import 불가
//import Chapter2.AccessModifierRun;

public class AccessModifierSub {
	
	void method() {
		AccessModifier instance = new AccessModifier();
		
		//AccessModifier의 publicVariable 필드는
		//접근제어자가 publoc이기 때문에 외부 패키지에서 접근이 가능
		instance.publicVariable = 0;
		
		//AccessModifier의 protectedVariable,
		//defaultVariable,privateVariable
		//필드는 접근제어자가 protectd, default, private이기
		//때문에 외부 패키지에서 접근이 불가능
//		instance.protectedVariable = 0;
//		instance.defaultVariable = 0;
//		instance.privateVariable = 0;
		
		
	}	
}

class SubCalss extends AccessModifier{
	void method() {
		
//		AccessModifier instance = new AccessModifier();
//		instance.publicVariable = 0;
//		instance.protectedVariable = 0;
//		instance.defaultVariable = 0;
//		instance.privateVariable = 0;
		
		//AccessModifier의 publicVariavle, protectedVariable 필드는
		//접근제어자가 각각 pulic, protected이기 때문에 자손 클래스에 접근이 가
		super.publicVariable = 0;
		super.protectedVariable = 0;
		//AccessModifier의 defaultVariable, privateVariable 필드는
		//접근제어자가 각각 default, private이기 때문에 자손 클래스에서 접근이 불가능
//		super.defaultVariable = 0;
//		super.privateVariable = 0;
		
		
	}
}

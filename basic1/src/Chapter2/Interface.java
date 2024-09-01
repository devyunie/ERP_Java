package Chapter2;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

//인터페이스 : 클래스가 구현해야하는 메서드들을 선언한 참조 타입
//인터페이스의 모든 변수 public static final 형태가 와야함
//인터페이스의 모든 메소드는 public abstract 형태가 와야함
//인터페이스는 다중 구현이 가능

//접근제어자 interface 인터페이스명{...}

interface AreaCalculation {
	public static final double PI = 3.14;

	double getTriangleArea(double bottom, double height);

	double getRectanglelArea(double bottom, double height);

	double getCiclelArea(double radius);
}

interface CicumgerenceCalculation {
	double getCircleCircumference(double radius);

}
//인터페이스는 다중 상속이 가능함 
interface Calculation extends AreaCalculation, CicumgerenceCalculation{
	
}

//인터페이스는 implements 키워드를 이용하여 클래스에서 구현하여 사용 가능
//인터페이스는 다중 구현이 가능함
interface Statment{
	String greet = "안녕하세요.";
}



class MyCaculation implements Calculation{
//	AreaCalculation, CicumgerenceCalculation 

	@Override
	public double getTriangleArea(double bottom, double height) {
		return bottom * height / 2;
	}

	@Override
	public double getRectanglelArea(double bottom, double height) {
		return bottom * height;
	}

	@Override
	public double getCiclelArea(double radius) {
		return radius * radius * PI;
	}

	public double getCircleCircumference(double radius) {
		return 2 * radius * PI;
	}
}
//인터페이스는 개발자간의 상호 약속을 위한 수단으로도 사용됨

public class Interface {

	public static void main(String[] args) {
		double pi = AreaCalculation.PI;
		MyCaculation instance = new MyCaculation();
		// instance.getCiclelArea(10);
		System.out.println(instance.getCiclelArea(10));
		
		System.out.println(Statment.greet);

	}
}

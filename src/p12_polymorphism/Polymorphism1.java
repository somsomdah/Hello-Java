package p12_polymorphism;

abstract class Calc{ // 추상클래스
	int a=5;
	int b=6;
	
	abstract void plus();
}

class MyCalc extends Calc{
	int a=10;
	int b=6;
	
	void plus() {
		System.out.println(a+b);
	}
	
	void minus() {
		System.out.println(a-b);
	}
}

public class Polymorphism1 {

	public static void main(String[] args) {

		MyCalc mc=new MyCalc();
		mc.plus(); mc.minus();
		
		Calc mc2=new MyCalc();
		mc2.plus(); 
		//mc2.minus(); // 다음 메소드는 사용할 수 없다
		
	}

}

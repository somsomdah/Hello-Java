package p15_instanceof;

interface Cry{
	void cry();
}

class Cat implements Cry{
	public void cry() {
		System.out.println("�߿�~");
	}
}

class Dog implements Cry{
	public void cry() {
		System.out.println("�۸�!");
	}
}


public class CheckCry {

	public static void main(String[] args) {
		
		Cry test1 = new Dog();
		
		if (test1 instanceof Cat) {
			test1.cry();
		} else {
			System.out.println("����̰� �ƴմϴ�");
		}		
		

	}

}

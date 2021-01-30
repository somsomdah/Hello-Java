package p15_instanceof;

interface Cry{
	void cry();
}

class Cat implements Cry{
	public void cry() {
		System.out.println("¾ß¿ë~");
	}
}

class Dog implements Cry{
	public void cry() {
		System.out.println("¸Û¸Û!");
	}
}


public class CheckCry {

	public static void main(String[] args) {
		
		Cry test1 = new Dog();
		
		if (test1 instanceof Cat) {
			test1.cry();
		} else {
			System.out.println("°í¾çÀÌ°¡ ¾Æ´Õ´Ï´Ù");
		}		
		

	}

}

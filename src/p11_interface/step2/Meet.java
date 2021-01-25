package p11_interface.step2;

interface Greet{
	void greet();
}

interface Bye extends Greet{
	void bye();
}

class Morning implements Bye{

	@Override
	public void bye() {
		System.out.println("안녕히 계세요");
	}

	@Override
	public void greet() {
		System.out.println("안녕하세요");
	}
	
}

public class Meet {

	public static void main(String[] args) {

		Morning m=new Morning();
		m.bye();
		m.greet();
	}

}

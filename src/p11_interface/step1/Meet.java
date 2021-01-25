package p11_interface.step1;

interface Greet{
	void greet();
}

interface Bye{
	void bye();
}

class Morning implements Greet,Bye{

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
		// TODO Auto-generated method stub
		
		Morning morning=new Morning();
		morning.greet();
		morning.bye();

	}

}

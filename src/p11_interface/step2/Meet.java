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
		System.out.println("�ȳ��� �輼��");
	}

	@Override
	public void greet() {
		System.out.println("�ȳ��ϼ���");
	}
	
}

public class Meet {

	public static void main(String[] args) {

		Morning m=new Morning();
		m.bye();
		m.greet();
	}

}

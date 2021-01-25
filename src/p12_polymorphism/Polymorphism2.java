package p12_polymorphism;


interface Printable{
	void print(String doc); // abstract method
}

class PrnDrvSamsung implements Printable{
	@Override
	public void print(String doc) {
		System.out.println(doc+"\nForm Samsung : Black-White Ver");
	}
}

class PrnDrvEpson implements Printable{
	@Override
	public void print(String doc) {
		System.out.println(doc+"\nForm Epson : Black-White Ver");
	}
}



public class Polymorphism2 {

	public static void main(String[] args) {
		String doc="Print with printer";
		
		Printable prn1=new PrnDrvSamsung();
		Printable prn2=new PrnDrvEpson();
		
		prn1.print(doc);
		prn2.print(doc);
		
		

	}

}

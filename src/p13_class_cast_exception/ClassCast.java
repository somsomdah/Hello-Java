package p13_class_cast_exception;

class ParentBoard {
	
}

class ChildBoard extends ParentBoard{
	
}

public class ClassCast {

	public static void main(String[] args) {
		
		ParentBoard sbd1=new ChildBoard();
		ChildBoard sbd2=(ChildBoard)sbd1; // ����ȯ ����
		
		System.out.println("------------------------");
		
		ParentBoard ebd1=new ParentBoard();
		ChildBoard ebd2=(ChildBoard)ebd1; // ����ȯ �Ұ� -> ������
		
	}

}

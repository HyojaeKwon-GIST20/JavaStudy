package intergaceex;

public class MyclassTest extends MyClass {
	public static void main(String[] args) {
		MyClass mClass = new MyClass();
		
		X xClass = mClass;
		xClass.x();
		
		Y yClass = mClass;
		yClass.y();
		
		MyInterface iClass = mClass;
		iClass.myMethod();
		iClass.y();
		iClass.x();
	}
}	

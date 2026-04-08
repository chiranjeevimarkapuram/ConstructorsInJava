package assignmentblock;

//interface in1 {
//
//	public default void I1() {
//		System.out.println("hi");
//	}
//
//	public static void S1() {
//		System.out.println("Hello");
//	}
//
//}
//
//interface in2 extends in1 {
//	public default void I1() {
//		System.out.println("Hiiiiiiiiiiiiiiiiii");
//	}
//
//	public static void S1() {
//		System.out.println("Bye");
//	}
//
//}
//
//// However We can implements first either first or second Interface, 
//// default method loaded only second Interface only
//public class MultipleInterfaces implements in2, in1 {
//	public static void main(String[] args) {
//		MultipleInterfaces mi = new MultipleInterfaces();
//		mi.I1();// calling interface 2 only
//		in1.S1();
//		in2.S1();
//
//	}
//}


interface I1{
	default void walk() {
		System.out.println("Interface 1 walk method");
	}
	static void run() {
		System.out.println("Interface 1 static run method ");
	}
	default void walking() {
		System.out.println("Interface 1 walking method");
	}
	static void running() {
		System.out.println("Interface 1 running method");
	}
}
interface I2 extends I1{
	
	default void walk() {
		System.out.println("Interface 2 walk method");
	}

	static void run() {
		System.out.println("Interface 2 static run method ");
	}
//	This static method cannot hide the instance method from I1 
//	becoz it is default method in Interface 1
	  
//	static void walking() {
//		System.out.println("Interface 2 walking method");
//	}
	default void running() {
		System.out.println("Interface 2 running method");
	}
}
class A{
	static public void walk() {
		System.out.println("888888");
	}
}
public class MultipleInterfaces implements I2,I1{
	public void walk() {
		System.out.println("Testing walk method");
	}
	public void run() {
		System.out.println("Testing 2 static run method ");
	}
	public void walking() {
		System.out.println("Testing 1 walking method");
	}
	public void running() {
		System.out.println("Testing 1 running method");
	}
	public static void main(String[] args) {
		I2 a=new MultipleInterfaces();
		a.walk();
//		This static method of interface I2 can only be accessed as I2.run
		I2.run();     //Static Binding occurs here
		a.walking();
		a.running();
	}

}

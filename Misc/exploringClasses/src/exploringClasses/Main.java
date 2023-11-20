package exploringClasses;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello, world!");
		MyClass hello = new MyClass();
		System.out.println(hello.myMethod());
		System.out.println(hello.accessMe);
		hello.main(args);

	}
}

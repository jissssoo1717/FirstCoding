package FirstJava;

public class Calculator {

	public static void main(String[] args) {
		/* Chapter01-3
		System.out.println(add(5, 2));
		System.out.println(sub(5, 2));
		System.out.println(mul(5, 2));
		System.out.println(div(5, 2));*/

	}
	
	// Chapter01-3
	// 더하기 메소드
	static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	// 빼기 메소드
	static int sub(int num1, int num2) {
		return num1 - num2;
	}
	
	static int mul(int num1, int num2) {
		return num1 * num2;
	}
	
	static int div(int num1, int num2) {
		return num1 / num2;
	}
}

package firstJava;

public class Member {

	public static void main(String[] args) {
		
		// Chapter01-2
		printName();
		
		// Chapter02-1
		String name = "이지수";
		int age = 50;
		double height = 200;
		boolean hasBook = true;
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age); 
		System.out.println("키 : " + height); 
		System.out.println("책 보유 여부 : " + hasBook); 

	}
	
	// Chapter01-2
	static void printName() {
		System.out.println("이지수");
	}

}

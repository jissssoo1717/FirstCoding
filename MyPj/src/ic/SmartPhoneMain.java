package ic;

import java.util.Scanner;

public class SmartPhoneMain {

	public static void main(String[] args) {
		
Scanner in = new Scanner(System.in);
		
		SmartPhone sp = new SmartPhone();
		
		for(int i = 0; i < sp.contacts.length; i++) {
			System.out.print("이름을 입력하세요 >> ");
			String name = in.nextLine();
			
			System.out.print("생일을 입력하세요 >> ");
			String birth = in.nextLine();	
			
			System.out.print("전화번호를 입력하세요 >> ");
			String phoneNm = in.nextLine();
			
			System.out.print("이메일을 입력하세요 >> ");
			String email = in.nextLine();
			
			System.out.print("주소를 입력하세요 >> ");
			String address = in.nextLine();
			
			System.out.print("그룹을 입력하세요 >> ");
			String groups = in.nextLine();
			
			System.out.println("======================");
			
			sp.saveData(i, name, birth, phoneNm, email, address, groups);
			
		}
		
		
		System.out.println("*******연락처 정보*******");
		for(int i = 0; i < sp.contacts.length; i++) {
			sp.printData(i);
		}
		System.out.println("***********************");
		
		
	}

}

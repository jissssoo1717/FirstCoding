package ic;

import java.util.Scanner;

public class ContactMain {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		// 연락처 저장하는 인스턴스
		Contact contact = new Contact("Kim", "5월 5일", "010-1234-5678", 
				"aaa@gmail.com", "Seoul", "그룹");

		// 변수 값을 반환하는 각각의 메소드 호출하여 출력문으로 출력
		System.out.println(contact.getName());
		System.out.println(contact.getBirth());
		System.out.println(contact.getPhoneNm());
		System.out.println(contact.getEmail());
		System.out.println(contact.getAddress());
		System.out.println(contact.getGroups());
		
		System.out.println();
		
		// 정보 출력 메소드 호출
		contact.printInfo();
		
		System.out.println();
		
		// 각 변수에 값을 바꾸는 메소드를 이용하여 데이터 수정
		System.out.print("이름을 입력하세요 >> ");
		String name = in.nextLine();
		contact.setName(name);
		
		System.out.print("생일을 입력하세요 >> ");
		String birth = in.nextLine();		
		contact.setBirth(birth);
		
		System.out.print("전화번호를 입력하세요 >> ");
		String phoneNm = in.nextLine();
		contact.setPhoneNm(phoneNm);
		
		System.out.print("이메일을 입력하세요 >> ");
		String email = in.nextLine();
		contact.setEmail(email);
		
		System.out.print("주소를 입력하세요 >> ");
		String address = in.nextLine();
		contact.setAddress(address);
		
		System.out.print("그룹을 입력하세요 >> ");
		String groups = in.nextLine();
		contact.setGroups(groups);
		
		System.out.println();
		
		// 데이터 수정 후 정보 출력 메소드 재실행
		contact.printInfo();
		
		in.close();
		
	}

}

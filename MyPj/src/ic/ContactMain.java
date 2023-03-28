package ic;

public class ContactMain {

	public static void main(String[] args) {
		
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
		contact.setName("Park");
		contact.setBirth("3월 3일");
		contact.setPhoneNm("010-8888-8888");
		contact.setEmail("ppp@naver.com");
		contact.setAddress("Park");
		contact.setGroups("그룹2");
		
		// 데이터 수정 후 정보 출력 메소드 재실행
		contact.printInfo();
		
	}

}

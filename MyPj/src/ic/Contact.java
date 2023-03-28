package ic;

public class Contact {

	// Instance Variable
	String name;
	String birth;
	String phoneNm;
	String email;
	String address;
	String groups;
	
	
	// Constructor
	Contact(String name, String birth, String phoneNm, String email,
			String address, String groups) {
		this.name = name;
		this.birth = birth;
		this.phoneNm = phoneNm;
		this.email = email;
		this.address = address;
		this.groups = groups;
	}
	
	
	// Name Getter/Setter Method
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	
	// Birth Getter/Setter Method
	String getBirth() {
		return birth;
	}
	void setBirth(String birth) {
		this.birth = birth;
	}
	
	// PhoneNumber Getter/Setter Method
	String getPhoneNm() {
		return phoneNm;
	}
	void setPhoneNm(String phoneNm) {
		this.phoneNm = phoneNm;
	}	
	
	// Email Getter/Setter Method
	String getEmail() {
		return email;
	}
	void setEmail(String email) {
		this.email = email;
	}
	
	// Address Getter/Setter Method
	String getAddress() {
		return address;
	}
	void setAddress(String address) {
		this.address = address;
	}	

	// Groups Getter/Setter Method
	String getGroups() {
		return groups;
	}
	void setGroups(String groups) {
		this.groups = groups;
	}
	
	
	void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("생일 : " + birth);
		System.out.println("전화번호 : " + phoneNm);
		System.out.println("이메일 : " + email);
		System.out.println("주소 : " + address);
		System.out.println("그룹 : " + groups);
	}
}

package ic;


public class SmartPhone {
	
	Contact[] contacts = new Contact[10];
	
	
	void saveData(int num, String name, String birth, String phoneNm, String email, String address, String groups) {
		contacts[num] = new Contact(
				name, birth, phoneNm, email, address, groups
				);
	}
	
	/*fix del */
	
	void printData(int i) {
		System.out.println(contacts[i].name + " [" + contacts[i].birth + " " + contacts[i].phoneNm + " "
				+ contacts[i].email + " " + contacts[i].address + " " + contacts[i].groups + "]");
	}


}

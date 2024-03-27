package Encapsulation;

public class Bank1 {

   String name;
   int pinNo;
   
   
	public Bank1(String name, int pinNo) {
	this.name = name;
	this.pinNo = pinNo;
}

	public void userValidate() {
		
		User user =new User();
		user.setUsername(name);
		System.out.println("UserName  is : "+user.getUsername());
		int PIN=pinNo;
		if(1000<=PIN && 9999>=PIN) {
			user.setPIN(PIN);
			System.out.println("Pin is : "+user.getPIN());
			
		}else {
			System.out.println("Wrong Pin");
		}
		
	}
	
	

	
}

package Exception;

public class LicenseExceptionExample {

	public static void main(String[] args) throws LicenseException {
		LicenseExceptionExample license = new LicenseExceptionExample();
		license.display(12);

	}
	public void display(int age) throws LicenseException {
		
		if (age<18) {
			throw new LicenseException("Not Eligible for license");
		}
		else {
			System.out.println("Eligible");
		}
	}

}

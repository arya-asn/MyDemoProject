package Excel;

import java.io.IOException;

public class ExcelInvoke {

	public static void main(String[] args) throws IOException {
		String invokeStringValue = ExcelRead.getStringData(1, 1);
		System.out.println(invokeStringValue);
		
		String invokeIntegerValue = ExcelRead.getIntData(1, 0);
		System.out.println(invokeIntegerValue);
		

	}

}

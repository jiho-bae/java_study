package chap10;

public class NumberFormatException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data1 = "0101";
		String data2 = "a0101";
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		
		int result = value1 + value2;
		System.out.println(data1 + " + " + data2 + " = " + result);
	}

}

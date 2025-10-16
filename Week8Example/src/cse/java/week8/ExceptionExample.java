package cse.java.week8;

public class ExceptionExample {

	public static void main(String[] args) {
		
		String data = null;
		System.out.println(data.toString());
		
		
		int[] numbers = {10, 20, 30};
		System.out.println(numbers[3]);
      
        int value1 = Integer.parseInt("100");
        int value2 = Integer.parseInt("1000a");
        int result = value1 + value2;
        System.out.println(value1 + "+" + value2 + "=" + result);
        try {
        	findClass();
        } catch(ClassNotFoundException e) {
        	
        }
	}
	
	public static void findClass() throws ClassNotFoundException {
        Class clazz = Class.forName("java.lang.String2");
    }
}

package MainPackage;



public class CheckDigit {
	
	String number;
	static int sum1 = 0;
	static int sum2 = 0;
	static int total = 0;
	
	public static int GetNum1(String number) {
		
		for (int i = number.length() - 2; i >= 0; i -= 2) {
			
			int getNumber1 = 2 * Character.getNumericValue(number.charAt(i));

			String toString = Integer.toString(getNumber1);
			
			for (int j = 0; j < toString.length(); j++) {
				
				int get_numbers = Character.getNumericValue(toString.charAt(j));
				
				sum1 += get_numbers;
				
			}
		}
		
		total += sum1;
		
		return sum1;
		
	}
	
	public static int GetNum2(String number) {
		
		for (int j = number.length() - 1; j >= 0; j -= 2) {
			
			sum2 += Character.getNumericValue(number.charAt(j));
			
		}
		
		total += sum2;
		
		return sum2;
	}
	
	public static boolean BoolCheck() {
		
		if (total % 10 != 0) 
			
			return false;
			
		
		
		else if (total % 10 == 0) 
			
			return true;
			
		
		
		return false;
	}
	
	
}
	
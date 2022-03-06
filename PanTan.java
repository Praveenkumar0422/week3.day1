package wwek3.day1;

public class PanTan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=15;
	
			
			if (number%3==0 && number%5==0) {
				System.out.println("neither TAN nor PAN");
		}
		else if (number%5==0) {
			System.out.println("PAN");
			
		}
		else if (number%3==0) {
			System.out.println("TAN");
			
		}

	}

}

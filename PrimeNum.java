package wwek3.day1;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input=15;
		boolean flag=false;
		for(int i=2;i<input;i++) {
			
			
			
			if(input % i==0) {
				
				flag=true;
				break;
					
			}
			}
		if(!flag)
			System.out.println(input + " is a prime number");
		else
			System.out.println(input + " is not a prime number");

	}

}

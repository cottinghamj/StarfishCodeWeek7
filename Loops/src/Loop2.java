import java.util.Scanner;

public class Loop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner myScanner = new Scanner(System.in);
		int num = 20;
		int userinput = myScanner.nextInt();
		int S = num + userinput;
		System.out.println(S);
		
		
		
		
		
		userinput = myScanner.nextInt();
		S = S + userinput;
		System.out.println(S);
		
		
		
		
		
		
		
		
		
		
		
		
		
		int input;
		int sum = 0;
		
		
		
		
		
		int iterator = 0;
		
		while(iterator < 10){
			
			userinput = myScanner.nextInt();
			S = S + userinput;
			System.out.println(S);
			
			
			iterator += 1;
		}
		
		System.out.println(sum);
	}

}

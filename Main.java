import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (s.hasNextInt()){
			System.out.println(adCalc(s.nextInt()));
		}
		s.close();
	}
	
	public static String adCalc(int num){
		if (num <= 0){
			throw new IllegalArgumentException("Number input must be greater than 0");
		}
		
		
		String ret = num + " ";
		
		int sum = 1 + num;
		for(int i = 2; i < num; i++){
			if (num % i == 0) sum += i;
		}
		
		if(sum < 2 * num){
			ret += "deficient";
		}
		else if(sum == 2 * num){
			ret += "~~neither~~ deficient";
		}
		else{
			ret += "abundant by ";
			ret += sum - 2 * num;
		}
		
		return ret;
	}

}

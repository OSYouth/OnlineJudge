import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Main test = new Main();
		int n;
		while(in.hasNextInt()){
			n = in.nextInt();
			System.out.println(test.count(n));
		}
	}
	
	public int count(int num){
		int result = -1;
		int loop = num / 8;
		
		if(num%8 == 0){
			result = loop;
		}else{
			for(int i = loop; i >= 0; i--){
				if( (num-i*8) % 6 == 0){
					int mark6 = (num - i*8 )/6;
					result = mark6 + i;
					break;
				}
			}
		}
		return result;
	}
}

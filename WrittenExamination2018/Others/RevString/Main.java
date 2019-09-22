import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String[] sentence  = in.nextLine().split(" ");
		for(int i = sentence.length - 1; i > 0; i--){
			System.out.print(sentence[i] + " ");
		}
		System.out.println(sentence[0]);

	}
}
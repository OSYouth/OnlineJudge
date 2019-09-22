import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String s = null;
		while(in.hasNext()){
			s = in.nextLine();
			char[] c = s.replace(" ","").toCharArray();
			for(int i = 0; i < c.length; i++){
				System.out.print(c[i]);
				if(i == 5 && c.length > 5){
					System.out.print(" ");
				}
				if(i == 13 && c.length > 13){
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
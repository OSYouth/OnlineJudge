import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main{
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<>();
		while(in.hasNextInt()){
			array.add(in.nextInt());
		}
		Collections.sort(array);
		System.out.println(array.get((array.size()-1)/2));
	}
}
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
		int length = array.get(array.size()-1);
		array.remove(array.size()-1);
		Collections.sort(array);
		for(int i = 0; i < length - 1; i++){
			System.out.print(array.get(i) + " ");
		}
		System.out.println(array.get(length-1));
	}
}
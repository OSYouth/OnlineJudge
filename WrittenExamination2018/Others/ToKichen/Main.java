import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		HashSet<String> meterial = new HashSet<>();
		String line = null;
		while(in.hasNext()){
			line = in.nextLine();
			String[] temp = line.split(" ");
			for(int i = 0; i < temp.length; i++){
				meterial.add(temp[i]);
			}
		}
		in.close();
		System.out.println(meterial.size());
	}
}
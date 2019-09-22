import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		String result = "None";
		String[][] input = new String[m][3];
		HashMap<String,Integer> map = new HashMap<>();
		for(int i = 0; i < m; i++){
			for(int j = 0; j < 3; j++){
				input[i][j] = sc.next();
				if(input[i][j] != "*"){
					map.put(input[i][j],0);
				}	
			}
		}
		int size = map.size();
		ArrayList<String>[] all = new ArrayList<String>()[size];

		// for(int i = 0; i < m; i++){
		// 	if(map.containsKey(input[i][0])){
		// 		if(input[i][2].equals("*")){
		// 			map.put(input[i][0],1);
		// 		}else{
		// 			map.put(input[i][0],2);
		// 		}
		// 	}
		// }
		for(String key:map.keySet()){
			System.out.println(key+":"+map.get(key));
		}
		System.out.println(result);
	}
}
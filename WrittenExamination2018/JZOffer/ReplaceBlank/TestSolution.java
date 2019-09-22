import java.util.Scanner;
public class TestSolution{
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		StringBuffer str = new StringBuffer();
		str.append(in.nextLine());
		Solution s = new Solution();
		System.out.println(s.replaceSpace(str));
	}
}
//	9
//	1 2 3 4 5 6 7 8 9
//	9 7 5 3 1 2 4 6 8
//10
//1 2 3 4 5 6 7 8 9 10
//10 8 6 4 2 1 3 5 7 9
//neither of them can't pass all cases because of time complexity

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = in.nextInt();
		}
		if(n%2==0){
			for(int i = 0; i < n/2; i++){
//				System.out.println(n-2*i);
				b[i] = a[n-2*i-1];
			}
			for(int i = n/2; i < n; i++){
				b[i] = a[ 2*(i-n/2)];
			}
		}else{
			for(int i = 0; i < n/2 +1; i++){
				b[i] = a[n-2*i-1];
			}
			for(int i = n/2 +1; i < n; i++){
				b[i] = a[ 2*(i-n/2)-1];
			}
		}
		for(int i = 0; i < n-1; i++){
			System.out.print(b[i] + " ");
		}
		System.out.println(b[n-1]);
	}

}





//import java.util.Scanner;
//public class Main {
//
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		int[] a = new int[n];
//		for(int i = 0; i < n; i++){
//			a[i] = in.nextInt();
//			int mark = i;
//			int temp = 0;
//			for(int j = 0; j < mark/2 +1; j++){
//				temp = a[j];
//				a[j] = a[mark-j];
//				a[mark-j] = temp;
//			}
//		}
//		for(int i = 0; i < n-1; i++){
//			System.out.print(a[i] + " ");
//		}
//		System.out.println(a[n-1]);
//	}
//
//}

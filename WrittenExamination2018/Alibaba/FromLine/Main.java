import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int trees[] = new int[n];
        for(int i=0;i<n;i++){
            trees[i] = input.nextInt();
        }

        int MaxP[] = new int[n];
        for(int j = 0;j < n;j++){
            MaxP[j] = 1;
            for(int m = 0;m<j;m++){
                if(MaxP[m]+1>MaxP[j]&&trees[j]>trees[m]){
                    MaxP[j] = MaxP[m] + 1;
                }
            }
        }

        int maxPeach = 1;
        for(int k = 0;k<n;k++){
            if(maxPeach<MaxP[k]){
                maxPeach = MaxP[k];
            }
        }

        System.out.println(maxPeach);

    }

}
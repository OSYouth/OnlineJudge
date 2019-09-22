import java.lang.reflect.Array;
import java.util.Scanner;
public class Main {
    private final static int CUSTOMS_LIMIT_MONEY_PER_BOX = 2000;

    private static int process() 
    {
        int result = -1;
        
        return result;
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        Model boxTemplate = new Model();
        Model[] items ;
        boxTemplate.price = CUSTOMS_LIMIT_MONEY_PER_BOX;

        while (scanner.hasNext()){
            boxTemplate.length = scanner.nextInt();
            boxTemplate.width = scanner.nextInt();
            boxTemplate.height = scanner.nextInt();

            int itemNum = scanner.nextInt();
            items = new Model[itemNum];
            for(int i=0; i<itemNum; i++){
                Model item = new Model();
                item.price = scanner.nextInt();
                item.length = scanner.nextInt();
                item.width = scanner.nextInt();
                item.height = scanner.nextInt();
                items[i] = item;
            }
            long startTime = System.currentTimeMillis();
            int boxMinNum = Integer.MAX_VALUE;
          System.out.println (process());
      }
    }
}

class Model{
    int price = 0;
    int length = 0;
    int width = 0;
    int height = 0;
}
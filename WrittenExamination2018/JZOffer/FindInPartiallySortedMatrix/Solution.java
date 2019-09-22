public class Solution {
    public boolean Find(int target, int [][] array) {
    	boolean flag = false;
    	int rows = array.length;
    	int columns = array[0].length;
    	int r = rows-1;
    	int c = 0;
    	while(r>=0 && c<columns){
    		// System.out.println(array[r][c] + " " + r + " " + c);
    		if(array[r][c] == target){	//remember the equal condition should be the first one to judge
    			flag = true;
    			break;
    		}else if(array[r][c] > target){
    			r--;
    		}else {
    			c++;
    		}
    	}
    	// for(; r>=0 && c<columns;){
    	// 	if(array[r][0] > target){
    	// 		r--;
    	// 	}else if(array[r][c] < target){
    	// 		c++;
    	// 	}else if(array[r][c] == target){
    	// 		flag = true;
    	// 		break;
    	// 	}
    	// }
    	return flag;
    }
}


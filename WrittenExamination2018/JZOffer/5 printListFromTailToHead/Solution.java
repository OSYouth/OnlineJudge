/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*
*/
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
    	ArrayList<Integer> list = new ArrayList<>();
    	ArrayList<Integer> result = new ArrayList<>();
    	while(listNode.next != null){
    		list.add(listNode.val);
    	}
    	for(int i = list.size()-1; i>=0; i--){
    		result.add(list.get(i));
    	}
        return result;
    }
}
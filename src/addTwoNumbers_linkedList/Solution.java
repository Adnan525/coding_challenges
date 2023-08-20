import java.math.BigInteger;

public class Solution{
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String str1 = "";
        String str2 = "";
        ListNode head = new ListNode(); //will return this
        ListNode temp = new ListNode(); // this will keep changing in each iteration
        ListNode emptyNode = new ListNode(-1);
        while(l1.next != null)
        {
            str1 = Integer.toString(l1.val) + str1;
            l1 = l1.next;
        }
        str1 = l1.val + str1;
        while(l2.next != null)
        {
            str2 = Integer.toString(l2.val) + str2;
            l2 = l2.next;
        }
        str2 = l2.val + str2;

        BigInteger s1 = new BigInteger(str1);
        BigInteger result = s1.add(new BigInteger(str2));
        int counter = 0;
        while(result.intValue() != 0){
            int val = result.mod(BigInteger.valueOf(10)).intValue();
            result = result.divide(BigInteger.valueOf(10));
            if(counter == 0){
                head = new ListNode(val, null);
            }
            else{
                temp = new ListNode(val, null);
                temp = head;
                while(temp.next != null){
                    temp = temp.next;
                }
                temp.next = new ListNode(val, null);
            }
            counter+=1;
        }
        return head;
    }
}
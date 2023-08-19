public class Solution{
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String str1 = "";
        String str2 = "";
        ListNode head = new ListNode(); //will return this
        ListNode temp = new ListNode(); // this will keep changing in each iteration
        ListNode emptyLn = new ListNode();
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
        int result = Integer.parseInt(str1) + Integer.parseInt(str2);
        int counter = 0;
        while(result != 0){
            int val = result % 10;
            result = result/10;
            if (result == 0){
                temp = new ListNode(val);
            }
            else{
                temp = new ListNode(val, emptyLn);
            }
            if(counter == 0){
                head = temp;
            }
            temp = temp.next;
            counter+=1;
        }
        return head;
    }
}
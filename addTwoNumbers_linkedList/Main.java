public class Main {
    public static void main(String[] args) {

        ListNode three = new ListNode(3, null);
        ListNode four = new ListNode(4, three);
        ListNode two = new ListNode(2, four);

        ListNode four2 = new ListNode(4, null);
        ListNode six = new ListNode(6, four2);
        ListNode five = new ListNode(5, six);

        ListNode result = Solution.addTwoNumbers(five, two);
        System.out.println(result.next.val);

    }
    
}

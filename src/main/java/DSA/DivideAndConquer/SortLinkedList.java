package DSA.DivideAndConquer;

public class SortLinkedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode mid = middle(head);

        ListNode left = head;
        ListNode right  = mid.next;
        mid.next = null;
        
        left = sortList(left);
        right  = sortList(right);

        return merge(left, right);
    }

    public ListNode merge(ListNode left, ListNode right) {
        if(left == null) return right;
        if(right == null) return left;
        ListNode res  = new ListNode(-1);
        ListNode temp = res;

        while(left != null && right != null){
            if(left.val < right.val){
                temp.next = left;
                left  = left.next;
            } else {
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }

        if(left != null){
            temp.next = left;
        }

        if(right != null){
            temp.next = right;
        }
        return res.next;
    }

     private ListNode middle(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
package DSA.DivideAndConquer;

public class MergeKSortedLinkedList {
     public class ListNode {
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {

        //idea is to use divide and conquer very similar to quick sort & merge sort
        // 1. find the middle partition in left half and right
        // 2. repeat step 1 until all the elements are in sorted order
        

        return partitionList(0, lists.length-1, lists); 
    }

    public ListNode partitionList(int low, int high, ListNode[] lists) {
        if(low == high) return lists[low];
        if(low < high){
            int mid = low + (high-low)/2;
            ListNode left = partitionList(low, mid, lists);
            ListNode right = partitionList(mid+1, high, lists);
            return merge(left, right);
        } else {
            return null;
        }
    }

    public ListNode merge(ListNode left, ListNode right){
        if(left == null) return right;
        if(right == null) return left;
        if(left.val < right.val){
            left.next = merge(left.next, right);
            return left;
        } else {
            right.next = merge(left, right.next);
            return right;
        }
    }
}

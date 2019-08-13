
package com.nilank.crackingthecodinginterview.MergeKSortedLists;

import java.util.PriorityQueue;

public class Solution {
    
    public ListNode mergeKLists(ListNode[] lists){
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        for(ListNode head : lists){
            while(head != null){
                minHeap.add(head.val);
                head = head.next;                
            }
        }
        
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        while(!minHeap.isEmpty()){
            head.next = new ListNode(minHeap.remove());
            head = head.next;
        }
        return dummy.next;    
    }   
}


package com.nilank.crackingthecodinginterview.KthSmallestElement;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 *
 * @author nilan
 */
public class KthSmallestElement {
    public void smallestElement(int[] arr){
        if(arr == null || arr.length == 0)
            System.out.println("Invalid Input");
        
//        int minimum = Integer.MAX_VALUE;
//        int maximum = Integer.MIN_VALUE;
//        
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] < minimum){
//                minimum = arr[i];
//            }
//            if(arr[i] > maximum){
//                maximum = arr[i];
//            }
//        }
//        System.out.println("Minimum Number " + minimum);
//        System.out.println("Maximum Number " + maximum);
        int k =2;
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(arr.length);
        for(int number : arr){
            pQueue.add(number);
        }
        System.out.println("Head value using peek function:" + pQueue.peek());
        System.out.println("The queue elements:");
        Iterator itr = pQueue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
    
}

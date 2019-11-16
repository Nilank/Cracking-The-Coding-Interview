package com.nilank.crackingthecodinginterview.FindIntersectionInArray;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nilan
 */
public class FindIntersection {

    public void intersection(int[] arr1, int[] arr2) {
        if (arr1 == null || arr1.length == 0 || arr2.length == 0 || arr2 == null) {
            return;
        }

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    list.add(arr1[i]);
                }

            }

        }
        System.out.println("Intersection of arrays " + list);
    }

}

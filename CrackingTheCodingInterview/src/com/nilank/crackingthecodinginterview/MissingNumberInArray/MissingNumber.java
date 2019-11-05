package com.nilank.crackingthecodinginterview.MissingNumberInArray;

import java.util.Scanner;

/**
 *
 * @author nilan
 */
public class MissingNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            System.out.println("The fourth input " + t);
            int n = 0, res = 0;
            n = sc.nextInt();
            System.out.println("The second input " + n);
            

            int x;
            for (int i = 1; i < n; i++) {
                x = sc.nextInt();
            System.out.println("The third input " + x);
                res = res ^ x;
            System.out.println("The RES input " + res);
                res = res ^ i;
            System.out.println("The NEW RES input " + res);
            }
            System.out.println(res ^ n);
        }
    }

}

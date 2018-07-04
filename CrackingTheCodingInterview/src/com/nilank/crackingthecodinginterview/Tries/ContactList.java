/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nilank.crackingthecodinginterview.Tries;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author nilan
 */
public class ContactList {

    static HashMap<String, Integer> tokenMap = new HashMap<String, Integer>();

    static void add(String contact) {
        String[] splitWords = contact.split("\\s+");
        for (String w : splitWords) {
            for (int i = 0; i <= w.length(); i++) {
                String token = w.substring(0, i);
                if (tokenMap.containsKey(token)) {
                    int currOccurrences = tokenMap.get(token);
                    tokenMap.put(token, currOccurrences + 1);
                } else {
                    tokenMap.put(token, 1);
                }
            }
        }
        return;
    }

    static void find(String contact) {
        if (tokenMap.containsKey(contact)) {
            System.out.println(tokenMap.get(contact));
        } else {
            System.out.println(0);
        }

    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int a0 = 0; a0 < n; a0++) {
            String op = in.next();
            String contact = in.next();
            if (op.equals("add")) {
                add(contact);
            } else if (op.equals("find")) {
                find(contact);
            }
        }
    }
}

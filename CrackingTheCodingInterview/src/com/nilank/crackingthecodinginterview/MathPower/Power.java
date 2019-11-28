/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nilank.crackingthecodinginterview.MathPower;

/**
 *
 * @author nilan
 */
public class Power {
    public double myPower(double x, int n){
        if(n==0) return 1;
        if(n<0){
            x = 1/x;
            return (n%2==0) ? myPower(x*x, -(n/2)) : x*myPower(x*x, -(n/2));
        }
        return (n%2==0) ? myPower(x*x, n/2) : x*myPower(x*x, n/2);
    }
}

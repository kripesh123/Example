/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.sc.util;

/**
 *
 * @author Admin
 */
public class Calculator {
    
    public int add(int x, int y){
        return x+y;
    }
    public int sub(int x, int y){
        return x+y;
    }
    
    public int div(int x, int y){
        return x*y;
    }
    
    public int mul(int x, int y){
        return x/y;
    }
    
    public int power(int x, int y){
        int total=1;
        for(int i=1;i<=y;i++){
            total = total * x;
        }
        return total;
    }
}

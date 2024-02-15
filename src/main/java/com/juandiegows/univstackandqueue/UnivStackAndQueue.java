/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.juandiegows.univstackandqueue;

import com.juandiegows.univstackandqueue.model.StackJD;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author JuanDiegoWS
 */
public class UnivStackAndQueue {

    public static void main(String[] args) {
        System.out.println("Welcome to aplication created by Juan Diego Mejia Maestre (JuanDiegows)");
        System.out.println("For finish to write -1");
        
        Scanner input = new Scanner(System.in);
        int num, i = 0;
        StackJD stack = new StackJD();
        do {
            System.out.print("Insert the number "+ ++i+" : ");
             num = input.nextInt();
             if(num != -1)
             stack.Insert(num);
        } while (num != -1);
        
        System.out.println("Show to stack");
        stack.Print();
        System.out.println("\n");
        System.out.println("Count even number : "+ stack.CountEvenNumber());
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("average : "+ df.format(stack.Average()));
        System.out.println("last data of stack : "+ stack.first.value);
    }
}

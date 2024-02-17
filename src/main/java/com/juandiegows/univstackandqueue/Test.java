/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.juandiegows.univstackandqueue;


import com.juandiegows.univstackandqueue.Stack.DoublyLinkedStack;

/**
 *
 * @author JuanDiegoWS
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DoublyLinkedStack queue = new DoublyLinkedStack();
        queue.Insert(4);
        queue.Insert(6);
        queue.Insert(7);
        queue.Insert(8);
        queue.Insert(9);
        queue.Print();
        System.out.println("");
        queue.Print();
    }

}

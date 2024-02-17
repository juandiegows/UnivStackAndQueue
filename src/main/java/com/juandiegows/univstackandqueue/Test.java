/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.juandiegows.univstackandqueue;

import com.juandiegows.univstackandqueue.model.QueueJD;

/**
 *
 * @author JuanDiegoWS
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QueueJD queue = new QueueJD();
        queue.Insert(4);
        queue.Insert(6);
        queue.Insert(7);
        queue.Insert(8);
        queue.Insert(9);
        queue.Print();
        queue.DeleteByItem(6);
        queue.DeleteByPosition(2);
        System.out.println("");
        queue.Print();
    }

}

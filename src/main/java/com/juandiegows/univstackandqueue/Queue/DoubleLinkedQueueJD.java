/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.juandiegows.univstackandqueue.Queue;

import com.juandiegows.univstackandqueue.model.DoublyLinkedNodeJD;

/**
 *
 * @author JuanDiegoWS
 */
public class DoubleLinkedQueueJD {
      public DoublyLinkedNodeJD<Integer> first = null;
    public DoublyLinkedNodeJD<Integer> aux = null;

    public void Insert(int value) {
        DoublyLinkedNodeJD<Integer> newNode = new DoublyLinkedNodeJD<>();
        newNode.value = value;
        if (aux != null) {
            aux.next = newNode;
        }
        aux = newNode;
        if (first == null) {
            first = aux;
        }
    }

    public void Print() {
        DoublyLinkedNodeJD<Integer> current = first;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
    }

    public void DeleteByItem(int index) {

        DoublyLinkedNodeJD<Integer> current = first;
        DoublyLinkedNodeJD<Integer> before = first;
        while (current != null) {
            if (current.value == index) {

                before.next = current.next;
            }
            before = current;
            current = current.next;

        }
    }

    public void DeleteByPosition(int index) {
        int i = 0;
        DoublyLinkedNodeJD<Integer> current = first;
        DoublyLinkedNodeJD<Integer> before = first;
        while (current != null) {
            if (i == index) {

                before.next = current.next;
            }
            before = current;
            current = current.next;
            i++;
        }
    }
}

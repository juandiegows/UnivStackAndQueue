/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.juandiegows.univstackandqueue.model;

/**
 *
 * @author JuanDiegoWS
 */
public class QueueJD {

    public NodeJD<Integer> first = null;
    public NodeJD<Integer> aux = null;

    public void Insert(int value) {
        NodeJD<Integer> newNode = new NodeJD<>();
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
        NodeJD<Integer> current = first;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
    }

    public void DeleteByItem(int index) {

        NodeJD<Integer> current = first;
        NodeJD<Integer> before = first;
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
        NodeJD<Integer> current = first;
        NodeJD<Integer> before = first;
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

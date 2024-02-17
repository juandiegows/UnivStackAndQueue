package com.juandiegows.univstackandqueue.Stack;

import com.juandiegows.univstackandqueue.model.DoublyLinkedNodeJD;

/**
 *
 * @author JuanDiegoWS
 */
public class DoublyLinkedStackJD {

    public DoublyLinkedNodeJD<Integer> first = null;

    public void Insert(int value) {
        DoublyLinkedNodeJD<Integer> newNode = new DoublyLinkedNodeJD<>();
        newNode.value = value;
        newNode.next = first;
        first = newNode;
        if (first.back == null) {
            first.back = first;
        }
    }

    public void Print() {
        DoublyLinkedNodeJD<Integer> currentNode = first;
        while (currentNode != null) {
            System.out.print(currentNode.value + ", ");
            currentNode = currentNode.next;
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

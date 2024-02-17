
package com.juandiegows.univstackandqueue.Stack;

import com.juandiegows.univstackandqueue.model.NodeJD;
import com.juandiegows.univstackandqueue.model.Person;

/**
 *
 * @author JuanDiegoWS
 */
public class StackPersonJD {

    public NodeJD<Person> first = null;

    public void Insert(Person value) {
        NodeJD<Person> newNode = new NodeJD<>();
        newNode.value = value;
        newNode.next = first;
        first = newNode;
    }

    public void Print() {
        NodeJD<Person> currentNode = first;
        while (currentNode != null) {
            System.out.print(currentNode.value);
            currentNode = currentNode.next;
        }
    }

    public int Count() {
        int count = 0;
        NodeJD<Person> currentNode = first;
        while (currentNode != null) {
            count++;
            currentNode = currentNode.next;
        }
        return count;
    }
    
    public void DeleteFirst(){
        first = first.next;
    }
}

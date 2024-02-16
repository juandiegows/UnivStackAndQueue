package com.juandiegows.univstackandqueue.model;
/**
 * @author JuanDiegoWS
 */
public class StackJD {
    public NodeJD<Integer> first = null;
    
    public void Insert(int value){
        NodeJD<Integer> newNode = new NodeJD<>();
        newNode.value = value;
        newNode.next = first;
        first = newNode;
    }
    
    public void Print(){
        NodeJD<Integer> currentNode = first;
        while(currentNode!= null){
            System.out.print(currentNode.value+", ");
            currentNode = currentNode.next;
        }
    }
    
    public int CountEvenNumber(){
        int count = 0;
        NodeJD<Integer> currentNode = first;
        while(currentNode!= null){
            if(currentNode.value % 2 == 0){
                count++;
            }
            currentNode = currentNode.next;
        }
        return count;
    }
    
      public double Average(){
        int count = 0;
        double sum = 0;
        NodeJD<Integer> currentNode = first;
        while(currentNode!= null){
            if(currentNode.value instanceof Integer){
                count++;
               sum +=(int)currentNode.value;
            }
            currentNode = currentNode.next;
        }
        return sum / count;
    }
}


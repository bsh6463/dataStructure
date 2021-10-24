package queue;

import linkedList.MyLinkedList;
import linkedList.MyListNode;

public class MyLinkedQueue extends MyLinkedList implements MyQueue {

    MyListNode front;
    MyListNode rear;

    @Override
    public void enQueue(String data) {

        MyListNode newNode;
        if (isEmpty()){
            newNode = addElement(data);
            front = newNode;
            rear = newNode;
        }else {
            newNode = addElement(data);
            rear = newNode;
        }

       // System.out.println(newNode.getData() + "added");
    }

    @Override
    public String deQueue() {

        if (isEmpty()){
            throw new IllegalArgumentException("Queue is empty");
        }

        String ret = front.getData();
        removeElement(0);

        front = front.getNext();
        if(front == null){
            rear = null;
        }

        return ret;
    }

    @Override
    public void printQueue() {
        printAll();
    }


}

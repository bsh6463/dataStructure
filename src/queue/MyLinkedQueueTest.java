package queue;

import linkedList.MyListNode;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedQueueTest {

    MyLinkedQueue myLinkedQueue;
    int cnt = 5;

    @BeforeEach
    void setUp() {

        myLinkedQueue = new MyLinkedQueue();

        for (int i = 0; i < cnt; i++){
            myLinkedQueue.enQueue(Integer.toString(i));
        }

    }

    @AfterEach
    void tearDown() {
        myLinkedQueue.clear();
    }

    @Test
    void enQueue() {
        //given

        //when
        myLinkedQueue.enQueue("A");

        //then
        assertEquals(myLinkedQueue.getCount(), cnt+1);
    }

    @Test
    void deQueue() {
        //given
        MyListNode front = myLinkedQueue.front;

        //when
        String result = myLinkedQueue.deQueue();

        //then
        assertEquals(result, Integer.toString(0));
        assertEquals(result, front.getData());
        assertEquals(cnt-1, myLinkedQueue.getCount());
    }
}
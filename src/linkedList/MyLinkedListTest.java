package linkedList;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {

    MyLinkedList myLinkedList = new MyLinkedList();
    int cnt = 5;

    @BeforeEach
    void initTest(){

        for (int i=0; i<5; i++){
            myLinkedList.addElement(Integer.toString(i));
        }
        myLinkedList.printAll();
    }

    @AfterEach
    void afterTest(){
        myLinkedList.clear();
    }

    @Test
    void addElement() {
        myLinkedList.addElement("A");
        String element = myLinkedList.getElement(cnt);
        assertEquals(element, "A");
    }

    @Test
    void insertElement() {
        int insertPosition = 2;

        myLinkedList.insertElement(insertPosition, "A");
        String element = myLinkedList.getElement(insertPosition);
        assertEquals(element, "A");
    }

    @Test
    void insertElementPositionZero(){
        int insertPosition = 0;

        myLinkedList.insertElement(insertPosition, "A");
        String element = myLinkedList.getElement(insertPosition);
        assertEquals(element, "A");
    }

    @Test
    void insertElementWrongPosition(){
        int insertPosition = myLinkedList.getCount() + 10;

        assertThrows(IllegalArgumentException.class, ()-> myLinkedList.insertElement(insertPosition, "A"));
    }

    @Test
    void removeElement() {

        int deletePosition = 2;
        String next = myLinkedList.getElement(deletePosition+1);

        myLinkedList.removeElement(deletePosition);

        int count = myLinkedList.getCount();
        System.out.println("count = " + count);

        myLinkedList.printAll();
        assertEquals(count, cnt-1);
        assertEquals(myLinkedList.getElement(deletePosition), next);
    }

    @Test
    void removeElementWrongPosition(){
        int removePosition = myLinkedList.getCount() + 10;

        assertThrows(IllegalArgumentException.class, ()-> myLinkedList.removeElement(removePosition));
    }

    @Test
    void clearTest(){
        myLinkedList.clear();
        MyListNode head = myLinkedList.getNode(0);

        assertNull(head.getNext());
    }


}
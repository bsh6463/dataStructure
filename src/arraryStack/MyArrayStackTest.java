package arraryStack;

import arraryStack.MyArrayStack;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayStackTest {

    MyArrayStack arrayStack;
    int cnt = 5;

    @BeforeEach
    void setUp() {
        arrayStack = new MyArrayStack();

        for (int i = 0; i< cnt; i++){
            arrayStack.push(i);
        }
    }

    @AfterEach
    void afterTest(){
        arrayStack.arrayStack.clear();
    }

    @Test
    void push() {
        //given
        int pushData = 10;

        //when
        arrayStack.push(pushData);

        //then
        assertEquals(arrayStack.top, cnt+1);
        assertEquals(arrayStack.peek(), pushData);
        assertEquals(arrayStack.pop(), pushData);
    }

    @Test
    void pop() {
        //given

        //when
        arrayStack.pop();

        //then
        assertEquals(arrayStack.top, cnt - 1);
        assertEquals(arrayStack.peek(), 3);
}

    @Test
    void peek() {
        //given

        //when
        int peek = arrayStack.peek();

        //then
        assertEquals(peek, 4);
        assertEquals(arrayStack.top, cnt);
    }

    @Test
    void isFUll() {
        for (int i=cnt; i < arrayStack.arrayStack.getARRAY_SIZE(); i++){
            arrayStack.push(i);
        }

        boolean result = arrayStack.isFUll();
        assertTrue(result);
    }

    @Test
    void isNotFUll() {
        for (int i=cnt; i < arrayStack.arrayStack.getARRAY_SIZE()-1; i++){
            arrayStack.push(i);
        }

        boolean result = arrayStack.isFUll();
        assertFalse(result);
    }

}
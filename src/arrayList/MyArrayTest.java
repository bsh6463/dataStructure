package arrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class MyArrayTest {

    MyArray array = new MyArray(10);

    int cnt = 5;

    @BeforeEach
    void initTest() throws IllegalArgumentException {
        for (int i=0; i<cnt; i++){
            array.addElement(i);
        }
    }

    @AfterEach
    void afterTest(){
        array.clear();
    }

    @Test
    void addElement() throws IllegalArgumentException {

        array.addElement(2);

        assertEquals(array.size(), cnt+1);
        assertEquals(array.intArr[cnt], 2);
    }

    @Test
    void insertElement() throws IllegalArgumentException {
        //given
        int insertIndex = 2;

        //when
        array.insertElement(insertIndex,5);

        //then
        assertEquals(array.size(), cnt+1);
        assertEquals(array.intArr[insertIndex], 5);

    }

    @Test
    void insertElementWrongPosition() throws IllegalArgumentException {

        //given
        int insertIndex = array.ARRAY_SIZE+10;

        //when, then
        assertThrows(IllegalArgumentException.class, () -> array.insertElement(insertIndex,5));

    }

    @Test
    void removeElement() throws IllegalArgumentException {

        //given
        int deleteIndex = 2;
        int deleteNum = array.intArr[deleteIndex];
        int nexNum = array.intArr[deleteIndex + 1];

        //when
        array.removeElement(deleteIndex);

        //then
        assertEquals(array.size(), cnt-1);
        assertEquals(array.intArr[deleteIndex], nexNum);

    }

    @Test
    void removeElementWrongPosition() throws IllegalArgumentException {

        //given
        int deleteIndex = array.ARRAY_SIZE+10;

        //when, then
        assertThrows(IllegalArgumentException.class, ()-> array.removeElement(deleteIndex));


    }

    @Test
    void noEnoughMemoryTest() throws OutOfMemoryError {
        for (int i = cnt; i <array.ARRAY_SIZE;i++){
            array.addElement(i);
        }
        assertThrows(OutOfMemoryError.class, ()-> array.addElement(10));
    }

    @Test
    void isEmpty() {

        assertEquals(array.isEmpty(), false);

        MyArray myArray = new MyArray();
        assertEquals(myArray.isEmpty(), true);
    }

}
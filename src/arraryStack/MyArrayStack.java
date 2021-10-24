package arraryStack;

import arrayList.MyArray;

public class MyArrayStack {

    MyArray arrayStack;
    int top;

    public MyArrayStack() {
        top = 0;
        arrayStack = new MyArray();
    }

    public MyArrayStack(int size){
        top = 0;
        arrayStack = new MyArray(size);
    }

    public void push(int data){
        if (isFUll()){
            throw new OutOfMemoryError("stack is full");
        }

        arrayStack.addElement(data);
        top++;
    }

    public int pop(){
        if (isEmpty() == true){
            return MyArray.ERROR_NUM;
        }
        return arrayStack.removeElement(--top);
    }

    public int peek(){
        if (isEmpty() == true){
            return MyArray.ERROR_NUM;
        }
        return arrayStack.getElement(top-1);
    }


    public boolean isFUll(){
        if (top == arrayStack.getARRAY_SIZE()){
            return true;
        }
        else return false;
    }

    public boolean isEmpty(){
        if (top == 0){
            return true;
        }
        return  false;
    }

    public void printAll(){
        arrayStack.printAll();
    }
}

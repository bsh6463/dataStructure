package linkedList;

public class MyListNode {

    private String data;
    private MyListNode next;

    public MyListNode() {
        data = null;
        next = null;
    }

    public MyListNode(String data){
        this.data = data;
        this.next = null;
    }

    public MyListNode(String data, MyListNode next) {
        this.data = data;
        this.next = next;
    }

    public String getData() {
        return data;
    }

    public MyListNode getNext() {
        return next;
    }

    public void setNext(MyListNode next) {
        this.next = next;
    }
}

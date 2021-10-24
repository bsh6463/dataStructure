package linkedList;

public class MyLinkedList {

    private MyListNode head;
    private int count;

    public MyLinkedList(){
        head = null;
        count = 0; //size, 다음 들어갈 수 있는 max position
    }

    public MyListNode addElement(String data){

        MyListNode newNode = new MyListNode(data);

        if (head == null){
            head = newNode;
        }
        else {
            MyListNode temp = head;
            while (temp.getNext() != null){
                temp = temp.getNext();
            }

            //temp의 다음이 null인 경우
            temp.setNext(newNode);
        }

        count++;
        return newNode;
    }

    public MyListNode insertElement(int position, String data){

        MyListNode tempNode = head;
        MyListNode preNode = new MyListNode();

        MyListNode newNode = new MyListNode(data);

        if(position < 0 || position > count){
            throw new IllegalArgumentException("해당 위치에 insert 불가");
        }

        //맨 앞에 추가하는 경우
        if (position == 0){
            newNode.setNext(head);
            head = newNode;
        }else {
            preNode = findPreNode(position, tempNode, preNode);
            //temp는 기존 position을 가르킴.
            newNode.setNext(preNode.getNext());
            preNode.setNext(newNode);

        }

        count++;
        return newNode;
    }

    public void removeElement(int position){
        MyListNode tempNode = head;
        MyListNode preNode = new MyListNode();

        if(position < 0 || position > count){
            throw new IllegalArgumentException("position 오류");
        }
        //맨 앞을 지우는 경우
        if(position == 0){
            head = tempNode.getNext();
        }else {
            //find PreNode
            preNode = findPreNode(position, tempNode, preNode);
            MyListNode nextNode = preNode.getNext().getNext();
            //temp노드는 입력된 position에 해당.
            preNode.setNext(nextNode);
        }

        count--;
    }

    public String getElement(int position){
        MyListNode tempNode = head;

        if (position < 0 || position > count){
            throw new IllegalArgumentException("position 오류 현재 list수는 " + count + "개 입니다.");
        }
        if (position == 0){
            return head.getData();
        }

        for (int i = 0; i < position; i++){
            tempNode = tempNode.getNext();
        }

         return tempNode.getData();
    }

    public MyListNode getNode(int position){
        MyListNode tempNode = head;

        if (position < 0 || position > count){
            throw new IllegalArgumentException("position 오류 현재 list수는 " + count + "개 입니다.");
        }
        if (position == 0){
            return head;
        }

        for (int i = 0; i < position; i++){
            tempNode = tempNode.getNext();
        }

        return tempNode;
    }

    private MyListNode findPreNode(int position, MyListNode tempNode, MyListNode preNode) {
        for (int i = 0; i < position; i++){
            preNode = tempNode;
            tempNode = tempNode.getNext();

        }
        return preNode;
    }

    public boolean isEmpty(){
        if (head == null){
            return true;
        }
        return false;
    }
    public void clear(){
        MyListNode preNode = head;
        MyListNode tempNode;

        if (head.getNext() == null){
            return ;
        }
        for (int i = 0; i < count-1; i++){
            tempNode = preNode.getNext();
            preNode.setNext(null);
            preNode = tempNode;
        }
    }

    public void printAll(){
        MyListNode tempNode = head;

        for (int i = 0; i< count ; i++){
            System.out.println("position : "+i+" -> "+tempNode.getData());
            tempNode = tempNode.getNext();
        }
    }

    public int getCount() {
        return count;
    }
}

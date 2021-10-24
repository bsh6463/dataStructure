package arrayList;

public class MyArray {

    int[] intArr;
    int count;

    public int ARRAY_SIZE;
    public static final int ERROR_NUM = -99999999;

    public MyArray() {
        count = 0;
        ARRAY_SIZE = 10;
        intArr = new int[ARRAY_SIZE];
    }

    public MyArray(int size) {
        count = 0;
        ARRAY_SIZE = size;
        intArr = new int[size];
    }

    public void addElement(int num){

        isMemoryEnough();
        intArr[count++] = num;
    }

    /**
     * 중간에 요소를 추가하면 마지막 요소부터 한칸씩 뒤로 옮겨야함.
     */
    public void insertElement(int position, int num){

        positionValidation(position);

        isMemoryEnough();

        for (int i = count-1; i>=position; i--){
            intArr[i+1] = intArr[i];
        }
        intArr[position] = num;
        count++;
    }

    /**
     * 삽입할 위치의 다음 요소부터 한칸 씩 앞으로 옮김.
     * 기존 마지막 위치는 초기화시킴
     */
    public int removeElement(int position){

        if(isEmpty()){
            System.out.println("array is Empty");
            return ERROR_NUM;
        }

        positionValidationForRemove(position);

        int ret = intArr[position];

        for (int i = position+1; i <= count-1; i++){
            intArr[i-1] = intArr[i];
        }

        intArr[count-1] = 0;
        count--;

        return ret;
    }

    private void positionValidation(int position) {
        if (position > ARRAY_SIZE || position < 0 || position > count) {
            System.out.println("position error");
        }
    }

    private void positionValidationForRemove(int position) {
        if (position > ARRAY_SIZE || position < 0 || position >= count) {
            System.out.println("position error");
        }
    }

    private void isMemoryEnough() {
        if (count >= ARRAY_SIZE) {
            System.out.println("not enough memory");
        }
    }

    public Boolean isEmpty(){
        if(count == 0){
            return true;
        }
        return false;
    }

    public int size(){
        return this.count;
    }

    public void clear(){
        for (int i=0; i<count; i++){
            this.intArr[i] = 0;
        }
        this.count = 0;
    }
}

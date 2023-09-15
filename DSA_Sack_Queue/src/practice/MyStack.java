package practice;

public class MyStack {
    private int[] arr ;
    public int size ;
    private int index = 0 ;

    public MyStack(int size ){
        this.size = size ;
        arr = new int[size] ;
    }
    public boolean isFull(){
        if (index == size ){
            return true ;
        }
        return false ;
    }
    public boolean isEmpty(){
        if (index == 0 ){
            return true ;
        }
        return false ;
    }
    public void push(int element){
        if (isFull()){
            System.out.printf("Stack is full !!");
        }else {
            arr[index] = element ;
            index ++ ;
        }
    }
    public int pop(){
        if (isEmpty()){
            System.out.printf("Stack is null");
        }
        return arr[--index];
    }
}

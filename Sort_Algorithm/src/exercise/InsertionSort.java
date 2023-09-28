package exercise;

public class InsertionSort {
    public static void insertionSort(int[] list){
        int pos , x ;
        for (int i = 1; i < list.length; i++) {
            pos = i;
            x = list[i]; ;
            while (pos > 0 && x < list[pos - 1] ){
                list[pos] = list[pos - 1];
                pos--;
            }
            list[pos] = x ;
        }
    }

    public static void main(String[] args) {
        int[] list = {5,1,6,7,8,2,12};
        insertionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}

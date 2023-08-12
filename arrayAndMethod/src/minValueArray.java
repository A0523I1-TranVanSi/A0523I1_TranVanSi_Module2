public class minValueArray {
    public static void main(String[] args) {
        int[] array = {4,12,5,6,78,1};
        int index = minValue(array);
        System.out.println("The smallest element in the array is : " + index);
    }
    public static int minValue(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if ( arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}

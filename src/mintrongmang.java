public class mintrongmang {
    public static int minValue(int[] arr) {
        return 0;
    }
    public static void main(String[] args) {
        int[] arr ={3,7,4,6,2};
        int index = minValue(arr);
        System.out.println("the smallest element in the array is: " + arr[index]);
        int min = arr[0];
        int i = 1;
        for (int j = 0; j < arr.length; j++){
            if (arr[j] < min){
                min = arr[j];
                i = j + 1;
            }
        }
        System.out.println("số nhỏ nhất trong mảng : "+ min + " vị trí ở trong mảng: "+ i);
    }
}

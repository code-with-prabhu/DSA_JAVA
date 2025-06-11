package Arrays;

public class reverse {
    public static void reverse_array(int arr[]){
        int st = 0;
        int lat = arr.length-1;
        while(st<lat){
            arr[st] = arr[st] ^ arr[lat];
            arr[lat] = arr[st] ^ arr[lat];
            arr[st] = arr[st] ^ arr[lat];

            st++;
            lat--;
        }
        System.out.println("reversed array is: ");
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6, 7, 8};
        reverse_array(arr);
    }
}

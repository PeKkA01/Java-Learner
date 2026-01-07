import java.util.Arrays;
public class NewArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int n = arr.length;
        int k = 3;

        for (int i = 0; i < k  ; i++) {
            int temp = arr[i];
            arr[i] = arr[n - k + i];
            arr[n - k + i] = temp;
        }
        System.out.println(Arrays.toString(arr));

//        int[] arr = {1,2,3,4,5,6,7};
//         int n = arr.length;
//         int temp = arr[n-3];
//         for(int i = n-3; i > 0; i-- ){
//             arr[i] = arr[i - 1];
//         }
//         arr[0] = temp ;
//        System.out.println(Arrays.toString(arr));
        }
    }


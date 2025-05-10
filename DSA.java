//                                              (day1)Find the maximum and minimum element in an array


 

// import java.util.*;
// public class DSA{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//  System.out.print("Enter size of array: ");
//  int n = sc.nextInt();
//  int[] arr = new int[n];

//  System.out.println("Enter elements:");
//  for (int i = 0; i < n; i++) {
//  arr[i] = sc.nextInt();
//  }
//         int max = arr[0];
//             for (int i = 1; i < n; i++) {
//            if (arr[i] > max) {
//                  max = arr[i];
//            }
//         }
//     int min = arr[0];
//     for(int i =1; i<arr.length; i++ ){
//         if(arr[i]<min){
//             min = arr[i];
//         }
    
// }


// System.out.println("Maximum element: " + min);
// System.out.println("Maximum element: " + max);
//     }
// }


//                                                   (day2 Reverse an array in place)

// public class DSA{
//     public static void main(String[] args) {
//         int[] arr={1,2,3,4,5};
//         for(int i=arr.length-1; i>=0; i--){
//             System.out.println(arr[i]);
//         }
//     }
// }

//                                    (day3 Find the 'Kth' max and min element of an array)
// public class DSA{
//     public static void main(String[] args) {
//         int[] arr={12,3,5,7,19,0,23};
//          int k=5;

//         // Arrays.sort(arr);

//         if(k <= arr.length){
//             int kthMin = arr[k-1];
//             int kthMax = arr[arr.length-k];
//             System.out.println(k + "th minimum element"+ kthMin);
//             System.out.println(k + " th is maximum element" + kthMax);

//         }
//         else{
//             System.out.println("k is largest than the size of the array");
//         }
//     }
// }

//                                         (day4 /5. Move all negative numbers to beginning and positive to end)
public class DSA{
    public static void main(String[] args) {
        int[] arr ={2,-4,5,-6,7,-9};
        int j=0;
        int i;
        for(i=0; i<5; i++){
            if ( arr[i]<0){
                int temp= arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
                j++;
                
            }
        }
        System.out.println(arr[j] );
    }
}
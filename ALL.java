
//import java.util.* ;
// public class ALL{
//     public static void main(String[] args) {
                                                                      //print 2D array
        // int [] [] arr = {
        //     {1,2,3},
        //     {4,4,5},
        //     {5,8,6}
        // } ;
        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr[i].length; j++){
        //         System.out.print(arr[i][j] + " ");
        //     }
        // }
        // System.out.println();

                                                                       //sum of 2D array

//         int [] [] arr = {
//             {1,2,3},
//             {4,4,5},
//             {5,8,6}
//         } ;
//         int sum =0;
//         for(int i=0; i<arr.length; i++){
//             for(int j=0; j<arr[i].length; j++){
//             sum+= arr[i][j];

// System.out.println("total sum"+ sum);
//     }
// }
                                                                             //row wise sum
// 

// int [] [] arr = {
//              {1,2,3},
//                  {4,4,5},
//                  {5,8,6}
//              } ;

// for (int i = 0; i < arr.length; i++) {
//     int rowSum = 0;
//     for (int j = 0; j < arr[i].length; j++) {
//     rowSum += arr[i][j];
//     }
//     System.out.println("Sum of Row " + i + ": " + rowSum);
//    }
                                                                // colum wise sum
         
                                                    //             int [] [] arr = {
                                                    //                 {1,2,3},
                                                    //                     {4,4,5},
                                                    //                     {5,8,6}
                                                    //                 } ;
                                                       
                                                    //    for (int i = 0; i < arr.length; i++) {
                                                    //        int colSum = 0;
                                                    //        for (int j = 0; j < arr[i].length; j++) {
                                                    //        colSum += arr[j][i];
                                                    //        }
                                                    //        System.out.println("Sum of Row " + i + ": " + colSum);
                                                    //   }                                                                        
                                        //matrix me sabse bada element
         
                                        
                            //             int [] [] arr = {
                            //                 {1,2,3},
                            //                     {4,4,5},
                            //                     {5,8,6}
                            //                 } ;
                            //    int min= arr[0][0];
                            //    for (int i = 0; i < arr.length; i++){

                               
                            //        for (int j = 0; j < arr[i].length; j++) {
                            //        if(arr[i][j] > min) {
                            //        min= arr[i][j];
                            //        }
                            //        }
                            //     }
                            //     System.out.println("minimum element "+ min);

                                                             //lenear search
        // Scanner in = new Scanner(System.in);
        // System.out.println("enter the size of array ");
        // int n = in.nextInt();
        // int [] arr = new int[n] ;
        // System.out.println("enter element");
        // for(int i=0; i<n; i++){
        //     arr[i]= in.nextInt();

        // }
        // System.out.println("enter number to search");
        // int x = in.nextInt();
        //    boolean found = false;
        //    for(int val : arr){
        //     if( val==x){
        //         found = true;
        //         break;
        //     }


        //    }
        //    if(found){
        //     System.out.println(x + " present ");
        //    }
        //    else
        //    {
        //     System.out.println(x + " not present");
        //    }

//method(function) non static

        //   public class ALL{
        //      void sum (int a){
        //         System.out.println(a);
        //     }
        //     public static void main(String[] args) {
        //         ALL obj=new ALL();
        //         obj.sum (5);
        //     }
        //   }                                                   
    //global variable
        // public class ALL{
        //     int a=5;
           
        //    public static void main(String[] args) {
        //     ALL obj=  new ALL();
        //     System.out.println(obj.a);
        //     // ALL obj=  new ALL();
        //       // obj.sum (5);
           

        // bullle sort
        // public class ALL{
        //     static void bubblesort(int[] arr){
        //         for(int i=0; i<arr.length-1; i++){
        //             for(int j=0; j<arr.length-i-1; j++){
        //                 if(arr[j]= arr[j+1]){
        //                     int temp=arr[j];
        //                     arr[j+1]=temp;
        //                 }


        //             }
        //         }
        //         System.err.println(arr[i]);
        //     }
        // }    
        //  public static void main(String[] args){
        //     int[] arr = {1,4,6,3,7};
            
        //     ALL obj=new ALL();
        //     obj.bubblesort(arr[j]);
            
        // }*
    
                                                     // constructor( two or more conductor)

   
        //inheritance
        class employe{
            void work() {
                System.out.println("employee is working");

            }
        }
        class manager extand employee{
            void attendmetting(){
                System.out.println("manager is attend metting ");
            }
        }
        public class ALL{
            public static void main(String[],args){
                manager m = new manager();
                m.work();
                m.attendmetting();
            }
        }
        // public class ALL{
        //     public static void main(String[] args){
        //         manager m= new manager();
        //         m.work();
        //         m.attend metting();
        //     }
        // }

    
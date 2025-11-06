
// import java.util.*;
// public class Code{
//     public static void main(String[] args){
//         // System.out.print("maa");
//         // String name  = " mata ";
//         // int  a = 34; 
//         // int  b = 45;
//         //  System.out.println(name );
//         Scanner sc= new Scanner( System.in);
//         String name =sc.next();
//         // nextInt();
//         // nextFloat();
//         System.out.println(name);

//                              addition of two number 



// Scanner sc= new Scanner(System.in);
// int a= sc.nextInt();
// int b= sc.nextInt();
// int sum = a+b;
// System.out.println(sum );
//     }
// }

//                                conditional statement 
// Scanner sc= new Scanner(System.in);
// int age= sc.nextInt();
// if( age>18){
//     System.out.println("adult");
// }
// else{
//     System.out.println("not adult");
// }
//     }
// }

//                           odd or even number
// Scanner sc= new Scanner(System.in);
// int num= sc.nextInt();
// if( num%2==0){
//     System.out.println("even");
// }
// else{
//     System.out.println("odd");
// }
//     }
// }
//                           a=b,a>b,a<b check karna 
// Scanner sc= new Scanner(System.in);
// int a= sc.nextInt();
// int b= sc.nextInt();
// if( a==b){
//     System.out.println("equal");
// }
// else{
//     if(a>b){
//     System.out.println("grater");
// }

// else{
//     System.out.println("lesser");

//                             switch  case statement use
// Scanner sc= new Scanner(System.in);
// int button= sc.nextInt();
// switch(button){
//     case 1: System.out.println("monday");
//     break;
//     case 2: System.out.println("tuesday");
//     break;
//     case 3: System.out.println("wednesday");
//     break;
//     case 4: System.out.println("friday");
//     break;
//     default: System.out.println("kuch nahi ree");
// }
//                        
//                          loop for loop
// for(int counter=0; counter<5; counter= counter+1){
//     System.out.println("counter");
// }

//                              while loop 
//   Scanner sc= new Scanner(System.in);
//  int age= sc.nextInt();
// while(age<12){
//     System.out.println("bachha");
// }

//                                    do while loop
// int i=0;
// do{
//     System.out.println(i);
//     i++;
// }while(i<=20);
//                               pattern
// for(int i=1; i<=4; i++){
//     for(int j=1; j<=4;j++){
//         System.out.print("*");
//     }
//     System.out.println("*");
//     }
// }

//                       Hollow Ractangle pattern 
    
    // for(int i=1; i<=4; i++){
    //     for(int j=1; j<=5; j++){
    //         if(i==1 || j==1 || i==4 || j==5){
    //             System.out.print("*");
    //         }
    //          else{
    //         System.out.print(" ");
    //     }
    // }
    //         System.out.println( );
        
        
    //     }
//                                Half pyramid pattern

// for( int i=1; i<=4; i++){
//     for(int j=1; j<=i; j++){
//         System.ut.print("*");
//     }
//     System.out.println( );
// }
//     }
  

//                                       butterfly pattern 
//  int n = 4;


//        //upper part
//        for(int i=1; i<=n; i++) {
//            for(int j=1; j<=i; j++) {
//                System.out.print("*");
//            }


//            int spaces = 2 * (n-i);
//            for(int j=1; j<=spaces; j++) {
//                System.out.print(" ");
//            }


//            for(int j=1; j<=i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

// for(int i=n; i>=1; i--) {
//            for(int j=1; j<=i; j++) {
//                System.out.print("*");
//            }


//            int spaces = 2 * (n-i);
//            for(int j=1; j<=spaces; j++) {
//                System.out.print(" ");
//            }


//            for(int j=1; j<=i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//                                          function 
import java.util.*;
public class Code{
    // public static void printMyName(String name){
    //     System.out.println(name);
    //     return ;

    // }

    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     String name= sc.next(); 
    //     printMyName(name);

//                         print sum using function 


// public static int CalculationSum(int a,int b){
//     int sum = a+b;
//     return sum;

// }
// public static void main(String[] args) {
//     Scanner sc= new Scanner( System.in);
//     int a =sc.nextInt();
//     int b =sc.nextInt();
//     int sum = CalculationSum(a,b);
//     System.out.println(sum);
// }
//     }

//                      factorial number
//  public static void printFactorial(int n){
//     int factorial=1;
//     for(int i=n; i>=1;i--){
//         factorial = factorial*i; 
//     }
//     System.out.println(factorial);
//     return ;


//  } 
// public static void main(String[] args) {
//     Scanner sc= new Scanner(System.in );
//     int n= sc.nextInt();
//     printFactorial(n);
// }
// 

//                           array 
// public static void main(String[] args) {
//     int[] marks = new int[3];
//     marks[0]= 97;
//     marks[1]=98;
//     marks[2]=95;
//      for(int i=0; i<3; i++){
//         System.out.println(marks[i]);
//      }
//                     input size of array 
// public static void main(String[] args) {
//   Scanner sc = new Scanner( System.in );
//   int size= sc.nextInt();
//   int number[]= new int[size];

//   for(int i=0; i<size; i++){
//     number[i]=sc.nextInt();
//   }
//   for(int i=0; i<size; i++){
//     System.out.print(number[i]+ " ");
//   }  


//                          input and search the number 
public static void main(String[] args) {
  Scanner sc = new Scanner( System.in );
  int size= sc.nextInt();
  int number[]= new int[size];

  for(int i=0; i<size; i++){
    number[i]=sc.nextInt();
  }
  int x= sc.nextInt();
  for(int i=0; i<number.length; i++){
     if(number[i]==x){
        System.out.println("found at index " + i);
     }
  }  
}
}


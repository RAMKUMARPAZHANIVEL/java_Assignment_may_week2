import java.util.*;
public class assignment2 {
   public static void main(String[] args) {
       System.out.println("hello");
       Scanner sc = new Scanner(System.in);
       
 //1.  print even number till n

        int n = sc.nextInt();
        for(int i=0; i<=n; i++){
            if(i%2==0){
                System.out.println("1. even num : "+i);
            }
        }
   
      int n1 = sc.nextInt();
      for(int i=1; i<=n1;i++){
          if(i%7==0){
              System.out.println("1. divisible by 7 till n : "+i);
          }
      }
     
 //2.  multiple of 5 and print count for that
    int count2 = 0;
      int n2 = sc.nextInt();
      for(int i=1; i<=n2;i++){
          if(i%5==0){
            
            
              count2++;             
          }
          
      }
      System.out.print("2. the final count of *5 is : "+count2);
 
//3.  multiple of  3 and print count for that
      int count3 = 0;
      int n3 = sc.nextInt();
      for(int i=1; i<=n3;i++){
          if(i%3==0){
            
              count3++;             
          }
          
      }
      System.out.print("3. the final count of *3 : "+count3);
      
//4. input n and two integers if the sum is even print add else print multiplication
        int n4 = sc.nextInt();
       for(int i=0; i<n4; i++){
           int a = 10;
           int b = 10;
         if(i%2==0){
             int add = a+b;
             System.out.println(add);
         }
         else{
             System.out.println(a*b);
         }
       }

/*5. WAP to print 1 2 3  4
                   4 5 6  7
                   8 9 10 11 12 */

        int n5 = 3;
        int count5 = 0;
       for(int i=0; i<n5; i++){
          for(int j=0; j<=n1; j++){
              count5++;
              System.out.print("5. "+count5+" ");
          }
          System.out.println();
       }
/*6.  count no. of pairs in 1-n with sum even*/
       int n6 =sc.nextInt();
       int count6 = 0;
      for(int i=1; i<=n6; i++){
         for(int j=1; j<=i; j++){
             int sum = i+j;
             if(sum%2==0){
                count6++;
                
                System.out.println("6. "+i+"+"+j +"="+ sum);
             }
         }
        }
        System.out.println("6. no. of pairs with sum even : "+count6);

/*7.  no. of pairs with given sum*/ 
        int s =sc.nextInt();
        int count7 = 0;
       for(int i=1; i<=s; i++){
          for(int j=1; j<=s; j++){
              int sum = i+j;
              if(sum==s){
                 count7++;
              }
          }
         }
         System.out.println("7. no. of pairs wit given sum :"+ count7);


   }
    
}
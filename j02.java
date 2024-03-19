import java.util.Scanner;

public class j02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input:");
        int m = sc.nextInt();
        
        while(m!=999){   
        int n = sc.nextInt();
         System.out.println(gcd(m,n));
         System.out.println("Input:");
         m = sc.nextInt();
        }
        
       }
        static int gcd(int m, int n){         
         int t=0;
         while(n!=0){
          t = m%n;
          m = n;
          n = t;
         }
         return m;
           }   
      }
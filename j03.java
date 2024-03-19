import java.util.Scanner;
public class j03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("請輸入三角形第一個邊長:");
        int a = scn.nextInt();
        System.out.print("請輸入三角形第二個邊長:");
        int b = scn.nextInt();
        System.out.print("請輸入三角形第三個邊長:");
        int c = scn.nextInt();

        if(a*a+b*b==c*c){
            System.out.println("您所輸入的三邊為直角三角形");
        }
        else if(a*a+b*b!=c*c){
            System.out.println("您所輸入的三邊不為直角三角形");
        }
    }
}

import java.util.Scanner;

public class j01{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("請輸入您的姓名:");
        String name=scn.next();
        
        System.out.println("HI,"+name+"請輸入您的銅板個數:");
        System.out.print("請輸入1元的數量:");
        int a = scn.nextInt();
        System.out.print("請輸入5元的數量:");
        int b = scn.nextInt();
        System.out.print("請輸入10元的數量:");
        int c = scn.nextInt();
        System.out.print("請輸入50元的數量:");
        int d = scn.nextInt();
        int e = a+b*5+c*10+d*50;
        System.out.printf("您的錢總共有:%d 千 %d 百 %d 十 %d 元",e/1000,e/100%10,e/10%10,e/1%10);

    }
    }
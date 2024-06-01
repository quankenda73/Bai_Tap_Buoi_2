import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so a = ");
        a = sc.nextInt();
        System.out.print("Nhap vao so b = ");
        b = sc.nextInt();
        System.out.print("Nhap vao so c = ");
        c = sc.nextInt();

        if(a>b && a>c){
            System.out.println("So lon nhat là a = "+a);
        }else if(b>c && b>a){
            System.out.println("So lon nhat la b = "+b);
        }else{
            System.out.println("So lon nhat là c =  "+c);
        }
    }
}

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        while (true){
            System.out.println("Vui lòng nhập 3 cạnh của 1 tam giác");
            System.out.println("Mời bạn nhập độ dài của 1 cạnh");
            Scanner scanner= new Scanner(System.in);
            int a;
            a= scanner.nextInt();
            System.out.println("Mời bạn nhập độ dài cạnh thứ 2");
            int b;
            b= scanner.nextInt();
            System.out.println("Mời bạn nhập độ dài cạnh còn lại");
            int c;
            c= scanner.nextInt();
            if (a+b>c&a+c>b&b+c>a){
                if (a==b&a==c&b==c){
                    System.out.println("Tam giác của bạn là tam giác cân");
                }
                else if (a==b||b==c||a==c){
                    System.out.println("Tam giác của bạn là tam giác đều");
                }
                else if (a*a==b*b+c*c||b*b==a*a+c*c||c*c==a*a+b*b) {
                    System.out.println("Tam giác của bạn là tam giác vuông");
                }
                else if ((a*a==b*b+c*c||b*b==a*a+c*c||c*c==a*a+b*b)&&(a==b&a==c&b==c)) {
                    System.out.println("Tam giác của bạn là tam giác vuông cân");
                }
                else {
                    System.out.println("Tam giác của bạn là tam giác thường");
                }
                break;
            }
            else {
                System.out.println("Tam giác của bạn sai vui lòng nhập lại ");
            }
        }
    }
}
// a*a+a*a=64
// a*a=24

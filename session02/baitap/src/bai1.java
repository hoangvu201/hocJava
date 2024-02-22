import javax.swing.text.Style;
import java.util.Scanner;

// cho ng dùng nhập vào a,b,c là 3 cạnh của tam giác
// nếu 3 cạnh ko thỏa mãn đk tạo tam giác thì bắt nhập lại
// nếu thỏa mãn thì tính diện tích và chu vi
public  class  bai1 {
    public static void main(String[] args) {
      while (true){
          System.out.println("Vui lòng nhập 3 cạnh của 1 tam giác ");
          System.out.println("Mời bạn nhập độ dài của 1 cạnh ");
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
              int chuvi=a+b+c;
              System.out.println("Chu vi tam giác của bạn là "+chuvi+"cm");
              float nuaChuvi=chuvi/2;
              System.out.println("Diện tích tam giác của bạn là"+Math.sqrt(nuaChuvi*(nuaChuvi-a)*(nuaChuvi-b)*(nuaChuvi-c))+"c");
              break;
          }
          else {
              System.out.println("Tam giác của bạn sai");
          }
      }
    }
}
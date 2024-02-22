import java.util.Scanner;
    public class bai1 {
        //Bài 1: Khai báo mảng số nguyên gồm 5 phần tử, nhập giá trị các phần tử từ bàn phím và in ra giá trị các phần tử của mảng
        public static void main(String[] args) {
            Scanner scanner= new Scanner(System.in);
            System.out.println("Mời bạn nhập 1 số nguyên");
            int num1=scanner.nextInt();
            System.out.println("Mời bạn nhập số nguyên thử 2");
            int num2= scanner.nextInt();
            System.out.println("Mời bạn nhập số nguyên thứ 3");
            int num3= scanner.nextInt();
            System.out.println("Mời bạn nhập số nguyên thứ 4");
            int num4= scanner.nextInt();
            System.out.println("Mời bạn nhập số nguyên thứ 5");
            int num5= scanner.nextInt();
            int[] snt={num1,num2,num3,num4,num5};
            System.out.println("Dãy số nguyên của bạn là");
            for (int i = 0; i <snt.length ; i++) {
                System.out.println(snt[i]);
            }
        }
    }


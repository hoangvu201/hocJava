import java.util.Scanner;
public class bai2 {
    //Bài 2: Nhập vào số phần tử (n) của mảng 1 chiều,
    // khai báo và nhập giá trị các phần tử của mảng một chiều số thực gồm n phần tử.
    // In ra giá trị trung bình cộng của các phần tử trong mảng
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Mời nhập số phần tử của dãy số");
        int n=scanner.nextInt();
        int[] mang= new int[n];
        System.out.println(mang.length);
        for (int i = 0; i <= mang.length-1 ; i++) {
            System.out.println("Mời bạn nhập phần tử " +(i+1));
            int num= scanner.nextInt();
            mang[i]=num;
        }
        float tbc=0;
        for (int i = 0; i <mang.length ; i++) {
            tbc=tbc+mang[i];
        }
        System.out.println("Giá trị trung bình của dãy số của bạn là "+ tbc/n);
    }
}

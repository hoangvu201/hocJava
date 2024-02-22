import java.util.Scanner;

public class baitap4 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int num;
        num = scanner.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println("Bang cuu chuong nhan "+i);
            for (int j = 1; j <=10 ; j++) {
                System.out.println(i+"x"+j+"="+i*j);
            }
        }
    }
}

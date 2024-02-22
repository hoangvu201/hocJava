import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Mời bạn nhập số");
        int number;
        number = scanner.nextInt();
        if (number%2==0){
            System.out.println("Số bạn nhập là số chẵn");
        }
        else {
            System.out.println("Số bạn nhập là số lẻ");
        }
    }
}

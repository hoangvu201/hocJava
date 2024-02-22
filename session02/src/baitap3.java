import java.util.Scanner;

public class baitap3 {
    public static void main(String[] args) {
        System.out.println("Moi ban nhap diem TB");
        Scanner scanner= new Scanner(System.in);
        float dTb;
        dTb= scanner.nextFloat();
        if (dTb>8){
            System.out.println("Ban la Hs gioi");
        }
        else if(dTb>7){
            System.out.println("Ban la Hs kha");
        } else if (dTb>5) {
            System.out.println("Ban la hs TB");
        }
        else {
            System.out.println("Ban la hs Yeu");
        }

    }
}

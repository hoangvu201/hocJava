import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        while (true){
            Scanner scanner= new Scanner(System.in);
            System.out.println("Mời bạn nhập năm bất kì");
            int nam;
            nam=scanner.nextInt();
            System.out.println("Mời bạn nhập tháng bất kì trong năm");
            int thang;
            thang= scanner.nextInt();
            if (thang<=12){
                if (thang==2){
                    if (nam%2==0){
                        System.out.println("Tháng "+thang+" năm "+nam+" có 29 ngày");
                    }
                    else {
                        System.out.println("Tháng "+thang+" năm "+nam+" có 28 ngày");
                    }
                } else if (thang<=7) {
                    if (thang%2==0){
                        System.out.println("Tháng "+thang+" năm "+nam+" có 30 ngày");
                    }
                    else {
                        System.out.println("Tháng "+thang+" năm "+nam+" có 31 ngày");
                    }
                } else if (thang>7) {
                    if (thang%2==0){
                        System.out.println("Tháng "+thang+" năm "+nam+" có 31 ngày");
                    }
                    else {
                        System.out.println("Tháng "+thang+" năm "+nam+" có 30 ngày");
                    }
                }
                break;
            }
            else {
                System.out.println("Tháng sai vui lòng nhập lại");
            }
        }

    }
}
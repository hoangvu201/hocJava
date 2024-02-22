import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        while (true){
            Scanner scanner= new Scanner(System.in);
            System.out.println("Mời bạn nhập năm bất kì");
            int nam;
            nam= scanner.nextInt();
            System.out.println("Mời bạn nhập tháng bất kì trong năm");
            int thang;
            thang= scanner.nextInt();
            System.out.println("Mời bạn nhập ngày bất kì trong tháng");
            int ngay;
            ngay= scanner.nextInt();
            System.out.println("Mời bạn nhập vào ngày bất kì trong tháng");
            if (nam >1581) {
                if (thang<=12){
                    if (thang==2){
                        if (nam%2==0&&ngay>30){
                            System.out.println("Ngày "+ngay+" Tháng "+thang+" Năm "+nam+" hợp lệ");
                        }
                        else {
                            System.out.println("Tháng "+thang+" năm "+nam+" có 28 ngày");
                        }
                    }
                }
                else {
                    System.out.println("Tháng sai vui lòng nhập lại");
                }
            }
            else {
                System.out.println("Vui lòng nhập số năm lớn hơn 1581");
            }
        }
    }
}

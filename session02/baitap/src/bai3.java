import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        System.out.println("Mời bạn nhập số công tơ điện tháng cũ");
        Scanner scanner= new Scanner(System.in);
        int soCu;
        soCu= scanner.nextInt();
        System.out.println("Mời bạn nhập số công tơ điện tháng mới");
        int soMoi;
        soMoi= scanner.nextInt();
        int soDien=soMoi-soCu;
        System.out.println("Số điện tiêu thụ tháng vừa rồi là " +soDien+" kWh" );
        if (soDien<50){
            System.out.println("Số tiền điện bạn phải trả là "+soDien*10000+"VNĐ");
        }
        else if (soDien>=50&&soDien<100){
            System.out.println("Số tiền điện bạn phải trả là "+soDien*15000+"VNĐ");
        }
        else if (soDien>=100&&soDien<150){
            System.out.println("Số tiền điện bạn phải trả là "+soDien*20000+"VNĐ");
        }
        else if (soDien>=150&&soDien<200){
            System.out.println("Số tiền điện bạn phải trả là "+soDien*25000+"VNĐ");
        }
        else if (soDien>=200){
            System.out.println("Số tiền điện bạn phải trả là "+soDien*30000+"VNĐ");
        }
    }
}

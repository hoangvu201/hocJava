import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        // lam chuong trinh xem phim
        // nhap vao tuoi
        // neu tuoi lon hon 18 moi xem phim
        Scanner scanner= new Scanner(System.in);
        int age;
        System.out.println(" Moi ban nhap tuoi de xem phim");
        age = scanner.nextInt();
//        if (age>18){
//            System.out.println(" Moi ban xem phim");
//        }
//        else {
//            System.out.println(" Ban chua du tuoi xem phim");
//        }
        // neu tuoi < 16 in ra moi xem doreamon
        // neu tuoi > 16 thi moi xem kiem hiep
        if (age>18){
            System.out.println(" Moi ban xem phim");
        } else if (age>16){
            System.out.println("Moi ban xem kiem hiep");
        }
        else {
            System.out.println("Moi ban xem doraemon");
        }

    }
}

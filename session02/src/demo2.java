import java.util.Date;
import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        // khai báo biến fullName
        String fullName;
        // nhap gia tri cho bien fullName tu ban phim
        // khoi tao doi tuong scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap ho ten");
        fullName=  scanner.nextLine();
        System.out.println(" Xin chào "+fullName);
        System.out.println("Moi ban nhap tuoi");
        int age;
        age = scanner.nextInt();
        System.out.println(" Ban sinh nam" +(2024-age));
        float height;
        System.out.println(" Nhap vao chieu cao cua ban");
        height = scanner.nextFloat();
        System.out.println(" Ban cao "+height+"cm");
        boolean sex;
        System.out.println(" Nhap vao gioi tinh true neu la Nam va false neu la Nu");
        sex = scanner.nextBoolean();
        System.out.println(" Ban gioi tinh "+ (sex ? "Nam": "Nu"));
    }
}

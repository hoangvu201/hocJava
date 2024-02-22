import java.util.Scanner;

public class demo4 {
    public static void main(String[] args) {
        // nhap vao so tu 2-8
        // dua ra man hinh thu tuong ung nhung bang chu
        Scanner scanner= new Scanner(System.in);
        int num;
        System.out.println("Nhap vao tu 2-8");
        num = scanner.nextInt();
        switch (num){
            case 2:
                System.out.println("Hom nay la thu hai");
                break;
            case 3:
                System.out.println("Hom nay la thu Ba");
                break;
            case 4:
                System.out.println("Hom nay la thu Tu");
                break;
            case 5:
                System.out.println("Hom nay la thu Nam");
                break;
            case 6:
                System.out.println("Hom nay la thu Sau");
                break;
            case 7:
                System.out.println("Hom nay la thu Bay");
                break;
            case 8:
                System.out.println("Hom nay la thu Chu Nhat");
                break;
            default:
                System.out.println("Sai dinh dang");

        }
    }
}

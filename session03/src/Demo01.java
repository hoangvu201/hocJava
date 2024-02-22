import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Mời bạn nhập vào 1 số nguyên");
        int n1=scanner.nextInt();
        System.out.println("Mời bạn nhập vào 1 số nguyên");
        int n2=scanner.nextInt();
        System.out.println("Mời bạn nhập vào 1 số nguyên");
        int n3=scanner.nextInt();
        do {
            System.out.println("************CACULAROR**************");
            System.out.println("1.Tổng 3 số nguyên");
            System.out.println("2.Trung bình cộng của 3 số nguyên");
            System.out.println("3.Số lớn nhất,nhỏ nhất trong 3 số");
            System.out.println("4.Thoát");
            System.out.println("Lựa chọn của bạn");
            int choice= scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Tổng 3 số nguyên là "+(n1+n2+n3));
                    break;
                case 2:
                    System.out.println("Trung bình cộng của 3 số nguyên là "+(n1+n2+n3)/2);
                    break;
                case 3:
                    if (n1>n2&&n1>n3){
                        System.out.println(n1+" là số lớn nhất");
                    }
                    else if (n2>n1&&n2>n3){
                        System.out.println(n2+" là số lớn nhất");
                    }
                    else if (n3>n1&&n3>n2){
                        System.out.println(n3+" là số lớn nhất");
                    }

                    if (n1<n2&&n1<n3){
                        System.out.println(n1+" là số nhỏ nhất");
                    }
                    else if (n2<n1&&n2<n3){
                        System.out.println(n2+" là số nhỏ nhất");
                    }
                    else if (n3<n1&&n3<n2){
                        System.out.println(n3+" là số nhỏ nhất");
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Mời bạn chọn số trong Menu");
            }
        }
        while (true);

    }
}

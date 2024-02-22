import java.util.Scanner;

public class demo02 {
    public static void main(String[] args) {
        // nhập vào số hàng, số cột của ma mảng
        // ============Menu==========
        // 1. Nhập vo giá trị các phần tử mảng
        // 2. In ra các phần tử của mảng
        // 3. Hiển thị dưới dạng ma trận
        // 4. In ra đường chéo  chính
        // 5. In ra đường chéo phụ
        // 6. In ra đường biên
        // 7. Thoát chương trình
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào số hàng");
        int row = sc.nextInt();
        System.out.println("Mời bạn nhập vào số cột");
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];

        do {
            System.out.println("============Menu==========");
            System.out.println("1. Nhập vào giá trị các phần tử mảng");
            System.out.println("2. In ra các phần tử của mảng");
            System.out.println("3. Hiển thị dưới dạng ma trận");
            System.out.println("4. In ra đường chéo chính");
            System.out.println("5. In ra đường chéo phụ");
            System.out.println("6. In ra đường biên");
            System.out.println("7. Thoát chương trình");
            System.out.print("Mời bạn chọn lệnh trong chương trình: ");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Mời bạn nhập giá trị");
                    for (int i = 0; i < matrix.length; i++) {
                        System.out.println("Giá trị dòng thứ " + (i + 1));
                        for (int j = 0; j < matrix[i].length; j++) {
                            System.out.printf("arr[%d][%d]", i, j);
                            matrix[i][j] = sc.nextInt();
                        }
                    }
                    break;
                case 2:
                    for (int in = 0; in < matrix.length; in++) {
                        System.out.println("Giá trị dòng thứ " + (in + 1) + " là: ");
                        for (int i = 0; i < matrix[in].length; i++) {
                            System.out.println(matrix[in][i]);
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            System.out.print(matrix[i][j]);
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            if (i == j) {
                                System.out.print(matrix[i][j]);
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    if (row == col) {
                        for (int i = 0; i < matrix.length; i++) {
                            for (int j = 0; j < matrix[i].length; j++) {
                                if (i + j == matrix[i].length -1) {
                                    System.out.print(matrix[i][j]);
                                } else {
                                    System.out.print(" ");
                                }
                            }
                            System.out.println();
                        }
                    } else {
                        System.out.println("Cột và hàng không hợp lệ");
                    }
                    break;
                case 6:
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            if (i == 0) {
                                System.out.print(matrix[i][j]);
                            } else if (j == 0&&i!= matrix.length-1) {
                                System.out.print(matrix[i][j]);
                            } else if (j!=0&&j!= matrix[i].length-1&&i!= matrix.length-1) {
                                System.out.print(" ");
                            } else if (j== matrix[i].length-1&&i!= matrix.length-1) {
                                System.out.print(matrix[i][j]);
                            }
                            if (i == matrix.length-1){
                                System.out.print(matrix[i][j]);
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 7:
                    System.exit(0);
            }
        }
        while (true);
    }
}

public class demo01 {
    public static void main(String[] args) {

        // 3 sinh viên với mỗi sv có điểm 3 môn khác nhau

      //  float[] sv1= {8,7,8};
        double[] sv1= {8,5,7};
        double[] sv2= {9,9,9};
        double[] sv3= {5,5,5};
        double[][] svs = {sv1,sv2,sv3};

        System.out.println(svs[0][0]);
        System.out.println(svs[0][1]);
        System.out.println(svs[0][2]);
        System.out.println("Điểm sinh viên thứ 3 là"+ svs[2][2]);

        // in tất cả các phần tử mảng 2 chiều
        for (int i = 0; i <svs.length ; i++) {
            System.out.println("điểm trung bình hs thứ " +i);

            for (int j = 0; j <svs[i].length ; j++) {
                System.out.println(svs[i][j]);
            }
        }
    }
}

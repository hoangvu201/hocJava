public class bai6 {
    public static void main(String[] args) {
        // tìm tất cả các số có 3 chứ số
        //tổng các chữ số = 15;
        for (int soTram = 1; soTram <=9 ; soTram++) {
            for (int soChuc = 0; soChuc <=9 ; soChuc++) {
                for (int soDv = 0; soDv <=9 ; soDv++) {
                    if (soTram+soDv+soChuc==15){
                        System.out.println("Số bạn cần tìm là "+soTram+soDv+soChuc);
                    }
                }
            }
        }
    }
}

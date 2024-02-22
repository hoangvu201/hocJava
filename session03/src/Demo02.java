public class Demo02 {
    public static void main(String[] args) {
        // khai báo biến mảng
        // khai bo mảng lưu trữ 5 nyc
        String[] nycs = new String[5];
        // truy cập và đặt tên cho phần tử mảng
        nycs[0]= "Hoa";
        nycs[1]= "Hương";
        nycs[2]= "Trang";
        nycs[3]= "Thảo";
        nycs[4]= "Thảo";
        System.out.println("Người yêu cũ thứ 3 là "+nycs[2]);
        // hiển thị danh sách nyc
        for (int i = 0; i < nycs.length ; i++) {
            System.out.println(nycs[i]);
        }
        // khai bao mảng lưu trữ tên của 2 nym
        String[] nym = {"Ngọc","Hân"};
    }
}

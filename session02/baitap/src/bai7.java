import java.util.Scanner;

public class bai7 {
    //Bài 12: Tìm số đảo ngược của một số nguyên. Ví dụ nhập số 12345 sẽ in ra 54321
    public static void main(String[] args) {
            Scanner scanner= new Scanner(System.in);
            System.out.println("Mời bạn nhập dãy số bất kì");
            int num= scanner.nextInt();
            int newNum=0;
            while (num!=0){
                int x=num%10;/* 8 */
                num=num/10;/* 1234567 */
                newNum = (newNum * 10) + x;
            }
            System.out.println(newNum);
    }
}

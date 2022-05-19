import java.util.Scanner;
public class money {
    public static void main(String[] args) {
        double vnđ = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập số tiền USD: ");
        usd = sc.nextDouble();
        double quydoi = usd * 23000;
        System.out.print("Gía trị VNĐ:" + quydoi);
    }
}

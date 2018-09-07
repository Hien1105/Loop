import java.util.Scanner;

public class Tim20SoNguyenToDauTien {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("So luong so nguyen to can hien thi la: ");
        n = scanner.nextInt();
        int count = 0;
        for (int i = 2; i < i + 1; i++) {
            int tag = 0;
            for (int j = 2; j <= Math.sqrt(i); j++)
                if (i % j == 0) tag = 1;
            if (tag==0) {
                count++;
                System.out.println("i=" + i);
            }
            if (count==n) break;
        }
    }
}



public class SoNguyenToNhoHon100 {
    public static void main(String[] args) {
        for (int i=1; i<100;i++)
        {
            int count = 0;
            for (int j=2; j<= Math.sqrt(i); j++){
                if (i%j == 0) count ++;
            }
            if (count == 0) System.out.println("i = "+i);
        }
    }
}

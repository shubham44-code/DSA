import java.util.Scanner;

public class Kernighans {

    public static int kernighans(int n){
        int count = 0;
        while(n != 0){
            int rsbm = n & -n;
            n -= rsbm;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        System.out.println(kernighans(n));
    }
}

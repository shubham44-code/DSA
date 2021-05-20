import java.util.Scanner;

class NumberOfOnes {
    static int numberOfOnes(int n){
        int count = 0;
        while(n != 0){
            n = n & (n - 1);
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(numberOfOnes(n));
    }
}
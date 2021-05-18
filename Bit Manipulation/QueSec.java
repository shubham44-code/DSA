import java.util.Scanner;

class QueSec{
    public int rsb(int a){
        // int comp = ~a;
        // int secComp = comp + 1;

        // return a & secComp;
        return a & -a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueSec ob = new QueSec();
        int a = sc.nextInt();

        int res = ob.rsb(a);

        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(res));

    }
}
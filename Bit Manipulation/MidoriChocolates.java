// https://practice.geeksforgeeks.org/problems/midori-and-chocolates2438/1/?category[]=Bit%20Magic&category[]=Bit%20Magic&problemStatus=unsolved&page=1&query=category[]Bit%20MagicproblemStatusunsolvedpage1category[]Bit%20Magic#/
public class MidoriChocolates {
    static long leftShops(long i, long L){

        return (1 << L) - i;
        // return ((long)(Math.pow(2, L))) - i;
        
    }
    public static void main(String[] args) {

        System.out.println(leftShops(1, 2));

    }
}

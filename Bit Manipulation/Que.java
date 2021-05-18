import java.util.Scanner;

class Que {

    public int on(int a, int pos){
        return (a | (1 << pos));
    }

    public int off(int a, int pos){
        return (a & (~(1 << pos)));
    }

    public int toggle(int a, int pos){
        return (a ^ (1 << pos));
    }

    public boolean check(int a, int pos){
        if((a & (1 << pos)) == 0){
            return false;
        }else{
            return true;
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);   
        Que ob = new Que();
        
        int a = sc.nextInt();
        int pos = sc.nextInt();
        sc.close();
        
        // System.out.println(ob.on(a, pos));
        // System.out.println(ob.off(a, pos));
        // System.out.println(ob.toggle(a, pos));
        System.out.println(ob.check(a, pos));
    }
}

class bit{

    public long numSetBits(long a) {
        long b = a;
        int res = 0;
        System.out.println(a);
        while(b != 0){
            b = b & (b - 1);
            res++;
        }
        System.out.println(res);
	    a = a << res;
	    return a;
	}
    public static void main(String args[]) {
        
        bit ob = new bit();

        System.out.println(ob.numSetBits(10));

    }
}
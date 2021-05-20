public class SubsetOfSet {

    public static int subsetOfSet(int arr[], int n){
        int count = 0;
        for(int i = 0; i < (1 << n); i++){
            for(int j = 0; j < n; j++){
                if((i & (1 << j)) == 0){
                    System.out.print(arr[j]);
                }
            }
            count++;
            System.out.println();
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(subsetOfSet(arr, arr.length));
    }
}

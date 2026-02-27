class Main {
    public static int[] square(int[] a) {
        for(int i = 0; i<a.length; i++) {
            a[i] = a[i]*a[i];
        }
        return a;
    }
    
    public static void main(String[] args) {
        int[] arr = {2,3,4};
        int[] b = square(arr);
        System.out.println(arr[1]+b[2]);
    }
}

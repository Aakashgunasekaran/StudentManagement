public class Array {
//    static int sort(int[] arr)
//    {
//        int n= arr.length;
//        for(int i=0;i<n;i++)
//        {
//            for(int j=0;j<n-i-1;j++)
//            {
//                if(arr[j]>arr[j+1])
//                {
//                    int temp = arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
//        return arr[n-1];
//    }
//    static  int sort1(int [] arr)
//
//    {
//        int large=arr[0];
//        for(int j: arr)
//        {
//            if(j>large)
//            {
//                large=j;
//            }
//        }
//        return large;
//    }
    static void RR(int[] a, int d) {
        int n = a.length;
        d = d % n; // handle d > n
        int[] temp = new int[d];

        // Step 1: Copy last d elements into temp
        for (int i = 0; i < d; i++) {
            temp[i] = a[n - d + i];
        }

        // Step 2: Shift the rest of the array to the right
        for (int i = n - 1; i >= d; i--) {
            a[i] = a[i - d];
        }

        // Step 3: Copy back temp[] to the front
        for (int i = 0; i < d; i++) {
            a[i] = temp[i];
        }

    } static  void main(String[] args)
    {
//        int  n;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("enter the  number of element:");
//         n=scan.nextInt();
//        int[] arr = new int[n];
//        System.out.println("enter the each element of an array:");
//        for(int i=0;i<n;i++)
//        {
//            arr[i]=scan.nextInt();
//        }
//
//        System.out.println("largest element in an array:"+ sort(arr));
//        System.out.println("largest element in an array:"+ sort1(arr));
        int[] a = {1,2,3,4,5,6,7};
        RR(a,3);
        for (int j : a) {
            System.out.print(j);
        }

    }
}

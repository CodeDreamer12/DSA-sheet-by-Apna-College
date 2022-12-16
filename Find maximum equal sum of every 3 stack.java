class Solution {
    public static int maxEqualSum(int N1,int N2,int N3, int[] S1, int[] S2, int[] S3) {
          int a = 0; //sum1
          int b = 0; //sum2
          int c = 0; //sum3
          for (int i: S1) a += i;
        for (int i: S2) b += i;
        for (int i: S3) c += i;
        int i = 0, j = 0, k = 0;
        while (a > 0 && b > 0 && c > 0) {
            if (a == b && b == c) return a;
            else if (a >= b && a >= c) {
                a -= S1[i];
                i++;
            } else if (b >= c && b >= a) {
                b -= S2[j];
                j++;
            } else if (c >= a && c >= b) {
                c -= S3[k];
                k++;
            }
        }
        return 0;
    }
}

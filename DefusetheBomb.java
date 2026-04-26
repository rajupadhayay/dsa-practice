import java.util.Arrays;

class DefusetheBomb{
        public static int[] decrypt(int[] code, int k) {
        int ans[] = new int[code.length];
        int sum = 0;
        if (k == 0)
            return ans;
        if (k > 0) {
            for (int i = 1; i <= k; i++) {
                sum += code[i % code.length];
            }
            for (int i = 0; i < code.length; i++) {
                ans[i] = sum;
                sum -= code[(i + 1) % code.length];
                sum += code[(i + k + 1) % code.length];
            }
        }

        if (k < 0) {
            k = -k;
            for (int i = 1; i <= k; i++) {
                sum += code[(code.length - i) % code.length];
            }
            for (int i = 0; i < code.length; i++) {
                ans[i] = sum;
                sum -= code[(code.length + i - k) % code.length];
                sum += code[i];

            }
        }
        return ans;
    }

     public static void main(String[] args) {
       int code[] = {5,7,1,4};
       int k =3;
       System.out.println(Arrays.toString(decrypt(code,k)));
    }
}
public class Fakultät {
    public static int Fakultät(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }



    public static void main(String[] args) {
        int n = 3;
        int Ergebniss = Fakultät(n);
        System.out.println(Ergebniss);
    }
}



public class RSA {

    // http://teh-box.ru/informationsecurity/algoritm-shifrovaniya-rsa-na-palcax.html
    // https://www.sanfoundry.com/java-program-implement-rsa-algorithm/

    private final int P = 3; // простое число
    private final int Q = 11; // простое число

    private final int e = 7; // откритая експонента
    private int d;

    // (e,N) - opened key
    // (d,N) - closed key
    private int N; // модуль

    private void acsiiTable() {
        for (int c = 32; c < 128; c++) {
            System.out.println(c + ": " + (char) c);
            //char a = (char) c;
            //System.out.println((int)a);
        }
    }

    // Function to return GCD of a and b
    static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    // A simple method to evaluate
    // Euler Totient Function
    private int phi(int n) {
        int result = 1;
        for (int i = 2; i < n; i++)
            if (gcd(i, n) == 1)
                result++;
        return result;
    }

    private int calculateClosedEcsponent() {
        return (e % phi(N));
    }

    public String[] getCryptedMassage(String message) {
        N = P * Q;

        //System.out.println(gcd(Q, Q));

        System.out.println(modPow(3,7,20));

//        System.out.println(phi(N));
//        System.out.println(calculateClosedEcsponent());
        return null;
    }

    private int modPow(int base, int exponent, int modulus) {
        if (modulus == 1) return 0;
        int c = 1;
        for (int i = 1; i < exponent; i++) {
            c = (c*base) % modulus;
            System.out.println(c + " " + base + " " +modulus);
        }
        return c;
    }


}

import java.math.BigInteger;

public class RSANew {
    private BigInteger p = new BigInteger(String.valueOf(3));
    private BigInteger q = new BigInteger(String.valueOf(11));

    private BigInteger e = new BigInteger(String.valueOf(7));

    private BigInteger d;

    private BigInteger n;

    private int phi(BigInteger n) {
        int result = 1;
        System.out.println(q.gcd(q));
        return Integer.parseInt(null);
    }

    public static void main(String[] args) {
        RSANew rsa = new RSANew();
    }
}

// RSA Program: 
import java.math.BigInteger;

public class RSA {
    public static void main(String args[]) {
        int p, q, n, z, d = 0, e, i;

        // The number to be encrypted and decrypted
        int msg = 12;
        BigInteger c, msgback;

        // 1st prime number p
        p = 3;

        // 2nd prime number q
        q = 11;
        n = p * q;
        z = (p - 1) * (q - 1);
        System.out.println("the value of z = " + z);

        for (e = 2; e < z; e++) {

            // e is for public key exponent
            if (gcd(e, z) == 1) {
                break;
            }
        }
        System.out.println("the value of e = " + e);
        for (i = 0; i <= 9; i++) {
            int x = 1 + (i * z);

            // d is for private key exponent
            if (x % e == 0) {
                d = x / e;
                break;
            }
        }
        System.out.println("the value of d = " + d);
        
        BigInteger msgBigInt = BigInteger.valueOf(msg);
        BigInteger nBigInt = BigInteger.valueOf(n);

        c = msgBigInt.modPow(BigInteger.valueOf(e), nBigInt);
        System.out.println("Encrypted message is : " + c);

        msgback = c.modPow(BigInteger.valueOf(d), nBigInt);
        System.out.println("Decrypted message is : " + msgback);
    }

    static int gcd(int e, int z) {
        if (e == 0)
            return z;
        else
            return gcd(z % e, e);
    }
}
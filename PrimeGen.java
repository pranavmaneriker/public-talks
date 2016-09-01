import java.math.BigInteger;
import java.util.Random; //NOT SECURE!!!
import java.security.SecureRandom;

class PrimeGen{
	public static void main(String args[]){
		//BigInteger n = BigInteger.probablePrime(1024, new Random());
		BigInteger n = BigInteger.probablePrime(1024, new SecureRandom());
		System.out.println(n.toString());
	}
}

import java.math.BigInteger;
import java.util.Scanner;
public class Primetry {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in)
        System.out.println("Enter the no: ");
        BigInteger str = scanner.nextBigInteger();
        if(str.isProbablePrime(100)){
            System.out.println(str + " Its is a Prime");
        }
        else{
            System.out.println(str + " Its not a prime");
        }

    }
}

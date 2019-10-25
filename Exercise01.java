import java.util.Scanner;
public class Exercise01 { 
    public static void main(String[] args) {         
        Scanner reader = new Scanner(System.in);
        System.out.println("Introduce cuantos digitos");
        int digito = reader.nextInt();
        double res = Math.pow(10, digito) - 1;
        System.out.println("largestNumber(n) = "+ (int) res);            
    }
}
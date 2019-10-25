import java.util.Scanner;
public class Exercise02 { 
    public static void main(String[] args) {         
        Scanner reader = new Scanner(System.in);
        System.out.println("Porfavor, Introduce tu año:");
        int anio = reader.nextInt();
        int siglo = (anio-1)/100 + 1;               
        System.out.println("Su siglo es: "+ siglo);
    }
}
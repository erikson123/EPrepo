/*{1, 2, 3, 4, 5, 6, 7} 
//Min Value:      1
//Max Value:      7
//Average Val
*/
import java.util.Arrays;

public class Exercise01{

    public static void main(String[] args) {
        
        int[] values = {1, 2, 3, 4, 5, 6, 7};
        int min = values[0];
        int max = values[0];
        int avg = values[0];
        int sum = 0;

        for(int i = 0; i < values.length; i++){
            max = Math.max(max,values[i]);
            min = Math.min(min,values[i]);
            sum += values[i];
            avg = sum/values.length;            
        }
        System.out.println("El numero mayor es: " + max);
        System.out.println("El numero menor es: " + min);
        System.out.println("El promedio de los numeros es: " + avg);

    }
}
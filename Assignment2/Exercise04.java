/*Checking whether two arrays contain a mismatch
If two arrays are equal, then a mismatch should return -1.
But if two arrays are not equal, then a mismatch should return the index of the first mismatch between the two given arrays.
*/

public class Exercise04 {
    
        public static void main(String[] args) {
            int[] firstTestArrayOne = {1, 2, 3, 4, 5, 6};
            int[] firstTestArrayTwo = {1, 2, 3, 4, 5, 6};
    
            int resultFirstTest = mismatch(firstTestArrayOne, firstTestArrayTwo);
            System.out.println(resultFirstTest); //result should be -1
    
    
            int[] secondTestArrayOne = {1, 2, 3, 4, 5, 6};
            int[] secondTestArrayTwo = {1, 2, 3, 4, 2, 6};
            
            int resultSecondTest = mismatch(secondTestArrayOne, secondTestArrayTwo);
            System.out.println(resultSecondTest); //result should be 4    
        }
    
        public static int mismatch(int[] left, int[] right) {
            for(int i=0; i<left.length; i++){
                if(left[i]!=right[i])
                return left[i-1];
            }
            return -1;
        }
    }
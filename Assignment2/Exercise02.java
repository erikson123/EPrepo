/*Make a program that counts the number of occurrences of every repeating word, not you should ignore those words that are not repeating. 
    "This is is a new text text that have repeating repeating repeating words"
    //Result:
    is:        2
    text:      2
    repeating: 3
*/

package String;

public class Exercise02
{
   public static void main(String[] args)
   {      
      String value="This is is a new text text that have repeating repeating repeating words";
      String[] words=value.split(" ");  //Get each word in one array, based on space empty
      int countWords=1;
      
      for(int i=0;i<words.length;i++) //1st FOR to run  from i=0
      {
         for(int j=i+1;j<words.length;j++) //2nd FOR to run from j=i+1
         {            
         if(words[i].equals(words[j]))  //Run both 'for' validating if are repeated words
            {
                countWords=countWords+1;    //+1 if is duplicated
                words[j]="0"; //Replace repeated words by zero to compare after
            }
         }
         if(words[i]!="0" && countWords>1) //conditions before print repeated words and counter
         System.out.println(words[i] +": " + countWords); //Print the repeated words plus counter
         countWords=1;         
        }           
   }
}
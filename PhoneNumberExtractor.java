import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

public class PhoneNumberExtractor{

    public static void main(String[] args){
        Pattern number = Pattern.compile("\\(?(0?0?\\d{2})\\)?[ \\-\\.]?(\\d{1,4})[ \\-\\.](\\d{3}[\\-\\.]?\\d{4})|\\(?(0?0?\\d{2})\\)?(\\d{1,4})(\\d{7})");
        
        String phoneNumber = System.console().readLine("Please, enter your phone number:");        
        ArrayList<String> operatorCode = new ArrayList<>();
        ArrayList<String> cityCode = new ArrayList<>();
        ArrayList<String> phone = new ArrayList<>();

        Matcher matcher = number.matcher(phoneNumber);

        if(matcher.find()){
            operatorCode.add(matcher.group(1));
            cityCode.add(matcher.group(2));
            phone.add(matcher.group(3));
            
            System.out.println("The phone number " + phoneNumber + " is VALID and:");
            System.out.println("The operator code is: " + operatorCode);
            System.out.println("The city code es: " + cityCode);
            System.out.println("The phone number is: " + phone);        
        }
        else {
        System.out.println("The phone number " + phoneNumber + " is NOT VALID");
        }
    }
}

//20.28 other example
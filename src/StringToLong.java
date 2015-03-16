/**
 * Created by Xu on 3/14/2015.
 */
public class StringToLong {
    public long stringToLong(String s) throws NumberFormatException{
        long num = 0;
        long digitIndex = 1;
        // calculate all but the first digit
        for(int i = s.length() - 1; i > 0; i--){
            if(s.charAt(i) > '9'|| s.charAt(i) < '0') {
                throw new NumberFormatException(s + " is not a valid integer number.");
            }
            num += (s.charAt(i) - '0') * digitIndex;
            digitIndex *= 10;
        }

        // check the first char, decide whether it is a negative number or positive number
        if (s.charAt(0) == '-') {
            return -num;
        } if (s.charAt(0) == '+') {
            return num;
        }
        else{
            num += (s.charAt(0) - '0') * digitIndex;
            return num;
        }
    }
}

/**
 * Created by Xu on 3/14/2015.
 */
public class StringToLong {
    public long stringToLong(String s) throws NumberFormatException{
        if (s.length() == 0)
            return 0;
        while (s.charAt(0) == ' ') {
            s = s.substring(1);
        }
        double digit = 1;
        double result = 0;
        int index = s.length() -1;
        for (int i = s.length() -1 ; i >=0; i--) {
            if (s.charAt(i) > '9' || s.charAt(i) < '0') {
                if (i != 0)
                    index = i;
                else if (s.charAt(i) != '-' && s.charAt(i) != '+') {
                    return 0;
                }
            }
        }
        s = s.substring(0, index + 1);
        for (int i = s.length() - 1; i > 0; i--) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                result += (s.charAt(i) - '0') * digit;
                digit *= 10;
                if (s.charAt(0) != '-') {
                    if (result > Long.MAX_VALUE)
                        return Long.MAX_VALUE;
                    if (result < Long.MIN_VALUE)
                        return Long.MIN_VALUE;
                } else {
                    if (result > Long.MAX_VALUE)
                        return Long.MIN_VALUE;
                    if (result < Long.MIN_VALUE)
                        return Long.MAX_VALUE;
                }
            }
        }
        if (s.charAt(0) == '-')
            return (long)-result;
        else if (s.charAt(0) == '+')
            return (long)result;
        else {
            result += (s.charAt(0) - '0') * digit;
            if (result > Long.MAX_VALUE)
                return Long.MAX_VALUE;
            if (result < Long.MIN_VALUE)
                return Long.MIN_VALUE;
        }
        return (long)result;
    }
}

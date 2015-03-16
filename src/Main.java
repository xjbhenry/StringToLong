import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Xu on 3/14/2015.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> testString = new ArrayList<String>();
        testString.add("  0123456789");
        testString.add("+");
        testString.add("-");
        testString.add("+1");
        testString.add("-1");
        testString.add("1");
        testString.add("524234");
        testString.add("0");
        testString.add("9223372036854775807");
        testString.add("-9223372036854775808");

        ArrayList<Long> result = new ArrayList<Long>();
        result.add(123456789L);
        result.add(0L);
        result.add(0L);
        result.add(+1L);
        result.add(-1L);
        result.add(1L);
        result.add(524234L);
        result.add(0L);
        result.add(Long.MAX_VALUE);
        result.add(Long.MIN_VALUE);

        Iterator iteratorTest = testString.iterator();
        Iterator iteratorResult = result.iterator();

        while (iteratorResult.hasNext() && iteratorResult.hasNext()) {
            if (! iteratorResult.next().equals(new StringToLong().stringToLong((String)iteratorTest.next())))
                System.out.println("errors found");
        }
        System.out.println("no errors found");
/*        long i = new StringToLong().stringToLong("9223372036854775807");
        System.out.println(i);*/
    }
}

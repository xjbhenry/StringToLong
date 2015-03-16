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
        testString.add("524234AB");
        testString.add("0");
        testString.add("9223372036854775807");
        testString.add("9223372036854775807");
        testString.add("-9223372036854775808");

        ArrayList<Double> result = new ArrayList<Double>();
        result.add((double)123456789L);
        result.add((double)0L);
        result.add((double)0L);
        result.add((double)+1L);
        result.add((double)-1L);
        result.add((double)1L);
        result.add((double)524234L);
        result.add((double)0L);
        result.add((double)Long.MAX_VALUE + 2);
        result.add((double)Long.MAX_VALUE);
        result.add((double)Long.MIN_VALUE);

        Iterator iteratorTest = testString.iterator();
        Iterator iteratorResult = result.iterator();

        while (iteratorTest.hasNext() && iteratorResult.hasNext()) {
            long outcome = new StringToLong().stringToLong((String)iteratorTest.next());
            if (! iteratorResult.next().equals((double)outcome))
                System.out.println("errors found");
        }
        System.out.println("no errors found");
    }
}

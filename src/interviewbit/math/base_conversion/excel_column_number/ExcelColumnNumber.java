package interviewbit.math.base_conversion.excel_column_number;

/**
 * Created by izzymoriguchi on 8/11/17.
 */
public class ExcelColumnNumber {
    public int titleToNumber(String a) {
        int sum = 0;
        for (int i = 0; i < a.length(); i++) {
            int numOfChar = convertFromLetterToNum(a.charAt(i));
            sum = sum + (int) (Math.pow(26, a.length() - i - 1) * numOfChar);
        }
        return sum;
    }

    public int convertFromLetterToNum(char letter) {
        int valOfA = (int) 'A';
        return ((int) letter) - valOfA + 1;
    }
}

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Advent1 {
    public static void main(String[] args) throws IOException {
        String line;
        int numericValue;
        int sum = 0;
        int spojenBroj = 0;    //don't mix serbian and english -> example: twoDigitNumber

        try {
            BufferedReader reader = new BufferedReader(new FileReader("AdventOfCode-1.txt"));
            while ((line = reader.readLine()) != null) {
                //no need for this big (double or triple) line-breaks

                String numericString = line.replaceAll("[^0-9]", "");     //nice 
                int firstDigit;
                if (numericString.length() != 1) {
                    int lastDigit = 0;
                    numericValue = Integer.parseInt(numericString);
                    lastDigit = Math.abs(numericValue % 10);

                    firstDigit = Character.getNumericValue(Integer.toString(numericValue).charAt(0));
                    spojenBroj = Integer.parseInt(Integer.toString(firstDigit) + Integer.toString(lastDigit));    //why do this for every digit until you get to last one
                    sum += spojenBroj;

                    System.out.println(spojenBroj);
                    //System.out.println(numericValue); DEBUGOVAN USPESNO !
                } else {
                    //variable names start with small letter -> doubled
                    String Doubled = numericString + numericString;
                    numericValue = Integer.parseInt(Doubled);
                    System.out.println(numericValue);
                    sum += numericValue;
                }
            }

            System.out.println("SUMA " + sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

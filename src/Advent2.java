import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Advent2 {
    public static void main(String[] args) {
        String line;
        long numericValue;
        int sum = 0;
        int spojenBroj = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader("AdventOfCode-1.txt"));
            while ((line = reader.readLine()) != null) {
                line=line.replaceAll("(?i)one","1");
                line=line.replaceAll("(?i)two","2");
                line=line.replaceAll("(?i)three","3");
                line=line.replaceAll("(?i)four","4");
                line=line.replaceAll("(?i)five","5");
                line=line.replaceAll("(?i)six","6");
                line=line.replaceAll("(?i)seven","7");
                line=line.replaceAll("(?i)eight","8");
                line=line.replaceAll("(?i)nine","9");

                String numericString = line.replaceAll("[^0-9]","");
                int firstDigit;
                if (numericString.length() != 1) {
                    long lastDigit = 0;
                     numericValue = Long.parseLong(numericString);
                    lastDigit = Math.abs(numericValue % 10);

                    firstDigit = Character.getNumericValue((String.valueOf(numericValue)).charAt(0));
                    spojenBroj = Integer.parseInt(Integer.toString(firstDigit) + (lastDigit));
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

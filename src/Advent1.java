import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Advent1 {
    public static void main(String[] args) throws IOException {
        String line;
        int numericValue;
        int sum = 0;
        int spojenBroj = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader("AdventOfCode-1.txt"));
            while ((line = reader.readLine()) != null) {


                String numericString = line.replaceAll("[^0-9]", "");
                int firstDigit = 0;
                if (numericString.length() != 1) {
                    int lastDigit = 0;
                    numericValue = Integer.parseInt(numericString);
                    lastDigit = Math.abs(numericValue % 10);
                    while (numericValue != 0) {

                        firstDigit = Math.abs(numericValue % 10);
                        numericValue /= 10;
                        spojenBroj = Integer.parseInt(Integer.toString(firstDigit) + Integer.toString(lastDigit));



                    }
                    sum += spojenBroj;

                    System.out.println(spojenBroj);
                    //System.out.println(numericValue); DEBUGOVAN USPESNO !


                } else {
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
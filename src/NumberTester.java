import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class NumberTester implements NumberTest {
    private NumberTest oddTester;
    private NumberTest primeTester;
    private NumberTest palindromeTester;
    private String fileName;

    public NumberTester(String fileName) {
        this.fileName = fileName;
    }

    public void setOddEvenTester(NumberTest oddTester) {
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester) {
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester) {
        this.palindromeTester = palindromeTester;
    }

    public void testFile() {
        File file = new File(fileName);
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(fileName));
            String zeile = null;
            in.readLine();
            String[] arr = null;
            while ((zeile = in.readLine()) != null) {
                arr = null;
                arr = zeile.split("\\s+");
                int number1 = Integer.parseInt(arr[0]);
                int number2 = Integer.parseInt(arr[1]);

                if (number1 == 1) {
                    setOddEvenTester((int number)->number%2==0);
                    if (oddTester.testNumber(number2)) {
                        System.out.println("EVEN");
                    } else{
                        System.out.println("ODD");
                    }
                } else if (number1 == 2) {
                    //setPrimeTester();
                    //setPrimeTester.test;
                    boolean[] ar = new boolean[number2 + 1];
                    boolean prime = false;
                    for (int i = 0; i < ar.length; i++) {
                        ar[i] = true;
                    }
                    for (int i = 2; i < ar.length; i++) {
                        for (int j = 2; j < ar.length; j++) {
                            if ((i * j) >= ar.length) {
                                break;
                            }
                            ar[i * j] = false;
                        }
                    }
                    boolean boo = false;
                    for (int i = 0; i < ar.length; i++) {
                        if (ar[i] == true && i == number2) {
                            System.out.println("PRIME");
                            boo = true;
                        }
                    }
                    if (boo == false) {
                        System.out.println("NO PRIME");
                    }
                } else if (number1 == 3) {

                    boolean pali = false;
                    int reverse = 0;
                    int num = number2;
                    do {
                        reverse = reverse * 10 + (num % 10);
                        num /= 10;
                    } while (num > 0);
                    //System.out.println(number2+";"+reverse);
                    if (number2 == reverse) {
                        System.out.println("PALINDROME");
                        pali = true;
                    } else if (pali == false) {
                        System.out.println("NO PALINDROME");
                    }
                } else {
                    System.out.println("...Fail...");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null)
                try {
                    in.close();
                } catch (IOException e) {
                }
        }
    }

    @Override
    public boolean testNumber(int number) {
        return false;
    }
}

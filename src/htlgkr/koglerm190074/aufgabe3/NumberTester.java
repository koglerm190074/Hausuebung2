package htlgkr.koglerm190074.aufgabe3;

import htlgkr.koglerm190074.aufgabe3.NumberTest;
import htlgkr.koglerm190074.aufgabe3.NumberTest2;

import java.io.*;

public class NumberTester implements NumberTest, NumberTest2 {
    private NumberTest oddTester;
    private NumberTest primeTester;
    private NumberTest2 palindromeTester;
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

    public void setPalindromeTester(NumberTest2 palindromeTester) {
        this.palindromeTester = palindromeTester;
    }

    public void testFile() {
        File file = new File(fileName);
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(fileName));
            String zeile = null;
            in.readLine();
            while ((zeile=in.readLine())!=null) {
                String[] arr = null;
                arr = zeile.split("\\s+");
                int number1 = Integer.parseInt(arr[0]);
                String number2 = arr[1];

                if (number1 == 1) {
                    setOddEvenTester((int number) -> number % 2 == 0);
                    if (oddTester.testNumber(Integer.parseInt(number2))) {
                        System.out.println("EVEN");
                    } else {
                        System.out.println("ODD");
                    }
                } else if (number1 == 2) {
                    //setPrimeTester();
                    //setPrimeTester.test;
                    setPrimeTester((number) -> {
                        boolean[] ar = new boolean[number + 1];
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


                        if (ar[number] == true) {
                            System.out.println("PRIME");
                            boo = true;
                        } else {
                            System.out.println("NO PRIME");
                        }


                        return false;
                    });
                    primeTester.testNumber(Integer.parseInt(number2));

                } else if (number1 == 3) {
                    setPalindromeTester((String number) -> {//String weil int < 10 Stellen sein muss
                        /*if(number.length()>10){//wurde zun debugen verwendet
                            System.out.println();
                        }*/
                        char[] car = new char[number.length()];
                        char[] car1 = new char[number.length()];
                        if (number.length() % 2 == 0) {

                            car = number.toCharArray();
                            int count = 0;
                            for (int i = car.length-1; i >= 0; i--) {
                                car1[count] = car[i];
                                count++;
                            }
                            boolean pali = true;
                            for (int i = 0; i < car.length; i++) {
                                if(car[i]!=car1[i]){
                                    pali = false;
                                }
                            }

                            if(pali) {
                                System.out.println("PALINDROME");
                            }else {
                                System.out.println("NO PALINDROME");
                            }
                        }
                        /*System.out.println(s);*/

                        /*boolean pali = false;
                        int reverse = 0;
                        int num = number;
                        do {
                            reverse = reverse * 10 + (num % 10);
                            num /= 10;
                        } while (num > 0);
                        if (number == reverse) {
                            System.out.println("PALINDROME");
                            pali = true;
                        } else if (pali == false) {
                            System.out.println("NO PALINDROME");
                        }*/
                        return false;
                    });
                    palindromeTester.testNumber2(number2);

                } else {
                    System.out.println("No correct Number");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();

        }catch (NumberFormatException e) {
            System.out.println("no Number");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds");
        }
        /*finally {
            if (in != null)
                try {
                    in.close();
                } catch (IOException e) {
                }
        }*/
    }

    @Override
    public boolean testNumber(int number) {
        return false;
    }

    @Override
    public boolean testNumber2(String number) {
        return false;
    }
}

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class NumberTester {
    private NumberTest oddTester;
    private NumberTest primeTester;
    private NumberTest palindromeTester;
    private String fileName;

    public NumberTester(String fileName) {
        this.fileName = fileName;
        /*try {
            FileReader filereader = new FileReader(fileName);

            String[] arr = new String[10];
            for (int i = 0; i < arr.length; i++) {

                String line = arr[i];
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/


    }

    public void setOddEvenTester(NumberTest oddTester){
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester){
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester){
        this.palindromeTester = palindromeTester;
    }

    public void testFile(){

    }

    public void test(){
        File file = new File(fileName);

        /*if (!file.canRead() || !file.isFile())
            System.exit(0);*/
        /*List<String> list = new ArrayList<>();*/
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(fileName));
            String zeile = null;
            in.readLine();
            int count = 0;
            String[] arr = null;//zuerst zeile einlesen dann in string array speichern und splitten dann gesplittet in int[]
            while ((zeile = in.readLine()) != null) {
                arr[count] = String.valueOf(zeile.split("\\s+"));
                int number1 = Integer.parseInt(arr[count]);
                int number2 = Integer.parseInt(arr[count]);
                /*list.add(zeile);*/
                /*String[] split = zeile.split("\\s+");
                int[] arr = new int[split.length];
                for (int i = 0; i < split.length; i++) {
                    System.out.println(split[i]);
                    try{

                        arr[i] = Integer.parseInt(split[i]);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }*/
                count++;




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

        /*int[] first= null;
        String[] splitted = null;
        for (int i = 0; i < list.size(); i++) {
            splitted = list.get(i).split("\\s+");
            System.out.println(splitted[i]);
            *//*first[]= Integer.parseInt(list.get(i).split(" "));*//*
        }*/

    }


}

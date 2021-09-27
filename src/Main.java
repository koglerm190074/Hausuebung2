import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("A1");
        list.add("B1");
        list.add("C1");
        list.add("D1");
        list.add("E1");

        HalloJavamitForEach hjmfe = new HalloJavamitForEach(list);

        hjmfe.print();


    }
}

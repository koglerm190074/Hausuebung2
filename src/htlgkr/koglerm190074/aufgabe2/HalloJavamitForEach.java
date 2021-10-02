package htlgkr.koglerm190074.aufgabe2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class HalloJavamitForEach {
    private List<String> list;

    public HalloJavamitForEach(List<String> list) {
        this.list = list;
    }

    public void print(){
        for (String s:list) {
            System.out.println(s);
        }
        System.out.println("\n");

        list.forEach((String s) -> System.out.println(s));
        System.out.println("\n");

        Consumer<String> consumer = (String s) -> System.out.println(s);
        System.out.println("\n");

        list.forEach(System.out::println);
        System.out.println("\n");
    }

}

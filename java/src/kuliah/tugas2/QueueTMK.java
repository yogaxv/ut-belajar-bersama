package kuliah.tugas2;

import java.util.ArrayList;
import java.util.List;

public class QueueTMK {
    public static void main(String[] args) {
        List elemen = new ArrayList<>();

        elemen.add("I");
        elemen.add("N");
        elemen.add("F");
        elemen.add("O");
        elemen.add("R");
        elemen.add("M");
        elemen.add("A");
        elemen.add("S");
        elemen.add("I");

        elemen.remove("I");
        elemen.remove("N");
        elemen.remove("F");
        elemen.remove("M");

        for (Object queueList:elemen) {

            System.out.print(queueList+"-->");
        }

    }
}

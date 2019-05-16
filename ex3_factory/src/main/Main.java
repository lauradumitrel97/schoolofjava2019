package main;

import java.nio.file.Paths;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.sayHello("Bill");

        //exemplu de singleton Runtime.getRuntime().availableProcessors();
        //exemplu de builder StringBuilder;
        // Locale loc = new Locale.Builder()
        //       .setLanguage("en")
        //      .setRegion("US")
        //     .build();
        //exemplu de factory Executors.new....
        //sau incepand cu java9 metodele of pe List
        // sau reprezentarea sub forma interfetei de Path: Path path = Paths.get("C:/A")
    }
}

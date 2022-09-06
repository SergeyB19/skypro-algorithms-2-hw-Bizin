package pro.sky.java.course2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StringList stringList = new StringListImpl();
        stringList.add("test1"); // 0
        stringList.add("test2"); // 1
        stringList.add("test3"); // 2
        stringList.add("test4"); // 3

        stringList.add(3, "test6");

        stringList.remove(3);

        System.out.println(Arrays.toString(stringList.toArray()));

        stringList.clear();
        System.out.println(stringList.size());

        }
    }
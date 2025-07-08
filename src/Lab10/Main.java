package Lab10;

import Lab09.Game;
import Lab09.SimpleList;
import Lab09.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] ars) {

        var res = FileHandler.readFile("C:\\123.txt");
        System.out.println(res);

        //FileHandler.writeToFile("qwe", "C:\\123copy.txt");

        //FileHandler.concatFiles("C:\\Concat.txt", "C:\\123.txt", "C:\\123copy.txt");

        //FileHandler.replaceInFile("\\$", "C:\\Concat.txt");
    }
}

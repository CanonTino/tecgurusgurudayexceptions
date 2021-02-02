package net.tecgurus.guruday.basicexample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTypesExample {

    public static void main(String[] args) {
        new ExceptionTypesExample().checkedException();
        System.out.println("main method ended");
    }

    void checkedException() /*throws FileNotFoundException*/ {

        try {
            FileInputStream fileInputStream = new FileInputStream("B:/myfile.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    void unCheckedException() {
        int result = 1 / 0;

        Integer integer = null;
        integer.doubleValue();
    }
}

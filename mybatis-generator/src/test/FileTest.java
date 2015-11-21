package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileTest {

    public static void main(String[] args) {
        fun1();
        fun2();
    }

    public static void fun1() {
        File f = new File("E:\\tmp\\test.txt");

        FileInputStream fis = null;
        try {
            fis = new FileInputStream(f);

        } catch (FileNotFoundException e) {
        }

        int ch = 0;

        try {
            while ((ch = fis.read()) != -1) {
                System.out.println((char) ch);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block I
            e.printStackTrace();
        }

        try {
            fis.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void fun2() {
        File f = new File("E:\\tmp\\test.txt");
        if (f.exists()) f.delete();
    }
}

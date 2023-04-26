/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hattmakarn;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author carolinaappel
 */
public class FileWriter {



public static void writeToFile(String text, String fileName) {
    try {
        FileWriter writer = new FileWriter(new File(fileName));
        writer.write(text);
        writer.close();
    } catch (IOException ex) {
        ex.printStackTrace();
    }
}

public static void main(String[] args) {
    String text = "Hello, world!";
    String fileName = "output.txt";
    writeToFile(text, fileName);
}
}

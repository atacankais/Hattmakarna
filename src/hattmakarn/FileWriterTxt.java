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
public class FileWriterTxt {
   public static void main(String[] args) {
      try {
         FileWriter writer = new FileWriter("/Users/clarajonsson/NetBeansProjects/hattmakarna/fil.txt");
         writer.write("Detta är text som skrivs till filen.");
         writer.close();
         System.out.println("Filen har skapats.");
      } catch (IOException e) {
         System.out.println("Ett fel uppstod: " + e.getMessage());
      }
   }
}

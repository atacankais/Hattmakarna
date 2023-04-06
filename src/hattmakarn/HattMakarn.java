/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hattmakarn;

import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;

public class HattMakarn {
    
    private static InfDB idb;
    
    public static void main(String[] args) throws InfException {
   try{
       idb = new InfDB ("hattdb", "3306", "hattdba", "hattkey");
       
   } catch (InfException ex) {
       Logger.getLogger(HattMakarn.class.getName()).log(Level.SEVERE, null, ex);
   }
    }
    
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hattmakarn;

import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;

/*
Denna klass syfte är att instansiera databasklassen. DB_Access klassen gör externa metodanrop till denna klass för att använda idb-objektets metoder.
*/
public class Connector {
    
    public InfDB idb;
    
    public Connector() {
        
        try {

            idb = new InfDB("hattdb", "3306", "hattdba", "hattkey");

        } catch (InfException ex) {

            Logger.getLogger(HattMakarn.class.getName()).log(Level.SEVERE, null, ex);

        }
        
    }
    
}
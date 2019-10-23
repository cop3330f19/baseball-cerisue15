/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlFile;

import java.util.List;


/**
 *
 * @author cerigoff
 */
public class TestRead {
    
    
    public static void main(String args[]) {
        
        System.out.println("here");
        StaXParser read = new StaXParser();
        List<Player> readXML = read.readXML("/Users/cerigoff/NetBeansProjects/Baseball/src/xmlFile/baseball.xml");
        for (Player player : readXML) {
            System.out.println(player);
        }
        System.out.println();
        System.out.println();
    }
    
}


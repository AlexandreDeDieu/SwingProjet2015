/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingtest;

import events1.BadIdea1;
import events1.BadIdea2;
import events1.PopUp;
import javax.swing.JFrame;

/**
 *
 * @author Alexandre
 */
public class SwingTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //BadIdea1 toto = new BadIdea1();
        
        /*JFrame f= new BadIdea1();
        f.setSize(300, 200);
        f.setVisible(true);*/
        
            
        JFrame f = new PopUp();
        f.setVisible(true);
    }
    
}

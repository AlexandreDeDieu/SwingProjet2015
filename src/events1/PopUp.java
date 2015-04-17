/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package events1;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 *
 * @author Alexandre
 */
public class PopUp extends JFrame implements ActionListener {

    private JButton myTFButton;
    JTextField myTextField;
    JTextField myTextField2;
    JTextField myTextField3;
    

    /**
     *
     */
    public PopUp() {
        
        setSize(1000, 600);
        setResizable(false);
        GridLayout master = new GridLayout(3, 2);
        
// Création d'un listener spécifique
        this.addWindowListener(
                new WindowBadIdea2Listener()
        );

                
        
        myTextField = new JTextField();
        myTextField.setSize(20, 150);
        this.add(myTextField);
         
        myTextField2 = new JTextField();
        myTextField2.setSize(20, 150);
        this.add(myTextField2);
         
        myTextField3 = new JTextField();
        myTextField3.setSize(20, 150);
        this.add(myTextField3);
        
        myTFButton = new JButton("Button 1" );
        this.add(myTFButton);
        
        //add(myTFButton);
        
        myTFButton.addActionListener(this);
        setLayout(master);
    }
       


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == myTFButton) {
            
            String nom = myTextField.getText();
            String mdp = myTextField2.getText();
            String Adresse = myTextField3.getText();
            
            System.out.println(nom);
            System.out.println(mdp);
            System.out.println(Adresse);
        }
        else {
            
        }
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }             

}
// Création d'un listener spécifique
// la classe WindowAdaper définit à vide toutes les méthodes de
// l'interface WindowListener. Le corps des méthodes est {}

class WindowPopUpListener extends WindowAdapter {

    @Override
    public void windowClosing(WindowEvent e) {
        System.out
                .println(
                        "Window Closing"
                );
        System.
                exit(0);
    }
}

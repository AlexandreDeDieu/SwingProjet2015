package events1;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.*;

public class BadIdea2
        extends
        JFrame
        implements ActionListener {

    JButton b1
            = new JButton(
                    "Button 1"
            );
    JButton b2
            = new JButton(
                    "Button 2"
            );

    public
            BadIdea2() {
        setLayout(
                new FlowLayout());
// Création d'un listener spécifique
        this.addWindowListener(
                new WindowBadIdea2Listener()
        );
        b1.addActionListener(this);
        b2.addActionListener(this);
        this
                .add(
                        b1
                );
        this
                .add(
                        b2
                );
    }
// relents de programmation procédurale

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source
                == b1) {
            System.out
                    .println(
                            "Button 1 pressed"
                    );
        } else if (source
                == b2) {
            System.out
                    .println(
                            "Button 2 pressed"
                    );
        } else {
            System.out
                    .println(
                            "Something else"
                    );
        }
    }

    public static
            void
            main(String[] args) {
        JFrame f
                = new BadIdea2();
        f.setSize(300, 200);
        f.setVisible(
                true
        );
    }
}
// Création d'un listener spécifique
// la classe WindowAdaper définit à vide toutes les méthodes de
// l'interface WindowListener. Le corps des méthodes est {}

class WindowBadIdea2Listener
        extends
        WindowAdapter {

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

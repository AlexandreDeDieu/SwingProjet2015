package events1;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.*;

/**
 *
 * @author Alexandre
 */
public class BadIdea1
        extends
        JFrame
        implements ActionListener, WindowListener {
JButton b1
            = new JButton(
                    "Button 1"
            );
    JButton b2
            = new JButton(
                    "Button 2"
            );

    public
            BadIdea1() {
        setLayout(
                new FlowLayout());
        this.addWindowListener((WindowListener) this); // le BadIdea1 s'écoute lui-même!
        b1.addActionListener(this); // le BadIdea1 écoute le bouton
        b2.addActionListener(this); // le BadIdea1 écoute le bouton
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

@Override
    public void windowClosing(WindowEvent e) {
        System.out
                .println(
                        "Window Closing"
                );
        System.
                exit(0);
    }
// définitions à vide des méthodes de l'interface
// WindowListener: c'est fastidieux!

@Override
    public void windowClosed(WindowEvent e) {
    }

@Override
    public void windowDeiconified(WindowEvent e) {
    }

@Override
    public void windowIconified(WindowEvent e) {
    }

@Override
    public void windowActivated(WindowEvent e) {
    }

@Override
    public void windowDeactivated(WindowEvent e) {
    }

    public void windowOpened(WindowEvent e) {
    }

    public static
            void
            main(String[] args) {
        JFrame f
                = new BadIdea1();
        f.setSize(300, 200);
        f.setVisible(
                true
        );
    }
}

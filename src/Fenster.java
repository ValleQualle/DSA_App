import javax.swing.*;

public class Fenster {

    JFrame frame;

    public Fenster() {
        // Erstellt ein Fenster mit einem individuellen Namen
        frame = new JFrame("DSA Application");
        frame.setSize(800, 700);
        frame.setVisible(true);
        frame.setResizable(false);
    }

}

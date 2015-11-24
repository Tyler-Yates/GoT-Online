package got.client;

import javax.swing.*;
import java.awt.*;

public class ClientGUI extends JFrame {
    private static JFrame frame;

    public ClientGUI() {
        frame = new JFrame("GoT Online");
        frame.setVisible(true);
        frame.setSize(1024, 768);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ClientGUI();
    }

    public void paint(Graphics g) {
        super.paint(g);
    }
}

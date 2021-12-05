package technotewriteup;

import java.awt.Color;
import technote2htmljlabel.*;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

/**
 * This Basic class demonstrates the use of a JSlider.
 *
 * @author Nicole
 */
public class JLabelHTML {

    public JLabelHTML() {
        // Initialize main components
        JFrame frame = new JFrame("frame");
        JPanel panel = new JPanel();

        // Label 1 - No additions
        JLabel label = new JLabel("This is a simple test label");
        
        // UNCOMMENT THE FOLLOWING LINES TO USE JLABEL METHODS
        //label.setFont(new Font("Sans-Serif", Font.BOLD, 12));
        //label.setForeground(new Color(0x4287f5));
        panel.add(label);

        // Label 2 - Setting up HTML
        JLabel label2 = new JLabel("<html>This is an HTML test label</html>");
        panel.add(label2);

        // Label 3 - Bolding with HTML
        JLabel label3 = new JLabel("<html><u>This is an underlined test label</u></html>");
        panel.add(label3);

        // Label 4 - Table in HTML
        String table = "<html><table border = '1'>"
                + "<tr>"
                + "<th>Name</th><th>Company</th><th>Position</th>"
                + "</tr>"
                + "<tr>"
                + "<td>Norm Niner</td><td>Apple</td><td>Software Engineer</td>"
                + "<tr>"
                + "<td>Norma Niner</td><td>Microsoft</td><td>CEO</td>"
                + "</tr>"
                + "</table></html>";
        JLabel label4 = new JLabel(table);
        panel.add(label4);

        // Label 5 - Color with HTML
        JLabel label5 = new JLabel("<html>This is a <font color=orange>color</font> test label</html>");
        panel.add(label5);
        
        // Set Frame details
        frame.add(panel);
        frame.setSize(300, 250);
        frame.setVisible(true);

        // Stop running program upon closing window
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JLabelHTML();
    }

}

import javax.swing.JFrame;
import javax.swing.JPanel;
//
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create JFrame
        JFrame frame = new JFrame("GridBagLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridBagLayout()); // Set GridBagLayout

        // Create GridBagConstraints
        GridBagConstraints gbc = new GridBagConstraints();

        // Create JPanel for the top two rows
        JPanel topPanel = new JPanel();
        topPanel.setBackground(Color.BLUE);
        // Configure constraints for topPanel
        gbc.gridx = 0;       // First column
        gbc.gridy = 0;       // First row

        gbc.gridwidth = 1;   // Occupy one column
        gbc.gridheight = 2;  // Span two rows

        gbc.weightx = 1;     // Stretch horizontally
        gbc.weighty = 2;     // Stretch vertically (relative weight)
        gbc.fill = GridBagConstraints.BOTH; // Fill the entire cell
        frame.add(topPanel, gbc);

        // Create JPanel for the bottom row
        JPanel bottomPanel = new JPanel();
        bottomPanel.setBackground(Color.GREEN);
        // Configure constraints for bottomPanel
        gbc.gridx = 0;       // First column
        gbc.gridy = 2;       // Third row (after spanning two rows)
        gbc.gridwidth = 1;   // Occupy one column
        gbc.gridheight = 1;  // Span one row
        gbc.weightx = 1;     // Stretch horizontally
        gbc.weighty = 1;     // Stretch vertically (relative weight)
        gbc.fill = GridBagConstraints.BOTH; // Fill the entire cell
        frame.add(bottomPanel, gbc);

        // Make the frame visible
        frame.setLocationRelativeTo(null); // center JFrame
        frame.setVisible(true);
    }
}
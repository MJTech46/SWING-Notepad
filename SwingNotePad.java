import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingNotePad {
    public static void main(String[] args) {
        // Create the frame (window)
        JFrame frame = new JFrame("Swing NotePad");

        // Create a JTextArea and make it editable
        JTextArea textArea = new JTextArea();
        textArea.setEditable(true);

        // Increase the font of textarea
        textArea.setFont(new Font("Arial", Font.PLAIN, 20));

        // Create a JScrollPane to add scrolling functionality
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        // Create buttons for 'New', 'Open', and 'Save'
        JButton newButton = new JButton("New");
        JButton openButton = new JButton("Open");
        JButton saveButton = new JButton("Save");

        // Add action listeners for button actions
        newButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Clear the text area for new document
                textArea.setText("");
            }
        });

        openButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Open functionality coming soon!");
            }
        });

        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Save functionality coming soon!");
            }
        });

        // Create a JPanel for the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        // Add buttons to the panel
        buttonPanel.add(newButton);
        buttonPanel.add(openButton);
        buttonPanel.add(saveButton);

        // Set layout to BorderLayout
        frame.getContentPane().setLayout(new BorderLayout());

        // Add button panel to the top (BorderLayout.NORTH)
        frame.getContentPane().add(buttonPanel, BorderLayout.NORTH);
        // Add the JScrollPane (containing the JTextArea) to the center (BorderLayout.CENTER)
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);

        // Set the frame size
        frame.setSize(500, 400);
        // Set the default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Set the frame visible
        frame.setVisible(true);
    }
}

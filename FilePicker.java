import javax.swing.*;
import java.io.File;

public class FilePicker {
    public static String open() {
        // Create a JFileChooser object
        JFileChooser fileChooser = new JFileChooser();
        
        // Show the open dialog and store the user's response
        int result = fileChooser.showOpenDialog(null);
        
        // Check if a file was selected
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            //System.out.println("Selected file: " + selectedFile.getAbsolutePath());
            return selectedFile.getAbsolutePath();
        } else {
            //System.out.println("File selection was cancelled.");
            return "";
        }
    }
}

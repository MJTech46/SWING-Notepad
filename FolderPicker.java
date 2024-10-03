import javax.swing.*;
import java.io.File;

public class FolderPicker {
    public static String open() {
        // Create a JFileChooser object
        JFileChooser folderChooser = new JFileChooser();
        
        // Set the selection mode to directories only
        folderChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        
        // Show the open dialog and store the user's response
        int result = folderChooser.showOpenDialog(null);
        
        // Check if a folder was selected
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFolder = folderChooser.getSelectedFile();
            //System.out.println("Selected folder: " + selectedFolder.getAbsolutePath());
            return selectedFolder.getAbsolutePath();
        } else {
            //System.out.println("Folder selection was cancelled.");
            return "";
        }
    }
}

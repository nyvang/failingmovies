/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package moviedatabase;

import gui.MainGUI;

/**
 *
 * @author Nyvang
 */
public class MovieDatabase {

    /**
     * Main method, starting the movie database system
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }

}
